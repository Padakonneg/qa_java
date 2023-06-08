import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionNegativeTest {

    @Mock
    Lion lion;

    @Test
    public void exceptionTest() throws Exception {
        try {
            lion = new Lion("Другое");
        } catch (Exception e) {
            Assert.assertEquals("Некорректное выброшенное исключение или текст.", new Exception("Используйте допустимые значения пола животного - самей или самка").toString(), e.toString());
        }
    }
}
