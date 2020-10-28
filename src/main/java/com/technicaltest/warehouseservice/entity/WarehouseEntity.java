
package com.technicaltest.warehouseservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "Warehouse")
public class WarehouseEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String city;

    @PrePersist
    public void prePersist() {
        this.id = null;
    }
}