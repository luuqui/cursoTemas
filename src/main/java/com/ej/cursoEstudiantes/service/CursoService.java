
package com.ej.cursoEstudiantes.service;

import com.ej.cursoEstudiantes.dto.CursoTemaDTO;
import com.ej.cursoEstudiantes.models.Curso;
import com.ej.cursoEstudiantes.repository.ICursoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements ICursoService{
    
    @Autowired
    private ICursoRepository repocurs;

    @Override
    public String saveCurso(Curso curso) {
        repocurs.save(curso);
        return "Se guardo el curso correctamente";
    }

    @Override
    public List<Curso> getCursos() {
        List<Curso> listaCursos = repocurs.findAll();
        return listaCursos;
    }

    @Override
    public List<Curso> getCursosJava() {
        String palabraClave = "Java";
        String textoComparar;
        
        List<Curso> listaCursos = this.getCursos();
        List<Curso> listaCursosJava = new ArrayList<Curso>();
        
        for (Curso cur : listaCursos){
            textoComparar = cur.getNombre();
            boolean contieneJava = textoComparar.contains(palabraClave);
            if(contieneJava){
                listaCursosJava.add(cur);
            }
        }
        
        return listaCursosJava;
    }

    @Override
    public void editCurso(Curso curso) {
        this.saveCurso(curso);
    }

    @Override
    public CursoTemaDTO temasPorCurso(Long id_curso) {
        
       CursoTemaDTO curTemDTO = new CursoTemaDTO();
       Curso curso = this.findCurso(id_curso);
       curTemDTO.setNombreCurso(curso.getNombre());
       curTemDTO.setListaTemas(curso.getLista_temas());
       
       return curTemDTO;
    }

    @Override
    public Curso findCurso(Long id) {
        return repocurs.findById(id).orElse(null);
    }

    
}
