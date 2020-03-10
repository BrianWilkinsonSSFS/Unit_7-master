import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class TraversingTest {

    @Test
    public void getStates() {
        ArrayList<String> test = new ArrayList<>();
        test.add("Maryland");
        test.add("Virginia");
        test.add("Tennessee");
        test.add("Delaware");
        test.add("Pennsylvania");
        test.add("Vermont");

        assertEquals(test, Traversing.getStates());
    }

    @Test
    public void createList() {
        ArrayList<String> test = new ArrayList<>();
        test.add("Maryland");
        test.add("Virginia");
        test.add("Tennessee");
        test.add("Delaware");
        test.add("Pennsylvania");
        test.add("Vermont");

        String finalText = "Maryland -> Virginia -> Tennessee -> Delaware -> Pennsylvania -> Vermont";
        assertEquals(finalText, Traversing.createList(test));
    }

    @Test
    public void largeAndSmall() throws IOException {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(9);

        assertEquals(numbers, Traversing.largestAndSmallest());

    }

    @Test
    public void testRectangleArea() {
        ArrayList<Rectangle> r = new ArrayList<>();
        r.add(new Rectangle(5, 6));
        r.add(new Rectangle(2.5, 7.25));
        r.add(new Rectangle(8, 4));
        r.add(new Rectangle(3.5, 1));
        r.add(new Rectangle(2.3, 1.5));
        r.add(new Rectangle(5, 3.25));

        assertEquals(17.22, ListOfRectangles.findAverage(r), 0.1);

    }
}