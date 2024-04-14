// import java.util.Scanner;
// class conditions{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.print("enter a your age: ");
//         int age=sc.nextInt();
//         if(age>=18){
//             System.out.println("your adult ");
//         }
//         else{
//             System.out.println("your minor");
//         }
//     }
// }

// import java.util.Scanner;
// class conditions{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.print("enter a number:");
//         int num=sc.nextInt();
//         if(num%2==0){
//             System.out.print("even num"+num);
//         }
//         else if (num%2!=0){
//             System.out.println("odd num"+num);

//         }
//         else{
//             System.out.print("renter");
//         }
//     }
// }

// import java.util.Scanner;
// class conditions{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.print("enter a number:");
//         int num1=sc.nextInt();
//         System.out.print("enter a number2:");
//         int num2=sc.nextInt();

//         if (num1>num2){
//             System.out.print("num1 is greater");
//         }
//         else if (num1==num2){
//             System.out.print("equal");
//         }
//         else{
//             System.out.print("a is lesser");
//         }

//     }
// }


//switch


// import java.util.Scanner;
// class conditions{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.print("enter a number:");
//         String num1=sc.next();
//         switch(num1){
//             case "prasanth": System.out.print("hello");
//             break;
//             case "ppk": System.out.print("welcome");
//             break;
//             case "subbu": System.out.print("namaste");
//             break;
//             default: System.out.print("hi");
//             break;
//         }

//     }
// }

// import java.util.Scanner;
// class conditions{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter value of a: ");
//         int a = sc.nextInt();
//         System.out.print("enter value of b: ");
//         int b = sc.nextInt();  
//         System.out.print("enter the operator: ");
//         String operator = sc.next();
//         switch(operator){
//             case "*": int A=a*b;
//             System.out.print(A);
//             break;
//             case "/": int B=a/b;
//             System.out.print(B);
//             break;
//             case "-": int C=a-b;
//             System.out.print(C);
//             break;
//             case "+": int D=a+b;
//             System.out.println(D);
//             break;
//             default: System.out.print("");

//         }
//     }
// }

// import java.util.Scanner;
// class conditions{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter value of num: ");
//         int a = sc.nextInt();
//         switch(a){
//             case 1: System.out.println("Janauary");
//             break;
//             case 2:System.out.println("febauary");
//             break;
//             case 3:System.out.println("march");
//             break;
//             case 4:System.out.println("april");
//             break;
//             case 5:System.out.println("may");
//             break;
//             case 6:System.out.println("june");
//             break;
//             case 7:System.out.println("july");
//             break;
//             case 8:System.out.println("august");
//             break;
//             case 9:System.out.println("sep");
//             break;
//             case 10:System.out.println("oct");
//             break;
//             case 11:System.out.println("nove");
//             break;
//             case 12:System.out.println("dec");
//             break;
//             default:System.out.println("");
            

//         }
//     }
// }

// class forloop{
//     public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             System.out.println("enter subject marks");
//             float m1=sc.nextInt();
//             float m2=sc.nextInt();
//             float m3=sc.nextInt();
//             float PT=((m1+m2+m3)/300)*100;
//             if(m1>33&&m2>33&&m3>33&&PT>40){
//                     System.out.println("Congrats he is Pass");
//             }else{
//                     System.out.println("he is Fail");
//             }
//     }
// }

// import java.util.Scanner;
// class conditions{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int year=sc.nextInt();
//         if((year%4==0||year%400==0)&& year%100!=0){
//             System.out.println("leap year");
//         }else{
//             System.out.println("NOT leap year");
//         }
//     }
    
// }


// import java.util.Scanner;
// class forloop{
//     public static boolean isPrime(int n){
//         if(n<=1){
//             return false;
//         }
//         for (int i=2;i<=Math.sqrt(n);i++){
//             if (n%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int n=sc.nextInt();
//         if (isPrime(n)){
//             System.out.println(n+"is Primenumber");
//         }else{
//             System.out.println(n+"not prime");
//         }
//         sc.close();
//     }
// }
// import java.util.Scanner;
// public class forloop {
//     public static void evaluateMarks(int marks) {
//         if (marks >= 90) {
//             System.out.println("This is Good");
//         } else if (marks >= 60 && marks <= 89) {
//             System.out.println("This is also Good");
//         } else if (marks >= 0 && marks <= 59) {
//             System.out.println("This is Good as well\nBecause marks don’t matter but our effort does.");
//         } else {
//             System.out.println("Invalid input for marks");
//         }
//     }



// import java.util.Scanner;
// class conditions{
//     public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.print("enter a range");
//        int a=sc.nextInt();
//        for (int i=0;i<=a;i++){
//         if(i%2==0){
//             System.out.println(i);
//         }else{
//             System.out.println("odd");
//         }
//        }
//     }
// }






















































































