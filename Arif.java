import java.util.ArrayList;
import java.util.Scanner;

public class One {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(); // create a list in which we enter first numbers
        list.add(1);
        list.add(1);


        Scanner scanner = new Scanner(System.in);
        int skobs = scanner.nextInt(); // enter the numbers of skobs

        int result = 0;

        for (int i = 1; i < skobs; i++) // cycle which find the numbers of skobs
        {
            result = 0;
            for (int j = 0; j < list.size(); j++) {
                result += list.get(j) * list.get(list.size() - j - 1);

            }
            list.add(result);
            System.out.println(result);

        }
    }
}