package com.ej.cursoEstudiantes.repository;

import com.ej.cursoEstudiantes.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository <Curso, Long>{
  
}
