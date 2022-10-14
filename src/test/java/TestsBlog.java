import Pages.BlogHillel;
import Pages.BlogPage;
import Util.Util;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.Collection;

public class TestsBlog {

    @RunWith(Parameterized.class)
    public class TestsBlogItHillel extends Base {
        private Integer expectedCountOfNews;
        private String topic;

        private static final String BASEURL = "https://ithillel.ua/";
        private static BlogHillel Blog;
        private static BlogPage blogPage;

        public TestsBlogItHillel(String topic, Integer expectedCountOfNews) {
            this.topic = topic;
            this.expectedCountOfNews = expectedCountOfNews;
        }

        @Parameterized.BeforeParam
        public static void beforeParam() {
            driver.get(BASEURL);

            Blog = new BlogHillel(driver);
            Blog.clickBlogButton();

            blogPage = new BlogPage(driver);
        }

        @Parameterized.Parameters(name = "Topic - {0} count news: {1}")
        public static Collection news() {
            return Arrays.asList(new Object[][]{
                    {"frontend", 114},
                    {"qa", 83},
                    {"management", 96},
                    {"marketing", 100},
            });
        }

        @Test
        public void testBlogNews() {

            blogPage.clickBlogMenu(topic);
            Util.scrollToElementVisibilityOf(driver, By.cssSelector("div.posts_spinner"));

            int count = blogPage.getAmountListNews();
            System.out.println(topic + " news: " + count);
            Assert.assertNotEquals(0, count);
            Assert.assertEquals((long) expectedCountOfNews, count);
        }
    }
}
