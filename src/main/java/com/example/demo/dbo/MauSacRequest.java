package com.example.demo.dbo;


import com.example.demo.JPA.entity.LoaiDe;
import com.example.demo.JPA.entity.MauSac;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MauSacRequest {

    private String ten;



    public MauSac dto(MauSac sp){
        sp.setTen(this.getTen());

        return sp;
    }

}
