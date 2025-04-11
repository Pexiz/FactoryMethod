package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExemploSorted {
    
    static void sorted() {
        
        List<Pessoa> pessoaList = new Pessoa().populaPessoas();
        
        Stream<Pessoa> stream = pessoaList.stream().sorted(Comparator.comparing(Pessoa::getNome));
        
        Stream<Pessoa> stream1 = pessoaList.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .sorted(Comparator.comparing(Pessoa::getNome));
        
        Stream<Pessoa> stream2 = pessoaList.stream()
                .sorted((valor1, valor2) -> Integer.compare(valor1.getIdade(), valor2.getIdade()));
        
        
        Stream<Pessoa> treste = pessoaList.stream()
                .sorted(Comparator.comparing(Pessoa::getIdade));
        treste.forEach(i -> System.out.println(i));


    Stream streamSorted2 = pessoaList.stream()
            .sorted((p1,p2) -> Integer.compare(p2.getIdade(), p1.getIdade()));
        streamSorted2.forEach(i -> System.out.println(i));
        
    }
}