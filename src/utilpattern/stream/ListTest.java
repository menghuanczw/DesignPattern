package utilpattern.stream;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("123");list.add("456");list.add("789");
        String s = list.stream().filter(x -> x.equals("456")).findFirst().get();
        System.out.println(s);
    }
}
