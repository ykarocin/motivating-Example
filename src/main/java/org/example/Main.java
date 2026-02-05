package org.example;

    public class Main {
        public static void main(String[] args) {
            String input = args[0];
            Text t = new Text(input);
            t.normalizeWhiteSpace(); // Previous change
            t.removeComments();
            t.removeDuplicateWords(); // Current change
            System.out.println(t.getText());
        }
    }