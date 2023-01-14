package com.example.demo.pattern.composite;

public class HtmlElement extends HtmlTag {
    private String tagName;
    private String startTag;
    private String endTag;
    private String tagBody;

    public HtmlElement(String tagName) {
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
        this.tagBody = "";
    }

    public String getTagName() {
        return this.tagName;
    }


    /**
     *
     */
    @Override
    public void setStartTag(String tag) {
        this.startTag = tag;
    }

    /**
     *
     */
    @Override
    public void setEndTag(String endTag) {
        this.endTag = endTag;
    }


    @Override
    public void setTagBody(String tagBody) {
        this.tagBody = tagBody;
    }


    /**
     *
     */
    @Override
    public String generateHtml() {
        return startTag + "" + tagBody + "" + endTag;
    }
}
