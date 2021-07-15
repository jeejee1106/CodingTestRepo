import java.util.ArrayList;
import java.util.Scanner;
class Game {
    int highScore = 0;
    public int menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("=== �߱����� ===");
        System.out.println("1.���� ����");
        System.out.println("2.�ְ� ��� Ȯ��");
        System.out.println("3.���� ����");
        System.out.print(">>");
        return input.nextInt();
    }
    public int randNum() {
        int ran = (int)(Math.random()*9)+1; //���� 1~9
        return ran;
    }
    //�������� �迭 �����ϴ� �޼ҵ�
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
        System.out.println("�ְ��� ����");
        System.out.println("����� ��� " + a+"ȸ");
        highScore = a;
    }
    
    public void gameStart() {
        
        int count = 0;
        System.out.println("������ �����մϴ�.");
        ArrayList<Integer> gameArr = sol();
        System.out.print("���� : ");
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
                System.out.println("3��Ʈ����ũ!! �����Դϴ�!!");
                if (highScore == 0 ) {
                    result(count);
                } else  if (highScore > count) {
                    result(count);
                } else {
                    System.out.println("����� ��� : "+count+"ȸ");
                }
                return;
            } else {
                System.out.println("=== ��� ===");
                System.out.println("Strike : "+strike);
                System.out.println("Ball : "+ball);
            }
        }
    }
 
    //���� ���� �� : �迭�� ��ȯ�ϴ� �޼ҵ�
    public ArrayList<Integer> myNumbers() {
        Scanner input = new Scanner(System.in);
        
        loop :
            while (true) { 
                ArrayList<Integer> arr = new ArrayList<Integer>();
                System.out.print("����� ���ڸ� �Է��ϼ��� : ");
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
                            System.out.println("�ߺ��� ���ڴ� ��� �ȵ˴ϴ�.");
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
                System.out.println("����� �ְ��� : "+game.highScore);
                break;
            case 3 :
                System.out.println("������ �����մϴ�.");
                System.exit(0);
                break;
            default:
                System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
                break;
            }
        }
 
    }
}
 
