package org.example;

public class Text {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    // Current change
    public void removeDuplicateWords() {
        text = text.replaceAll("\\b(\\w+)\\b(?=\\s+\\1\\b)", "");
    }

    public void removeComments() {
        text = text.replaceAll("/\\*.*?\\*/", "");
        text = text.replaceAll("//.*", "");
    }

    public String getText() {
        return text;
    }
}