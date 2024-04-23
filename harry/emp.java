package harry;

class emp{
    String name;
    int empid;
    String category;
    double bpay;
    double hra;
    double da;
    double npay;
    double pf;
    double grosspay;
    double incometax;
    double allowance;

    emp(String name, int empid, String category, double bpay) {
        this.name = name;
        this.empid = empid;
        this.category = category;
        this.bpay = bpay;
        this.hra = 0.20 * bpay;
        this.da = 0.10 * bpay;
        this.pf = 0.05 * bpay;
        this.allowance = 0.05 * bpay;
        this.grosspay = bpay + da + hra + allowance - pf;
        this.incometax = 0.40 * grosspay;
        this.npay = grosspay - incometax;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empid);
        System.out.println("Category: " + category);
        System.out.println("Basic Pay: $" + bpay);
        System.out.println("HRA: $" + hra);
        System.out.println("DA: $" + da);
        System.out.println("PF: $" + pf);
        System.out.println("Allowance: $" + allowance);
        System.out.println("Gross Pay: $" + grosspay);
        System.out.println("Income Tax: $" + incometax);
        System.out.println("Net Pay: $" + npay);
    }
}
