package comparable;


import aplication.Produto;
import comparable.Produto01;

import java.util.Set;
import java.util.TreeSet;

public class Aplicationt01 {

    Produto p1 = new Produto(4, "Arroz");
    Produto p2 = new Produto(3, "feijao");
    Produto p3 = new Produto(2, "macarrão");
    Produto p4 = new Produto(1, "lasanha");
    Produto p5 = new Produto(5, "trigo");

    Set<Produto> produtos = new TreeSet<>();
}
