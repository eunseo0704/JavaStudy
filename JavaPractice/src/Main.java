import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 랜덤 숫자 생성
        Random random = new Random();
        int target = random.nextInt(100) + 1; // 1~100 사이 숫자

        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;

        System.out.print("숫자 맞추기 게임을 시작합니다! (1~100)");

        while (guess != target) {
            System.out.print("숫자를 입력하세요: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < target) {
                System.out.println("더 큰 수를 입력하세요!");
            } else if (guess > target) {
                System.out.println("더 작은 수를 입력하세요!");
            } else {
                System.out.println("정답입니다! 시도 횟수:" + attempts + "번");
            }
        }

        scanner.close();
    }
}