import java.util.ArrayList;
import java.util.Scanner;
class Game {
    int highScore = 0;
    public int menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("=== 야구게임 ===");
        System.out.println("1.게임 시작");
        System.out.println("2.최고 기록 확인");
        System.out.println("3.게임 종료");
        System.out.print(">>");
        return input.nextInt();
    }
    public int randNum() {
        int ran = (int)(Math.random()*9)+1; //범위 1~9
        return ran;
    }
    //랜덤숫자 배열 생성하는 메소드
    public ArrayList<Integer> sol() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0 ; i < 3;i++) {
            int temp = randNum();
            if (arr.contains(temp)) {
                i--;
            } else {
                arr.add(temp);
            }
        }
        return arr;
    }
    
    public void result (int a) {
        System.out.println("최고기록 갱신");
        System.out.println("당신의 기록 " + a+"회");
        highScore = a;
    }
    
    public void gameStart() {
        
        int count = 0;
        System.out.println("게임을 시작합니다.");
        ArrayList<Integer> gameArr = sol();
        System.out.print("정답 : ");
        for (int i = 0; i < gameArr.size();i++) {
            System.out.print(gameArr.get(i));
        }
        System.out.println();
        while (true) {
            int strike = 0;
            int ball = 0;
            ArrayList<Integer> myArr = myNumbers();
            
            count++;
            for (int i = 0 ; i < gameArr.size(); i++) {
                for (int j = 0 ; j < myArr.size();j++) {
                    if (gameArr.get(i) == myArr.get(j) && i == j) {
                        strike++;
                    } else if (gameArr.get(i) == myArr.get(j) && i != j) {
                        ball++;
                    }
                }
            }
            if (strike == 3) {
                System.out.println("3스트라이크!! 정답입니다!!");
                if (highScore == 0 ) {
                    result(count);
                } else  if (highScore > count) {
                    result(count);
                } else {
                    System.out.println("당신의 기록 : "+count+"회");
                }
                return;
            } else {
                System.out.println("=== 결과 ===");
                System.out.println("Strike : "+strike);
                System.out.println("Ball : "+ball);
            }
        }
    }
 
    //내가 뽑은 수 : 배열를 반환하는 메소드
    public ArrayList<Integer> myNumbers() {
        Scanner input = new Scanner(System.in);
        
        loop :
            while (true) { 
                ArrayList<Integer> arr = new ArrayList<Integer>();
                System.out.print("당신의 숫자를 입력하세요 : ");
                int num = input.nextInt();
                for (int i = 0;i<3;i++) {
                    arr.add(num % 10);
                    num /= 10;
                }
                int temp1 = arr.get(2);
                arr.set(2, arr.get(0));
                arr.set(0, temp1);
                for (int i = 0 ;i<3;i++) {
                    for (int j = i+1 ;j < 3;j++) {
                        if (arr.get(i) == arr.get(j)) {
                            System.out.println("중복된 숫자는 허용 안됩니다.");
                            continue loop;
                        }
                    }
                }
                return arr;
            }
    }
}
 
 
public class BaseballGame {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Game game = new Game();
        while (true) {
            int select = game.menu();
            switch (select) {
            case 1 :
                game.gameStart();
                break;
            case 2 :
                System.out.println("당신의 최고기록 : "+game.highScore);
                break;
            case 3 :
                System.out.println("게임을 종료합니다.");
                System.exit(0);
                break;
            default:
                System.out.println("잘못된 값을 입력하였습니다.");
                break;
            }
        }
 
    }
}
 
