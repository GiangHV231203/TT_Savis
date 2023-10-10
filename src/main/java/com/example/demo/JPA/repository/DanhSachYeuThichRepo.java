package com.example.demo.JPA.repository;

import com.example.demo.JPA.entity.DanhSachYeuThich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DanhSachYeuThichRepo extends JpaRepository<DanhSachYeuThich, UUID> {
}
