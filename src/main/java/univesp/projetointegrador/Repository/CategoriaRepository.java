package univesp.projetointegrador.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import univesp.projetointegrador.Model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
