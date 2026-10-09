import java.util.Scanner;

public class Addition {
    int a = 20;
    int b = 30;
    int c = a + b;

    public static void main(String args[]) {
        Addition obj = new Addition();

        Scanner sc = new Scanner(System.in);

        System.out.println("Addition of " + obj.a + " and " + obj.b + " is: " + obj.c);

        obj.display();

        sc.close();
    }

    void display() {
        System.out.println("Piyush Sikarwar");
    }
}