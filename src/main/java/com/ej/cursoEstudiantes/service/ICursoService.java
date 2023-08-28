
package com.ej.cursoEstudiantes.service;

import com.ej.cursoEstudiantes.dto.CursoTemaDTO;
import com.ej.cursoEstudiantes.models.Curso;
import java.util.List;

public interface ICursoService {
    
    //metodo para dar de alta un curso
    public String saveCurso (Curso curso);
    
    //metodo para traer todos los cursos
    public List<Curso> getCursos();
    
    //metodo para traer los cursos "Java"
    public List<Curso> getCursosJava();
    
    //metodo para editar datos de un curso
    public void editCurso(Curso curso);
    
    //find curso
    public Curso findCurso(Long id);
    
    //metodo para obtener DTO
    public CursoTemaDTO temasPorCurso(Long id_curso);
    
}
