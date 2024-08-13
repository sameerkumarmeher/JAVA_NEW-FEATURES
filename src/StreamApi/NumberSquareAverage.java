package StreamApi;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,40,50);
        double avg = list.stream()
                .map(e->e*e)  //square each number
                    .filter(e->e>100) // filter all the element whose value is > 100
                        .mapToInt(e->e) // convert to an Integer whose value is > 100
                            .average() // get average of number
                                .getAsDouble();

        System.out.println(avg);
    }
}
