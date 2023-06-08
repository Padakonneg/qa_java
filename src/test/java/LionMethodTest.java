import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionMethodTest {

    @Spy
    private Lion lion = new Lion("Самец");

    public LionMethodTest() throws Exception {
    }

    @Test
    public void getKittens() {
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFood() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
