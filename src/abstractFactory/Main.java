package abstractFactory;

public class Main {
    public static void main(String[] args) {
        Customer customerOne = new Customer("A", true);
        
        AbstractFactory factory = getFactory(customerOne);
        Car carOne = factory.createCar(customerOne.getGradeRequest());
        carOne.startEngine();
    }
    
    private static AbstractFactory getFactory(Customer customer) {
        if (customer.hasCompanyContract()) {
            return new CompanyFactory();
        }
        return new RegularFactory();
    }
}