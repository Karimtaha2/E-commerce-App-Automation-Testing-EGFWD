package StepDefinition;

import io.cucumber.java.en.Given;

import static Pages.HomeSlidersPage.link_1;
import static Pages.HomeSlidersPage.link_2;

public class SD07_HomeSliders {
    @Given("user select nivo control")
    public void user_select_nivo_control() {

        String linkClass_1 = link_1().getAttribute("class");
        String linkClass_2 = link_2().getAttribute("class");

        if (linkClass_1.contains("active")) {
            link_2().click();
            System.out.println("click on second link");
        }

        Hook.sleep(20);

        if (linkClass_2.contains("active")) {
            link_1().click();
            System.out.println("click on first link");
        }

        Hook.sleep(20);


    }
}
