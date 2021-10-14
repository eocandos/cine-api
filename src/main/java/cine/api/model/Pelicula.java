package cine.api.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="pelicula")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPelicula;


    @Column(length = 20)
    private String nombre;

    @Column
    private Integer anio;

    @Column
    private Date fechaLanzamiento;

    @ManyToOne
    @JoinColumn(name="idEstudio")
    private Estudio estudio;

}
