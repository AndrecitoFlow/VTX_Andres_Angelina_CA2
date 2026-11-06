package mx.edu.utez.VTX_Andres_Angelina_CA2.service;

import mx.edu.utez.VTX_Andres_Angelina_CA2.controller.dto.VideoJuegoDTO;
import mx.edu.utez.VTX_Andres_Angelina_CA2.model.Videojuego;
import mx.edu.utez.VTX_Andres_Angelina_CA2.repository.VideoJuegoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideojuegoService {

    private final VideoJuegoRepository videoJuegoRepository;

    public VideojuegoService(VideoJuegoRepository videoJuegoRepository){
        this.videoJuegoRepository = videoJuegoRepository;
    }

    public Videojuego refistrarVideoJuego(VideoJuegoDTO dto){
        Videojuego videojuego = new Videojuego();
        videojuego.setTitulo(dto.getTitulo());
        videojuego.setPlataforma(dto.getPlataforma());
        videojuego.setDisponible(dto.getDisponible());

        return videoJuegoRepository.save(videojuego);
    }


}
