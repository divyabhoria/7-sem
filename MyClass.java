public class MyClass {
    int a = 2;  // Instance variable

    public static void main(String[] args) {
        int b;    
        b = 1;
        System.out.println("main method");
        System.out.println("My name is Divya Bhoria");
    }
}









public class MyClass {
    int a = 2;  // Instance variable (optional for this program)

    public static void main(String[] args) {
        int b;              // Declared and assigned, but not used
        b = 1;
        
        int c = 10;
        int d = 10;
        int e = c + d;
        
        System.out.println(e);
        System.out.println("My name is Divya Bhoria");
    }
}









public class MyClass {
    int a = 2;

    public static void main(String[] args) {
        MyClass obj = new MyClass(); // Create object to access 'a'
        int b = 1;
        
        int c = 10;
        int d = 10;
        int e = c + d + b + obj.a;  // Now 'a' and 'b' are used

        System.out.println("Sum is: " + e);
        System.out.println("My name is Divya Bhoria");
    }
}

