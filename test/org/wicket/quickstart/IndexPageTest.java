package org.wicket.quickstart;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;
import org.wicket.quickstart.page.IndexPage;

public class IndexPageTest {

	@Test
	public void testIndexPage() {
		final WicketTester tester = new WicketTester();
		tester.startPage(IndexPage.class);
		tester.assertRenderedPage(IndexPage.class);

	}

}
