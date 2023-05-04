package br.com.etec.vinicius.cursoApi.repository.filter;

public class CidadeFilter {

    private String nomecidade;
    private String uf;

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
}
