// abstract class Grade {
//     abstract double getCGPA();
//   }
  
//   class Sam extends Grade {
//     int sub1, sub2, sub3, sub4;
  
//     Sam(int sub1, int sub2, int sub3, int sub4) {
//       this.sub1 = sub1;
//       this.sub2 = sub2;
//       this.sub3 = sub3;
//       this.sub4 = sub4;
//     }
  
//     @Override
//     double getCGPA() {
//       return (sub1 + sub2 + sub3 + sub4) / 4.0;
//     }
//   }
  
//   class John extends Grade {
//     int sub1, sub2, sub3;
  
//     John(int sub1, int sub2, int sub3) {
//       this.sub1 = sub1;
//       this.sub2 = sub2;
//       this.sub3 = sub3;
//     }
  
//     @Override
//     double getCGPA() {
//       return (sub1 + sub2 + sub3) / 3.0;
//     }
//   }
  
//   public class cat2{
//     public static void main(String[] args) {
//       Sam sam = new Sam(9, 8, 7, 8);
//       John john = new John(10, 9, 8);
  
//       System.out.println("Sam's CGPA: " + sam.getCGPA());
//       System.out.println("John's CGPA: " + john.getCGPA());
//     }
//   }

// import java.util.*;
// class read{
    
//     Scanner sc=new Scanner(System.in);
//     int c=sc.nextInt();;
//     int arrtemp[]=new int[c];
//     void readtemp(){
//         for(int i=0;i<c;i++){
//             arrtemp[i]=sc.nextInt();
//         }
//     }
//     void disTemp(){
//         for(int i=0;i<c;i++){
//             System.out.println(arrtemp[i]);
//         }
//     }

// }
// class sealevelrise{
//     Scanner sc=new Scanner(System.in);

//     int a=sc.nextInt();
//     double arrsea[]=new double[a];
//     void readtemp(){        
//         for(int i=0;i<a;i++){
//             arrsea[i]=sc.nextDouble();
//         }
//     }
//     void disTemp(){
//         for(int i=0;i<a;i++){
//             System.out.println(arrsea[i]);
//         }
//     }
// }

// public class cat2 {
//     public static void main(String[] args) {
//         read r1=new read();
//         r1.readtemp();
//         r1.disTemp();
//         sealevelrise s1=new sealevelrise();
//         int sum=0;
//         for(int i=0;i<r1.c;i++){
//             sum+=r1.arrtemp[i];
//         }
//         double avg=sum/r1.c;
//         System.out.println(avg);

//     }
// }

// public class cat2{

//     private int day;
//     private boolean doctorAvailable;
//     private int patientsVisited;
  
//     public cat2(int day, boolean doctorAvailable, int patientsVisited) {
//       this.day = day;
//       this.doctorAvailable = doctorAvailable;
//       this.patientsVisited = patientsVisited;
  
//       // Check for exceptions during object creation
//       if (patientsVisited < 0) {
//         throw new IllegalArgumentException("Patients visited cannot be negative");
//       }
//     }
  
//     public double AvgPatVit(int day1, int day2) throws IllegalArgumentException {
//       // Check for valid day range
//       if (day1 < 1 || day2 > 5 || day1 > day2) {
//         throw new IllegalArgumentException("Invalid day range for average calculation");
//       }
  
//       int totalPatients = 0;
//       for (int day = day1; day <= day2; day++) {
//        cat2 appointment = getAppointmentDetails(day);
//         totalPatients += appointment.getPatientsVisited();
//       }
  
//       return (double) totalPatients / (day2 - day1 + 1);
//     }
  
//     public double Day4Ratio() throws ArithmeticException {

//       if (!getAppointmentDetails(4).isDoctorAvailable()) {
//         throw new ArithmeticException("Doctor not available on Day 4, ratio cannot be calculated");
//       }
      
//       int patients = getAppointmentDetails(4).getPatientsVisited();
//       return patients == 0 ? Double.NaN : (double) patients;  // Handle zero division
//     }
  
//     public double Day5Ratio() throws ArithmeticException {
//       // Check if doctor is available on Day 5
//       if (!getAppointmentDetails(5).isDoctorAvailable()) {
//         throw new ArithmeticException("Doctor not available on Day 5, ratio cannot be calculated");
//       }
      
