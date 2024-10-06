import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;


public class HomeWork {

    @BeforeAll
    static void beforeAll() {

    }

    @Test
    void homeWorkTests() {

        open("https://demoqa.com/automation-practice-form");


        // First name
        $("#firstName").setValue("Eduard");

        // Last name
        $("#lastName").setValue("Kungurtsev");

        // Email
        $("#userEmail").setValue("Eduard@gmail.com");

        // Gender
        $("#gender-radio-1").parent().click();
//        $(byText("Male")).click();  // two example
//        $("label[for=gender-radio-1]").click(); // three example
//        $("#genterWrapper").$(byText("Male")).click(); // four example


        // Mobile phone
        $("#userNumber").setValue("9529330360");

//        //Date of Birth
        $("#dateOfBirth").parent().click();
        $(".react-datepicker__month-select").selectOption("April");
//        $("#react-datepicker__month-select").selectOptionByValue("6"); // example
        $(".react-datepicker__year-select").selectOption("2008");
        $(".react-datepicker__day--001:not(.react-datepicker__day--outside-month)").click();

        // Subject
        $("#subjectsInput").setValue("Math").pressEnter();

        // Hobbies
        $("#hobbies-checkbox-1").parent().click();

        //Picture
        $("#uploadPicture").uploadFromClasspath("img/1.png");

        // Current Address
        $("#currentAddress").setValue("Some address 1");

        // State and City
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();



        $("#submit").scrollTo();
        $("#submit").click();

    }
}
