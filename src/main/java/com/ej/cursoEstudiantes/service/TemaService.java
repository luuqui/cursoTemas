package com.ej.cursoEstudiantes.service;

import com.ej.cursoEstudiantes.models.Tema;
import com.ej.cursoEstudiantes.repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemaService implements ITemaService{
    
    @Autowired
    private ITemaRepository repoTema;

    //crear tema
    @Override
    public String saveTema(Tema tema) {
        repoTema.save(tema);
        return "El tema se creo correctamente";
    }

    //editar tema
    @Override
    public String editarTema(Tema tema) {
        this.saveTema(tema);
        return "El tema se edito correctamente";
    }
    
    
}