//       int patients = getAppointmentDetails(5).getPatientsVisited();
//       return patients == 0 ? Double.NaN : (double) 1;  // Assume one doctor on Day 5 (modify if needed)
//     }
  
//     // Replace this with your actual logic to retrieve appointment details based on day
//     private cat2 getAppointmentDetails(int day) {
//       // Implement logic to fetch data from table or source
//       throw new UnsupportedOperationException("Not implemented - Replace with data retrieval logic");
//     }
//   }

// class AccountAlreadyExistsException extends Exception{
//     public String tostring(){
//         return "Account already exists!";
//     }
// }
// class InsufficientFundsException extends Exception{
//     public String tostring(){
//         return "Insufficient funds!";
//     }
// }
// public class cat2{
//     private String accountNumber;
//     private double balance;
//     cat2(String accountNumber) {
//         this.accountNumber = accountNumber;
//         this.balance = 0.0;
//     }
//     public void createAccount(String accountNumber) throws AccountAlreadyExistsException{
//         if (this.accountNumber != null) {
//             throw new AccountAlreadyExistsException();
//         }
//         this.accountNumber = accountNumber;
//     }
//     public double getBalance() {
//         return balance;
//     }
//     public void deleteAccount() {
//         this.accountNumber = null;
//         this.balance = 0.0;
//     }
//     public void receiveMoney(double amount) {
//         this.balance += amount;
//     }
//     public void sendMoney(double amount) throws InsufficientFundsException{
//         if (balance < amount) {
//             throw new InsufficientFundsException();
//         }
//         this.balance -= amount;
//     }
//     public static void main(String[] args) {
//         // Example usage of the VTStudentUPIAccount class
//         cat2 account = new cat2(null);
//         try {
//             account.createAccount("1234567890");
//             account.receiveMoney(1000.0);
//             System.out.println("Account balance: " + account.getBalance());
//             account.sendMoney(500.0);
//             System.out.println("Account balance after withdrawal: " + account.getBalance());
//             account.deleteAccount();
//             System.out.println("Account deleted successfully!");
//         } 
//         catch (AccountAlreadyExistsException | InsufficientFundsException e) {
//             e.printStackTrace();
//         }
//     }
// }

// import harry.opo;
// public class cat2 {
//     public static void main(String[] args) {
//         opo o1=new opo();
//         o1.message();
//     }
// }

// import java.util.*;
// import java.lang.*;
// class Mymath{
//     static public void sqrt(int a){
//         a=a*a;
//         System.out.println(a);
//     }
//     static public void power(int a,int b){
//         int prod=1;
//         for(int i=1;i<=b;i++){
//             prod*=a;
            
//         }
//         System.out.println(prod);
//     }
// }
// class mycheck extends Mymath{
//     static public void areasquare(int a){
//         double area =4*a;
//         System.out.println(area);
//     }
//     static public void arearec(int a,int b){
//         double area=a*b;
//         System.out.println(area);
//     }
// }

// public class cat2 {
//     public static void main(String[] args) {
//         Mymath m1=new Mymath();
//         m1.power(3, 2);
//         m1.sqrt(4);
//         mycheck c1=new mycheck();
//         c1.areasquare(4);
//         c1.arearec(2, 3);
//     }
// }

// class ageNOTwithinrangeException extends Exception{
//     public String toString(){
//         return "the age is not b/w 15 and 21";
//     }
// }
// class NameNOTvalidException extends Exception{
//     public String toString(){
//         return "it contains";
//     }
// }
// class student{
//     int rollno;
//     String name;
//     String course;
//     int age;
//     student(String name,int rollno,String course,int age){
//         this.name=name;
//         this.age=age;
//         this.course=course;
//         this.age=age;
//     }
//     public void checkage() throws ageNOTwithinrangeException{
//         if(age<21 && age >15){
//             throw new ageNOTwithinrangeException();
//         }
//     }
//     public void checkname() throws NameNOTvalidException{
//         if (!name.matches("[a-zA-Z]+")) {
//             throw new NameNOTvalidException();
//           }
//     }
// }
// public class cat2 {
//     public static void main(String[] args) {
//         student s1=new student("$Prasanth",9742,"CSe",18);
//         try{
//             s1.checkage();
//             s1.checkname();
//         }
//         catch(ageNOTwithinrangeException e){
//             System.out.println(e.toString());
//         }
//         catch(NameNOTvalidException e){
//             System.out.println(e.toString());
//         }

