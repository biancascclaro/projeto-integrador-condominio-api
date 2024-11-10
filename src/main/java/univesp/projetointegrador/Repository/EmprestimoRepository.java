package univesp.projetointegrador.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import univesp.projetointegrador.Model.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
}
