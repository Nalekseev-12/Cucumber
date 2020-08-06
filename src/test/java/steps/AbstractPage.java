package steps;

import org.springframework.beans.factory.annotation.Autowired;
import ActionComponent.Action;

public abstract class AbstractPage {

    @Autowired
    protected Action action;
}
