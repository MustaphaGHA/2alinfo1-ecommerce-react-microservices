package com.mustaphagha.clientmicroservice;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
public class ClientEntity {
    @Id
    private String id ;
    private String firstName ;
    private String lastName ;
    private Address address ;
    @Indexed(unique = true)
    private String email ;
    private Gender gender ;
    private List<String> purchasedProducts ;
    private BigDecimal totalSpent ;
    private LocalDateTime createdAt ;

    public ClientEntity(String firstName, String lastName, Address address, String email, Gender gender, List<String> purchasedProducts, BigDecimal totalSpent, LocalDateTime createdAt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.gender = gender;
        this.purchasedProducts = purchasedProducts;
        this.totalSpent = totalSpent;
        this.createdAt = createdAt;
    }
}
