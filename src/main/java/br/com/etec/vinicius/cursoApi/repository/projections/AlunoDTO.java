package br.com.etec.vinicius.cursoApi.repository.projections;

public class AlunoDTO {
    private Long id;
    private String nomealuno;
    private String nomecidade;
    private String uf;
    private String nomecurso;

    public AlunoDTO(Long id, String nomealuno, String nomecidade, String uf, String nomecurso) {
        this.id = id;
        this.nomealuno = nomealuno;
        this.nomecidade = nomecidade;
        this.uf = uf;
        this.nomecurso = nomecurso;
    }
}
