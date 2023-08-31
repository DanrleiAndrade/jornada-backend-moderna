package moderna.cadastro.repository;

import moderna.cadastro.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    Optional<Pessoa> findByDocumento(String documento);
    //select * from pessoa p where p.documento = documento;
}
