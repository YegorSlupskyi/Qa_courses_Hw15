import org.example.Complex;
import org.example.SquareEquation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareEquationTest {
    @Test
    public void equationHasTwoRoots() {
        try {
            SquareEquation theSecondEquation = new SquareEquation(1, -7, 10);
            Complex[] roots = theSecondEquation.solve();

            Assert.assertTrue(roots[0].equals(5) && roots[1].equals(2));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void equationHasOneRoot() {
        try {
            SquareEquation theThirdEquation = new SquareEquation(1, 2, 1);
            Complex[] roots = theThirdEquation.solve();

            Assert.assertTrue(roots[0].equals(-1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void equationHasComplexRoots() {
        try {
            SquareEquation theFourthEquation = new SquareEquation(1, 0, 4);
            Complex[] roots = theFourthEquation.solve();

            Assert.assertTrue(roots[0].equals(new Complex(0, 2))
                    && roots[1].equals(new Complex(0, -2)));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void equationDoesNotExist(){
        try {
            SquareEquation theFifthEquation = new SquareEquation(0, 3, 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assert.assertTrue(true);
        }

    }
}
