package map;

import java.util.HashMap;

public class Count {
    public static  <T> HashMap<T, Integer> count(T[] array) {
        HashMap<T, Integer> map = new HashMap<>();
        for (T t : array) {
            map.merge(t, 1, Integer::sum);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(Count.count(new String [] {"kek", "lol","kek","kek","lol","chebyrek"}));
        System.out.println(Count.count( new Integer []{1,2,3,4,5,5}));
    }
}
