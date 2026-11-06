package mx.edu.utez.VTX_Andres_Angelina_CA2.repository;

import mx.edu.utez.VTX_Andres_Angelina_CA2.model.Estado;
import mx.edu.utez.VTX_Andres_Angelina_CA2.model.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoJuegoRepository extends JpaRepository<Videojuego, Long> {
}
