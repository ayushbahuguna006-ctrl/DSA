//Strings are immutable
//In java,outputs are always given in form of string whatever you int a=56 or int[] arr=new int{1,3,4,4} everything output is string as tostring method is used when giving the output.Also in case of arrays output is given in form of string in formatted text so we generally discard the tostring method and use the array.toString() method as it gives a much more readable format although we can make our own method later on
// String name="Ayush";   //here string is the datatypes name is the reference variable and ayush is the object in the string pool in the heap memory.
//we can't change string objects if once made due to security reasons as if one object changed by user and multiple ref variable are pointing to the same object it would cause passwords to change for each ref variable which are the user say .
//Second thing we know if two ref variable point to the same object and we try to change the value of one of the ref variable it causes value to be changed for other ref variable but for strings it doesn't work this way as in java strings are immutable. 


// public class astring{
//     public static void main(String[] args) {
//         String a="Ayush";
//         System.out.println(a);
//         a="sir";
//         System.out.println(a);
//     }
// }

// public class astring{
//     public static void main(String[] args) {
//         String a="Ayush";
//         String b="Ayush";
//         System.out.println(a==b);   //True as both in string pool of heap memory so both ref var points to the same object 

//     }
// }

// In the above example , we should know that string objects are immutable i.e. ayush here so when we are assigning new object  to a new variable a , it creates a new object so a ref variable points to this new object and garbage collection hits and Ayush object is removed
//a==b,gives true for if the ref variale both a and b are poiting to the same object else it gives false if the ref variable are pointing uniquely even if the object is the same.
//if you use the new method for creating a string it will store the object in the heap memory outside of the string pool and thus even if two objects are same ref variable will be pointing to the object uniquely for both say a for object 1 and b for object 2.

// public class astring{
//     public static void main(String[] args) {
//         String a=new String("Ayush");
//         String b=new String("Ayush");
//         System.out.println(a==b);   //false as both outside of string pool in the heap memory so treated as different objects.
//     }
// }

// equals method is used to check only and only the values are same or not it doesn't include the concept of ref varibale or object

// Example~

// public class astring{
//     public static void main(String[] args) {
//         String a="ayush";
//         String b="ayush";
//         System.out.println(a.equals(b));
//     }
// }

//charAt(index)  method is used for getting the character at that index in the string


//pretty printing ~

// public class astring{
//     public static void main(String[] args) {
//         float a=2.375f;
//         //printf is used for pretty printing and instead of + sign , is used
//         System.out.printf("The value of a is %.2f",a);  //2.37
//         System.out.println();
//         System.out.println(Math.PI);
//         System.out.println();
//         System.out.printf("value is %.3f",Math.PI);
//         System.out.println();
//         System.out.printf("Hello my name is %s","ayush");
//     }
// }

// Operators~for operator atleast one of the operand should be of type string and then java will convert whole epression to string except one special case of char addition where unicode values are taken as char is numeric type in java

// import java.util.ArrayList;
// public class astring{
//     public static void main(String[] args) {
//         System.out.println('a'+'b');  //195  //converted to unicode
//         System.out.println("a"+"b");  //ab   
//         System.out.println('a'+3);   //100
//         System.out.println((char)('a'+3));  //d
//         System.out.println("a"+1);  //a1   //1 integer will be converted to string "1" and then added
//         System.out.println("kunal"+new ArrayList<>());  //kunal[]
//     }
// }


//StringBuilder ~

// StringBuilder is a class in Java used to modify strings efficiently.

// The key idea is:

// String is immutable → once created, it cannot be changed.
// StringBuilder is mutable → its contents can be changed without creating a new object every time

// Normal String ~
// String s = "Hello";
// s = s + " World";


// What actually happens is:

// "Hello" object exists.
// "Hello World" is created as a new object.
// s now points to the new object.
// The old "Hello" object becomes eligible for garbage collection.


// Using stringBuilder ~

// StringBuilder sb = new StringBuilder("Hello");

// sb.append(" World");

// System.out.println(sb);

// Visual Representation ~

// Normal String
// s ───► "Hello"

// s = s + " World"

// Old object:  "Hello"        (unused)
// New object:  "Hello World"  ◄── s

// StringBuilder ~

// sb ───► [Hello]

// append(" World")

// sb ───► [Hello World]


// Usecase ~

// public class astring{
//     public static void main(String[] args) {
//         StringBuilder builder=new StringBuilder();
//         for(int i=0;i<26;i++){
//             char ch=(char)('a'+i);
//             builder.append(ch);
//         }
//         System.out.println(builder); //prints abcdef.....z
//     }
// }

//StringBuilder methods ~

// append("")  //appends text at end
// insert(int index,value)   //inserts text at a posn
// delete(int start,int end)   //deletes character from start to end-1
// deleteCharAt(int index)     //deletes one character
// reverse()    //reverse the string
// charAt(int index)   //returns a char at the specified index
// length()    //return length of string
// substring(int start,int end)    //returns substring from start to end-1
// toString()     //converts it into string


//String methods ~
// note that changes are made in a new string not the original one

//breaking string into char and storing char in array

// import java.util.Arrays;

// public class astring{
//     public static void main(String[] args) {
//         String name="KUNAL";
//         System.out.println(Arrays.toString(name.toCharArray()));   // [K,U,N,A,L]
//         System.out.println(name.toLowerCase()); //makes all the char lower case
//         System.out.println(name.trim()); //removes out extra space
//         System.out.println(Arrays.toString(name.split("")));   //It splits a string into an array of strings based on a delimiter (separator).
//     }
// }


// Ques.Palindrome program