package com.ej.cursoEstudiantes.controller;

import com.ej.cursoEstudiantes.dto.CursoTemaDTO;
import com.ej.cursoEstudiantes.models.Curso;
import com.ej.cursoEstudiantes.service.ICursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    
    @Autowired
    private ICursoService servCur;
    
    @GetMapping("/traer")
    public List<Curso> getCursos(){
        return servCur.getCursos();
    }
    
    @GetMapping("/traer/java")
    public List<Curso> getCursosJava(){
        return servCur.getCursosJava();
    }
    
    @PostMapping("/crear")
    public String crearCurso(@RequestBody Curso curso){
        servCur.saveCurso(curso);
        return "La persona se guardo correctamente";
    }
    
    @PutMapping("/editar")
    public String editCurso(@RequestBody Curso curso){
        servCur.editCurso(curso);
        return "Se edito correctamente";
    }
    
    @GetMapping("/cursos/temas/{id_curso}")
    public CursoTemaDTO temasPorCurso (@PathVariable Long id_curso){
        return servCur.temasPorCurso(id_curso);
    }
}
