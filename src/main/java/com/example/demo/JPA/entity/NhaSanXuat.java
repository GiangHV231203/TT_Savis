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
@Table(name = "NhaSanXuat")
@Entity
public class NhaSanXuat {
    @Id
    @Column(name = "MaNSX")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maNSX;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "TrangThai")
    private int trangThai;

}
