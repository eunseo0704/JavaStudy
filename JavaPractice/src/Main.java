import java.util.Scanner; // 사용자로부터 입력을 받기 위한 도구(Scanner)를 가져옴

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        if (age >= 20) {
            System.out.println("성인입니다!");
        } else {
            System.out.println("미성년자입니다!");
        }

            sc.close();
    }
}