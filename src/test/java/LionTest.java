import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void doesHaveManeThrowsException() throws Exception {
        Executable executable = () -> new Lion("Тест", feline);
        assertThrows(Exception.class, executable);
    }

    @Test
    public void getKittensWithoutArgsReturnOne() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedResult = 1;
        assertEquals(expectedResult, lion.getKittens());
    }

    @Test
    public void getFoodReturnsFoodForPredator() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = lion.getFood();
        assertEquals(expectedResult, actualResult);
    }
}