package reflection.exemplos;

public class Produto {
    
    private long codigo;
    
    private String descricao;
    
    private Double valor;
    
    public Produto() {

    }
    
    public long getCodigo() {
        return codigo;
    }
    
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Double getValor() {
        return valor;
    }
    
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public void setValor(double valor )
    {
        this.valor = valor;
    }

}
