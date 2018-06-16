import java.util.Scanner;

public class ChiSoCanNang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Your weight(in kilogram): ");
        weight= sc.nextDouble();
        System.out.println("Your height(in meter): ");
        height = sc.nextDouble();
        bmi = weight/Math.pow(height,2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if(bmi<18)
            System.out.printf("%-20s%s",bmi , "Underweight\n");
        else if(bmi<25.0)
            System.out.printf("%-20s%s",bmi, "Normal\n");
        else if(bmi<30.0)
            System.out.printf("%-20s%s",bmi, "Overweight\n");
        else
            System.out.printf("%-20s%s",bmi,"Obese\n");
    }
}
