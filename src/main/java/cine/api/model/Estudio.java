package cine.api.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "estudio")
public class Estudio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstudio;

    @Column(length = 20)
    private String nombre;

    @Column
    private String direccion;

    @OneToMany
    private List<Pelicula> pelicula;

}
