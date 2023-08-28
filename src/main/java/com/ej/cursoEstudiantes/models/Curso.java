package com.ej.cursoEstudiantes.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_curso;
    private String nombre;
    private String modalidad;
    private LocalDate fecha_finalizacion;
    @OneToMany(mappedBy = "curso")
    private List<Tema> lista_temas;
                  
    public Curso(){}

    public Curso(Long id_curso, String nombre, String modalidad, LocalDate fecha_finalizacion, List<Tema> lista_temas) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fecha_finalizacion = fecha_finalizacion;
        this.lista_temas = lista_temas;
    }    
    
}
