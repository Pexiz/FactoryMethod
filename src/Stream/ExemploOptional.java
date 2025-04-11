package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class ExemploOptional {
    
    public static void main(String[] args) {
        
        List<Pessoa> pessoaList = new Pessoa().populaPessoas();
        
       Optional<Pessoa> opcional = pessoaList.stream()
               .max(Comparator.comparing(Pessoa::getIdade));
       
       if (opcional.isPresent())
       {
           System.out.println(opcional.get());
       }
       
       opcional.ifPresent(System.out::println);

    
    }
}
