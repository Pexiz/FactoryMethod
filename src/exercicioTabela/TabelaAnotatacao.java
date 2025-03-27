package exercicioTabela;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface TabelaAnotatacao {
    String nomeTabela();
}
