package moderna.cadastro.controller;

import jdk.jfr.Description;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import moderna.cadastro.model.Pessoa;
import moderna.cadastro.repository.PessoaRepository;
import moderna.cadastro.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoas")
@AllArgsConstructor
@Slf4j

public class PessoaController {

    //GET = buscar info
    //POST = enviar info
    //PUT = editar info
    //DELETE = apagar info

    private PessoaRepository pessoaRepository;
    private PessoaService pessoaService;

    //@GetMapping("/texto1")
    //public String mostrarTexto(){
       // return "Sejam bem-vindos a minha primeira API Rest";
    //}

    @PostMapping("/salvar") //Salvar no banco de dados se não existir e devolver 201. Caso já exista, mostrará o erro 400
    public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa pessoa){

        try{ //quando conseguir salvar um objeto
            log.info("Salvando uma pessoa");
            return new ResponseEntity<>(pessoaService.salvarPessoa(pessoa), HttpStatus.CREATED);

        }catch (Exception exception){ //lance um erro se o objeto não for salvo
            exception.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    //método para listar todas as pessoas
    @GetMapping("/listar-todos")
    public List<Pessoa> listarTodos(){
        return pessoaRepository.findAll();
    }

    //buscar por ID
    @GetMapping("buscar/{id}")
    public ResponseEntity<Optional<Pessoa>> buscarPorId(@PathVariable Long id){

        try{
            return new ResponseEntity<>(pessoaService.buscarPorId(id), HttpStatus.OK);
        }catch (Exception exception){
            exception.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    //delete
    @DeleteMapping("deletar-todos")
    public void deletarTodos(){
        pessoaRepository.deleteAll();
    }

    @DeleteMapping("deletar/{id}")
    public void deletarPorId(@PathVariable Long id) throws Exception {
        pessoaService.deletarPorId(id);
    }

}
