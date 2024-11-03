package answer12a;

import java.util.Scanner;

public class Answer12a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;
        double R, area;
        System.out.println("Enter the value of R");
        R = input.nextDouble();
        area = PI * R * R;
        System.out.println("the area of the circle for R=" + R + "is" + area);
    }

}
