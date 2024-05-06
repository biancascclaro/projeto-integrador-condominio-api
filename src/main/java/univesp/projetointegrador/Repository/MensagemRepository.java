package univesp.projetointegrador.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import univesp.projetointegrador.Model.Mensagem;

public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
}
