package ActionComponent;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "steps.**",
        "ActionComponent.**",

})
public class QAConfig {
}
