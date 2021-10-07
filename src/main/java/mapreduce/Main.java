package mapreduce;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static BiFunction<Integer, Integer, Integer>
                        mapReduce(final int zero,
                                BiFunction<Integer, Integer, Integer> op,
                                Function<Integer, Integer> f) {

        return (a, b) -> {
            int acc = zero;
            while (a <= b) {
                acc = op.apply(acc, f.apply(a));
                ++a;
            }
            return acc;
        };
    }

    public static BiFunction<Integer, Integer, Integer> product(Function<Integer, Integer> f) {
        return mapReduce(1, (x, y) -> x * y, f);
    }

    public static BiFunction<Integer, Integer, Integer> sum(Function<Integer, Integer> f) {
        return mapReduce(0, Integer::sum, f);
    }

    public static BiFunction<Integer, Integer, Integer> sumInts() {
        return sum(x -> x);
    }

    public static int fact(int n) {
        return product(x -> x).apply(1, n);
    }

    public static BiFunction<Integer, Integer, Integer> sumCube() {
        return sum(x -> x * x * x);
    }
}
