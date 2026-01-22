import java.util.*;

public class Task1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your list size:");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the values of list:");

        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        int result = list.stream()
        .distinct()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst()
        .orElse(-1);
        System.out.println("Second Highest:"+ result);
    }
}