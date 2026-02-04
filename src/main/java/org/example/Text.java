package org.example;

public class Text {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    public void removeComments() {
        text = text.replaceAll("/\\*.*?\\*/", "");
        text = text.replaceAll("//.*", "");
    }

    // Previous change
    public void normalizeWhiteSpace() { 
        text = text.replaceAll("\\s+", " ").trim();
    }

    public String getText() {
        return text;
    }
}