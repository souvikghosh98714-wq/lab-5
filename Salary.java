interface Salary {
    void earnings();
    void deductions();
    void bonus();
}

// Abstract class because bonus() is not implemented
abstract class Manager implements Salary {

    double basic;

    Manager(double b) {
        basic = b;
    }

    public void earnings() {
        double total = basic + (0.80 * basic) + (0.15 * basic);
        System.out.println("Earnings - " + total);
    }

    public void deductions() {
        double pf = 0.12 * basic;
        System.out.println("Deduction - " + pf);
    }
}

class Substaff extends Manager {

    Substaff(double b) {
        super(b);
    }

    public void bonus() {
        System.out.println("Bonus - " + (0.50 * basic));
    }

    public static void main(String[] args) {
        Substaff s = new Substaff(50000);
        s.earnings();
        s.deductions();
        s.bonus();
    }
}