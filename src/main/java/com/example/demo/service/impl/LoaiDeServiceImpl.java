package com.example.demo.service.impl;

import com.example.demo.JPA.entity.LoaiDe;
import com.example.demo.dbo.LoaiDeCustom;
import com.example.demo.dbo.LoaiDeRequest;
import com.example.demo.repository.LoaiDeRepository;
import com.example.demo.service.LoaiDeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class LoaiDeServiceImpl implements LoaiDeService {

    @Autowired
    private LoaiDeRepository repository;

    public List<LoaiDeCustom> getAll(){
        return repository.getAllLoaiDe();
    }

    public com.example.demo.JPA.entity.LoaiDe add(LoaiDeRequest request){
        com.example.demo.JPA.entity.LoaiDe sp = request.dto(new com.example.demo.JPA.entity.LoaiDe());

        return repository.save(sp);
    }
    public Boolean delete(Long id){
        Optional<com.example.demo.JPA.entity.LoaiDe> optional = repository.findById(id);
        if (optional.isPresent()){
            com.example.demo.JPA.entity.LoaiDe sp = optional.get();
            repository.delete(sp);
            return true;
        }else {
            return false;
        }
    }
    public com.example.demo.JPA.entity.LoaiDe update (com.example.demo.JPA.entity.LoaiDe loaiDe, Long ma){
        Optional<com.example.demo.JPA.entity.LoaiDe> optional = repository.findById(ma);
        return optional.map(o-> {
            // o.setMaLoaiDe(loaiDe.getMaLoaiDe());
            o.setTen(loaiDe.getTen());
            o.setMoTa(loaiDe.getMoTa());
            return repository.save(o);
        }).orElse(null);

    }

}
