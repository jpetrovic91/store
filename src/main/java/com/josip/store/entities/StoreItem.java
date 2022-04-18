package com.josip.store.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "items")
public class StoreItem {

    @Id
    @Column(name="item_id")
    private int itemId;
    @Column(name="item_name")
    private String itemName;
    @Column(name="price")
    private double price;
}
