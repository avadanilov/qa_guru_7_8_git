import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    void firstTest() {
        System.out.println("FirstTest2");
        Selenide.open("http://ya.ru");
    }
}
