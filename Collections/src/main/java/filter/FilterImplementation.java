package filter;


import java.util.function.Function;

public class FilterImplementation<T> implements Filter<T> {
    private final Function<T, T> function;

    public FilterImplementation(Function<T, T> function) {
        this.function = function;
    }

    @Override
    public T apply(T o) {
        return function.apply(o);
    }
}

