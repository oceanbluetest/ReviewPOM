package step_defs;

import io.cucumber.java.en.When;
import stepImpl.CommonPageImpl;

import java.util.List;

public class CommonPageStep extends CommonPageImpl {

    @When("Verify following navigation buttons are enabled:")
    public void verify_following_navigation_buttons_are_enabled(List<String> dataTable) {
        verifyNavButtonsEnabled(dataTable);
    }
}
