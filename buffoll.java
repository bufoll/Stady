/**
 * Created by buffoll on 18.07.2018.
 */
import java.util.*;

    class Main {
    static final int CONST = 55;
}

public class buffoll {
    public static void main(String[] args) {

        System.out.println("Привет,сегодня");
        System.out.println(new Date());

        System.out.print("Сегодняшний счастливчик у нас : "  );
        Random Rand = new Random();
        int a;
        a = Rand.nextInt(10);
        System.out.println(a);
        Integer g = new Integer(40);
        Integer q = new Integer(40);
        System.out.println(g.equals(q));
        System.out.println(g!=q);
        int got = 0177;
        System.out.println(Integer.toBinaryString(got));
    }
}


