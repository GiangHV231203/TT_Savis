package com.example.demo.service;

import com.example.demo.dbo.MauSacRequest;
import com.example.demo.dbo.MauSauCustom;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MauSacService {


    List<MauSauCustom> getAll();
    com.example.demo.JPA.entity.MauSac add(MauSacRequest request);
    Boolean delete(Long id);
    com.example.demo.JPA.entity.MauSac update (com.example.demo.JPA.entity.MauSac mauSac, Long ma);

}
