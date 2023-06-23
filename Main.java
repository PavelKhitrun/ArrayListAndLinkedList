import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List <Integer> arr = new ArrayList<>(Arrays.asList(1 ,2 ,3, 5));
        int k = 2;
        averageValueOfRange(arr, k);
    }

    private static void averageValueOfRange(List<Integer> arr, int k) {
        LinkedList<Integer> subList = new LinkedList<>();
        for (int i = 0; i<k; i++){
            subList.add(arr.get(i));
        }
        System.out.println(averageOfNumbers(subList));
        for (int i = k; i < arr.size(); i++){
            subList.add(arr.get(i));
            subList.remove();
            System.out.println(averageOfNumbers(subList));
        }
    }
    private static double averageOfNumbers (LinkedList<Integer> subList) {
        double result = 0;
        double sum = 0;
        for (int i = 0; i < subList.size(); i++){
            sum = sum + subList.get(i);
        }
        result = sum/subList.size();
        return result;
    }
}