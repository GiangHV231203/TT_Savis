package com.example.demo.service.impl;

import com.example.demo.JPA.entity.LoaiSanPham;
import com.example.demo.dbo.LoaiSanPhamCustom;
import com.example.demo.dbo.LoaiSanPhamRequest;
import com.example.demo.repository.LoaiSanPhamRepository;
import com.example.demo.service.LoaiSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoaiSanPhamServiceImpl implements LoaiSanPhamService {

    @Autowired
    private LoaiSanPhamRepository repository;

    public List<LoaiSanPhamCustom> getAll(){
        return repository.getAllLoaiSanPham();
    }

    //public Page<LoaiSanPham>
    public LoaiSanPham add(LoaiSanPhamRequest request){
        LoaiSanPham sp = request.dto(new LoaiSanPham());

        return repository.save(sp);
    }
    public Boolean delete(Long id){
        Optional<LoaiSanPham> optional = repository.findById(id);
        if (optional.isPresent()){
            LoaiSanPham sp = optional.get();
            repository.delete(sp);
            return true;
        }else {
            return false;
        }
    }

    public LoaiSanPham update (LoaiSanPham loaiSanPham, Long ma){
        Optional<LoaiSanPham> optional = repository.findById(ma);
        return optional.map(o-> {

            o.setTen(loaiSanPham.getTen());
            o.setMoTa(loaiSanPham.getMoTa());
            return repository.save(o);
        }).orElse(null);

    }
}
