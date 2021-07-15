
public class ㄱ조건문연습2예제 {

	public static void main(String[] args) {
		
		//(1) int형 변수 a가 10보다 크고 20보다 작을 때 true인 조건식
		int a = 15;
		
		if(10<a && a<20) {
			System.out.println("true");
		}
		
		//(2) char형 변수 b가 공백이고 탭이 아닐 때 true인 조건식
		char b = 'ㄱ';
		if ((b==' ') && (b!='\t')) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
//		(3) char형 변수 c가 'x' 또는 'X'일 때 true인 조건식
		char c = 'x';
		if (c=='x' || c=='X') {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
//		(4) char형 변수 d가 숫자('0' ~ '9')일 때 true인 조건식
		char d = '5';
		if('0'<=d && d<='9') {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
//		(5) char형 변수 e가 영문자(대문자 또는 소문자)일 때, true인 조건식 
		char e = 'a';
		if(('a'<= e && e<='z') || ('A'<=e && e<='Z')) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
//		(6) 자바초등학교에서 1학년부터 4학년까지 중간고사 시험을 보았다. 4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
//		이를 판단하는 프로그램을 작성해보자. 점수가 0미만 100초과이면 경고문구 출력!
		//첫 번째 코드.
//		int grade = 3;
//		int score = 100;
//		if((grade == 4 && 70<=score && score<=100) || (grade<4 && 60<=score && score<=100)) {
//			System.out.println("합격");
//		} else if(grade<=4 && (score<0 || score>100)) {
//			System.out.println("경고경고");
//		} else if(grade>4) {
//			System.out.println("1~4학년 중에 선택해 주세요");
//		} else {
//			System.out.println("불합격");
//		}
		
		//코드리뷰 후 코드.
		int grade = 5;
		int score = 60;
		if((0>score || score>100) || (grade<1 || grade>4)) {
			System.out.println("경고경고");
		} else if((grade==4 && score>=70) || ((grade<4) && score>=60)) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		
//		(7)사용자로부터 키를 입력받는다. 입력받은 키가 150 이상이면 놀이기구 이용 가능, 150 미만이면 부모와 함께 왔는지 한 번 더 묻는다. 
//		 함께 왔다면 1번을 입력받고, 혼자 왔다면 0번 입력받는다. [1번 입력: 좋은 시간 보내렴~] [0번 입력: 어른 모시고 다시 오렴~]
		int h = 150;
		int f = 1; //부모님과 함께 온 경우1, 혼자 혼 경우0
		
		if(h<150) {
			System.out.println("부모님과 함께 왔나요?");
			if(f==1) {
				System.out.println("좋은 시간 보내렴~");
			} else {
				System.out.println("어른 모시고 다시 오렴~");
			}
		} else {
			System.out.println("놀이기구 이용 가능");
		}
		//ㅋㅋ...이게 맞는건가...? 몬가 이상...
		
		
		
		
		
		
		
		
		
	}

}
