import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

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

    @ParameterizedTest
    @ValueSource(ints = {1, 10})
    public void getKittensReturnsCorrectNumber(int kittensNumber) {
        int actualResult = feline.getKittens(kittensNumber);
        assertEquals(kittensNumber, actualResult);
    }

}
