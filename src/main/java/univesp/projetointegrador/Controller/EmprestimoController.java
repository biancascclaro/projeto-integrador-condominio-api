package univesp.projetointegrador.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import univesp.projetointegrador.Model.Emprestimo;
import univesp.projetointegrador.Repository.EmprestimoRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emprestimos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmprestimoController {

    private final EmprestimoRepository emprestimoRepository;

    public EmprestimoController(EmprestimoRepository emprestimoRepository) {
        this.emprestimoRepository = emprestimoRepository;
    }

    @GetMapping
    public List<Emprestimo> getAllEmprestimos() {
        return emprestimoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Emprestimo> getEmprestimoById(@PathVariable Long id) {
        Optional<Emprestimo> emprestimo = emprestimoRepository.findById(id);
        return emprestimo.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Emprestimo> createEmprestimo(@RequestBody Emprestimo emprestimo) {
        Emprestimo novoEmprestimo = emprestimoRepository.save(emprestimo);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoEmprestimo);
    }

}
