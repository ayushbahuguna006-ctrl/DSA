//Array ~ collection of single datatypes , arrays are mutable
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

//         // System.out.println(Arrays.toString(arr));   //best method of printing an array
//     }
// }


//Multi dimension array~2d arrays

// syntax~ int [][] arr=new int[3][3];   or if hardcoded   int[][] arr={{1,2,3},{4,5,6},{7,8,9}};



// Ques:Make a 2D array taking rows and coloumns as input and then print the 2D array

// import java.util.Arrays;
// import java.util.Scanner;

// public class arrays{
//     public static void main(String[] args) {
//          Scanner in=new Scanner(System.in);
//          System.out.println("Enter number of rows");
//          int row=in.nextInt();
//          System.out.println("Enter number of coloumns");
//          int col=in.nextInt();
//         int[][] arr=new int[row][col];
//         System.out.println(arr.length);
//         System.out.println("Enter elements of this row");
//         for(row=0;row<arr.length;row++){
//             for(col=0;col<arr[row].length;col++){
//                 arr[row][col]=in.nextInt();
//             }
//         }
//         //two methods for output~
//         //1st method

//         for( row=0;row<arr.length;row++){
//            for(col=0;col<arr[row].length;col++){
//             System.out.print(arr[row][col]);
//            }
//            System.out.println();
//         }
        
//         // 2nd method
//         for( row=0;row<arr.length;row++){
//            System.out.println(Arrays.toString(arr));
//         }




        
//     }
// }

// Array-list~used when size of input to be inserted in array is not known

//syntax~
    // ArrayList<Integer> list=new ArrayList<>();

// import java.util.ArrayList;

// public class arrays{
//         public static void main(String[] args) {
//             ArrayList<Integer> list=new ArrayList<>();
//             list.add(67);
//             list.add(100);
//             list.add(86);
//             list.add(65);
//             System.out.println(list);   //prints list of array elements
//             System.out.println(list.contains(67));   //return boolean after checking
//             list.set(0, 99);
//             System.out.println(list);   // [99,100,86,65]
//             list.remove(2);
//             System.out.println(list);   // [99,100,65]
//         }
//     }


     //Taking input in arraylist~

//        import java.util.ArrayList;
// import java.util.Scanner;
//            public  class arrays{
//             public static void main(String[] args) {
//                 Scanner in=new Scanner(System.in);
//                 ArrayList<Integer> list=new ArrayList<>();
//                 //input
//                 for(int i=0;i<5;i++){
//                     System.out.println("Enter number"+" "+(i+1)+" ");  
//                     list.add(in.nextInt());
//                 }
 //no get used because array list is directly iterated 
//                 //output
//                 System.out.println(list);
//             }
//            }


// Points to note~

// Size is internally fixed but as soon as more number of elements come in array a new arraylist ios created say of double the size and all the ol elements are copied in the new one and this continues if more and more elements keep entering.Old arraylist is deleted after the creation of the new one.


//Multi Array List~

// import java.util.ArrayList;
// import java.util.Scanner;

// public class arrays{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         ArrayList<ArrayList<Integer>> list=new ArrayList<>();
//         for(int i=0;i<3;i++){
//             list.add(new ArrayList<>());   //adding 3 arraylist
//         }

//         for(int i=0;i<3;i++){
//                for(int j=0;j<3;j++){
//                 list.get(i).add(in.nextInt());  
//                }
// //get is used for getting array list position and iterate over it and here it will fetch the array list and then add 3 integers in that array list which the user inputs
//         }
//         System.out.println(list);

//     }
// }


// Ques.Swap two values in an array

// import java.util.Arrays;
// public class arrays{
//     public static void main(String[] args) {
//         int[] arr={1,4,8,2};
//         swap(arr,1,2);
//         System.out.println(Arrays.toString(arr));
// }
//  static void swap(int[] array,int index1,int index2){
//         int  temp=array[index1];
//         array[index1]=array[index2];
//         array[index2]=temp;
//     }
// }

// Ques.max value of an array

// public class arrays{
//     public static void main(String[] args) {
//         int[] arr={4,76,86,43,56,78,32,100};
//         int maximumVal=max(arr);
//         System.out.println(max(arr));
//     }
//     static int max(int[] arr){
//         int max=arr[0];
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         return max;
//     }
// }

//Ques.reverse of an array

// import java.util.Arrays;
// public class arrays{
//     public static void main(String[] args) {
//         int[] arr={1,4,8,2};
//         swap(arr,1,2);
//         System.out.println(Arrays.toString(arr));
//         reverse(arr);
//         System.out.println(Arrays.toString(arr));
// }
  
// static void reverse(int[] arr){
//     int index1=0;
//     int index2=arr.length-1;
//     for(int i=0;index1<=index2;i++){
//         swap(arr,index1, index2);
//         index1++;
//         index2--;
//     }
// }
//  static void swap(int[] array,int index1,int index2){
//         int  temp=array[index1];
//         array[index1]=array[index2];
//         array[index2]=temp;
//     }
// }
