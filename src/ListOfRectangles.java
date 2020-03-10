import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOfRectangles {
    public static ArrayList<Rectangle> getRectangles() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("rectangles.txt"));

        ArrayList<Rectangle> list = new ArrayList<>();
        while(scan.hasNext()){
            double length = scan.nextDouble();
            double width = scan.nextDouble();
            list.add(new Rectangle(length, width));
        }
        return list;
    }

    public static double findAverage(ArrayList<Rectangle> rectangles){
        double total = 0;
        for(int i = 0; i < rectangles.size(); i++){
            total += rectangles.get(i).area();
        }
        double average = total/rectangles.size();
        return average;
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Rectangle> list = getRectangles();

        System.out.println(findAverage(list));
    }
}
