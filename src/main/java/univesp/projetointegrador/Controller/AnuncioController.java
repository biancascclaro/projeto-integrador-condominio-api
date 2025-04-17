package univesp.projetointegrador.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import univesp.projetointegrador.Model.Anuncio;
import univesp.projetointegrador.Repository.AnuncioRepository;

import java.util.List;

@RestController
@RequestMapping("/anuncios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AnuncioController {


    private final AnuncioRepository anuncioRepository;

    @Autowired
    public AnuncioController(AnuncioRepository anuncioRepository) {
        this.anuncioRepository = anuncioRepository;
    }


    @GetMapping
    public List<Anuncio> getAllAnuncios() {
        return anuncioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Anuncio getAnuncioById(@PathVariable Long id) {
        return anuncioRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Anuncio createAnuncio(@RequestBody Anuncio anuncio) {
        return anuncioRepository.save(anuncio);
    }
}
