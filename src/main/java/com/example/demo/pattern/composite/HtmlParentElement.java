package com.example.demo.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HtmlTag {
    private String tagName;
    private String startTag;
    private String endTag;
    private List<HtmlTag> childrenTag;

    public HtmlParentElement(String tagName) {
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
        this.childrenTag = new ArrayList<>();
    }

    @Override
    public String getTagName() {
        return tagName;
    }


    @Override
    public String generateHtml() {
        StringBuilder sb = new StringBuilder();
        sb.append(startTag);
//        System.out.println(startTag);
        for (HtmlTag tag : childrenTag) {
            sb.append(tag.generateHtml());
        }
//        System.out.println(endTag);
        sb.append(endTag);
        return sb.toString();
    }

    public String getStartTag() {
        return startTag;
    }

    public void setStartTag(String startTag) {
        this.startTag = startTag;
    }

    public String getEndTag() {
        return endTag;
    }


    @Override
    public void setEndTag(String endTag) {
        this.endTag = endTag;
    }

    @Override
    public List<HtmlTag> getChildren() {
        return childrenTag;
    }

    public void setChildrenTag(List<HtmlTag> childrenTag) {
        this.childrenTag = childrenTag;
    }

    @Override
    public void addChildTag(HtmlTag htmlTag) {
        childrenTag.add(htmlTag);
    }


}
