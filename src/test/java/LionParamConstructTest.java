import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

@RunWith(Parameterized.class)
public class LionParamConstructTest {

    boolean hasMane;

    @Mock
    Feline feline;

    @Spy
    private Lion lion;

    public LionParamConstructTest(String sex, Boolean hasMane) throws Exception {
        lion = new Lion(sex, feline);
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters(name = "Проверка пола. Тестовые данные {0}, {1}")
    public static Object[][] getCredential() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void doesHaveMane() {
        Assert.assertEquals(this.hasMane, lion.doesHaveMane());
    }
}
