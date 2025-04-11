package Stream;

import java.util.List;
import java.util.stream.Stream;

public class ExemploDistinct {
    
    List<Pessoa> pessoaList = new Pessoa().populaPessoas();
    
    Stream<Pessoa> distintict = pessoaList.stream()
            .distinct(); // vai filtrar baseado em equals and hashCode
    
             // ELE OLHA APENAS O EQUALS E HASHCODE ENTAO CASO FOR USAR GERAR APENAS DO QUE PRECISO ANALISAR
    
}
