import { loginFailure, loginStart, loginSuccess } from "./userRedux";
import { publicRequest } from "../requestMethods";

export const login = async (dispatch, user) => {
  dispatch(loginStart());
  try {
    const res = await publicRequest.get("/client", {
      params: { email: user.username, password: user.password },
    });
    console.log(res);
    if (res.data !== "") dispatch(loginSuccess(res.data));
    else alert("Invalid credentials");
  } catch (err) {
    console.log(err);
    dispatch(loginFailure());
  }
};
