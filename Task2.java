//Student Grade CAlculator

import java.util.Scanner;

class grade {

    public void takemarks() {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total number of subject : ");
        int tot = sc.nextInt();
        float[] num = new float[20];
        float sum = 0;
        float avg;
        while (i <= tot) {
            System.out.println("Enter the marks of subject " + i + ": ");
            num[i] = sc.nextInt();
            sum += num[i];

            i++;
        }
        System.out.println("The Total is : " + sum);
        avg = sum / tot;
        System.out.println("The Average of marks is : " + avg);

        String grade = "";

        if (avg >= 94 && avg <= 100)
            grade = "A";
        else if (avg >= 90 && avg < 94)
            grade = "A-";
        else if (avg >= 87 && avg < 90)
            grade = "B+";
        else if (avg >= 83 && avg < 87)
            grade = "B";
        else if (avg >= 80 && avg < 83)
            grade = "B-";
        else if (avg >= 77 && avg < 80)
            grade = "C+";
        else if (avg >= 73 && avg < 77)
            grade = "C";
        else if (avg >= 70 && avg < 73)
            grade = "C-";
        else if (avg >= 67 && avg < 70)
            grade = "D+";
        else if (avg >= 63 && avg < 67)
            grade = "D";
        else if (avg >= 60 && avg < 63)
            grade = "D-";
        else if (avg >= 0 && avg < 60)
            grade = "F";
        else
            grade = "Invalid Input!";

        if (grade.equals("invalid Input!"))

        {
            System.out.println("Invalid input");
        } else {
            System.out.println("The grade is : " + grade);
        }

    }
}

public class Task2 {
    public static void main(String[] args) {
        grade gd = new grade();
        gd.takemarks();

    }
}
