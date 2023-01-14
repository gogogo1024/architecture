package com.example.demo;

import com.example.demo.pattern.composite.HtmlElement;
import com.example.demo.pattern.composite.HtmlParentElement;
import com.example.demo.pattern.composite.HtmlTag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Test
    void contextLoads() {
        HtmlTag parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");

        HtmlParentElement body = new HtmlParentElement("<body>");
        body.setStartTag("<body>");
        body.setEndTag("</body>");
        parentTag.addChildTag(body);

        HtmlTag part = new HtmlElement("<p>");
        part.setStartTag("<p>");
        part.setEndTag("</p>");
        part.setTagBody("this is part");
        body.addChildTag(part);
        String result = parentTag.generateHtml();
        assert result.equals("<html><body><p>this is part</p></body></html>");

    }

}
