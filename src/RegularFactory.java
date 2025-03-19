public class RegularFactory implements AbstractFactory{
    @Override
    public Car createCar(String requestedGrade) {
        if (requestedGrade.equals("A")) {
            return new VolksWagen(100, "Full", "Blue");
        } else if (requestedGrade.equals("B")) {
            return new Toyota(900, "Half", "Red");
        } else {
            System.out.println("The requested car is not available.");
            return null;
        }
    }
}