//     }
// }


// class Operation{
//     int x;
//     int y;
//     String str;
//     int z;
//     char re;
//     int value;

//     public float DivisionMethod(int x,int y) throws ArithmeticException{
//         this.x=x;
//         this.y=y;
//         if(y!=0){
//             value=x/y;
//         }
//         else{
//             throw new ArithmeticException();
//         }
//         return value;

//     }
//     public char CharAtMethod(String str,int z){
//         this.str=str;
//         this.z=z;
//         if(z>=0 && z<=str.length()){
//             for(int i=0;i<str.length();i++){
//                 if(i==z){
//                     re=str.charAt(i);
//                     break;
//                 }
//             }
//         }
//         else{
//             throw new ArithmeticException();
//         }
//         return re;

//     }
// }
// public class cat2 {

//     public static void main(String[] args) {
        
//     }
// }

import java.util.*;
// abstract class Person{
//     String name;
//     int age;
//     public abstract void details();
//     public void hobbies(){
//         System.out.println("the hobbies are cricket");
//     }
// }

// abstract class Employee extends Person{
//     String eid;
//     String desihnation;
//     public abstract void show();
// }

// class Manager extends Employee{
//     public void details(){
//         System.out.println(name+" "+age);
//     }
//     public void show(){
//         System.out.println(eid+" "+desihnation);
//         System.out.println("the show");
//     }
// }

// public class cat2 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         Manager m1=new Manager();
//         m1.name=sc.next();
//         m1.age=sc.nextInt();
//         m1.eid=sc.next();
//         m1.desihnation=sc.next();
//         m1.details();
//         m1.show();   
//     }
// }

// import harry.*;
// public class cat2 {

//     public static void main(String[] args) {
//         faculty c1=new faculty();
//         OOPcourse c2=new OOPcourse();
//         c1.detalis();
//         c2.facultyDetalis();
        
//     }
// }

// import java.util.Scanner;
// class arraynegativeindex extends Exception {
//     @Override
//     public String getMessage() {
//         return "negative size length";
//     }
// }

// class cam {
//     public void checkIndex() throws arraynegativeindex {
//         Scanner sc = new Scanner(System.in);
//         int index = sc.nextInt();

//         try {
//             if (index > 0) {
//                 System.out.println("Can create array");
//             } else {
//                 throw new arraynegativeindex();
//             }
//         } catch (arraynegativeindex e) {
//             throw e;
//         } finally {
//             sc.close();
//         }
//     }
// }

// public class cat2 {
//     public static void main(String[] args) {
//         cam c1 = new cam();
//         try {
//             c1.checkIndex();
//         } catch (arraynegativeindex e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

// class maxnumberException extends Exception{
//     public String getmessage(){
//         return "max working hours is 40";
//     }
// }
// class  positiveException extends Exception{
//     public String toString(){
//         return "Only positive";
//     }
// }

// class methods{
//     public void check() throws maxnumberException,positiveException{
//     Scanner sc=new Scanner(System.in);
//     int t=sc.nextInt();
//     double salary;
//     if(t>0){
//         if(t>0 && t<=10){
//             salary=t*100;
//         }
//         else if(t>10 && t<=20){
//             salary=10*100+(t-10)*150;
//         }
//         else if(t>20 && t<40){
//             salary=10*100+10*150+(t-20)*200;
//         }
//         else{
//             throw new maxnumberException();
//         }
//         System.out.println("the salary is :"+salary);
    
//     }
//     else{
//         throw new positiveException();
//     }
//     }
// }
// public class cat2 {
//     public static void main(String[] args) {
//         methods m1=new methods();
//         try{
//             m1.check();
//         }
//         catch(maxnumberException e){
//             System.out.println(e);
//             System.out.println(e.getmessage());
//         }
        
