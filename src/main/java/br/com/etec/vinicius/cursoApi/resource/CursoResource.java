package br.com.etec.vinicius.cursoApi.resource;

import br.com.etec.vinicius.cursoApi.model.Curso;
import br.com.etec.vinicius.cursoApi.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoResource {

    @Autowired
    private CursoRepository cursoRepository;

    @RequestMapping("/todos")
    public List<Curso> ListarTodosCursos() {
        return cursoRepository.findAll();
    }
}
