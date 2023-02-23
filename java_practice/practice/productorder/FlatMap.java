package java_practice.practice.productorder;

import java.util.Arrays;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2);
        List<Integer> list2 = Arrays.asList(3,4);
        List<Integer> list3 = Arrays.asList(5,6);
        List<Integer> list4 = Arrays.asList(7,8);
        List<Integer> list5 = Arrays.asList(9,10);

        List<List<Integer>> coll_lists = Arrays.asList(list1,list2,list3,list4,list5);

        coll_lists.stream().flatMap(x -> x.stream().map(value -> value+10)).forEach(pri -> System.out.print(pri+"   "));


    }
}
