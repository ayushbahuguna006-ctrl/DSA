//sout is written for system.out.println("Type here");
//scanner is used to take input like shown below
//nextInt() is used for allowing integer inputs
//next() is used for taking first word from a line
//nextLine() is used to print entire line
//nextFloat() is used for allowing float inputs

// import java.util.Scanner;
// public class main{
//     public static void main(String[] args){
//           System.out.println("Enter your input");
//           Scanner input=new Scanner(System.in);
//           int rollno=input.nextInt();
//           System.out.print("your roll no is" + rollno);
//     }
// }

//reassiging values in java as values points to the same variable so values ~

// public class main {
//     public static void main(String[] args) {

//         int a = 10;

//         a = 50;      // Change outside the block

//         {
//             a = 100; // Change inside the block
//         }

//         System.out.println(a);
//     }
// }

// Output for what happened in above example ~


// int a = 10;   → a = 10
// a = 50;       → a = 50
// a = 100;      → a = 100
// print(a);     → 100


//types of datatypes in java:
//primitive & non primitive~primitve are those datatypes which can't be divided further into smaller components & non prim are those which can be divided into further sub  components
//1 byte=8 bits and 1 bit can have two values 0 or 1 so total number of possible values can be 2 raise to power 8 in 1 byte which is equal to 256 values so -128 to -1 and 0 and 1 to 127 adding total to 256 so java byte can store values only from -128 to 127.
//Primitive:byte(1 byte),int(4 byte),short(2 byte),long(8 byte),float(4 byte),double(8 byte),boolean(JVM dependent),char(2 byte)
//non primitive:string,arr,class,object,interfaces,enums

//difference bw both:
//primitive:store actual value while non prim stores reference values
//prim fixed memory size while non prim memory varies
//prim can't call methods while non prim can call methods           


// public class main{
//     public static void main(String[] args){
//         byte age = 20;
//         short year = 2025;
//         int marks = 95;
//         long population = 8000000000L;
//         float price = 99.99f;
//         double pi = 3.14159;
//         char grade = 'A';
//         boolean isJavaFun = true;
//     }
// }

// Type coversion:


// import java.util.Scanner;
// public class main{
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         float a=input.nextFloat();
//         System.out.println(a);   
//     }
// }

// Now note in the above example if you input integer it will still print a float number which means type conversion has occured.
//when does this type conversion happens?
//certain conditions should match ~
//First both the user input and allowed datatype to be taken as input in program should be of compatible type example int and float not int and string.Second the allowd datatype should be bigger then the user input i.e. say allowed datatype is float so it includes both int and float thus if user enters int or float it will get converted to float

//Type casting:conversion of one datatype to another datatype


// public class main{
//     public static void main(String[] args) {
//         float a=20.34f;
//         System.out.println((int)a);   
//     }
// }


// public class main{
//     public static void main(String[] args) {
//         int a=258;
//         byte b=(byte)a;
//         System.out.println(b);   
//     }
// }

//When casting from a larger integer type (int) to a smaller one (byte), Java discards all but the lowest 8 bits. Those remaining 8 bits are then interpreted as a signed byte (using two's complement).
//Since a byte has 256 possible bit patterns, casting effectively wraps around every 256 values.
//easy trick:
//result=number%256

//for the above example answer would be 2 as 258%256=2
// for positive numbers, a shortcut works.
// For int → byte, we said:
// A byte has 8 bits → 2⁸ = 256 possible values.
// Shortcut: Result = Number % 256 (for positive numbers).
// For int → short:
// A short has 16 bits → 2¹⁶ = 65,536 possible values.
// Shortcut: Result = Number % 65,536 (for positive numbers).
//so like this for bigger to shorter datatype conversion modulo number by total number of bits of the smaller datatype


//do like this for any bigger conversion to short~
// Example 1
// int a = 257;
// byte b = (byte) a;
// 257 % 256 = 1

// Since 257>256, answer is:

// 1
// Example 2
// int a = 255;
// byte b = (byte) a;
// 255 % 256 = 255

// Now 255 < 256, so:

// 255 - 256 = -1

// Output:

// -1

//Type promotion:

// public class main{
//     public static void main(String[] args) {
//         byte a=50;
//         byte b=40;
//         byte c=100;
//         int d=a*b/c;
//         System.out.println(d); 
//     }
// }


//In the above example,a*b explicitly exceeds byte range but auto type promotion happens in java whenever operation are performed so integer operation happen even if you would have declared float instead of int it would had given output as float but internal operation would had happened as integer first then output as the datatype declared of the output



