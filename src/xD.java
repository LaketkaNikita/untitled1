import java.util.ArrayList;
import java.util.LinkedList;

public class xD {


    final static int D = 5;

    public LinkedList<String> link() {
        LinkedList<String> link = new LinkedList<>();
        for (int i = 0; i < D; i++) {
            link.add("Da");
        }
        return link;
    }

    public ArrayList<String> array() {
        ArrayList<String> link = new ArrayList<>();
        for (int i = 0; i < D; i++) {
            link.add("Da");
        }
        return link;
    }

    public static void main(String[] args) {
        xD xd = new xD();
        System.out.println(xd.AtTheBeginning() + " " + "Линкед лист в начале");//LL at the beginning
        System.out.println(xd.AtTheBeginning() + " " + "ARRAY лист в начале");//AL at the beginning
        System.out.println(xd.AtTheMiddle() + " " + "Линкед лист в центре");//LL at the middle
        System.out.println(xd.AtTheMiddle() + " " + "ARRAY лист в центре");//AL at the middle
        System.out.println(xd.AtTheEnd() + " " + "Линкед лист в конце");//LL at the end
        System.out.println(xd.AtTheEnd() + " " + "ARRAY лист в конце");//AL at the end
    }

    public long AtTheBeginning() {
        long startTime = System.nanoTime();
        for (int i = 0; i < D; i++) {
            link().add(0, "Da");
        }
        for (int i = 0; i < D; i++) {
            array().add(0, "Da");
        }
        return System.nanoTime() - startTime;
    }

    public long AtTheMiddle() {
        long startTime = System.nanoTime();
        for (int i = 0; i < D; i++) {
            link().add(D / 2, "Da");
        }

        for (int i = 0; i < D; i++) {
            array().add(D / 2, "Da");
        }
        return System.nanoTime() - startTime;
    }

    public long AtTheEnd() {
        long startTime = System.nanoTime();
        for (int i = 0; i < D; i++) {
            link().add("Da");
        }

        for (int i = 0; i < D; i++) {
            array().add("Da");
        }
        return System.nanoTime() - startTime;
    }
}
