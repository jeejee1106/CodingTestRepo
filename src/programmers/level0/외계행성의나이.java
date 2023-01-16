package programmers.level0;

public class �ܰ��༺�ǳ��� {
    public static void main(String[] args) {
        int age1 = 23;
        int age2 = 51;
        int age3 = 100;

        System.out.println(�ܰ��༺�ǳ���.solution1(age1)); //cd
        System.out.println(�ܰ��༺�ǳ���.solution1(age2)); //fb
        System.out.println(�ܰ��༺�ǳ���.solution1(age3)); //baa

        System.out.println(�ܰ��༺�ǳ���.solution2(age1)); //cd
        System.out.println(�ܰ��༺�ǳ���.solution2(age2)); //fb
        System.out.println(�ܰ��༺�ǳ���.solution2(age3)); //baa
    }

    /////////////////[solution ����]/////////////////
    //��ռӵ� 0.05ms
    public static String solution1(int age) {
        String[] alphabetArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String[] numArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",};
        int count = 0;
        String stringAge = Integer.toString(age);

        for (int i = 0; i < numArr.length; i++) {
            if(stringAge.contains(numArr[i])){
                stringAge = stringAge.replace(numArr[i], alphabetArr[i]);
                count++;
            }
            if (count == stringAge.length()) {
                break;
            }
        }

        return stringAge;
    }

    //��ռӵ� 1.5ms (�ٸ���� Ǯ��)
    public static String solution2(int age) {
        String[] alphabetArr = {"a","b","c","d","e","f","g","h","i","j"};
        String answer = "";

        while(age > 0){
            answer = alphabetArr[age % 10] + answer;
            age /= 10;
        }

        return answer;
    }
}
