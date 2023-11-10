import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat; // assertThat()
import static org.hamcrest.CoreMatchers.equalTo; // equalTo()

/**
 * Enkel testklass för att addera två tal.
 * @author Örn Segerstedt
 * @version 2022-11-18
 */
public class AdderTest {
    
    private Adder adder = new Adder();

    @Test
    public void twoPlusThreeEqualsFive() {
        assertThat(adder.add(2, 3), equalTo(5));
    }

    @Test
    public void threePlusTwoEqualsFive() {
        assertThat(adder.add(3, 2), equalTo(5));
    }
    @Test
    public void twoPlusNegativeTwoEqualsZero() {
        assertThat(adder.add(2, -2), equalTo(0));
    }

    @Test
    public void zeroPlusZeroEqualsZero() {
        assertThat(adder.add(2, -2), equalTo(0));
    }
}
