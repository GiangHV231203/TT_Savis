package com.example.demo.dbo;

import com.example.demo.JPA.entity.MauSac;
import com.example.demo.JPA.entity.NhaSanXuat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NhaSanXuatRequest {

    private String ten;
    private Integer trangThai;


    public NhaSanXuat dto(NhaSanXuat sp){
        sp.setTen(this.getTen());
        sp.setTrangThai(this.getTrangThai());
        return sp;
    }
}
