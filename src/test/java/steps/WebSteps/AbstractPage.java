package steps.WebSteps;

import org.springframework.beans.factory.annotation.Autowired;
import ActionComponent.WebComponent.Web;


public abstract class AbstractPage {

    @Autowired
    protected Web web;
}
