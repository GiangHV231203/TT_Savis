package com.example.demo.service;

import com.example.demo.dbo.LoaiDeCustom;
import com.example.demo.dbo.LoaiDeRequest;
import com.example.demo.dbo.MauSacRequest;
import com.example.demo.dbo.MauSauCustom;

import java.util.List;

public interface LoaiDeService {

    List<LoaiDeCustom> getAll();
    com.example.demo.JPA.entity.LoaiDe add(LoaiDeRequest request);
    Boolean delete(Long id);
    com.example.demo.JPA.entity.LoaiDe update (com.example.demo.JPA.entity.LoaiDe loaiDe, Long ma);

}
