package mx.edu.utez.VTX_Andres_Angelina_CA2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "videojuego")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Videojuego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String plataforma;

    private Boolean disponible;

}
