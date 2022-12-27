package programmers.level0;

public class 최빈값구하기 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 3, 3, 4};
        int[] array2 = {1, 1, 2, 2};
        int[] array3 = {1};
        System.out.println(최빈값구하기.solution1(array1)); //3
        System.out.println(최빈값구하기.solution1(array2)); //-1
        System.out.println(최빈값구하기.solution1(array3)); //1

        System.out.println(최빈값구하기.solution2(array1)); //3
        System.out.println(최빈값구하기.solution2(array2)); //-1
        System.out.println(최빈값구하기.solution2(array3)); //1
    }

    /////////////////[solution 시작]/////////////////
    public static int solution1(int[] array) {
        int answer = 0;

        //array에서 최댓값 구하기
        int maxNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }

        //위에서 구한 최댓값+1 길이의 배열 만들기
        int[] countArr = new int[maxNum + 1];
        //countArr 배열의 각 인덱스에 해당하는 숫자가 몇 번 나왔는지 카운트하기
        for (int i = 0; i < array.length; i++) {
            countArr[array[i]]++;
        }

        //최빈값이 몇인지 구하기
        int maxCount = 0;
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] > maxCount) {
                maxCount = countArr[i];
                answer = i;
            }
        }

        //최빈값에 중복이 있는지 확인
        int duplicateNum = 0;
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] == maxCount) {
                duplicateNum++;
            }
        }

        if (duplicateNum != 1) {
            return -1;
        }

        return answer;
    }

    public static int solution2(int[] array) {
        int answer = 0;

        return answer;
    }
}
