import com.example.Feline;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeatPredatorReturnMeat() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void getFamilyReturnsFeline() {
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensWithoutArgReturnsOne() {
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        assertEquals(expectedResult, actualResult);
    }
}
