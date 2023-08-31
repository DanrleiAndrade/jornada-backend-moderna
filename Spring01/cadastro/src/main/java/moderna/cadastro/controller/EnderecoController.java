package moderna.cadastro.controller;

import lombok.AllArgsConstructor;
import moderna.cadastro.model.Endereco;
import moderna.cadastro.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/endereco")
@AllArgsConstructor
public class EnderecoController {

    //GET = buscar info
    //POST = enviar info
    //PUT = editar info
    //DELETE = apagar info

    private EnderecoRepository enderecoRepository;

    @GetMapping("/texto-endereco")
    public String mostrarTexto(){
        return "Sejam bem-vindos a minha primeira API Rest";
    }

    @PostMapping("/salvar")
    public Endereco salvar(@RequestBody Endereco endereco){
        return enderecoRepository.save(endereco);
    }

    @GetMapping("/listar-todos")
    public List<Endereco> listarTodos(){
        return enderecoRepository.findAll();
    }

    @GetMapping("buscar/{id}")
    public Optional<Endereco> buscarPorId(@PathVariable Long id){
        return enderecoRepository.findById(id);
    }

    @DeleteMapping("deletar-todos")
    public void deletarTodos(){
        enderecoRepository.deleteAll();
    }

    @DeleteMapping("deletar/{id}")
    public void deletarPorId(@PathVariable Long id){
        enderecoRepository.deleteById(id);
    }

}
