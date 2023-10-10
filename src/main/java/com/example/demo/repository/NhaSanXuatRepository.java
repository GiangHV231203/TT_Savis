package com.example.demo.repository;

import com.example.demo.JPA.entity.NhaSanXuat;
import com.example.demo.dbo.NhaSanXuatCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhaSanXuatRepository extends JpaRepository<NhaSanXuat,Long> {

    @Query(value = "select NhaSanXuat.Ten,NhaSanXuat.TrangThai  from NhaSanXuat",nativeQuery = true)
    List<NhaSanXuatCustom>getAllNhaSanXuat();
}
