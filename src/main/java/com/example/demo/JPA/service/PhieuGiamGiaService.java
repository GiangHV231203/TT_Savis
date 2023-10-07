package com.example.demo.JPA.service;

import com.example.demo.JPA.entity.KhachHang;
import com.example.demo.JPA.entity.PhieuGiamGia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PhieuGiamGiaService {
    List<PhieuGiamGia> getAll();

    void add(PhieuGiamGia phieuGiamGia);

    Page<PhieuGiamGia> phanTrang(Pageable pageable);

    void remove(String ma);

    void update(PhieuGiamGia phieuGiamGia);

    PhieuGiamGia detail(String ma);
}
