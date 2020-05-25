package com.t1billing.cuenta.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMER_GENERATOR")
    @SequenceGenerator(name="CUSTOMER_GENERATOR", sequenceName = "CUSTOMER_SEQ", allocationSize=50)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="middle_initial")
    private String middleName;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="mobile_number")
    private String mobileNumber;
    @Column(name="email_address", unique = true, nullable = false)
    private String emailAddress;
    @Column(name="company")
    private String company;
    @Column(name="pay_method")
    private String paymentMethod;
    @Column(name="bill_cycle")
    private long billCycle;
}
