package univesp.projetointegrador.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import univesp.projetointegrador.Model.Mensagem;
import univesp.projetointegrador.Repository.MensagemRepository;

import java.util.List;

@RestController
@RequestMapping("/mensagens")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MensagemController {


    private final MensagemRepository mensagemRepository;

    @Autowired
    public MensagemController(MensagemRepository mensagemRepository) {
        this.mensagemRepository = mensagemRepository;
    }


    @GetMapping
    public List<Mensagem> getAllMensagens() {
        return mensagemRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mensagem getMensagemById(@PathVariable Long id) {
        return mensagemRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Mensagem createMensagem(@RequestBody Mensagem mensagem) {
        return mensagemRepository.save(mensagem);
    }
}
