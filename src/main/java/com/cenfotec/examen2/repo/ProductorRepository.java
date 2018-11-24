package com.cenfotec.examen2.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cenfotec.examen2.core.Productor;

public interface ProductorRepository extends JpaRepository<Productor, Long> {
	
	List<Productor> findByNombreContaining(String nombre);
	
}