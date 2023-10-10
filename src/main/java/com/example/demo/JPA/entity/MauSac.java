package com.example.demo.JPA.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "MauSac")
@Entity
public class MauSac {

    @Id
    @Column(name = "MauMauSac")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maMauSac;

    @Column(name = "Ten")
    private String ten;
}
