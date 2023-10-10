package com.example.demo.service;

import com.example.demo.dbo.MauSacRequest;
import com.example.demo.dbo.MauSauCustom;
import com.example.demo.dbo.NhaSanXuatCustom;
import com.example.demo.dbo.NhaSanXuatRequest;

import java.util.List;

public interface NhaSanXuatService {

    List<NhaSanXuatCustom> getAll();
    com.example.demo.JPA.entity.NhaSanXuat add(NhaSanXuatRequest request);
    Boolean delete(Long id);
    com.example.demo.JPA.entity.NhaSanXuat update (com.example.demo.JPA.entity.NhaSanXuat nhaSanXuat, Long ma);
}
