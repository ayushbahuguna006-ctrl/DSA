//Array ~ collection of single datatypes
//syntax ~ 
//   int[] rnos=new int[5];  or  int[] rnos2={23,45,52};   or   int[] rnos=new int[]{5,6,7};


//Declaration and initialization~
// int[] rnos;   //declalre
// rnos=new int[5];   //intialize   ~ dynamic memory allocation to values is given on runtime while datatypes are coorect or not is checked on compile time
//elements of array in java are stored in continuous memory

// in java all primtive types values are stored in stack memory not heap while others arrays classes objects strings  etc values are stored in heap memory


//how to take input from user  for arrays~

// import java.util.Scanner;

// import java.util.Arrays;

// public class arrays{
//     public static void main(String[] args) {
//         int arr[]=new int[5];
//         Scanner input=new Scanner(System.in);
//         for(int i=0;i<arr.length;i++){
//             System.out.print("Enter your number"+" "+(i+1)+" ");
//             arr[i]=input.nextInt();
//         }
//         //  for(int i=0;i<arr.length;i++){      //1st way to print an array
//         //     System.out.print(arr[i]+" ");
//         // }

//         // System.out.println(Arrays.toString(arr));   //best mthod of printing an array

//     }
// }