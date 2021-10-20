package paths;

import java.util.LinkedList;
import java.util.List;

public class PathsTest {
    public static void main(String[] args) {
        List<String> sd = new LinkedList<>();
        sd.add("s");
        sd.add("d");
        System.out.println(sd);
        List<String> se = new LinkedList<>();
        se.add("s");
        se.add("e");
        System.out.println(se);
        se.remove("s");
        System.out.println("Mutation de s -> e");
        System.out.println(se);
        System.out.println(sd);

        // o(N)
    }
}
