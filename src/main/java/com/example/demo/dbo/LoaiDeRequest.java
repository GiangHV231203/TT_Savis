package com.example.demo.dbo;

import com.example.demo.JPA.entity.LoaiDe;
import com.example.demo.JPA.entity.LoaiSanPham;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoaiDeRequest {
    private String ten;

    private String moTa;

    public LoaiDe dto(LoaiDe sp){
        sp.setTen(this.getTen());
        sp.setMoTa(this.getMoTa());
        return sp;
    }
}
