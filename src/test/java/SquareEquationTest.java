import org.example.Complex;
import org.example.SquareEquation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareEquationTest {
    @Test
    public void equationHasTwoRoots() throws Exception {
        SquareEquation theSecondEquation = new SquareEquation(1, -7, 10);
        Complex[] roots = theSecondEquation.solve();
        Assert.assertTrue(roots.length == 2 && roots[0].equals(5) && roots[1].equals(2));
    }

    @Test
    public void equationHasOneRoot() throws Exception {
        SquareEquation theThirdEquation = new SquareEquation(1, 2, 1);
        Complex[] roots = theThirdEquation.solve();
        Assert.assertTrue(roots.length == 1 && roots[0].equals(-1));
    }

    @Test
    public void equationHasComplexRoots() throws Exception {
        SquareEquation theFourthEquation = new SquareEquation(1, 0, 4);
        Complex[] roots = theFourthEquation.solve();
        Assert.assertTrue(roots.length == 2
                && roots[0].equals(new Complex(0, 2))
                && roots[1].equals(new Complex(0, -2)));
    }

    @Test(expectedExceptions = Exception.class)
    public void equationDoesNotExist() throws Exception {
        SquareEquation theFifthEquation = new SquareEquation(0, 3, 4);
    }
}
