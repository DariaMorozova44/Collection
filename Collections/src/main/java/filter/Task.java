package filter;

public class Task {
    public static <T> T[] filter(T[] array, FilterImplementation<T> f) {
        for (int i = 0; i < array.length; i++) {
            array[i] = f.apply(array[i]);
        }
        return array;
    }

}