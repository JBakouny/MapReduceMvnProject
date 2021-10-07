package mapreduce;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

//    public static int mapReduce(int zero,
//                                 BiFunction<Integer, Integer, Integer> op,
//                                 Function<Integer, Integer> f,
//                                 int a,
//                                 int b) {
//        while(a <= b) {
//            zero = op.apply(zero, f.apply(a));
//            ++a;
//        }
//        return zero;
//    }
    //    def product(f : Int => Int, a : Int, b : Int): Int =
//    mapReduce(1, (x, y) => x * y, f, a, b)
//


    static int product(Function<Integer, Integer> f, int a, int b) {
        if (a > b) {
            return 1;
        } else {
            return f.apply(a) * product(f, a + 1, b);
        }
    }

    //    def sum (f : Int => Int, a : Int, b : Int): Int =
//    mapReduce(0, (x, y) => x + y, f, a, b)
    static int sum(Function<Integer, Integer> f, int a, int b) {
        if (a > b) {
            return 0;
        } else {
            return f.apply(a) + sum(f, a + 1, b);
        }
    }

    public static int sumInts(int a, int b) {
        return sum(x -> x, a, b);
    }

    public static int fact(int n) {
        return product(x -> x, 1, n);
    }

    public static int sumCube(int a, int b) {
        return sum(x -> x * x * x, a, b);
    }
}
