package programmers.level0;

public class ����Ⱦ�� {
    public static void main(String[] args) {
        String numbers1 = "onetwothreefourfivesixseveneightnine";
        String numbers2 = "onefourzerosixseven";

        System.out.println(����Ⱦ��.solution1(numbers1)); //123456789
        System.out.println(����Ⱦ��.solution1(numbers2)); //14067

        System.out.println(����Ⱦ��.solution2(numbers1)); //123456789
        System.out.println(����Ⱦ��.solution2(numbers2)); //14067
    }

    /////////////////[solution ����]/////////////////
    public static long solution1(String numbers) {
        String[] numStrArr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int[] numIntArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String answerStr = numbers;

        for (int i = 0; i < numStrArr.length; i++) {
            if (answerStr.contains(numStrArr[i])) {
                answerStr = answerStr.replace(numStrArr[i], Long.toString(numIntArr[i]));
            }
        }

        return Long.parseLong(answerStr);
    }

    //�̷��� �� ���� �� �־��µ�.. �̤� �� �����ϱ�!!!
    public static long solution2(String numbers) {
        String[] numStrArr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numStrArr.length; i++) {
            numbers = numbers.replace(numStrArr[i], Long.toString(i));
        }

        return Long.parseLong(numbers);
    }
}
