package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfArray {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,1,2,2,3,3);

        //way 1
        //Integer sum = list.stream().reduce(0,Integer::sum);
        //System.out.println(sum);

        //way 2
        Optional<Integer> sum = list.stream().distinct().reduce((a, b) -> a + b);
        System.out.println(sum.get());

    }
}
