package mx.edu.utez.VTX_Andres_Angelina_CA2.controller;

import jakarta.validation.Valid;
import mx.edu.utez.VTX_Andres_Angelina_CA2.controller.dto.PrestamoDTO;
import mx.edu.utez.VTX_Andres_Angelina_CA2.model.Prestamo;
import mx.edu.utez.VTX_Andres_Angelina_CA2.service.PrestamoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registrar_prestamo")
@CrossOrigin("*")
public class PrestamoController {

    private PrestamoService prestamoService;
    public PrestamoController(PrestamoService prestamoService){
        this.prestamoService = prestamoService;
    }

    @PostMapping
    public ResponseEntity<Prestamo> crear(@RequestBody @Valid PrestamoDTO payload){
        return ResponseEntity.status(HttpStatus.CREATED).body(prestamoService.crearPrestamo(payload));
    }

    @PatchMapping("/{id}/ cancelar")
    public ResponseEntity<Prestamo> cancelar(@PathVariable Long id) {
        return ResponseEntity.ok(prestamoService.cancelarPrestamo(id));
    }

}
