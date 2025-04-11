package Stream;

import java.util.List;

public class ExemploAllMatch {
    
    public static void main(String[] args) {
        
        List<Pessoa> pessoaList = new Pessoa().populaPessoas();
        
       boolean result = pessoaList.stream()
                .allMatch(pessoa -> pessoa.getNacionalidade().equals("Brasil"));
        System.out.println(result);     // Todas as pessoas sao brazileiras: NAO
        
    }
}
