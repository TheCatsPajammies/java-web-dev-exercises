package ch4ChapterCodeAlong;

public class Greeting {
    public String name = "Jess"; // needs semi-colon

    public void sayGreeting() {
        System.out.print("Hello " + this.name + "!"); // error - should be just this.name
    } // needs closing curly brace

}

// lines 3, 6, 7