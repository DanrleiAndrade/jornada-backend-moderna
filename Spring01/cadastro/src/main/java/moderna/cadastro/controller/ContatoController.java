package moderna.cadastro.controller;

import lombok.AllArgsConstructor;
import moderna.cadastro.model.Contato;
import moderna.cadastro.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contato")
@AllArgsConstructor
public class ContatoController {

    //GET = buscar info
    //POST = enviar info
    //PUT = editar info
    //DELETE = apagar info

    private ContatoRepository contatoRepository;

    @GetMapping("/texto-contato")
    public String mostrarTexto(){
        return "Sejam bem-vindos a minha primeira API Rest";
    }

    @PostMapping("/salvar")
    public Contato salvar(@RequestBody Contato contato){
        return contatoRepository.save(contato);
    }

    @GetMapping("/listar-todos")
    public List<Contato> listarTodos(){
        return contatoRepository.findAll();
    }

    @GetMapping("buscar/{id}")
    public Optional<Contato> buscarPorId(@PathVariable Long id){
        return contatoRepository.findById(id);
    }

    @DeleteMapping("deletar-todos")
    public void deletarTodos(){
        contatoRepository.deleteAll();
    }

    @DeleteMapping("deletar/{id}")
    public void deletarPorId(@PathVariable Long id){
        contatoRepository.deleteById(id);
    }

}
