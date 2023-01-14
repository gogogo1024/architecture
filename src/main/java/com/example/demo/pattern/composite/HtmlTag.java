package com.example.demo.pattern.composite;

import java.util.List;

public abstract class HtmlTag {
    public abstract String getTagName();

    public abstract void setStartTag(String tag);

    public abstract void setEndTag(String tag);

    public void setTagBody(String tagBody) {
        throw new UnsupportedOperationException("current operation is not support");
    }

    public void addChildTag(HtmlTag htmlTag) {
        throw new UnsupportedOperationException("current operation is not support");
    }

    public void removeChildTag(HtmlTag htmlTag) {
        throw new UnsupportedOperationException("current operation is not support");
    }

    public List<HtmlTag> getChildren() {
        throw new UnsupportedOperationException("current operation is not support");
    }

    public abstract String generateHtml();

}
