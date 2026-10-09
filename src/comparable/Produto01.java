package comparable;

import java.util.HashSet;
import java.util.Set;

public class Produto01 implements Comparable<Produto01>{

    private int id;
    private String descricao;
    private double valor;

    public Produto01(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor(){
        return valor;
    }

    @Override
    public String toString() {
        return id + " - " + descricao;
    }

    public static void main(String[] args) {

        aplication.Produto p1 = new aplication.Produto(1, "Produto 1");
        aplication.Produto p2 = new aplication.Produto(2, "Produto 2");

        aplication.Produto p3 = p2;

        Set<aplication.Produto> produtos = new HashSet<>();

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        for (aplication.Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    @Override
    public int compareTo(Produto01 o) {
        return 0;
    }
}
