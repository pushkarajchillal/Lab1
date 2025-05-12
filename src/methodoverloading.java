public class methodoverloading {

    // Method without parameters
    static void greet() {
        System.out.println("Hello there!");
    }

    // Method with one parameter
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method with two parameters
    static void greet(String name, int age) {
        System.out.println("Hello, " + name + ". You are " + age + " years old.");
    }

    // Main method — starting point
    public static void main(String[] args) {
        greet();                     // Calls method 1
        greet("Pushkaraj");          // Calls method 2
        greet("Pushkaraj", 25);      // Calls method 3
    }
}