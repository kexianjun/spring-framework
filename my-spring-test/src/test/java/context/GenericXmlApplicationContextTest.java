package context;

import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GenericXmlApplicationContextTest {
	private static String BASE_CONTEXT_TEST = "base-context-test.xml";
	private static final String TEST_BEAN_NAME = "testBean";

	@Test
	public void baseGenericXmlApplicationContextTest() {
		GenericXmlApplicationContext context =
				new GenericXmlApplicationContext(BASE_CONTEXT_TEST);
		assertThat(context.containsBean(TEST_BEAN_NAME), is(true));
	}
}
