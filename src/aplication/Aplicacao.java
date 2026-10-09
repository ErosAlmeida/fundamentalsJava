
package aplication;

public class Aplicacao {

    private int id;
    private String descricao;

    public Aplicacao(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return id + " - " + getDescricao();
    }
}