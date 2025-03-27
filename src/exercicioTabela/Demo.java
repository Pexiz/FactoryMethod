package exercicioTabela;

import java.lang.reflect.Field;

public class Demo {
    
    @TabelaAnotatacao(nomeTabela = "MinhaTabela123")
    private String campo;
    
    public static void main(String[] args) throws NoSuchFieldException {
        
            Field campo = Demo.class.getDeclaredField("campo");
            if (campo.isAnnotationPresent(TabelaAnotatacao.class)) {
                TabelaAnotatacao anotacao = campo.getAnnotation(TabelaAnotatacao.class);
                
                System.out.println("Nome da Tabela: " + anotacao.nomeTabela());
            }

    }
}
