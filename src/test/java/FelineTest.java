import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Feline feline;

    @Before
    public void setUpFeline() {
        feline = new Feline();
    }

    @Test
    public void getFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensVar() {
        assertEquals(2, feline.getKittens(2));
    }

    @Test
    public void eatMeat() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
}
