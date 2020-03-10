import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {

    public static ArrayList<Integer> getUnsorted() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("sortedData.txt"));
        ArrayList<Integer> list = new ArrayList<>();
        int counter = 0;
        while(counter<9){
            list.add(scan.nextInt());
            counter++;
        }
        return list;
    }

    public static boolean isSorted(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size()-1; i++){
            if(arr.get(i) > arr.get(i+1)){
                return false;
            }

        }
         return true;
    }
}
