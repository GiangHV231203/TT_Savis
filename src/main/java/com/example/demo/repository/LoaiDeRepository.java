package com.example.demo.repository;

import com.example.demo.JPA.entity.LoaiDe;
import com.example.demo.dbo.LoaiDeCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoaiDeRepository extends JpaRepository<LoaiDe, Long> {


    @Query(value = "select LoaiDe.Ten, LoaiDe.MoTa from LoaiDe",nativeQuery = true)
    List<LoaiDeCustom>getAllLoaiDe();
}
