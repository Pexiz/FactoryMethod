package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExemploMapStream {
    
    public static void main(String[] args)
    {
        List<Pessoa> pessoaList = new Pessoa().populaPessoas();
        
        IntStream steam1 = pessoaList.stream()
                .mapToInt(Pessoa::getIdade);
             
      Stream<Integer> transformei = pessoaList.stream()
                .map(Pessoa::getIdade);
        
        IntStream transformei1 = pessoaList.stream()
                .mapToInt(Pessoa::getIdade);
        
        
        Stream<Integer> steam = pessoaList.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade);       // exemplo mais cheio
     
    }
}
