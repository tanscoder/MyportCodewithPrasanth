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
