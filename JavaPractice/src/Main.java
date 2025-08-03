import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("당신의 성적은 A입니다.");
        } else  if (score >= 80) {
            System.out.println("당신의 성적은 B입니다.");
        } else  if (score >= 70) {
            System.out.println("당신의 성적은 C입니다.");
        } else  if (score >= 60) {
            System.out.println("당신의 성적은 D입니다.");
        } else {
            System.out.println("당신의 성적은 F입니다.");
        }

        scanner.close();
    }
}