package med.voll.api.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @PostMapping
    public void RegistrarMedico(@RequestBody DatosRegistroMedicos datosRegistroMedicos){
        System.out.println(datosRegistroMedicos);
    }
}

