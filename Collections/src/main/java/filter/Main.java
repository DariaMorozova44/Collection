package filter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FilterImplementation<Integer> fInt = new FilterImplementation<>(
                x -> x + 2
        );
        System.out.println(Arrays.toString(Task.filter(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, fInt)));

        FilterImplementation<String> fString = new FilterImplementation<>(
                String::toUpperCase
        );
        System.out.println(Arrays.toString(Task.filter(new String[]{"a", "b", "c"}, fString)));


    }
}
