package programmers.level0;

import java.util.HashMap;

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
        int maxCount = 0; //최빈값을 넣을 변수
        HashMap<Integer, Integer> map = new HashMap<>(); //array의 원소를 key로, 등장 횟수를 value로 넣을 맵

        for (int number : array) {
            //1. number가 한 번 등장할 때마다 해당 key에 대한 value를 +1 해준다.
            int count = map.getOrDefault(number, 0) + 1;

            if (count > maxCount) {
                maxCount = count; //2-1. number가 등장한 횟수(count)와 현재 최빈값을 비교해 number의 빈도수가 더 크면 최빈값 교체.
                answer = number; //2-2. number가 등장한 횟수(count)와 현재 최빈값을 비교해 number의 빈도수가 더 크다는 것은? number가 최빈값이라는 뜻.
            } else if (count == maxCount) { //3. number의 등장횟수와 현재 최빈값이 같다는 것은 둘의 등장횟수가 같다는 뜻이므로 -1 반환
                answer = -1;
            }
            map.put(number, count); //4. 마지막으로 map에 key, value를 넣어줌. 그래야 for문이 돌면서 같은 number가 나왔을 때 value+1을 해주니까.
        }

        return answer;
    }
}
