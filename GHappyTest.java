package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void testAllGsAreHappy() {
        Assertions.assertTrue(GHappy.gHappy("xxggxx"));
    }

    @Test
    public void testSingleGIsNotHappy() {
        Assertions.assertFalse(GHappy.gHappy("xxgxx"));
    }

    @Test
    public void testConsecutiveGsAreNotHappy() {
        Assertions.assertFalse(GHappy.gHappy("xxggyygxx"));
    }
    @Test
    public void testEdgeCaseSingleG() {
        Assertions.assertFalse(GHappy.gHappy("g"));
    }

    @Test
    public void testEdgeCaseDoubleG() {
        Assertions.assertTrue(GHappy.gHappy("gg"));
    }

    @Test
    public void testEdgeCaseMultipleG() {
        Assertions.assertTrue(GHappy.gHappy("ggg"));
    }
}
