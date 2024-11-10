package univesp.projetointegrador.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import univesp.projetointegrador.Model.Exemplar;
import univesp.projetointegrador.Repository.ExemplarRepository;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/exemplares")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ExemplarController {

    private final ExemplarRepository exemplarRepository;

    public ExemplarController(ExemplarRepository exemplarRepository) {
        this.exemplarRepository = exemplarRepository;
    }

    @GetMapping
    public List<Exemplar> getAllExemplares() {
        return exemplarRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exemplar> getExemplarById(@PathVariable long id) {
        Optional<Exemplar> exemplar = exemplarRepository.findById(id);
        return exemplar.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Exemplar> createExemplar(@RequestBody Exemplar exemplar) {
        Exemplar novoExemplar = exemplarRepository.save(exemplar);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoExemplar);
    }
}
