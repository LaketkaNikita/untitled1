import java.util.ArrayList;
import java.util.LinkedList;

public class xD{


    final static int D = 50;
    public LinkedList<String> link(){
        LinkedList<String> link = new LinkedList<>();
        for (int i = 0; i < D; i++) {
            link.add("Da");
        }
        return link;
    }


    public ArrayList<String> array(){
        ArrayList<String> link = new ArrayList<>();
        for (int i = 0; i < D; i++) {
            link.add("Da");
        }
        return link;
    }


    public static void main(String[] args) {
        xD xd = new xD();
        System.out.println(xd.LinkedListAtTheBeginning() + " " + "Линкед лист в начале");//LL at the beginning
        System.out.println(xd.ArrayAtTheBeginning() + " " + "ARRAY лист в начале");//AL at the beginning
        System.out.println(xd.LinkedListAtTheMiddle() + " " + "Линкед лист в центре");//LL at the middle
        System.out.println(xd.ArrayListAtTheMiddle() + " " + "ARRAY лист в центре");//AL at the middle
        System.out.println(xd.LinkedListAtTheEnd() + " " + "Линкед лист в конце");//LL at the end
        System.out.println(xd.ArrayListAtTheEnd() + " " + "ARRAY лист в конце");//AL at the end
    }
    //LL at the beginning
    public  long LinkedListAtTheBeginning() {


        long startTime = System.nanoTime();
        for (int i = 0; i < D; i++) {
            link().add(0, "Da");
        }



        return System.nanoTime() - startTime;
       }

    public long ArrayAtTheBeginning() {
    long startTime = System.nanoTime();
        for (int i = 0; i < D; i++) {
        array().add(0, "Da");
    }
        return System.nanoTime() - startTime;
    }
    //AL at the beginning


    //middle LL
    public long LinkedListAtTheMiddle() {
        long startTime = System.nanoTime();
        for (int i = 0; i < D; i++) {
            link().add(D/2, "Da");
        }
        return System.nanoTime() - startTime;
    }

    //middle AL
    public long ArrayListAtTheMiddle() {

        long startTime = System.nanoTime();
        for (int i = 0; i < D; i++) {
            array().add(D/2, "Da");
        }
        return System.nanoTime() - startTime;
    }

    //end LL
    public long LinkedListAtTheEnd() {
        long startTime = System.nanoTime();
        for (int i = 0; i < D; i++) {
            link().add("Da");
        }
        return System.nanoTime() - startTime;
    }

    //end AL
    public long ArrayListAtTheEnd() {

        long startTime = System.nanoTime();
        for (int i = 0; i < D; i++) {
            array().add("Da");
        }
        return System.nanoTime() - startTime;
    }

}
