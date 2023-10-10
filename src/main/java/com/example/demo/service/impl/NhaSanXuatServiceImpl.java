package com.example.demo.service.impl;

import com.example.demo.JPA.entity.NhaSanXuat;
import com.example.demo.dbo.NhaSanXuatCustom;
import com.example.demo.dbo.NhaSanXuatRequest;
import com.example.demo.repository.NhaSanXuatRepository;
import com.example.demo.service.NhaSanXuatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class NhaSanXuatServiceImpl implements NhaSanXuatService {

    @Autowired
    private NhaSanXuatRepository repository;

    public List<NhaSanXuatCustom> getAll(){
        return repository.getAllNhaSanXuat();
    }

    public NhaSanXuat add(NhaSanXuatRequest request){
        NhaSanXuat sp = request.dto(new NhaSanXuat());

        return repository.save(sp);
    }
    public Boolean delete(Long id){
        Optional<NhaSanXuat> optional = repository.findById(id);
        if (optional.isPresent()){
            NhaSanXuat sp = optional.get();
            repository.delete(sp);
            return true;
        }else {
            return false;
        }
    }

    public NhaSanXuat update (NhaSanXuat nhaSanXuat, Long ma){
        Optional<NhaSanXuat> optional = repository.findById(ma);
        return optional.map(o-> {
            o.setTen(nhaSanXuat.getTen());
            o.setTrangThai(nhaSanXuat.getTrangThai());
            return repository.save(o);
        }).orElse(null);

    }
}
