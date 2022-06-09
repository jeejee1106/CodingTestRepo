package test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * 초기 설정 확인을 위한 test클래스 입니다.
 *
 */


class Friends2{
    public String solution(String[] friendsArr) {

        // 1. 이름이 네 글자인 친구를 담기 위한 배열 생성
        ArrayList<String> list = new ArrayList<>();

        // 2. 이름의 길이가 4면 list에 추가
        for(String arrCheck : friendsArr) {
            if(arrCheck.length() == 4) {
                list.add(arrCheck);
            }
        }

        // 3. list에 담긴 배열을 다시 String 배열에 담아서 return
        String[] newFriendsArr = new String[list.size()];
        for(int i = 0; i < newFriendsArr.length; i++ ) {
            newFriendsArr[i] = list.get(i);
        }

        return Arrays.toString(newFriendsArr);
    }
}

public class Friends {

    public static void main(String[] args) {
        Friends2 friend = new Friends2();

        String[] aa = {"Ryan", "Kieran", "Mark", "aaaaaa", "bbbb", "cccc"};
        System.out.println(friend.solution(aa));
    }
}