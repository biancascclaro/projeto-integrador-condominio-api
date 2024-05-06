package univesp.projetointegrador.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import univesp.projetointegrador.Repository.ProblemaElevadorRepository;
import univesp.projetointegrador.Model.ProblemaElevador;

import java.util.List;


@RestController
@RequestMapping("/problemas-elevadores")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProblemaElevadorController {

    private final ProblemaElevadorRepository problemaElevadorRepository;

    @Autowired
    public ProblemaElevadorController(ProblemaElevadorRepository problemaElevadorRepository) {
        this.problemaElevadorRepository = problemaElevadorRepository;
    }

    @GetMapping
    public List<ProblemaElevador> getAllProblemasElevadores() {
        return problemaElevadorRepository.findAll();
    }

    @GetMapping("/{id}")
    public ProblemaElevador getProblemaElevadorById(@PathVariable Long id) {
        return problemaElevadorRepository.findById(id).orElse(null);
    }

    @PostMapping
    public ProblemaElevador createProblemaElevador(@RequestBody ProblemaElevador problemaElevador) {
        return problemaElevadorRepository.save(problemaElevador);
    }
}
