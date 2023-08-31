package moderna.cadastro.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name = "db_endereco")
public class Endereco {

    @Id //Chave primária - Primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 55)
    private String logradouro;
    private String bairro;
    private String numero;
    private String cep;
    private String uf;
    private String cidade;
    private String complemento;

}
