import java.util.ArrayList;
import java.util.LinkedList;

public class xD {
    private static int D = 100000;

    static LinkedList<String> linked = new LinkedList<>();
    static ArrayList<String> array = new ArrayList<>();

    public static void main(String[] args) {
        xD xd = new xD();
        System.out.println(xd.LinkedListAtTheBeginning() + " " + "Линкед лист в начале");//LL at the beginning
        System.out.println(xd.ArrayListAtTheBeginning() + " " + "ARRAY лист в начале");//AL at the beginning
        System.out.println(xd.LinkedListAtTheMiddle() + " " + "Линкед лист в центре");//LL at the middle
        System.out.println(xd.ArrayListAtTheMiddle() + " " + "ARRAY лист в центре");//AL at the middle
        System.out.println(xd.LinkedListAtTheEnd() + " " + "Линкед лист в конце");//LL at the end
        System.out.println(xd.ArrayListAtTheEnd() + " " + "ARRAY лист в конце");//AL at the end
    }
    //LL at the beginning
    public static long LinkedListAtTheBeginning() {
        linked = new LinkedList<>();

        for (int i = 0; i < D; i++) {
            linked.add("Da");
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < D; i++) {
            linked.add(0, "Da");
        }
        long LL = System.nanoTime() - startTime;
        return LL;
    }

    //AL at the beginning
    public long ArrayListAtTheBeginning() {
        array = new ArrayList<>();
        for (int i = 0; i < D; i++) {
            array.add("Da");
        }
        long startTime = System.nanoTime();

        for (int i = 0; i < D; i++) {
            array.add(0, "Da");
        }
        long AL = System.nanoTime() - startTime;
        return AL;
    }

    //middle LL
    public long LinkedListAtTheMiddle() {
        linked = new LinkedList<>();
        for (int i = 0; i < D; i++) {
            linked.add("Da");
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < D; i++) {
            linked.add(50000, "Da");
        }
        long LL = System.nanoTime() - startTime;

        return LL;
    }

    //middle AL
    public long ArrayListAtTheMiddle() {
        array = new ArrayList<>();
        for (int i = 0; i < D; i++) {
            array.add("Da");
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < D; i++) {
            array.add(50000, "Da");
        }
        long AL = System.nanoTime() - startTime;

        return AL;
    }

    //end LL
    public long LinkedListAtTheEnd() {
        linked = new LinkedList<>();
        for (int i = 0; i < D; i++) {
            linked.add("Da");
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < D; i++) {
            linked.add("Da");
        }
        long LL = System.nanoTime() - startTime;

        return LL;
    }

    //end AL
    public long ArrayListAtTheEnd() {
        array = new ArrayList<>();
        for (int i = 0; i < D; i++) {
            array.add("Da");
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < D; i++) {
            array.add("Da");
        }
        long AL = System.nanoTime() - startTime;

        return AL;
    }

}
