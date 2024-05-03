import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("ยินดีต้อนรับค่ะ");
        System.out.println("คุณลูกค้ารับอะไรดีคะ");
        System.out.println("นมสด = 1\n ชาไทย = 2\n ชาเขียว = 3\n กาแฟ = 4\n ลาเต้ = 5\n เก็บเงิน = 6\n");


        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int count = 0;

//เปลี่ยนเป็นfor
        for (int num = sc.nextInt(); num != 6; ) {
            if (num == 1) {
                num1 = num1 + 1;
            } else if (num == 2) {
                num2 = num2 + 1;
            } else if (num == 3) {
                num3 = num3 + 1;
            } else if (num == 4) {
                num4 = num4 + 1;
            } else if (num == 5) {
                num5 = num5 + 1;
            }
            System.out.println("นมสด = 1\n ชาไทย = 2\n ชาเขียว = 3\n กาแฟ = 4\n ลาเต้ = 5\n เก็บเงิน = 6\n");
            num = sc.nextInt();

        }
        System.out.println("นมสด"+num1);
        System.out.println("ชาไทย"+num2);
        System.out.println("ชาเขียว"+num3);
        System.out.println("กาแฟ"+num4);
        System.out.println("ลาเต้"+num5);
    }
}