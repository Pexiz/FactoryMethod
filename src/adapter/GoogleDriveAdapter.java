package adapter;

import java.io.File;
import java.util.Arrays;

public class GoogleDriveAdapter implements PersistenteArquivos {
    
    private GoogleDriveFile googleDriveFile;
    
    @Override
    public void gravar(File file) {
    
    }
    
    @Override
    public File ler(String caminho) {
       
       byte[] fileDrive = googleDriveFile.get(caminho);
        return new File(Arrays.toString(fileDrive));
     
        
    }
}
