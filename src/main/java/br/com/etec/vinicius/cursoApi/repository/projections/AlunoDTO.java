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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomealuno() {
        return nomealuno;
    }

    public void setNomealuno(String nomealuno) {
        this.nomealuno = nomealuno;
    }

    public String getNomecidade() {
        return nomecidade;
    }

    public void setNomecidade(String nomecidade) {
        this.nomecidade = nomecidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }
}
