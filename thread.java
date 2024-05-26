import java.util.*;
// class Movie extends Thread {
//     int seat;
//     String name;
//     static int sumofseats = 10;

//     Movie(int seat, String name) {
//         this.seat = seat;
//         this.name = name;
//     }

//     public void run() {
//         synchronized (Movie.class) {
//             if (sumofseats >= seat) {
//                 System.out.println("Available seats: " + sumofseats);
//                 System.out.println(seat + " Seat reserved for " + name);
//                 sumofseats -= seat;
//                 System.out.println("Available Seats: " + sumofseats);
//                 try {
//                     sleep(100);
//                 } catch (Exception e) {
//                     System.out.println(e);
//                 }
//             } else {
//                 System.out.println("Sorry! No seats are available for " + name);
//             }
//         }
//     }
// }

// public class thread{
//     public static void main(String[] args) {
//         Movie m1 = new Movie(10, "ppk");
//         Movie m2 = new Movie(1, "thanu");
//         m1.start();
//         m2.start();
//     }
// }

// class SumCalculator {
//     private int sum = 0;
//     private boolean isCalculated = false;

//     public synchronized void calculateSum() {
//         for (int i = 1; i <= 100; i++) {
//             sum += i;
//         }
//         isCalculated = true;
//         notify();
//     }

//     public synchronized int getSum() {
//         while (!isCalculated) {
//             try {
//                 wait();
//             } catch (InterruptedException e) {
//                 System.out.println("Thread interrupted: " + e.getMessage());
//             }
//         }
//         return sum;
//     }
// }

// class SumThread extends Thread {
//     private SumCalculator calculator;

//     SumThread(SumCalculator calculator) {
//         this.calculator = calculator;
//     }

//     @Override
//     public void run() {
//         calculator.calculateSum();
//     }
// }

// public class thread{
//     public static void main(String[] args) {
//         SumCalculator calculator = new SumCalculator();
//         SumThread sumThread = new SumThread(calculator);
//         sumThread.start();

//         int result = calculator.getSum();
//         System.out.println("Sum of numbers from 1 to 100 is: " + result);
//     }
// }


// class t1 extends Thread{
//     public synchronized void run(){
//         for(int i=1;i<10;i+=2){
//             System.out.println("Thread A:"+i);
//         }
//         try{
//             sleep(200);
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }
// class t2 extends Thread{
//     public synchronized void run(){
//         for(int i=2;i<10;i+=2){
//             System.out.println("Thread B:"+i);
//         }
//     }
// }

// public class thread {
//     public static void main(String[] args) {
//         t1 a=new t1();
//         t2 b =new t2();
//         a.start();
//         try{
//             a.sleep(200);
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//         b.start();
//     }
// }