import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary_Num = sc.nextInt();

        int ans = 0; // converted decimal number
        int pw = 1; // Power of 2

        while (binary_Num > 0){
            int unit_Digit = binary_Num % 10;

            ans = ans + unit_Digit * pw;
            binary_Num /= 10;
            pw *= 2;
        }
        System.out.println(ans);
    }
}
