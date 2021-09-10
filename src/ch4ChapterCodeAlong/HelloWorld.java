package ch4ChapterCodeAlong;

public class HelloWorld {
    public String message = "Hello World";

    public void sayHello() {

        String message = "Goodbye World";
        // message references the immediate scope within the method prints "Goodbye World".
        System.out.println(message);
        // this.message references the overall class scope prints "Hello World".
        System.out.println(this.message);

    }
}
