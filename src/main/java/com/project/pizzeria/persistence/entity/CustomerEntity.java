package com.project.pizzeria.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
public class CustomerEntity {
    @Id
    @Column(name="id_Customer", nullable=false, length = 15)
    //id will be assing by us no generatevale
    private String idCustomer;

    @Column(nullable=false, length=60)
    private String name;

    @Column(length=100)
    private String address;

    @Column(nullable=false, length=50)
    private String email;

    @Column(name = "phone_number", length=20)
    private String phoneNumber;


}
