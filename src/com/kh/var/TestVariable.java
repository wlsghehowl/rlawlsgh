// 1. 패키지 생성
package com.kh.var;

// 2. 클래스 생성(앞글자는 대문자)
public class TestVariable {
	// 기능 제공 메소드 만들기
	public void method1() {
		
		// 일반 데이터 출력
		// System.out.println(2500000);
		
		
	    // 변수 사용하기
		// 변수에 특정 값을 넣는다
		// 공간에 값을 대입해라!
		int sal = 2500000; //리터럴
		
		System.out.println(sal);
		System.out.println(sal);
		System.out.println(sal);
		
	}
	
	public void method2() {
		// 변수 선언하기
		
		// 1. 변수 선언 (회원 정보)
		String name;// 이름 - String (문자열)
		String num;// 전화번호 - String (문자열)
		String id;// 아이디 - String (문자열)
		String pw;// 비밀번호 - String (문자열)
		char gender;// 성별 - Char (문자)
		double hei;// 신장 - double
		double wei;// 몸무게 - double
		int age;// 나이 - int
		boolean mrg;// 결혼여부  - boolean
		
		// 2. 선언한 변수에 값 대입
		name = "김진호";
		num = "01092344940";
		id = "kimjinho";
		pw = "1234";
		gender = 'm';
		hei = 175.5;
		wei = 75.5;
		age = 26;
		mrg = false;
		
		// 3. 변수 안의 값 확인하기
		System.out.println(name);
		System.out.println(num);
		System.out.println(id);
		System.out.println(pw);
		System.out.println(gender);
		System.out.println(hei);
		System.out.println(wei);
		System.out.println(age);
		System.out.println(mrg);
		
	}
	
}
