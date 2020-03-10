import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class ArrayListMethodsTest {


    @Test
    public void aNumberList() {
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(0);
        testList.add(9);
        testList.add(10);
        testList.add(7);
        testList.add(-1);

        assertEquals(testList, ArrayListMethods.numberList());
    }

    @Test
    public void bFirstAndLast() {
        ArrayList<Double> testList = new ArrayList<>();
        testList.add(11.0);
        testList.add(11.6);
        testList.add(9.9);

        assertEquals(testList, ArrayListMethods.firstAndLast());
    }

    @Test
    public void cGetNumbers() {
        ArrayList<Double> testList = new ArrayList<>();
        testList.add(12.4);
        testList.add(19.6);
        testList.add(-4.56);

        assertEquals(testList, ArrayListMethods.getNumbers());
    }

    @Test
    public void dArrangeListMixed() {
        ArrayList<Double> testList = new ArrayList<>();
        testList.add(12.4);
        testList.add(19.6);
        testList.add(-4.56);
        ArrayList<Double> arranged = new ArrayList<>();
        arranged.add(-4.56);
        arranged.add(12.4);
        arranged.add(19.6);

        assertEquals(arranged, ArrayListMethods.arrangeList(testList));
    }

    @Test
    public void dArrangeListPositive() {
        ArrayList<Double> testList = new ArrayList<>();
        testList.add(5.8);
        testList.add(5.7);
        testList.add(5.9);
        ArrayList<Double> arranged = new ArrayList<>();
        arranged.add(5.7);
        arranged.add(5.8);
        arranged.add(5.9);

        assertEquals(arranged, ArrayListMethods.arrangeList(testList));
    }

    @Test
    public void dArrangeListNegative() {
        ArrayList<Double> testList = new ArrayList<>();
        testList.add(-4.56);
        testList.add(-4.32);
        testList.add(-4.99);
        ArrayList<Double> arranged = new ArrayList<>();
        arranged.add(-4.99);
        arranged.add(-4.56);
        arranged.add(-4.32);

        assertEquals(arranged, ArrayListMethods.arrangeList(testList));
    }

}