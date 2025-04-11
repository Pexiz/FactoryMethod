package Stream;

import java.util.List;

public class ExemplosCount {
    
    
    public static void main(String[] args) {
        
        List<Pessoa> pessoaList = new Pessoa().populaPessoas();

       long count = pessoaList.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .count();  // operação final
        
        System.out.println(count); // vai contar QUANTAS pessoas que entram ali certinho nos filtros
        
        long count2 = pessoaList.stream()
                .filter(pessoa -> pessoa.getNome().startsWith("R"))
                .count();  // operação final
        
        System.out.println(count2); // vai contar QUANTAS pessoas que entram ali certinho nos filtros
        
        
        
    }
}
