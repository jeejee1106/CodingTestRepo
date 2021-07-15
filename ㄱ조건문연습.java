
public class ㄱ조건문연습 {

	public static void main(String[] args) {
		
		//로그인 첫 번째 연습.
//		String id = args[0];
//		String inputid = "minjee";
//		
//		String pass = args[1];
//		String inputpass = "1111";
//		
//		if(id.equals(inputid) && pass.equals(inputpass)) {
//			System.out.println("hi, master");
//		} else {
//			System.out.println("who are you?");
//		}
		
		
		
		//로그인 두 번째 연습.
//		String id = args[0];
//		String inputid = "minjee";
//		
//		String pass = args[1];
//		String inputpass = "1111";
//		
//		if(id.equals(inputid) && pass.equals(inputpass)) {
//			System.out.println("환영합니다.");
//		}
//		else if(!id.equals(inputid)) {
//			System.out.println("아이디를 확인하세요.");
//		}
//		else if(!pass.equals(inputpass)) {
//			System.out.println("비밀번호를 확인하세요.");
//		}
//		else {
//			System.out.println("일치하는 내용이 없습니다.");
//		}
//			
		
		
		//로그인 세 번째 연습.
//		String id = args[0];
//		String inputid = "minjee";
//		
//		String pass = args[1];
//		String inputpass = "1111";
//		
//		if(!id.equals(inputid)) {
//			System.out.println("아이디를 확인하세요.");
//			return;
//		}
//		if(!pass.equals(inputpass)) {
//			System.out.println("비밀번호를 확인하세요.");
//			return;
//		}
//		if(id.equals(inputid) && pass.equals(inputpass)) {
//			System.out.println("환영합니다.");
//		}

		
		
		//로그인 네 번째 연습.
//		String id = args[0];
//		String inputid = "minjee";
//		
//		String pass = args[1];
//		String inputpass = "1111";
//		
//		if(!id.equals(inputid) || !pass.equals(inputpass)) {
//			System.out.println("아이디 혹은 비밀번호를 확인하세요.");
//			return;
//		}
//		if(id.equals(inputid) && pass.equals(inputpass)) {
//			System.out.println("환영합니다.");
//		}
		
		
		// 학점 연습
		String id = "minjee";
		int score = 4;
		char grade = 'F'; //공백이 아닌 F로 두면 마지막 else를 생략해도 된다.
		                  //else를 생략하는 것이 더 효율적이라고 함.
		
		System.out.println("안녕하세요.");
		System.out.println(id+"님");
		if (90 <= score) {
			grade = 'A';
		} else if (80 <= score) {
			grade = 'B';
		} else if (70 <= score) {
			grade = 'C';
		} else if (60 <= score) {
			grade = 'D';
		}
//		else {
//			grade = 'F';
//		}
		System.out.println("당신의 학점은 " + grade + " 입니다.");
		
		
		//switch문 연습
		int month = 7;
		switch(month) {
			case 3:
			case 4:
			case 5: //이렇게 밑으로 내려서 써도 되고,
				System.out.println("현재 계절은 봄입니다.");
				break;
			case 6: case 7: case 8: //이렇게 한 줄로 써도 된다.
				System.out.println("현재 계절은 여름입니다.");
				break;
			case 9 : case 10 : case 11 :
				System.out.println("현재 계절은 가을입니다.");
				break;
			default:
				System.out.println("현재 계절은 겨울입니다.");
		
		} // break를 넣지 않으면 조건에 해당하는 case문 뒤의 case문까지 모조리 실행이 된다.
		  // default는 if조건문에서 else와 같은 역할을 한다.
		  // swich문은 byte, short, int, enum, String, Character, Byte, Short, Intrger만 사용 가능하다
		
		
		
		
		
	}

}
