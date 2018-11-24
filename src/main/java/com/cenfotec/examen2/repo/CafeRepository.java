package com.cenfotec.examen2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cenfotec.examen2.core.Cafe;

public interface CafeRepository extends JpaRepository<Cafe, Long> {
	
}