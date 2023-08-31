package moderna.cadastro.service;

import moderna.cadastro.model.Pessoa;
import moderna.cadastro.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa salvarPessoa(Pessoa pessoa) throws Exception {
       //o "var" respeita o retorno do método
       var pessoaSalva = buscarPessoaPorDocumento(pessoa.getDocumento());

       //verificar se o documento já existe
       if (pessoaSalva.isEmpty()){
           //invocar o ".save" de repository
           return pessoaRepository.save(pessoa);
       }else {
           throw new Exception("Cliente existente");
       }
    }

    public void deletarPorId(Long id) throws Exception {
        var pessoaSalva = pessoaRepository.findById(id);
        if (pessoaSalva.isPresent()){
            pessoaRepository.deleteById(id);
        }else {
            throw new Exception("Cliente não existente");
        }
    }

    public Optional<Pessoa> buscarPorId(Long id) throws Exception{
        return Optional.ofNullable(pessoaRepository.findById(id)
                .orElseThrow(()-> new Exception("Cliente não existe")));
    }

    /*Outra opção para o método acima

    public Optional<Pessoa> buscarPorID(Long id) throws Exception{
        var clienteSalvo = pessoaRepository.findById(id);
        if (clienteSalvo.isEmpty()){
            return clienteSalvo;
        }else {
            throw new Exception("Cliente não existe");
        }
    }*/

    //MÉTODOS AUXILIARES
    private Optional<Pessoa> buscarPessoaPorDocumento(String documento){
        return pessoaRepository.findByDocumento(documento);
    }

}
