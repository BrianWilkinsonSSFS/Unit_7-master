import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {
    public static Scanner scan = new Scanner(System.in);

    public static ArrayList<Integer> numberList(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(-5);
        list.add(7);
        list.add(12);
        list.add(-1);
        System.out.println(list);
        list.add(2,10);
        list.set(1,9);
        System.out.println(list);
        list.remove(4);
        return list;
    }

    public static ArrayList<Double> firstAndLast(){
        ArrayList<Double> list2 = new ArrayList<>();
        ArrayList<Double> list = new ArrayList<>();
        int counter = 0;

        while(true){
            double scanning  = scan.nextDouble();
            if(scanning == 0){
                break;
            }
            list.add(scanning);
        }
        list2.add((double)list.size());
        list2.add(list.get(0));
        list2.add(list.get(list.size()-1));

        return list2;
    }

    public static ArrayList<Double> getNumbers(){
        ArrayList<Double> list = new ArrayList<>();

       list.add(scan.nextDouble());
       list.add(scan.nextDouble());
       list.add(scan.nextDouble());

       return list;
    }

    public static ArrayList<Double> arrangeList(ArrayList<Double> numbers){
        ArrayList<Double> list = new ArrayList<>();
        double larger = numbers.get(0);
        double smaller;
        int i = numbers.size()-1;
        while(i>0){
            if(numbers.get(i) < numbers.get(i-1)){
                larger = numbers.get(i-1);
                smaller = numbers.get(i);
                numbers.set(i, larger);
                numbers.set(i-1,smaller);

            }

            i--;
        }
        return numbers;
    }

}
