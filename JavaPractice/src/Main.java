import java.util.Scanner; // Scanner 클래스를 사용하기 위해 import

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

        System.out.print("이름을 입력하세요: "); // 입력 유도 메시지 출력
        String name = scanner.nextLine(); // 사용자로부터 문자열 입력받기

        System.out.println("안녕하세요, " + name + "님!"); // 인사 출력
    }
}