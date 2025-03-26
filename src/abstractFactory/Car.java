package abstractFactory;

public abstract class Car {
    private int horsePower;
    private String fuelSource;
    private String color;
    
    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }
    
    public void startEngine() {
        System.out.println("The engine of " + this.getClass().getSimpleName() + " has started.");
    }
}