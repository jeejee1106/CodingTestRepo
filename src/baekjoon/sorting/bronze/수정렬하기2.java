package baekjoon.sorting.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

//��� �ǹ��ܰ������� ����(?)��� �Բ� ������� ���� �־��٤���

public class �������ϱ�2 {
    public static void main(String[] args) throws IOException {
//        solution1();
        countingSort();
    }

    /**
     * �� �����ϱ�� ���� ���������� �� ������ �׽�Ʈ���̽��� ������ �ξ� Ŀ����.
     * �����͵� ���� ������ ���� 1000�� ��������, ���� ������ 1000�� �д�.
     * ������ �� ������ �� �����ϱ��� solution1���� ������ �ð��ʰ��� ���´�.
     * �׷��� solution2�� ������ ������ �ð��ʰ��� ���� �� �ִ�.
     * ��, �� �������� ����ߴٽ��� StringBuilder�� ����Ͽ� ����ϴ� ���� �ξ� �� �����ٴ� ���� �� ������ ���� �� �� �־���.
     *
     * �׸��� �� ���������� 1�� solution2���� �ξ� �� ���� �ٸ� ������� ������ Ǯ�����Ѵ�.
     * ���� ó�� ���� ����̶� �̹� ������ �� ������ ������ Ǯ���ٱ� ���ٴ� ���ν����� Ǯ���ٶ�� ���� ���� ���� �� ����.
     */

    public static void solution1() throws IOException {
        /**
         * ���1 : BufferedReader + Collections.sort
         * ���� ��α� : https://st-lab.tistory.com/106
         * �� �����ϱ�1�� solution2���ٴ� ���� ��������, �� ������ solution2�� ���� ���� ������.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());

        // list �迭 �� �ϳ��� ���� �ȴ�.
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < count; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for(int answer : list) {
            sb.append(answer).append('\n');
        }
        System.out.println(sb);
    }

    public static void solution2() throws IOException {
        /**
         * ���2 : Counting Sort(��� ����) �˰����� ������ ���
         * ���� ����(?) �˰��� solution1�� ���� �� �ι� ���� ������.
         *
         * ���� ��α� : https://st-lab.tistory.com/104
         *
         * �۵����� : �� �������� ������ �ʹ� ��ƴ�.. ��α� ���鼭 ��� ��������..
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());

        /*
		  -1,000,000 ~ 1,000,000 //���������� ���� ����
		  ������ 0 = index[100000] ���� ����
		*/
        boolean[] arr = new boolean[2000001];

        for(int i = 0; i < count; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i]) {
                sb.append((i - 1000000)).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static void countingSort() {
        /**
         * ��� ���� ���� �����غ���(220805)
         *
         * O(n)�� �ð����⵵�� ������ ������ �ӵ��� �и��� �������� ������ �����Ѵ�.
         * �Ʒ� �ڵ带 �� �� �о�ٸ� ������ ã�� �� �ִ�.
         *
         * �ٷ� counting �迭�̶�� ���ο� �迭�� �������־�� �Ѵٴ� ���̴�.
         * �������� �� ������ �� Ŭ �� �ִµ�, array �ȿ� �ִ� max���� ������ ���� counting �迭�� ���̰� �޶����� �ȴ�.
         * ���ε�� 10���� ���Ҹ� �����ϰ��� �ϴµ�, ���� ������ 0~1���̶�� �޸𸮰� �ſ� ���� �ȴ�.
         * (array�迭�� ���̴� 10�ε�, �� ������ ���� �ſ� ũ�ٸ� counting�迭�� ���̴� array�迭�� ���� ū ������ ���� ���̰� �ȴ�.
         *  ��, array = {1,2,3,4,5,6,7,8,9,1��}�̶�� counting�迭�� ���̴� 1���� �ȴ�!)
         */

        //1. ������ �ؾ��ϴ� �迭
        int[] array = {7, 2, 3, 5, 7, 1, 4, 6, 7, 5, 0, 1};

        //2. array�迭 �ȿ� ����ִ� ������ ������ ī���� ���ִ� �迭
        int[] counting = new int[15]; //�迭�� ũ��� ���Ƿ� ����(�����ϰ� 15�� �����ߴ�. �� �迭 ũ�⸦ �������ִ� �������� �޸��� ���� ���� �߻��Ѵ�.)

        //3. array�� �� �� ��ȸ�ϸ鼭 �� ���� ���� ������ �ش� ���� index �� �ϴ� ���ο� �迭(counting)�� ���� 1 ������Ų��.
        for(int i = 0; i <array.length; i++) {
            counting[array[i]]++;
        }
        //�� for���� ��ġ�� �Ǹ� counting[i]�� ���� array�迭�� i�� ������ ��Ÿ���� �ȴ�.

        //4. counting�迭�� �� ���� ���������� �ٽ� �־��ش�. �Ʒ� ����ó��.
        // counting[1] = counting[0] + counting[1]
        // counting[2] = counting[1] + counting[2]
        // counting[3] = counting[2] + counting[3]
        // ������ ��Ÿ���� counting[i] = counting[i-1] + counting[i]
        for(int i = 1; i<counting.length; i++) { //������ ���� i�� ������ 1!! index[0]�� �������� �ʴ´�.
            counting[i] += counting[i-1];
        }
        //�� for���� ��ġ�� counting�迭�� �� ���� ���� array�迭�� ���ĵǾ� �� result�迭(�����迭)�� �ε����� �ȴ�.
        //��!! array�迭�� �� ���Ұ� = counting�迭�� �ε���, counting�迭�� ���Ұ� - 1 = result�迭�� �ε���, result�迭�� ���Ұ� = array�迭�� ���Ұ�
        //��!! arr[i]�� ���� counting�� index���̰�, counting�� ���� -1 ��Ų ���� result�� index�� ����� �ش� index ���� arr[i] ���� �־��ְԵȴ�.
        //�̷������� �ϸ� result �迭�� array �迭�� ���ĵ� ���·� �ְ� �ȴ�. �Ʒ����� ��� �����غ���

        //5. array�� ���ĵ� ���·� ��� �迭
        int[] result = new int[15]; //�迭�� ũ�� ���� ����(�����ϰ� 15�Τ���)
        for (int i = array.length - 1; i >= 0; i--) { //���������� �����ϱ� ���ؼ��� array�� ������ index ���� ��ȸ�ϴ� ���� ���ٰ� �Ѵ�. -> ��Ȯ�� ���� �˾ƺ���
            int value = array[i];
            counting[value]--;
            result[counting[value]] = value;
        }

        //6. ���� result�迭�� array�迭�� ���ĵǾ����� ���̴�. Ȯ���غ���
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }


    }
}