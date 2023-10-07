package com.example.demo.JPA.service.impl;

import com.example.demo.JPA.entity.PhieuGiamGia;
import com.example.demo.JPA.repository.PhieuGiamGiaRepository;
import com.example.demo.JPA.service.PhieuGiamGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhieuGiamGiaServiceImpl implements PhieuGiamGiaService {
    @Autowired
    private PhieuGiamGiaRepository phieuGiamGiaRepository;
    @Override
    public List<PhieuGiamGia> getAll() {
        return phieuGiamGiaRepository.findAll();
    }

    @Override
    public void add(PhieuGiamGia phieuGiamGia) {
        phieuGiamGiaRepository.save(phieuGiamGia);
    }

    @Override
    public Page<PhieuGiamGia> phanTrang(Pageable pageable) {
        return phieuGiamGiaRepository.findAll(pageable);
    }

    @Override
    public void remove(String ma) {
        phieuGiamGiaRepository.deleteById(ma);
    }

    @Override
    public void update(PhieuGiamGia phieuGiamGia) {
        phieuGiamGiaRepository.save(phieuGiamGia);
    }

    @Override
    public PhieuGiamGia detail(String ma) {
        return phieuGiamGiaRepository.findPhieuGiamGiaByMaPhieu(ma);
    }
}
