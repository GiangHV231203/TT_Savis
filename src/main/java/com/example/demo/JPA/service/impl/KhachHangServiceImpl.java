package com.example.demo.JPA.service.impl;

import com.example.demo.JPA.entity.KhachHang;
import com.example.demo.JPA.repository.KhachHangRepository;
import com.example.demo.JPA.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangServiceImpl implements KhachHangService {
    @Autowired
    private KhachHangRepository khachHangRepository;
    @Override
    public List<KhachHang> getAll() {
        return khachHangRepository.findAll();
    }

    @Override
    public void add(KhachHang khachHang) {
        khachHangRepository.save(khachHang);
    }

    @Override
    public Page<KhachHang> phanTrang(Pageable pageable) {
        return khachHangRepository.findAll(pageable);
    }

    @Override
    public void remove(Long ma) {
        khachHangRepository.deleteById(ma);
    }

    @Override
    public void update(KhachHang khachHang) {
        khachHangRepository.save(khachHang);
    }

    @Override
    public KhachHang detail(Long ma) {
        return khachHangRepository.findKhachHangsByMaKhachHang(ma);
    }
}
