// import java.util.Scanner;

// class Hello {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine(); 
//         System.out.println(s);
        
//     }   
// }
// class Hello {
//      Static{
//      int a = 20;
//      int b = 30;
//      int add = a+b;
//      System.out.println(add);
//      }

//      public static void main(String[] args){
//      int a = 20;
//      int b = 30;
     
//      int c = a+b;
//      System.out.println("The sum of "+a+""and"+b+"is:"+c);
//      }
//      public static void main(String[] args){
//      int a = 20;
//      int b = 330;
     
//      int c = a+b;
//      System.out.println(null);
//      }

// }

// class Hellow{
//     public static void main(String[] args) {
//         double a = 20;
//         int b = (int)a;
//         System.out.println(a);
//         System.out.println(b);

//     }
// }
// Patterns Problem
//     public static void main(String[] args) {
//         int n = 4;
//         int m= 5; // You can change this value for larger patterns

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= m; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println(); // Move to the next line after each row
//         }
//     }
// }
// StarPattern Square
// public class StarPattern{
//      public static void main(String[] args) {
//         int n = 5;
//         int m= 5; // You can change this value for larger patterns

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <n-1; j++) {
//                 System.out.print( "*");
//             }
//             for (int j = 1; j <n; j++) {
//                 System.out.print(" ");
//             }
//                 System.out.println(); 
//         }
    
//     }
// }
public class StarNumberPattern {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <= i; j++) {
                    System.out.print(count + " ");
                    count++;
            
                }
            
            System.out.println();
        }
        }
    }

