package adapter;

import java.io.File;

public interface PersistenteArquivos {
    
    public void gravar(File file);
    
    public File ler(String caminho);
    
    
}
