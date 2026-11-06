package mx.edu.utez.VTX_Andres_Angelina_CA2.controller;

import jakarta.validation.Valid;
import mx.edu.utez.VTX_Andres_Angelina_CA2.controller.dto.VideoJuegoDTO;
import mx.edu.utez.VTX_Andres_Angelina_CA2.model.Videojuego;
import mx.edu.utez.VTX_Andres_Angelina_CA2.service.VideojuegoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/videojuegos")
@CrossOrigin("*")
public class VideojuegoController {

    private final VideojuegoService videojuegoService;

    public VideojuegoController(VideojuegoService videojuegoService){
        this.videojuegoService = videojuegoService;
    }

    @PostMapping
    public ResponseEntity<Videojuego> registrar(@RequestBody @Valid VideoJuegoDTO payload) {
        return  ResponseEntity.status(HttpStatus.CREATED).body((videojuegoService.refistrarVideoJuego(payload)));
    }
}
