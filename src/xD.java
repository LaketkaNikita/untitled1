import java.util.ArrayList;
import java.util.LinkedList;

public class xD {
    private static int d = 100000;
    private static String v=("-------------------------------------");

    public static void main(String[] args) {
        xD xd = new xD();
        System.out.println(xd.nanoTime());//LL at the beginning
        System.out.println(xd.naniTime());//AL at the beginning
        System.out.println(xd.nTime());//LL at the middle
        System.out.println(xd.Time());//AL at the middle
        System.out.println(xd.nanTime());//LL at the end
        System.out.println(xd.naTime());//AL at the end
    }
    //LL at the beginning
    public String nanoTime(){
        LinkedList<String> linked = new LinkedList<>();

        for(int i=0; i<d; i++){
            linked.add("Da");
        }

        long startTime = System.nanoTime();
        for(int i=0; i<d; i++){
            linked.add(0,"Da");
        }
        long LL = System.nanoTime() - startTime;
        System.out.println(LL + " " + "Линкед лист в начале");
        return v;
    }
    //AL at the beginning
    public String naniTime(){
        ArrayList<String> array = new ArrayList<>();
        for(int i=0; i<d; i++){
            array.add("Da");
        }
        long startTime = System.nanoTime();

        for(int i=0; i<d; i++){
            array.add(0,"Da");
        }
        long AL = System.nanoTime() - startTime;
        System.out.println(AL + " " + "ARRAY лист в начале");
        return v;
    }
    //middle LL
    public String nTime(){
        LinkedList<String> linked = new LinkedList<>();
        for(int i=0; i<d; i++){
            linked.add("Da");
        }
        long startTime = System.nanoTime();
        for(int i=0; i<d; i++){
            linked.add(50000,"Da");
        }
        long LL = System.nanoTime() - startTime;
        System.out.println(LL + " " + "Линкед лист в центре");
        return v;
    }
    //middle AL
    public String Time(){
        ArrayList<String> array = new ArrayList<>();
        for(int i=0; i<d; i++){
            array.add("Da");
        }
        long startTime = System.nanoTime();
        for(int i=0; i<d; i++){
            array.add(50000,"Da");
        }
        long AL = System.nanoTime() - startTime;
        System.out.println(AL + " " + "ARRAY лист в центре");
        return v;
    }
    //end LL
    public String nanTime(){
        LinkedList<String> linked = new LinkedList<>();
        for(int i=0; i<d; i++){
            linked.add("Da");
        }
        long startTime = System.nanoTime();
        for(int i=0; i<d; i++){
            linked.add("Da");
        }
        long LL = System.nanoTime() - startTime;
        System.out.println(LL + " " + "Линкед лист в конце");
        return v;
    }
    //end AL
    public String naTime(){
        ArrayList<String> array = new ArrayList<>();
        for(int i=0; i<d; i++){
            array.add("Da");
        }
        long startTime = System.nanoTime();
        for(int i=0; i<d; i++){
            array.add("Da");
        }
        long AL = System.nanoTime() - startTime;
        System.out.println(AL + " " + "ARRAY лист в конце");
        return v;
    }

}
