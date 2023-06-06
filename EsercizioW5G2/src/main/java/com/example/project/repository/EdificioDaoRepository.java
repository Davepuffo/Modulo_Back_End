package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Edificio;

@Repository
public interface EdificioDaoRepository extends JpaRepository <Edificio, Long>{

}
