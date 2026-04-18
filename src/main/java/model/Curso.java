package com.vivianacalderon.cursos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity // Indica que esta clase se guardará en la base de datos
@Data   // Genera automáticamente los Getters, Setters y Constructores
public class Curso {

    @Id // Define que el ID es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // El ID se crea solo (1, 2, 3...)
    private Long id;

    private String nombre;
    private String educacion;
    private String nivel;
    private String instructor;
    private Double costo;
}
