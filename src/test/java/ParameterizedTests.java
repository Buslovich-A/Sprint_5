import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedTests {

    private Feline feline = new Feline();

    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    public void lionHasCorrectMane(String sex, boolean expected) throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expected, lion.doesHaveMane());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 10})
    public void getKittensReturnsCorrectNumber(int kittensNumber) {
        int actualResult = feline.getKittens(kittensNumber);
        assertEquals(kittensNumber, actualResult);
    }
}
