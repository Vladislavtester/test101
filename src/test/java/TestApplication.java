import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class TestApplication {

    @Test
    void ApplicationSend() {
        Selenide.open("https://piter-online.net");
       // $("#HeaderMenu .app161").setValue("Тестовая линия");
        sleep(5000);


    }

}
