import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println("입력한 숫자는 짝수입니다.");
        } else {
            System.out.println("입력한 숫자는 홀수입니다.");
        }

        scanner.close();
    }
}