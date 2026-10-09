class Company {
    void company() {
        System.out.println("Company work");
    }
}

class Employee1 extends Company {
    void employee1() {
        System.out.println("Employee will handle");
    }
}

class Manager extends Employee1 {
    void manager() {
        System.out.println("Manager will manage");
    }

    public static void main(String args[]) {
        Manager a = new Manager();

        a.company();
        a.employee1();
        a.manager();
    }
}