package mx.edu.utez.VTX_Andres_Angelina_CA2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "prestamo")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreSolicitante;

    private LocalDate fechaPrestamo;

    private LocalDate fechaDevolucion;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "id_videojuego")
    private Videojuego videojuego;
}
