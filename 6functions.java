// import java.util.Scanner;

// public class functions{
//     public static void main(String[] args) {
//         sum();
//         int ans=sum2();
//         System.out.println(ans);
//     }

//print type function/method ~ void can be used as there's no returning value in the function

//     static void sum(){
//     Scanner input=new Scanner(System.in);
//     System.out.println("Enter a");
//     int a=input.nextInt();
//     System.out.println("Enter b");
//     int b=input.nextInt();
//     int sum=a+b;
//     System.out.println("The sum is:"+" "+sum);
//     }

    //return type function/method ~ int is required as returning a datatype ~ after return it means end further executions inside that scope will not happen

    //int type return

//     static int sum2(){
//         Scanner input=new Scanner(System.in);
//         System.out.println("Enter a");
//         int a=input.nextInt();
//         System.out.println("Enter b");
//         int b=input.nextInt();
//         int sum=a+b;
//         return sum;
//     }
// }
              
    

        //string type return

        // import java.util.Scanner;
        // public class functions{
        //     public static void main(String[] args) {
        //         Scanner input=new Scanner(System.in);
        //         System.out.println("Enter your name");
        //         String name=input.next().trim();
        //         String output=greeting(name);
        //         System.out.println(output);
        //     }
        //     static String greeting(String name){
        //         String message="Hello"+" "+name;
        //         return message;
        //     }
        // }

        // passing values as arguments

        // public class functions{
        //     public static void main(String[] args) {
        //         int ans=sum(2,3);                            //arguments
        //         System.out.println(ans);
        //     }
        //     static int sum(int a,int b){                     //parameters
        //         int sum=a+b;
        //         return sum;
        //     }
        // }

        //swap two numbers once inside main class and once inside functions~

        //in java,only call by values happen and not reference so object is not changed on swapping while in function scope as in the function scope the variable points to the same object as the original variable so any changes made in the value swapping will change the other variable not the original variable

        //inside main class ~ In this case numbers will get swapped because the original variable is being altered

        // public class functions{
        //     public static void main(String[] args) {
        //         int a=10;
        //         int b=20;
        //         int temp=a;
        //         a=b;
        //         b=temp;
        //         System.out.println(a+" "+b);
        //     }
        // }
        

        //inside function then calling in main class ~ In this case numbers will not get swapped as another variable is being introduced in the function scope so that variable is targeting the value along with original if we change function variable it doesn't affect the original one value.
        
        // public class functions{
        //     public static void main(String[] args) {
        //         int a=10;     //original variable
        //         int b=20;
        //         swap(a,b);
        //         System.out.println(a+" "+b);
        //     }
        //     static void swap(int a,int b){   
        //         int temp=a;
        //         a=b;
        //         b=temp;
        //     }
        // }

        //int a and int b are function parameters and assigned to value passed from the main class so both variables original as well as the function one points to the same value so any changes made in function variable will not result in the change of the value of the original variable
         

        //if not call by reference then how to change the actual value ? ~ modify values using arrays

        
        // Primitive types (int, double, char, etc.) → a copy of the value is passed.
        // Arrays and objects → a copy of the reference is passed.This is the reason array changes values even inside functions as reference copy is passed so reference is same but if whole of the array is tried to replace it won't as reference gets changed on changing values.

   
        // Eg: This changes the original array as the value of array is being modified not the original is being changed

                    //    import java.util.Arrays;

                    //    public class functions{
                    //     public static void main(String[] args) {
                    //         int[] arr={1,2,3,4};
                    //         change(arr);
                    //         System.out.println(Arrays.toString(arr));
                    //     }
                    //     static void change(int nums[]){
                    //         nums[0]=99;
                    //     }
                    //   }
           

        //Eg: This gives the original array and doesn't change it.


                //  import java.util.Arrays;

                    //    public class functions{
                    //     public static void main(String[] args) {
                    //         int[] arr={1,2,3,4};
                    //         change(arr);
                    //         System.out.println(Arrays.toString(arr));
                    //     }
                   //   static void change(int[] nums){
                //    nums = new int[]{5,6,7};
                //     }
           
        
        // function/method overloading ~ when function execution depends on the datatype of arguments if function names happens to be same

// import java.util.Arrays;

// public class functions{
//             public static void main(String[] args) {

//                 demo(2,3,4);   //if int arguments are passed , that demo function will execute which allows integer arguments.for this,function on line 138 will execute

//                 demo("Rahul","Ayush");   //if string arguments are passed,that demo function will execute which allows string arguments.for this,function on line 141 will execute
//             }
//             static void demo(int ...v){
//                 System.out.println(Arrays.toString(v));
//             }
//              static void demo(String ...v){
//                 System.out.println(Arrays.toString(v));
//             }
//         }


// Questions~
   
//     Ques1)check if a number is prime

// import java.util.Scanner;

// public class functions{
//             public static void main(String[] args) {
//                 Scanner input=new Scanner(System.in);
//                 System.out.println("Enter your number");
//                 int num=input.nextInt();
//                 boolean ans=isPrime(num);
//                 System.out.println(ans);
//             } 
//             static boolean isPrime(int n){
//                 if(n<=1){
//                     return false;
//                 }
//                 for(int i=2;i<n;i++){
//                     if(n%i==0){
//                         return false;
//                     }
//                 }
//                 return true;
//             }
//         }

//         Ques2)check if armstrong number

// import java.util.Scanner;

// public class functions{
//                 public static void main(String[] args) {
//                     Scanner input=new Scanner(System.in);
//                     System.out.println("Enter your number");
//                     int num=input.nextInt();
//                     armstrong(num);

//                 }
//                 static void armstrong(int n){
//                     int sum=0;
//                     for(int i=0;n>0;i++){
//                     int rem=n%10;
//                     sum+=rem*rem*rem;
//                     n/=10;
//                     }

//                     System.out.println(sum);
//                 }
//             }


        

       

