package ru.prod.logist.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "CustomerOrders")
public class CustomerOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String number;
}
