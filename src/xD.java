import java.util.ArrayList;
import java.util.LinkedList;

public class xD {
    private static int d = 100000;

    LinkedList<String> linked = new LinkedList<>();
    ArrayList<String> array = new ArrayList<>();

    public static void main(String[] args) {
        xD xd = new xD();
        System.out.println(xd.nanoTime() + " " + "Линкед лист в начале");//LL at the beginning
        System.out.println(xd.naniTime() + " " + "ARRAY лист в начале");//AL at the beginning
        System.out.println(xd.nTime() + " " + "Линкед лист в центре");//LL at the middle
        System.out.println(xd.Time() + " " + "ARRAY лист в центре");//AL at the middle
        System.out.println(xd.nanTime() + " " + "Линкед лист в конце");//LL at the end
        System.out.println(xd.naTime() + " " + "ARRAY лист в конце");//AL at the end
    }

    //LL at the beginning
    public long nanoTime() {
        linked = new LinkedList<>();

        for (int i = 0; i < d; i++) {
            linked.add("Da");
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < d; i++) {
            linked.add(0, "Da");
        }
        long LL = System.nanoTime() - startTime;
        return LL;
    }

    //AL at the beginning
    public long naniTime() {
        array = new ArrayList<>();
        for (int i = 0; i < d; i++) {
            array.add("Da");
        }
        long startTime = System.nanoTime();

        for (int i = 0; i < d; i++) {
            array.add(0, "Da");
        }
        long AL = System.nanoTime() - startTime;
        return AL;
    }

    //middle LL
    public long nTime() {
        linked = new LinkedList<>();
        for (int i = 0; i < d; i++) {
            linked.add("Da");
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < d; i++) {
            linked.add(50000, "Da");
        }
        long LL = System.nanoTime() - startTime;

        return LL;
    }

    //middle AL
    public long Time() {
        array = new ArrayList<>();
        for (int i = 0; i < d; i++) {
            array.add("Da");
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < d; i++) {
            array.add(50000, "Da");
        }
        long AL = System.nanoTime() - startTime;

        return AL;
    }

    //end LL
    public long nanTime() {
        linked = new LinkedList<>();
        for (int i = 0; i < d; i++) {
            linked.add("Da");
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < d; i++) {
            linked.add("Da");
        }
        long LL = System.nanoTime() - startTime;

        return LL;
    }

    //end AL
    public long naTime() {
        array = new ArrayList<>();
        for (int i = 0; i < d; i++) {
            array.add("Da");
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < d; i++) {
            array.add("Da");
        }
        long AL = System.nanoTime() - startTime;

        return AL;
    }

}
