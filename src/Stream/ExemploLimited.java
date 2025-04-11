package Stream;

import java.sql.ClientInfoStatus;
import java.util.List;
import java.util.stream.Stream;

public class ExemploLimited {
    
    List<Pessoa> pessoaList = new Pessoa().populaPessoas();
    
    Stream<Pessoa> limitedStream = pessoaList.stream().limit(2);
}
