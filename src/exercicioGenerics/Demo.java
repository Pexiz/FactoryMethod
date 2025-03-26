package exercicioGenerics;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    
    public static void main(String[] args) {
        
        List<Carro> listaDeCarros = new ArrayList<>();
        
        listaDeCarros.add(new HondaCivic());
        listaDeCarros.add(new ToyotaCorolla());
        
        for (Carro carro : listaDeCarros) {
            carro.exibirDetalhes();
        }
        
        
    }

    
}
