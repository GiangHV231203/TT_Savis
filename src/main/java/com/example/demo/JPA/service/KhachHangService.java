package com.example.demo.JPA.service;

import com.example.demo.JPA.entity.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface KhachHangService {
    List<KhachHang> getAll();

    void add(KhachHang khachHang);

    Page<KhachHang> phanTrang(Pageable pageable);

    void remove(Long ma);

    void update(KhachHang khachHang);

    KhachHang detail(Long ma);
}
