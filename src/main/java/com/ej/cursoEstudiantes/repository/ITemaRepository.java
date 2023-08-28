
package com.ej.cursoEstudiantes.repository;

import com.ej.cursoEstudiantes.models.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository <Tema, Long>{
}
