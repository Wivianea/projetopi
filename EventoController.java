package eventos.pi.Eventos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EventoController {

    @PostMapping("/Classevento")
    public String Evento() {
        System.out.println("Método Evento foi chamado!");
        return "formvento";
    }
}