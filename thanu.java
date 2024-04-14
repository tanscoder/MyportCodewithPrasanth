// import java.util.*;
// class thanu {
//     public static void main(String[] args) {
//         int[] a={1,2,5,8,6,7};
//         Arrays.sort(a);
//         System.out.println(Arrays.toString(a));
//     }
// }
// import java.util.*;
// class thanu{
//     public static void main(String[] args) {
//         String s1="Hello Guys How Are You";
//         String words[]=s1.split(" ");
//         String newwords[]=new String[words.length];
        
//         System.out.println(Arrays.toString(words));
//         for(int i=0;i<words.length;i++){
//             String cw=words[i];
//             String newword="";
//             int ll=cw.length();
//             for(int j=ll-1;j>=0;j--){
//                 if(j==ll-1){
//                     newword+=Character.toUpperCase(cw.charAt(j));
//                 }
//                 if(j<ll-1 && j>0){
//                     newword+=cw.charAt(j);
//                 }
//                 if(j==0){
//                     newword+=Character.toLowerCase(cw.charAt(j));
//                 }
                
//             }
//             newwords[i]=newword;
//         }
//         String nnnn=String.join(" ",newwords);
//         System.out.println(Arrays.toString(newwords));
//         System.out.println(nnnn);
//     }
// }

// class Employee{
//     String name;
//     int year;
//     double salary;
//     String address;
//     Employee(String name,int year,double salary,String address){
//         this.year=year;
//         this.name=name;
//         this.salary=salary;
//         this.address=address;
//     }
//     public void display(){
//         System.out.println(name+"  "+year+"  "+salary+"  "+address);
//     }
// }

// public class thanu {
//     public static void main(String[] args) {
//         System.out.println("name"+"   "+"year"+"   "+"salry"+"    "+"address"+"   ");
//         Employee e1=new Employee("prasanth", 2024, 10000, "nellore");
//         Employee e2=new Employee("subbu", 2021, 1000, "lfiifi");
//         e1.display();
//         e2.display();
//     }
// }

// import java.util.Scanner;
// class student{
//     private static int rollno=1000;
//     private String name;
//     private String course;
//     private int year;
//     student(String name,String course,int year){
//         this.name=name;
//         this.course=course;
//         this.year=year;
//     }
//     public void display(){
//         System.out.println(rollno);
//         System.out.println(name);
//         System.out.println(year);
//         System.out.println(course);
//         System.out.println();
//     }
// }
// public class thanu {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         student []s1=new student[2];
//         for(int i=0;i<2;i++){
//             String  na=sc.next();
//             int  ye=sc.nextInt();
//             String  ad=sc.next();
//             s1[i]=new student(na,ad,ye);
//         }
//         for(student s2:s1){
//             s2.display();
//         } 
//     }
// }
