import java.util.Arrays;
import java.util.Random;

public class RandomArrayExample {
    public static void main(String[] args) {
        int size = 10; // Размер массива
        double[] arrayMath = new double[size];
        double[] arrayRandom = new double[size];
        for (int i = 0; i < size; i++) {
            arrayMath[i] = Math.random() * 100; // Случайные числа от 0 до 100
        }
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arrayRandom[i] = random.nextDouble() * 100; // Случайные числа от 0 до 100
        }
        System.out.println("Массив с использованием Math.random(): " + Arrays.toString(arrayMath));
        System.out.println("Массив с использованием класса Random: " + Arrays.toString(arrayRandom));
        Arrays.sort(arrayMath);
        Arrays.sort(arrayRandom);
        System.out.println("Отсортированный массив с использованием Math.random(): " + Arrays.toString(arrayMath));
        System.out.println("Отсортированный массив с использованием класса Random: " + Arrays.toString(arrayRandom));
    }
}
