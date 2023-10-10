package com.example.demo.JPA.Service.Impl;

import com.example.demo.JPA.Repository.DiachiRepository;
import com.example.demo.JPA.Service.DiachiService;
import com.example.demo.JPA.entity.DiaChi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DiachiServiceImpl implements DiachiService {
    @Autowired
    DiachiRepository diachiRepository;
    @Override
    public List<DiaChi> getAll() {
        return diachiRepository.findAll();
    }

    @Override
    public void save(DiaChi bp) {
    diachiRepository.save(bp);
    }

    @Override
    public void delete(UUID id) {
    diachiRepository.delete(diachiRepository.findById(id).get());
    }

    @Override
    public DiaChi edit(UUID id) {
        return diachiRepository.findById(id).get();
    }
}
