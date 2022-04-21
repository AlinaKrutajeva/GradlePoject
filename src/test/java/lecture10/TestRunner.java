package lecture10;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",
        features = {"C:\\Users\\a_lin\\IdeaProjects\\MyFirstGradleProject\\src\\test\\resources\\features\\forumcinemas.lv"},
        glue = {"lecture10\\steps"},
        tags = "ForumCinemas"
)

public class TestRunner {

}
