import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.*;

public class SortingTest {


    @Test
    public void aIsSorted() throws IOException {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(5,10, 15, 12, 11, 20, 9, 35));
        assertEquals(false, Sorting.isSorted(myList));
    }

    @Test
    public void bIsSorted() throws IOException {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(-4, -2, -1, 6, 19, 11, 23, -9));
        assertEquals(false, Sorting.isSorted(myList));
    }

    @Test
    public void cIsSorted() throws IOException {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(-20, -19, -17, -15, 0, 4, 6, 9));
        assertEquals(true, Sorting.isSorted(myList));
    }

    @Test
    public void dIsSorted() throws IOException {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(20, 19, 18, 17, 16, 15, 14, 13));
        assertEquals(false, Sorting.isSorted(myList));
    }

    @Test
    public void eGetDonorFile() throws IOException{
        ArrayList<Donor> donors = new ArrayList<>();
        donors.add(new Donor("Maria", 125.0));
        donors.add(new Donor("Isaac", 105.75));
        donors.add(new Donor("Jane", 98.5));
        donors.add(new Donor("Matsu", 61.99));
        donors.add(new Donor("Susan", 50.0));
        donors.add(new Donor("Carl", 45.25));
        donors.add(new Donor("Tiffany", 38.0));
        donors.add(new Donor("Sam", 25.0));
        donors.add(new Donor("Alonzo", 18.65));

       ArrayList<Donor> unsorted =  DonorRunner.readFile();
       DonorRunner.sortDonors(unsorted);

       boolean same = true;

       for (int i=0; i<donors.size(); i++) {
           Donor donor1 = donors.get(i);
           Donor donor2 = unsorted.get(i);

           if (!donor1.getName().equals(donor2.getName()) || donor1.getAmount() != donor2.getAmount()) {
               same = false;
               break;
           }
       }

       assertTrue(same);




    }
}