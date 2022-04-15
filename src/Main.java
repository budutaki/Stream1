import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();

        for (Integer integer : intList) {
            if (integer > 0) {
                positiveList.add(integer);
            }
        }

        for (Integer integer : positiveList) {
            if (integer % 2 == 0) {
                evenList.add(integer);
            }
        }

        evenList.sort(Comparator.naturalOrder());
        System.out.println(evenList);

    }
}
