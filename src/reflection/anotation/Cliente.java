package reflection.anotation;

public class Cliente {
    
    private  String nome;
    @TipoChave("getCpf")
    
    private Long cpf;
    
    private Long tel;
    
    private String end;
    
    private Integer numero;
    
    private String cidade;
    
    private String estado;
    
    
    public Cliente(String nome, Long tel, Long cpf, String end, Integer numero, String estado, String cidade) {
        this.nome = nome;
        this.tel = tel;
        this.cpf = cpf;
        this.end = end;
        this.numero = numero;
        this.estado = estado;
        this.cidade = cidade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Long getCpf() {
        return cpf;
    }
    
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
    
    public Long getTel() {
        return tel;
    }
    
    public void setTel(Long tel) {
        this.tel = tel;
    }
    
    public String getEnd() {
        return end;
    }
    
    public void setEnd(String end) {
        this.end = end;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Integer getNumero() {
        return numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}


