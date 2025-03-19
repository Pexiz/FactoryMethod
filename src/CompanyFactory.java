public class CompanyFactory implements AbstractFactory {
    @Override
    public Car createCar(String requestedGrade) {
        if (requestedGrade.equals("A")) {
            return new Tesla(1000, "Full", "Blue");
        } else if (requestedGrade.equals("B")) {
            return new Audi(500, "Half", "Black");
        } else {
            System.out.println("The requested car is not available.");
            return null;
        }
    }
}