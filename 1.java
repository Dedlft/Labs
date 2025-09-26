public class Main {
    public static void main(String[] args) {
        // Цикл for для перебора аргументов командной строки
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + i + ": " + args[i]);
        }
    }
}
