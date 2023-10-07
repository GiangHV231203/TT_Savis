package com.example.demo.JPA.service;

import com.example.demo.JPA.entity.KhachHang;
import com.example.demo.JPA.entity.TheThanhVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TheThanhVienService {
    List<TheThanhVien> getAll();

    void add(TheThanhVien theThanhVien);

    Page<TheThanhVien> phanTrang(Pageable pageable);

    void remove(String ma);

    void update(TheThanhVien theThanhVien);

    TheThanhVien detail(String ma);
}
