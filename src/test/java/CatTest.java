import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;
    private Cat cat;

    @Before
    public void setFeline() {
        cat = new Cat(feline);
    }

    @Test
    public void getSound() {
        Assert.assertEquals("Издаваемый звук несоответствует", "Мяу", cat.getSound());
    }

    @Test
    public void getFood() throws Exception {
        when(feline.eatMeat()).thenReturn(List.of("Мясо"));
        Assert.assertEquals("Несоответствует значение еды у Кота", List.of("Мясо"), cat.getFood());
    }
}
