// import java.util.Scanner;

// public class functions{
//     public static void main(String[] args) {
//         sum();
//         int ans=sum2();
//         System.out.println(ans);
//     }

//print type function/method ~ void can be used as there's no returning datatype

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

        // public class functions{
        //     public static void main(String[] args) {
        //         String line=greeting();
        //         System.out.println(line);
        //     }
        //     static String greeting(){
        //         String greeting="Hello!";
        //         return greeting;
        //     }
        // }

        //string type return
        import java.util.Scanner;
        public class functions{
            public static void main(String[] args) {
                Scanner input=new Scanner(System.in);
                System.out.println("Enter your name");
                String name=input.next().trim();
                String output=greeting(name);
                System.out.println(output);
            }
            static String greeting(String name){
                String message="Hello"+" "+name;
                return message;
            }
        }

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

