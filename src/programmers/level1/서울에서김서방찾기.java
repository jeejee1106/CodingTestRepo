package programmers.level1;

public class ���￡���輭��ã�� {
    public static void main(String[] args) {
        String[] seoul = {"Lee", "Park", "Kim"};
        String[] seoul2 = {"Kim", "Lee", "Park", "Kim"};
        System.out.println(���￡���輭��ã��.solution1(seoul));
        System.out.println(���￡���輭��ã��.solution2(seoul));
    }

    /////////////////[solution ����]/////////////////
    public static String solution1(String[] seoul) {
        String result = "";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                result = "�輭���� " + i + "�� �ִ�";
                break;
            }
        }
        return result;
    }

    public static String solution2(String[] seoul) {
        int x = 0; //StringŸ���� �����ϴ� �� ���� intŸ������ �����ϴ� ���� �޸� ������ �� �����ϴϱ� �� ���� ������?

        //���� for���� ��ôµ�, ��... ���ɸ��� ���̴� �� �𸣰����� �迭�� ���� �� ����� ���°Ŵϱ� ����غô�.
        for (String name : seoul) {
            if (name.equals("Kim")) {
                break;
            }
            x++;
        }
        return "�輭���� " + x + "�� �ִ�";
    }
}