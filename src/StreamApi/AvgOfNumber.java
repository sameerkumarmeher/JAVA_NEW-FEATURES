package StreamApi;

import java.util.Arrays;
import java.util.List;

public class AvgOfNumber {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        double asDouble = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println("Avg is : " + asDouble);
    }
}
