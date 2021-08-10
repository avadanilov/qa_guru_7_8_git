import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Selenide;

public class FirstTest {
    @Test
    void firstTest(){
        System.out.println("firstTest");
        Selenide.open("http://ya.ru");
    }
}
