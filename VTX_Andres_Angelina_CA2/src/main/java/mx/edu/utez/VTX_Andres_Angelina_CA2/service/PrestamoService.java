package mx.edu.utez.VTX_Andres_Angelina_CA2.service;

import mx.edu.utez.VTX_Andres_Angelina_CA2.controller.dto.PrestamoDTO;
import mx.edu.utez.VTX_Andres_Angelina_CA2.exception.CustomException;
import mx.edu.utez.VTX_Andres_Angelina_CA2.model.Estado;
import mx.edu.utez.VTX_Andres_Angelina_CA2.model.Prestamo;
import mx.edu.utez.VTX_Andres_Angelina_CA2.model.Videojuego;
import mx.edu.utez.VTX_Andres_Angelina_CA2.repository.PrestamoRepository;
import mx.edu.utez.VTX_Andres_Angelina_CA2.repository.VideoJuegoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PrestamoService {
    private final VideoJuegoRepository  videojuegorepository;

    private final PrestamoRepository prestamoRepository;

    public PrestamoService( VideoJuegoRepository videoJuegoRepository, PrestamoRepository prestamoRepository){
        this.prestamoRepository = prestamoRepository;
        this.videojuegorepository = videoJuegoRepository;

    }

    public Prestamo crearPrestamo(PrestamoDTO dto){
        Videojuego videojuego = videojuegorepository.findById(dto.getId()).orElseThrow(() -> new CustomException("No exiate el videojuego"));

        if (videojuego.getDisponible() != true){
            throw  new CustomException("No esta disponible");
        }

        Prestamo prestamo = new Prestamo();
        prestamo.setNombreSolicitante(dto.getNombreSolicitante());
        prestamo.setFechaPrestamo(LocalDate.now());
        prestamo.setFechaDevolucion(LocalDate.now().plusDays(7));
        prestamo.setEstado(Estado.ACTIVO);
        prestamo.setVideojuego(videojuego);

        return prestamoRepository.save(prestamo);
    }

    public Prestamo cancelarPrestamo(Long id){
        Prestamo prestamo = prestamoRepository.findById(id).orElseThrow(() -> new CustomException("Ese videojuego no existe"));
        if (prestamo.getEstado() != Estado.ACTIVO){
            throw new CustomException("No se puede cancelar lo que no esta activo");
        }
        prestamo.setEstado(Estado.CANCELADO);
        return prestamoRepository.save(prestamo);
    }
}
