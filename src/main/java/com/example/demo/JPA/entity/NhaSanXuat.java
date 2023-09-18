package com.example.demo.JPA.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
