public class TestComplex {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex c0 = factory.createComplex();
        Complex c1 = factory.CreateComplex(3, 4);

        System.out.println("Default complex: " + c0);
        System.out.println("Custom complex: " + c1);

        try {
            Complex bad = factory.CreateComplex(2000, 0);
            System.out.println("Bad complex: " + bad);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании: " + e.getMessage());
        }
    }
}
