package com.example.resta.Schema;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserOrder {
    @Id
    @GeneratedValue
    private int order_id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Menu menu;

    @ManyToOne(fetch = FetchType.EAGER)
    private Customer customer;
}
