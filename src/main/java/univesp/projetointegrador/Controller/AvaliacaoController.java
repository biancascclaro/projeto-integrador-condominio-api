package univesp.projetointegrador.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import univesp.projetointegrador.Model.Avaliacao;
import univesp.projetointegrador.Repository.AvaliacaoRepository;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AvaliacaoController {


    private final AvaliacaoRepository avaliacaoRepository;

    @Autowired
    public AvaliacaoController(AvaliacaoRepository avaliacaoRepository) {
        this.avaliacaoRepository = avaliacaoRepository;
    }


    @GetMapping
    public List<Avaliacao> getAllAvaliacoes() {
        return avaliacaoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Avaliacao getAvaliacaoById(@PathVariable Long id) {
        return avaliacaoRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Avaliacao createAvaliacao(@RequestBody Avaliacao avaliacao) {
        return avaliacaoRepository.save(avaliacao);
    }
}
