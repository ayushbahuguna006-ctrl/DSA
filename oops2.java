// Static keyword

// In Java, static means the member belongs to the class itself, not to individual objects.

// Without static

// Each object gets its own copy:

// class Student {
//     String name;
// }
// Student s1 = new Student();
// Student s2 = new Student();

// s1.name = "Ayush";
// s2.name = "Rahul";

// Each object has a different name.

// With static

// The variable is shared by all objects:

// class Student {
//     static String college = "Chitkara";
// }

// You can access it directly using the class name:

// System.out.println(Student.college);

// class Main {

//     static int x = 10;

//     public static void main(String[] args) {
//         System.out.println(x);
//     }
// }

// Because x is static, you can access it without creating an object.


// But without static:

// class Main {

//     int x = 10; // belongs to an object

//     public static void main(String[] args) {
//         // System.out.println(x); ❌
//     }
// }


// Why void main (String args[]) has main?

// main() is static so that the JVM can call it without creating an object of the class.

// Suppose:

// class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello");
//     }
// }

// When you run the program, Java needs a starting point. The JVM essentially does:

// Main.main(args);

// It can do this because main() belongs to the class.

// What if main() were not static?
// class Main {
//     public void main(String[] args) {
//         System.out.println("Hello");
//     }
// }

// Now main() belongs to an object, so you would need:

// Main obj = new Main();
// obj.main(args);

// But then the question is: who will create obj first? 🤔

// The JVM avoids this problem by requiring:

// public static void main(String[] args)

// public class oops2 {
    
// }
