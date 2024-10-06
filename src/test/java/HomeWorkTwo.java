import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HomeWorkTwo {

    @BeforeAll
    static void  beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 300000;
        Configuration.timeout = 30000;
    }

    @Test
    void fillFormTest() {

        open("https://demoqa.com/text-box");

        $("#userName").setValue("Edik Kungurtsev");
        $("[id=userEmail]").setValue("Edik@gmail.com");
        $("[id=currentAddress]").setValue("some address 1");
        $("[id=permanentAddress]").setValue("Edik Kungurtsev");
        $("[id=submit]").scrollTo();
        $("[id=submit]").click();

        $("[id=output]").shouldHave(text("Edik Kungurtsev"), text("Edik@gmail.com"),
                text("some address 1"), text("Edik Kungurtsev"));


    }
}