import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class AlgorithmsTest {

    @Test
    public void fileDuplicates() throws IOException {

        ArrayList<Integer> myList = new ArrayList<Integer>(Arrays.asList(75, 20, 10, 39, 28, 17, 55));
        Collections.sort(myList);
        ArrayList<Integer> fromStudent =  Algorithms.fileDuplicates();
        Collections.sort(fromStudent);
        assertEquals(myList, fromStudent);
    }

    @Test
    public void duplicateNames() throws IOException {
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList("Emma", "Olivia", "Oliver", "Noah", "Isabella", "Sophia", "Charlotte", "Mia", "Amelia", "Harper", "Evelyn", "Liam", "William", "James", "Benjamin", "Elijah", "Lucas", "Mason", "Logan"));
        Collections.sort(myList);
        ArrayList<String> fromStudent =  Algorithms.fileDuplicatesTwo();
        Collections.sort(fromStudent);
        assertEquals(myList, fromStudent);
    }

    @Test
    public void orderedList() throws IOException {
        ArrayList<Integer> myList = new ArrayList<Integer>(Arrays.asList(10, 11, 17, 20, 25, 28, 30, 32, 35, 39, 41, 48, 55, 62, 74, 75, 77, 88, 89, 97));
        assertEquals(myList, Algorithms.orderedList());
    }
}