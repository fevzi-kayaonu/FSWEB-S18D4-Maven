package com.workintech.s18d1.entity;


import jakarta.persistence.*;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Burger", schema = "proje")
public class Burger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Double price;
    @Column(name = "is_vegan")
    private Boolean IsVegan;
    @Column(name = "bread_type")
    @Enumerated(EnumType.STRING)
    BreadType breadType;
    @Column(name = "contenets")
    private String contents;

}
