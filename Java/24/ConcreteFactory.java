public class ConcreteFactory implements ComplexAbstractFactory {

    @Override
    public Complex createComplex() {
        // "комплексное число по умолчанию"
        return new Complex(0, 0);
    }

    @Override
    public Complex CreateComplex(int real, int image) {
        if (real < -1000 || real > 1000 || image < -1000 || image > 1000) {
            throw new IllegalArgumentException("Слишком большое комплексное число");
        }
        return new Complex(real, image);
    }
}
