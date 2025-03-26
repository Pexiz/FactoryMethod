package exercicioGenerics;

class ToyotaCorolla extends Carro {
    public ToyotaCorolla() {
        super("Toyota Corolla");
    }
    
    @Override
    public void exibirDetalhes() {
        System.out.println("Modelo: " + getModelo() + " - Um sedan durável da Toyota.");
    }
}
