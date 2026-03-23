public interface ComplexAbstractFactory {
    Complex createComplex();                     // без параметров
    Complex CreateComplex(int real, int image);  // с параметрами
}
