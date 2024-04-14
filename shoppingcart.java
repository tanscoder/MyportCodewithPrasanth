// import java.util.Scanner;
// public class shoppingcart {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         double totalamount=0;
//         System.out.println("welcome to the shopping cart!");
//         System.out.println("-----------------------------");
//         while(true)
//         {
//             System.out.println("Enter your choice (1-5): ");
//             System.out.println("1.Add apples to cart : ($1.5) ");
//             System.out.println("2.Add Laptops to cart : ($999) ");
//             System.out.println("3.Add Books to cart : ($12.49) ");
//             System.out.println("4.Display cart!");
//             System.out.println("5.Exit!");
//             int choice = sc.nextInt();

//             if(choice==1)
//             {
//                 System.out.println("Enter the quantity of apples : ");
//                 double a = sc.nextDouble();
//                 System.out.println(a + " apples are added to cart");
//                 totalamount+=1.5*a;
//             }
//             else if(choice==2)
//             {
//                 System.out.println("Enter the quantity of laptops : ");
//                 double b = sc.nextDouble();
//                 System.out.println(b + " laptops are added to cart");
//                 totalamount+=999*b;

//             }
//             else if(choice==3)
//             {
//                 System.out.println(" Enter the quantity of books : ");
//                 double c = sc.nextDouble();
//                 System.out.println(c + " books are added to cart");
//                 totalamount+=12.49*c;
//             }
//             else if(choice==4)
//             {
//                 System.out.println("Shopping cart Contents:");
//                 System.out.println("Total cost : $" + totalamount );
                
//             }
//             else if(choice==5)
//             {
//                 System.out.println("Total cost : $" + totalamount);
//                 System.out.println("Thank you for shopping with us !");
//                 break;
                
//             }
//             else
//             {
//                 System.out.println("Invalid data");
//             }
//         }

        
//     }
    
// }

// import java.util.*;

// class ArithmeticAverage {
//     public static double average(int[] arr) {
//         int sum = 0;
//         for (int num : arr) {
//             sum += num;
//         }
//         return (double) sum / arr.length;
//     }

//     public static double average(double[] arr) {
//         double sum = 0.0;
//         for (double num : arr) {
//             sum += num;
//         }
//         return sum / arr.length;
//     }
// }

// public class shoppingcart{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the length of the array: ");
//         int length = scanner.nextInt();
//         int[] intArray = new int[length];
//         double[] doubleArray = new double[length];
//         System.out.println("Enter " + length + " integers:");
//         for (int i = 0; i < length; i++) {
//             intArray[i] = scanner.nextInt();
//         }
//         System.out.println("Enter " + length + " doubles:");
//         for (int i = 0; i < length; i++) {
//             doubleArray[i] = scanner.nextDouble();
//         }
//         double intAvg = ArithmeticAverage.average(intArray);
//         System.out.println("Average of integers: " + intAvg);
        
//         double doubleAvg = ArithmeticAverage.average(doubleArray);
//         System.out.println("Average of doubles: " + doubleAvg);
        
//         scanner.close();
//     }
// }

// class customer{
//     String name;
//     int loan;
//     int salary;
//     String address;
//     customer(String name,int loan,int salary,String address){
//         this.name=name;
//         this.loan=loan;
//         this.salary=salary;
//         this.address=address;
//     }
//     public void display(){
//         System.out.println(name+" "+loan+" "+salary+" "+address);
//     }
// }
// public class shoppingcart {
//     public static void main(String[] args) {
//         customer c1=new customer("robert", 100000,10000,"dehli");
//         customer c2=new customer("sam", 200000,20000,"hyderabad");
//         customer c3=new customer("john", 19990,15000,"chennai");
//         System.out.println("Name"+" "+"loan"+" "+"salary"+" "+"address");
//         c1.display();
//         c2.display();
//         c3.display();
//     }
// }

// public class shoppingcart {
//     public static void main(String[] args) {
//         int a[][]=new int[3][3];
//         Scanner sc=new Scanner(System.in);
//         int sumd=0;
//         int sumad=0;
//         int sumo=0;
//         for(int i=0;i<a.length;i++){
//             for(int j=0;j<a.length;j++){
//                 a[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<a.length;i++){
//             for(int j=0;j<a.length;j++){
//                 if(i==j){
//                     sumd+=a[i][j];
//                 }
//                 else if(i+j==3-1){
//                     sumad+=a[i][j];
//                 }
//                 else{
//                     sumo+=a[i][j];
//                 }
//             }
//         }
//         System.out.println("the sum is:"+sumo);
        
//     }
// }

// class Person{
//     String name;
//     String gender;
//     String address;
//     int age;
//     Person(String name,String gender,String address,int age){
//         this.name=name;
//         this.gender=gender;
//         this.address=address;
//         this.age=age;
//         System.out.println(name+" "+gender+" "+address);
//     }
// }
// class department extends Person{
//     String head;
//     department(String name,String head){
//         super(name,"","",0);
//         this.head=head;
//     }
// }
// class doctor extends Person{
//     String sepciality;
//     String location;
//     float exp;
//     doctor(String speciality,String location,float exp){
//         super("","","",0);
//         this.sepciality=speciality;
//         this.location=location;
//         this.exp=exp;
//     }
    
// }
// class staff extends Person{
//     String education;
//     String date;
//     float exp;
//     staff(String education,String date,float exp){
//         super("","","",0);
//         this.education=education;
//         this.date=date;
//         this.exp=exp;
//     }

// }
// class patient extends Person{
//     String disease;
//     String dept;
//     patient(String name,String gender,String address,int age,String disease,String dept){
//         super(name,gender,address,age);
//         this.disease=disease;
//         this.dept=dept;
//         System.out.println(age+" "+disease+" "+dept);
//     }

// }
// public class shoppingcart {
//     public static void main(String[] args) {
//         patient p1=new patient("ppk","MAle","ndjln",12,"cancer","techincal");
//     }
// }


// public class shoppingcart{
//     public static void main(String[] args) {
//         int a[] = {1, 2, 3, 4, 5, 6, 7};
//         int max = Integer.MIN_VALUE;
//         int secMax = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE; 
//         int secmin=Integer.MAX_VALUE;

//         for (int i = 0; i < a.length; i++) {
//             if (a[i] > max) {
//                 secMax = max;
//                 max = a[i]; 
//             } else if (a[i] > secMax && a[i] != max) {
//                 secMax = a[i];
//             }
//             if (a[i] < min) {
//                 min = a[i]; 
//             }
//             else if(a[i]<secmin && a[i]!=min){
//                 secmin=a[i];
//             }
//         }

//         System.out.println("Maximum: " + max);
//         System.out.println("Second Maximum: " + secMax);
//         System.out.println("Minimum: " + min+" "+secmin);
//     }
// }
import java.util.Scanner;

public class shoppingcart{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double sum = 0;
        for (int i = 0; i < a; i++) {
            sum += Math.pow(-1, i) * (4.0 / (2 * i + 1));
        }
        System.out.println(sum);
    }
}

































