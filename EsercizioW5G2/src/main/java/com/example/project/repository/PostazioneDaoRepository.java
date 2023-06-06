package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Postazione;

@Repository
public interface PostazioneDaoRepository extends JpaRepository <Postazione, Long>{

}
