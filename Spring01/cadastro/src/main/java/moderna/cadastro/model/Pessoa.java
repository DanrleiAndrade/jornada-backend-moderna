package moderna.cadastro.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity //Para que a classe se torne uma tabela
@Data
@Table(name = "db_pessoa") //Renomear o nome da tabela, para diferenciar da classe
public class Pessoa {

    @Id //Chave primária - Primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //Auto incremento
    private Long id;
    @Column(length = 55) //Propriedades da coluna nome
    private String nome;
    private String documento;
    private String email;
    private String dataNascimento;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn (name = "pessoa_id")
    private List<Contato> contatos;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn (name = "pessoa_id")
    private List<Endereco> enderecos;

}
