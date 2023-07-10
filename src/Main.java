import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(5);
        intList.add(16);
        intList.add(-1);
        intList.add(-2);
        intList.add(0);
        intList.add(32);
        intList.add(3);
        intList.add(5);
        intList.add(8);
        intList.add(23);
        intList.add(4);

        List<Integer> positiveNumbers = new ArrayList<>();
        for (Integer number : intList) {
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }

        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : positiveNumbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        Collections.sort(evenNumbers);

        for (Integer number : evenNumbers) {
            System.out.println(number);
        }
    }
}
