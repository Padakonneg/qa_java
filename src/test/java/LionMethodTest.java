import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionMethodTest {

    @Mock
    Feline feline = new Feline();

    @Spy
    private Lion lion = new Lion("Самец", feline);

    public LionMethodTest() throws Exception {
    }

    @Test
    public void getKittens() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        int felineKittens = feline.getKittens();
        Assert.assertEquals(felineKittens, lion.getKittens());
    }

    @Test
    public void getFood() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
