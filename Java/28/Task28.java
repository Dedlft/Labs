import java.util.HashMap;
import java.util.Map;

public class Task28{
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Куценко", "Гоша");
        map.put("Куценко", "Гена");
        map.put("Бобов", "Гоша");
        map.put("Куценко", "Леша");
        map.put("Зощенко", "Миша");
        map.put("Семенов", "Гриша");
        map.put("Щесный", "Войцех");
        map.put("Цой", "Виктор");
        map.put("Потапов", "Гоша");
        map.put("Новиков", "Сережа");
        return map;
    }

    public static int getSameFirstNameCount(Map<String, String> map) {
        Map<String, Integer> firstNameCounts = new HashMap<>();
        for (String firstName : map.values()) {
            firstNameCounts.put(firstName, firstNameCounts.getOrDefault(firstName, 0) + 1);
        }
        int result = 0;
        for (int count : firstNameCounts.values()) {
            if (count > 1) {
                result += count;
            }
        }
        return result;
    }

    public static int getSameLastNameCount(Map<String, String> map) {
        Map<String, Integer> lastNameCounts = new HashMap<>();
        for (String lastName : map.keySet()) {
            lastNameCounts.put(lastName, lastNameCounts.getOrDefault(lastName, 0) + 1);
        }
        int result = 0;
        for (int count : lastNameCounts.values()) {
            if (count > 1) {
                result += count;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        int sameFirstNames = getSameFirstNameCount(map);
        int sameLastNames = getSameLastNameCount(map);
        System.out.println("Людей с повторяющимися именами: " + sameFirstNames);
        System.out.println("Людей с повторяющимися фамилиями: " + sameLastNames);
    }
}
