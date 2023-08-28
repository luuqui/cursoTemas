
package com.ej.cursoEstudiantes.controller;

import com.ej.cursoEstudiantes.models.Tema;
import com.ej.cursoEstudiantes.service.ITemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemaController {
    
    @Autowired
    private ITemaService servTem;
    
    @PostMapping("/crearTema")
    public String saveTema (@RequestBody Tema tema) {
        servTem.saveTema(tema);
        return "El tema se guardo correctamente";
    }
    
    @PutMapping("/editarTema")
    public String editarTema(@RequestBody Tema tema){
        servTem.editarTema(tema);
        return "El tema se edito correctamente";
    }
    
}
