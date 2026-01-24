import java.util.*;

class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Person> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new Person(sc.next(), sc.nextInt()));
        }

        int ageLimit = sc.nextInt();

        list.stream()
            .map(p -> p.name)
            .sorted()
            .forEach(s -> System.out.print(s + " "));
        System.out.println();

    
        list.stream()
            .filter(p -> p.age > ageLimit)
            .map(p -> p.name)
            .forEach(s -> System.out.print(s + " "));
        System.out.println();

        list.stream()
            .map(p -> p.name.toUpperCase())
            .forEach(s -> System.out.print(s + " "));
    }
}