//         catch(positiveException e){
//             System.out.println(e);
//             System.out.println(e.toString());
//         }
//     }
// }

// public class cat2{

//     public static void main(String[] args) {
//       try {
//         // Outer try block
  
//         int a[] = new int[5];
//         a[3] = 30 / 0;
  
//         try {
//           a[10] = 40;
//         } catch (ArrayIndexOutOfBoundsException e) {
//           System.out.println("Array index out of bounds exception in inner try block: " + e);
//         }
//       } catch (ArithmeticException e) {
//         System.out.println("Arithmetic exception in outer try block: " + e);
//       }
//     }
//   }

// class academicStaff {
//   String name;
//   String designation;
//   String subject;
  
//   academicStaff(String name, String designation, String subject) {
//       this.name = name;
//       this.designation = designation;
//       this.subject = subject;
//   }
  
//   public void teach() {
//       System.out.println(designation + " " + name + " is teaching " + subject);
//   }
// }

// class professor extends academicStaff {
//   professor(String name, String subject) {
//       super(name, "Professor", subject);
//   }
  
//   public void teach() {
//       System.out.println("Professor " + name + " is teaching " + subject);
//   }
// }

// class assistantProfessor extends professor {
//   assistantProfessor(String name, String subject) {
//       super(name, subject);
//   }
  
//   public void teach() {
//       System.out.println("Assistant Professor " + name + " is teaching " + subject);
//   }
// }

// class AssociateProfessor extends assistantProfessor {
//   AssociateProfessor(String name, String subject) {
//       super(name, subject);
//   }
  
//   public void teach() {
//       System.out.println("Associate Professor " + name + " is teaching " + subject);
//   }
// }

// class cat2{
//   public static void main(String args[]) {
//       assistantProfessor a = new assistantProfessor("Sanantu Mandal", "Maths");
//       AssociateProfessor a1 = new AssociateProfessor("Another Professor", "Physics");
//       a.teach();
//       a1.teach();
//   }
// }


// public class cat2 {
//   public static void main(String[] args) {
//     try{
//       int arr[]=new int[5];
//       arr[3]=30/0;
//       try{
//         System.out.println(arr[10]);
//       }
//       catch(Exception e){
//         System.out.println(e);
//       }
//     }
//     catch(ArithmeticException e){
//       System.out.println(e);
//     }
//   }
// }

// import java.util.*;
// class primenumberException extends Exception{
//   public String getmessage(){
//     return "is prime";
//   }
// }

// class NOTprimenumberException extends Exception{
//   public String getmessage(){
//     return "is not prime";
//   }
// }

// class check{
//   public boolean isPrime(int num) {
//     if (num <= 1) {
//         return false;
//     } else if (num <= 3) {
//         return true;
//     } else if (num % 2 == 0 || num % 3 == 0) {
//         return false;
//     }
//     int i = 5;
//     while (i * i <= num) {
//         if (num % i == 0 || num % (i + 2) == 0) {
//             return false;
//         }
//         i += 6;
//     }
//     return true;
// }
// }
// public class cat2 {
//   public static void main(String[] args) throws primenumberException,NOTprimenumberException{
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     check c1=new check();
//     try{
//       if(c1.isPrime(n)){
//         throw new primenumberException();
//       }
//       else{
//         throw new NOTprimenumberException();
//       }
//     }
//     catch(primenumberException e){
//       System.out.println(e.getmessage());
//     }
//     catch(NOTprimenumberException e){
//       System.out.println(e.getmessage());
//     }
//   }
// }


// interface mammals{
//   public void display();
// }
// interface Marineanimals{
//   public void display1();
// }
// class Bluewhale implements mammals,Marineanimals{
//   public void display(){
//     System.out.println("i am mammals");
//   }
//   public void display1(){
//     System.out.println("i am Marine animals");
//   }
//   public void display3(){
//     System.out.println("i am belong to both class");
//   }
// }
// public class cat2 {
//   public static void main(String[] args) {
//     Bluewhale b1=new Bluewhale();
//     b1.display();
//     b1.display1();
//     b1.display3();
//   }
// }

