import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace1() {
    int[] input2 = {1,2,3};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{3,2,1}, input2);
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input3 = {10, 10, 10, 1};
    double output = ArrayExamples.averageWithoutLowest(input3);
    assertEquals(10.0, output, 0.1);
  }

  @Test
  public void testAverageWithoutLowest1() {
    double[] input3 = {10, 10.2};
    double output = ArrayExamples.averageWithoutLowest(input3);
    assertEquals(10.2, output, 0.1);
  }
}
