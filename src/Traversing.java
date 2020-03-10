import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Traversing {
    public static Scanner scan = new Scanner(System.in);

    public static ArrayList<String> getStates(){
        ArrayList<String> list = new ArrayList<>();

        while(true){
            System.out.print("Enter the name of a State or \"Stop\"to quit: ");
            String states = scan.next();
            if(states.equals("Stop")){
                break;
            }
            list.add(states);
        }
        return list;
    }

    public static String createList(ArrayList<String> states){
        String outcome = "";
        for(int i = 0; i < states.size()-1; i++){
            if(i<states.size()-1){
                outcome += states.get(i);
                outcome += " -> ";
            }
            else{
                outcome += states.get(i);
                break;
            }
        }
        outcome += states.get(states.size()-1);
        return outcome;
    }

    public static ArrayList<Integer> largestAndSmallest() throws FileNotFoundException {
        Scanner input = new Scanner(new File("numbers.txt"));
        ArrayList<Integer> list= new ArrayList<>();
        while(input.hasNext()){
            list.add(input.nextInt());
        }
        int largest = list.get(0);
        int max = 0;
        int smallest = list.get(0);
        int min = 0;

        for(int i=0; i<list.size(); i++){
            if(list.get(i) > largest){
                largest = list.get(i);
                max = i;
            }
            if(list.get(i) < smallest){
                smallest = list.get(i);
                min = i;
            }
        }
        list.remove(min);
        list.add(0,smallest);
        list.remove(max);
        list.add(list.size(), largest);



        return list;
    }
}