// import java.util.Scanner;
// class NullPointException extends Exception {
//     @Override
//     public String toString() {
//         return "NullPointerException occurred";
//     }
// }
// public class cat2{
//     public static void main(String[] args) throws NullPointException {
//         Scanner sc = new Scanner(System.in);
//         String a = sc.next();
//         String b = sc.next();
//         try {
//             if (a.length()==0 || b.length()==0) {
//                 throw new NullPointException();
//             } else {
//               System.out.println("Strings are equal");
//             }
//         } catch (NullPointException e) {
//             System.out.println(e);
//         } 
// }


// class InvalidAgeException extends Exception {
//   @Override
//   public String toString() {
//       return "Welcome Runtime to Voting system";
//   }
// }
// class Application {
//   private String candidateName;
//   private int age;
//   private String qualification;
//   public Application(String candidateName, int age, String qualification) {
//       this.candidateName = candidateName;
//       this.age = age;
//       this.qualification = qualification;
//   }
//   public void Validate() throws InvalidAgeException {
//       if (age < 18) { // Assuming the legal voting age is 18
//           throw new InvalidAgeException();
//       } else {
//           System.out.println("Application processed successfully");
//       }
//   }
// }

// public class cat2{
//   public static void main(String[] args) {
//       Application application = new Application("John Doe", 20, "Bachelor's");

//       try {
//           application.Validate();
//       } catch (InvalidAgeException e) {
//           System.out.println(e.toString());
//           System.out.println("Invalid Candidate");
//       }
//   }
// }

import java.util.*;
// interface vechile{
//     public void cardetalis();
//     public void display();
// }
// class car implements vechile{
//     double cost;
//     int noofseats;
//     public void cardetalis(){
//         Scanner sc=new Scanner(System.in);
//         cost=sc.nextDouble();
//         noofseats=sc.nextInt();
//     }
//     public void display(){
//         System.out.println(cost+" "+noofseats);
//     }
// }
// class bicycle implements vechile{
//     double cost;
//     int noofseats;
//     public void cardetalis(){
//         Scanner sc=new Scanner(System.in);
//         cost=sc.nextDouble();
//         noofseats=sc.nextInt();
//     }
//     public void display(){
//         System.out.println(cost+" "+noofseats);
//     }
// }
// public class cat2 {
//     public static void main(String[] args) {
//         car c1=new car();
//         c1.cardetalis();
//         c1.display();
//     }
// }

// class Calculator {
//     int num1;
//     int num2;
  
//     public Calculator(int num1, int num2) {
//       this.num1 = num1;
//       this.num2 = num2;
//     }
  
//     public int add() throws ArithmeticException {
//       if (num1 < 0 || num2 < 0) {
//         throw new ArithmeticException("Numbers cannot be negative for addition");
//       }
//       return num1 + num2;
//     }
  
//     public int subtract() throws ArithmeticException {
//       if (num1 < 0 || num2 < 0) {
//         throw new ArithmeticException("Numbers cannot be negative for subtraction");
//       }
//       return num1 - num2;
//     }
//   }
  
//   public class cat2{
//     public static void main(String[] args) {
//       try {
//         Calculator calculator1 = new Calculator(5, 10);
//         int sum = calculator1.add();
//         System.out.println(sum);
  
//         Calculator calculator2 = new Calculator(15, 7);
//         int difference = calculator2.subtract();
//         System.out.println(difference);
//       } catch (ArithmeticException e) {
//         System.out.println(e.getMessage());
//       } catch (NumberFormatException e) {
//         System.out.println("Invalid input. Please enter integers only.");
//       }
//     }
//   }


// public class cat2{
//     public static void main(String[] args) {
//       try {
//         String str = null;
  
//         try {
//           int a = 10;
//           int b = 0;
  
//           try {
//             int result = a / b;
//             System.out.println(result);
//           } catch (ArithmeticException e) {
//             System.out.println("Inner try block 1: ArithmeticException occurred");
//           }
//           System.out.println(str.length());
//         } catch (NullPointerException e) {
//           System.out.println("Inner try block 2: NullPointerException occurred");
          
//         }
//       } catch (NullPointerException e) {
//         System.out.println("Outer try block: NullPointerException occurred");
       
//       }
//     }
//   }













