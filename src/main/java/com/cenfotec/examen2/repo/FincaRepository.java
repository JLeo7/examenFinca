package com.cenfotec.examen2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cenfotec.examen2.core.Finca;

public interface FincaRepository extends JpaRepository<Finca, Long> {
	
}