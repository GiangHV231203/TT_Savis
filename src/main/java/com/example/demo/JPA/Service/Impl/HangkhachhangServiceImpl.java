package com.example.demo.JPA.Service.Impl;

import com.example.demo.JPA.Repository.HangkhachhangRepository;
import com.example.demo.JPA.Service.HangkhachhangService;
import com.example.demo.JPA.entity.HangKhachHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HangkhachhangServiceImpl implements HangkhachhangService {
    @Autowired
    HangkhachhangRepository hangkhachhangRepository;
    @Override
    public List<HangKhachHang> getAll() {
        return hangkhachhangRepository.findAll();
    }

    @Override
    public void save(HangKhachHang bp) {
    hangkhachhangRepository.save(bp);
    }

    @Override
    public void delete(Long id) {
    hangkhachhangRepository.delete(hangkhachhangRepository.findById(id).get());
    }

    @Override
    public HangKhachHang edit(Long id) {
        return hangkhachhangRepository.findById(id).get();
    }
}
