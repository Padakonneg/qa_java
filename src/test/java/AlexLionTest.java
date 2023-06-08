import com.example.AlexLion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {

    @Mock
    AlexLion alexLion;

    @Before
    public void setUp() throws Exception {
        alexLion = new AlexLion();
    }

    @Test
    public void getFriends() {
        Assert.assertEquals("Друзья Алекса не совпадают", List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман"), alexLion.getFriends());
    }

    @Test
    public void getPlaceOfLiving() {
        Assert.assertEquals("Место жительства Алекса некорректное", "Нью-Йоркский зоопарк", alexLion.getPlaceOfLiving());
    }

    @Test
    public void getKittens() {
        Assert.assertEquals("Количество детей Алекса несоответствует", 0, alexLion.getKittens());
    }

    @Test
    public void getSex() {
        Assert.assertTrue("Пол Алекса не соответствует", alexLion.doesHaveMane());
    }
}
