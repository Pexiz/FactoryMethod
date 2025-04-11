package Stream;

import java.util.List;
import java.util.stream.Stream;

public class ExemplosForEach {
    
    public static void main(String [] args) {
        
        List<Pessoa> pessoaList = new Pessoa().populaPessoas();
        pessoaList.stream().forEach(variavel -> System.out.println(variavel));
        
        pessoaList.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .forEach(pessoa -> System.out.println(pessoa));
        
        Stream<Pessoa> variavelReceber = pessoaList.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"));
//                .forEach(pessoa -> System.out.println(pessoa)); nao funciona pq ele retorna VOID
        
        pessoaList.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))       // filtro por brasileiro
                .map(Pessoa::getIdade)           // converto em uma lista de INTEIROS apenas de idade
                .forEach(p -> System.out.println(p));         // print LN
        
        
    }
}
