import com.example.Feline;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineParameterizedTest {

    private Feline feline = new Feline();

    @ParameterizedTest
    @ValueSource(ints = {1, 10})
    public void getKittensReturnsCorrectNumber(int kittensNumber) {
        int actualResult = feline.getKittens(kittensNumber);
        assertEquals(kittensNumber, actualResult);
    }
}
