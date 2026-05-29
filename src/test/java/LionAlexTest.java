import com.example.Feline;
import com.example.LionAlex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LionAlexTest {

    Feline feline;
    LionAlex lionAlex;

    @BeforeEach
    void setUp() throws Exception {
        feline = new Feline();
        lionAlex = new LionAlex(feline);
    }

    @Test
    public void lionAlexHasMane() throws Exception {
        assertEquals(true, lionAlex.doesHaveMane());
    }

    @Test
    public void getFriendsReturnsListOfFriends() {
        List<String> expectedResult = List.of("Марти", "Глория", "Мелман");
        assertEquals(expectedResult, lionAlex.getFriends());
    }

    @Test
    public void getPlaceOfLivingReturnsPlace() {
        assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }

    @Test
    public void getKittensReturnsZero() {
        assertEquals(0, lionAlex.getKittens());
    }
}
