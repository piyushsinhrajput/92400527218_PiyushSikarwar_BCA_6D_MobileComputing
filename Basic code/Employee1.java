class Company {
    void company() {
        System.out.println("Employee will handle");
    }
}

class Employee1 extends Company {
    void employee1() {
        System.out.println("Completely handled");
    }

    public static void main(String args[]) {
        Employee1 a = new Employee1();

        a.employee1();
        a.company();
    }
}
