import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int n = scanner.nextInt();
        List<String> deck = createDeck();
        Collections.shuffle(deck);
        dealCards(deck, n);
    }

    private static List<String> createDeck() {
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        List<String> deck = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + suit);
            }
        }
        return deck;
    }

    private static void dealCards(List<String> deck, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Игрок " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print(deck.remove(0) + " ");
            }
            System.out.println("\n");
        }
    }
}
