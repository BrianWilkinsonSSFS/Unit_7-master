import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Algorithms {

    public static ArrayList<Integer> fileDuplicates() throws FileNotFoundException {
        Scanner file1 = new Scanner(new File("file1.txt"));
        Scanner file2 = new Scanner(new File("file2.txt"));
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> duplicate = new ArrayList<>();

        while(file1.hasNext()){
            list1.add(file1.nextInt());
        }
        while(file2.hasNext()){
            list2.add(file2.nextInt());
        }

        for(int i = 0; i<list1.size(); i++){
            int num = list1.get(i);
            if(list2.contains(num)){
                duplicate.add(num);
            }
        }
        return duplicate;
    }

    public static ArrayList<String> fileDuplicatesTwo() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("names.txt"));
        ArrayList<String> list = new ArrayList<>();

        while(scan.hasNext()){
            list.add(scan.next());
        }
        System.out.println(list);

        for(int i = 0; i < list.size(); i++){
            String word = list.get(i);
            for(int k = i+1; k < list.size(); k++){
                if(word.equals(list.get(k))){
                    String duplicate = list.get(k);
                    list.remove(k);
                }
            }
        }
        return list;
    }

    public static ArrayList<Integer> orderedList() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("file1.txt"));
        ArrayList<Integer> list = new ArrayList<>();
        while(scan.hasNext()){
            list.add(scan.nextInt());
        }

        for(int i = 1; i<list.size(); i++){
            int num = list.get(i);
            int k = i-1;
            while(k >= 0 && num < list.get(k)){
                    list.set(k+1, list.get(k));
                    k--;
            }
            list.set(k+1, num);
        }
        return list;
    }
}
