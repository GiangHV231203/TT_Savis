package com.example.demo.dbo;


import com.example.demo.JPA.entity.LoaiSanPham;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class LoaiSanPhamRequest {
  //  private Long maLoaiSanPham;

    private String ten;

    private String moTa;

    public LoaiSanPham dto(LoaiSanPham sp){
        sp.setTen(this.getTen());
        sp.setMoTa(this.getMoTa());
        return sp;
    }
}
