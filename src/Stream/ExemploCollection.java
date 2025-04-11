package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ExemploCollection {
    
    public static List<Pessoa> pessoaList = new Pessoa().populaPessoas();
    
    public static void main(String[] args) {
        
       List<Pessoa> listaB = pessoaList.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList());
       
        listaB.forEach(System.out::println);
        
        pessoaList.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        
        // MESMA COISa
        
        
        Set<Pessoa> set = pessoaList.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toSet());
        
        ArrayList<Pessoa> arrayList = pessoaList.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toCollection(ArrayList::new));
        
        Map<Integer,List<Pessoa>> agrupamento = pessoaList.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.groupingBy(Pessoa::getIdade));
        
        
    }
}


        
       
        


