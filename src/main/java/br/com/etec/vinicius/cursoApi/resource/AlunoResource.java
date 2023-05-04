package br.com.etec.vinicius.cursoApi.resource;

import br.com.etec.vinicius.cursoApi.model.Aluno;
import br.com.etec.vinicius.cursoApi.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoResource {

    @Autowired
    private AlunoRepository alunoRepository;

    @RequestMapping("/todos")
    public List<Aluno> ListarTodosAlunos() {
        return alunoRepository.findAll();
    }
}
