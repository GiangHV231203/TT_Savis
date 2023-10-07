package com.example.demo.JPA.service.impl;

import com.example.demo.JPA.entity.TheThanhVien;
import com.example.demo.JPA.repository.TheThanhVienRepository;
import com.example.demo.JPA.service.TheThanhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TheThanhVienServiceImpl implements TheThanhVienService {
    @Autowired
    private TheThanhVienRepository theThanhVienRepository;
    @Override
    public List<TheThanhVien> getAll() {
        return theThanhVienRepository.findAll();
    }

    @Override
    public void add(TheThanhVien theThanhVien) {
        theThanhVienRepository.save(theThanhVien);
    }

    @Override
    public Page<TheThanhVien> phanTrang(Pageable pageable) {
        return theThanhVienRepository.findAll(pageable);
    }

    @Override
    public void remove(String ma) {
        theThanhVienRepository.deleteById(ma);
    }

    @Override
    public void update(TheThanhVien theThanhVien) {
        theThanhVienRepository.save(theThanhVien);
    }

    @Override
    public TheThanhVien detail(String ma) {
        return theThanhVienRepository.findTheThanhVienByMaThe(ma);
    }
}
