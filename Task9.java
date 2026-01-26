import java.time.LocalDate;
import java.util.*;

class Event {
    String name;
    LocalDate date;

    Event(String name, String date) {
        this.name = name;
        this.date = LocalDate.parse(date); // yyyy-MM-dd
    }
}

public class Task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Event> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            events.add(new Event(sc.next(), sc.next()));
        }

        int month = sc.nextInt();

        // 1️⃣ Sort events by date
        List<Event> sorted =
                events.stream()
                      .sorted(Comparator.comparing(e -> e.date))
                      .toList();

        sorted.forEach(e -> System.out.print(e.name + " "));
        System.out.println();

        // 2️⃣ Earliest event
        System.out.println(sorted.get(0).name);

        // 3️⃣ Latest event
        System.out.println(sorted.get(sorted.size() - 1).name);

        // 4️⃣ Events in given month
        sorted.stream()
              .filter(e -> e.date.getMonthValue() == month)
              .forEach(e -> System.out.print(e.name + " "));
    }
}
