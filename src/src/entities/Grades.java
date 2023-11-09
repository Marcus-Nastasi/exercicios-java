package entities;

import java.util.Locale;
import java.util.Scanner;

public class Grades {

    public String nome;
    public double n1;
    public double n2;
    public double n3;

    public double somaNotas() {
        return (n1+n2+n3);
    }

    public void aprov() {
        if(this.somaNotas() >= 60) System.out.println("PASS");
        else {
            double pMissing = (60 - this.somaNotas());
            System.out.println("FAILED");
            System.out.printf("Missing %.2f Points%n", pMissing);
        }
    }

    public void impr() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome, e as tres notas: ");
        this.nome = sc.nextLine();
        this.n1 = sc.nextDouble();
        this.n2 = sc.nextDouble();
        this.n3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", somaNotas());
        this.aprov();

        sc.close();
    }
}
