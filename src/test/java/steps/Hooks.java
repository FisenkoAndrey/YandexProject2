package steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {
    @Before
    public void startTest(){
        Configuration.timeout=15000;
    open("https://yandex.ru/");
           }
    @After
    public void endTest(){

    }
}

