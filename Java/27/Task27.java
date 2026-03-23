public class Task27{
    private static class Node {
        String key;
        int value;
        Node next;
        Node(String key, int value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
    private static final int TABLE_SIZE = 16;
    private static Node[] table;
    public static int hashtabHash(String key) {
        int h = key.hashCode();
        if (h < 0) {
            h = -h;
        }
        return h % TABLE_SIZE;
    }
    public static void hashtabInit() {
        table = new Node[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = null;
        }
    }
    public static void hashtabAdd(String key, int value) {
        int index = hashtabHash(key);
        Node head = table[index];
        Node current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }
        Node newNode = new Node(key, value, head);
        table[index] = newNode;
    }
    public static Integer hashtabLookup(String key) {
        int index = hashtabHash(key);
        Node current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }
    public static void hashtabDelete(String key) {
        int index = hashtabHash(key);
        Node current = table[index];
        Node prev = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }
    public static void main(String[] args) {
        hashtabInit();
        hashtabAdd("one", 1);
        hashtabAdd("two", 2);
        hashtabAdd("three", 3);
        System.out.println("two = " + hashtabLookup("two"));
        System.out.println("four = " + hashtabLookup("four"));
        hashtabDelete("two");
        System.out.println("two after delete = " + hashtabLookup("two"));
    }
}
