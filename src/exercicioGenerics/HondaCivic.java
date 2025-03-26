package exercicioGenerics;

class HondaCivic extends Carro {
    public HondaCivic() {
        super("Honda Civic");
    }
    
    @Override
    public void exibirDetalhes() {
        System.out.println("Modelo: " + getModelo() + " - Um sedan confiável da Honda.");
    }
}
