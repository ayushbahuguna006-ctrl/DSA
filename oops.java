//int []=new int[5];
//String[] names=new String[5];

//similarly i want a datatype which stores name ,roll no. and marks all together in such a case we create class which is a template to the instance of the object we create using that template
//class is a named group of properties and functions
//example class is humans and say ayush is the object i.e instance of the template used to create that object
// import java.util.Arrays;

// public class oops1{
//     public static void main(String[] args) {
//         Student[] students=new Student[5];  //use to create 5 student objects in the below example you are only creating one when you want to create multiple you will go like ~


// Student[] students = new Student[5];
// students[0] = new Student(23.2f, "Ayush", 12);
// students[1] = new Student(90.5f, "Kunal", 1);

//         //if i do:
//         System.out.println(Arrays.toString(students));  //by default the value assigned in java to class is null
//         Student kunal=new Student();  //new student() creates a new object and gives it dynamic memory allocation  //here () is a special type of function known as constructor which holds parameters for the values that the class variable holds which can be accessed by using this keyword.constructor is used to intialise an object when it is created.if without parameters(student()) it is known as by no argument constructor and it calls that constructor in the student class which holds no argument else it calls the other which has parameters (student(int rollno,string name,float marks))


// A constructor in Java is a special block that is automatically called in class when you create an object using new.Special function inside class
// By default constructor is provided by java if no constructor is written where values assigned are null
// this keyword is used for the assigning variable i.e say here Student kunal=new Student(); , here kunal is the this keyword.

//         kunal.greeting();
//         kunal.changename("Rahul");
//         kunal.greeting();
        
//     }
// }
//   class Student{
//         String name;
//         int rollno;
//         float marks;
//         void greeting(){
//             System.out.println("Hello my name is"+" "+this.name);    //name will be called using this keyword from the constructor
//         }
//         Student(){
//           this.name="Ayush";
//           this.marks=33.3f;
//           this.rollno=2;
//         }
//         void changename(String newname){
//            this.name=newname;
//         }
//     }


    //Better way of writing constructors with parameterized constructor

import java.util.Arrays;

public class oops{
    public static void main(String[] args) {
        Student kunal=new Student(23.2f, "Ayush", 12);
        System.out.println(kunal.rollno);
        Student random=new Student(kunal);
        System.out.println(random.name);
    }
}
class Student{
    float marks;
    String name;
    int rollno;
    Student(float mar,String naam,int rno){    //when arguments are given in the static class this constructor is parameter one
        this.marks=mar;
        this.name=naam;
        this.rollno=rno;
    }
    Student(){     //when no arguments are given in static class this constructor is called no param constructor
        this.rollno=13;
        this.name="Rahul";
        this.marks=23.3f;
    }

     //constructor for assigning  objects values into other objects,here this is random and and other is kunal
    Student(Student other){
        this.name=other.name;
        this.rollno=other.rollno;
        this.marks=other.marks;
    }
}



//Wrapper classes => Wrapper classes are object version of primitve datatypes i.e they are non primitives

// Primitive	Wrapper Class
// byte	     Byte
// short	     Short
// int	         Integer
// long	     Long
// float	     Float
// double	     Double
// char	     Character
// boolean	     Boolean


// final keyword is used for if the value can't be changed any further never