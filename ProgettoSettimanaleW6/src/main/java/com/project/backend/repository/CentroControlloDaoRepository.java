
package com.project.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.backend.model.CentroControllo;

@Repository
public interface CentroControlloDaoRepository extends JpaRepository<CentroControllo, Long> {
	
}
