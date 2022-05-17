const express = require("express");
const app = express();
const cors = require("cors");
const eurekaHelper = require("./eureka-helper");
app.use(express.json());
app.use(
  cors({
    origin: "*",
  })
);

const stripe = require("stripe")(
  "sk_test_51KyvTsHBSOGpzWHYFoMhGsZ1rekmNfmZDwa218f56tpFMus5P8vNu5rfXT24nwRJsikoQfaHxYEDsOl7t1R9CsK500ZCw7Htxa"
);

const storeItems = new Map([
  [1, { priceInCents: 1000, name: "Product 1" }],
  [2, { priceInCents: 2000, name: "Product 2" }],
]);

app.get("/hello", (req, res) => {
  res.send("Hello World");
});

app.post("/create-checkout-session", async (req, res) => {
  try {
    console.log(req.body);
    const session = await stripe.checkout.sessions.create({
      payment_method_types: ["card"],
      mode: "payment",
      line_items: req.body.items.map((item) => {
        const storeItem = item;
        return {
          price_data: {
            currency: "usd",
            product_data: {
              name: storeItem.name,
            },
            unit_amount: storeItem.price * 100,
          },
          quantity: item.quantity,
        };
      }),
      success_url: `http://localhost:3000/success.html`,
      cancel_url: `http://localhost:3000/cancel.html`,
    });
    res.set("Access-Control-Allow-Origin", "*");
    res.json({ url: session.url });
  } catch (e) {
    console.log(e.message);
    res.set("Access-Control-Allow-Origin", "*");
    res.status(500).json({ error: e.message });
  }
});

app.listen(8088);

eurekaHelper.registerWithEureka("user-service", 8088);
