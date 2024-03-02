package tudelft.sum;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;

public class TwoNumbersSumTest {
    @Test
    public void testAddTwoNumbers_Case1() {
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(1);
        num1.add(2);
        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(3);
        num2.add(4);
        ArrayList<Integer> expected1 = new ArrayList<>();
        expected1.add(4);
        expected1.add(6);
        Assertions.assertEquals(expected1, twoNumbersSum.addTwoNumbers(num1, num2));
    }
    @Test
    public void testAddTwoNumBers_Case2(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        ArrayList<Integer> num3 = new ArrayList<>();
        num3.add(5);
        num3.add(7);
        num3.add(8);
        ArrayList<Integer> num4 = new ArrayList<>();
        num4.add(1);
        num4.add(3);
        num4.add(2);
        ArrayList<Integer> expected2 = new ArrayList<>();
        expected2.add(8);
        expected2.add(0);
        expected2.add(9);
        Assertions.assertEquals(expected2, twoNumbersSum.addTwoNumbers(num3, num4));
    }
    @Test
    public void testAddTwoNumBersSum_Case3() {
        ArrayList<Integer> num7 = new ArrayList<>();
        num7.add(0);

        ArrayList<Integer> num8 = new ArrayList<>();
        num8.add(0);

        ArrayList<Integer> expected4 = new ArrayList<>();
        expected4.add(0);

        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        Assertions.assertEquals(expected4, twoNumbersSum.addTwoNumbers(num7, num8));
    }
    @Test
     public void testAddTwoNumBersSum_Case4(){
        ArrayList<Integer> num9 = new ArrayList<>();
        num9.add(9);

        ArrayList<Integer> num10 = new ArrayList<>();
        num10.add(1);

        ArrayList<Integer> expected5 = new ArrayList<>();
        expected5.add(1);
        expected5.add(0);

        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        Assertions.assertEquals(expected5, twoNumbersSum.addTwoNumbers(num9, num10));



    }

}
