package entities;

import java.util.Locale;
import java.util.Scanner;

public class Employee {

    public String name;
    public double salBruto;
    public double tax;

    public void netSalary() {
        this.salBruto -= this.tax;
    }

    public void aumento(double pct) {
        this.salBruto += (salBruto * pct);
    }

    public void impr() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome, salario bruto e imposto, nessa ordem: ");
        name = sc.next();
        salBruto = sc.nextDouble();
        tax = sc.nextDouble();

        System.out.println("Digite uma porcentagem de aumento, se tiver: ");
        double amt = sc.nextDouble();
        this.aumento(amt);

        this.netSalary();

        System.out.printf("Employee: %s, Salary: R$%.2f%n", this.name, this.salBruto);

        sc.close();
    }
}
