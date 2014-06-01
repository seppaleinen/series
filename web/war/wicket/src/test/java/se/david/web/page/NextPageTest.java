package se.david.web.page;

import org.apache.wicket.model.Model;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import se.david.web.model.ModelObject;

import static org.mockito.Mockito.when;

public class NextPageTest {
    private NextPage nextPage;
    private WicketTester wicketTester;
    private ModelObject modelObject;
    private Model<ModelObject> model;

    @Before
    public void setup(){
        wicketTester = new WicketTester();
        modelObject = new ModelObject();
        model = new Model<>(modelObject);
        nextPage = new NextPage(model);
    }

    @Test
    public void testRenderPage(){
        wicketTester.startPage(nextPage);
        wicketTester.assertNoErrorMessage();
        wicketTester.assertRenderedPage(NextPage.class);
    }
}
