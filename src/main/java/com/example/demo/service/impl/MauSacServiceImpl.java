package com.example.demo.service.impl;

import com.example.demo.dbo.MauSacRequest;
import com.example.demo.dbo.MauSauCustom;
import com.example.demo.repository.MauSacRepository;
import com.example.demo.service.MauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MauSacServiceImpl implements MauSacService {

    @Autowired
    private MauSacRepository repository;

    public List<MauSauCustom> getAll(){
        return repository.getAllMauSac();
    }

    public com.example.demo.JPA.entity.MauSac add(MauSacRequest request){
        com.example.demo.JPA.entity.MauSac sp = request.dto(new com.example.demo.JPA.entity.MauSac());

        return repository.save(sp);
    }
    public Boolean delete(Long id){
        Optional<com.example.demo.JPA.entity.MauSac> optional = repository.findById(id);
        if (optional.isPresent()){
            com.example.demo.JPA.entity.MauSac sp = optional.get();
            repository.delete(sp);
            return true;
        }else {
            return false;
        }
    }

    public com.example.demo.JPA.entity.MauSac update (com.example.demo.JPA.entity.MauSac mauSac, Long ma){
        Optional<com.example.demo.JPA.entity.MauSac> optional = repository.findById(ma);
        return optional.map(o-> {
            o.setTen(mauSac.getTen());
            return repository.save(o);
        }).orElse(null);

    }
}
