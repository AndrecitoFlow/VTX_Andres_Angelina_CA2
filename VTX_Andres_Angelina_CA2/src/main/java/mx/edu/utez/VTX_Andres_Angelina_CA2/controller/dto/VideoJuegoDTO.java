package mx.edu.utez.VTX_Andres_Angelina_CA2.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class VideoJuegoDTO {

    @NotBlank(message = "COmo se que jugar si no me pone el nombre rey es obligatorio Pay")
    private String titulo;

    @NotBlank(message = "Nintendo Pllay dime la plataforma")
    private String plataforma;

    @NotNull(message = "DIme si esta disponible")
    private Boolean disponible;
}
