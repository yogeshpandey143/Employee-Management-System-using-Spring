package com.example.empapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.empapi.entity.EmpEntity;



@Repository
public interface EmpRepository extends JpaRepository<EmpEntity, Long>{

}
