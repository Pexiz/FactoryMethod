package Stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExemploFilter {
    
    List<Pessoa> pessoaList = new Pessoa().populaPessoas();
    
    Stream<Pessoa> streamNacionalidade = pessoaList.stream()
            .filter(essaPessoaVariavelFor -> essaPessoaVariavelFor.getNacionalidade().equals("Brasil"));
    
        Predicate<Pessoa> pred = pessoa -> pessoa.getNacionalidade().equals("Brasil"); // aqui eu CRIEI uma PREDICAÇÃO
        Stream<Pessoa> stream1 = pessoaList.stream().filter(pred);
    
}
