package entities;

import java.util.Locale;
import java.util.Scanner;

public class Rectangle {

    public double b;
    public double a;

    public double area() {
        return (this.b * this.a);
    }

    public double per() {
        return (2*(b+a));
    }

    public double diag() {
        double hip = Math.sqrt((a*a)+(b*b));
        return hip;
    }

    public void impr() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com largura e altura: ");
        b = sc.nextDouble();
        a = sc.nextDouble();
        System.out.printf("Area: %.2f%n", this.area());
        System.out.printf("Perimetro: %.2f%n", this.per());
        System.out.printf("Diagonal: %.2f%n", this.diag());
        sc.close();
    }
}
