
//if-else statements

// public class 5conditionloop {
//     public static void main(String[] args) {
//         int salary=40000;
//         if(salary>10000){
//             salary+=10000;
//             System.out.println(salary);
//         }
//         else if(salary>26000){
//             salary+=5000;
//             System.out.println(salary);
//         }
//         else{
//             System.out.println(salary);
//         }
//     }
// }



//loops~for loop,while loop.do-while loop


//for loop~

// public class conditionloop {
//     public static void main(String[] args) {
//         for(int i=0;i!=6;i++){
//             System.out.println(i);
//         }  
// }
// }

//while loop~

// public class conditionloop{
//     public static void main(String[] args) {
//         int i=1;
//         while(i<=5){
//             System.out.println(i);
//             i++;
//         }
//     }
// }

//do-while loop~the only loop which will execute atleast once before the condition is checked

// public class conditionloop{
//     public static void main(String[] args) {
//         int i=1;
//         do{
//             System.out.println(i);
//             i++;
//         }
//         while(i<=5);
//     }
// }



// Question 1)largest of two numbers:

// method 1~

// import java.util.Scanner;

// public class conditionloop{
//     public static void main(String[] args) {
//         int max;
//         Scanner input=new Scanner(System.in);
//         System.out.println("enter a");
//         int a=input.nextInt();
//         System.out.println("enter b");
//         int b=input.nextInt();
//         System.out.println("enter c");
//         int c=input.nextInt();
//         if(a>b){
//             max=a;
//         }
//        else{
//         max=b;
//        }
//        if(c>max){
//         max=c;
//        }
//        System.out.println("max number is"+" "+max);
//     }
// }

//method 2~

// import java.util.Scanner;

// public class conditionloop{
//     public static void main(String[] args) {
//         int max;
//         Scanner input=new Scanner(System.in);
//         System.out.println("enter a");
//         int a=input.nextInt();
//         System.out.println("enter b");
//         int b=input.nextInt();
//         System.out.println("enter c");
//         int c=input.nextInt();
//         max=Math.max(a, Math.max(b, c));
//         System.out.println("max is"+" "+max);
//     }
// }

// Question 2)Alphabet case check of a word first letter:

// import java.util.Scanner;

// public class conditionloop{
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         char word=input.next().trim().charAt(0);
//         if(word>='a' && word<='z'){
//             System.out.println("Lower case letter");
//         }else if(word>='A' && word<='Z'){
//             System.out.println("Upper case letter");
//         }
//     }
// }

// Question 3)fibonnaci series

// import java.util.Scanner;

// public class conditionloop{
//     public static void main(String[] args) {
//         int a=0;
//         int b=1;
//         System.out.println("Enter your number");
//         Scanner input=new Scanner(System.in);
//         int num=input.nextInt();
//         if(num==0){
//             System.out.println("Fibonnaci of num is"+" "+0);
//         }
//         else{
//             for(int i=2;i<=num;i++){
//             int c=a+b;
//             a=b;
//             b=c;
//         }
//         System.out.println("Fibonnaci of num is"+" "+b);
//         }
//     }
// }

// Question 4)finding count of a digit in a number


// import java.util.Scanner;

// public class conditionloop{
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         System.out.println("Enter your number");
//         int num=input.nextInt();
//         System.out.println("Enter the digit");
//         int digit=input.nextInt();
//         int count=0;
//         for(int i=0;num>0;i++){
//              int rem=num%10;
//              if(rem==digit){
//                 count++;
//              }
//              num/=10;
//         }
//         System.out.println(count);
//     }
// }

//Question 5) Reverse of a number

// import java.util.Scanner;

// public class conditionloop{
//     public static void main(String[] args) {
//         System.out.println("Enter your number");
//         Scanner input=new Scanner(System.in);
//         int num=input.nextInt();//1234
//         int rev=0;
//         for(int i=0;num>0;i++){
//             int rem=num%10;//4  //3  //2
//             rev=rev*10+rem;//4  //43  //432   //4321
//             num/=10;//123   //12   //1
//         }
//         System.out.println(rev);

//     }
// }


