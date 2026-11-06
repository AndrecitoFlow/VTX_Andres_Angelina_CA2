package mx.edu.utez.VTX_Andres_Angelina_CA2.controller.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.VTX_Andres_Angelina_CA2.model.Estado;
import mx.edu.utez.VTX_Andres_Angelina_CA2.model.Videojuego;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class PrestamoDTO {

    @NotNull(message = "ID obligatorio")
    private Long id;

    @NotBlank(message = "Nombre Obligatorio")
    private String nombreSolicitante;

    @NotNull(message = "La fecha de inicio es obligatoria")
    private LocalDate fechaPrestamo;


    @NotNull(message = "La fecha de devolucion es obligatoria")
    private LocalDate fechaDevolucion;


}
