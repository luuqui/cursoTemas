package com.ej.cursoEstudiantes.service;

import com.ej.cursoEstudiantes.models.Tema;

public interface ITemaService {
    //crear tema
    public String saveTema(Tema tema);
    
    //editar tema
    public String editarTema(Tema tema);
    
    
}
