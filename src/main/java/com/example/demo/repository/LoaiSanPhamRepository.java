package com.example.demo.repository;

import com.example.demo.JPA.entity.LoaiSanPham;
import com.example.demo.dbo.LoaiSanPhamCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LoaiSanPhamRepository extends JpaRepository<LoaiSanPham, Long> {

        @Query(value = "select LoaiSp.Ten, LoaiSp.MoTa from LoaiSp",
        nativeQuery = true)

    List<LoaiSanPhamCustom>getAllLoaiSanPham();
}
