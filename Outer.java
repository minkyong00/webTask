package innerTest01;

public class Outer {
	//필드, 메소드, 생성자, 클래스
	
	//Outer클래스의 필드
	int var1;
	String data1 = "Outer";
	
	//Outer 클래스의 기본 생성자
	public Outer() {
		super();
		System.out.println("Outer 외부 클래스의 생성자 호출");
	}
	
	//내부 클래스 Inner 정의
	class Inner{
		//Inner 클래스의 필드
		int var2 = 10;
		String data2 = "Inner";
		
		//Inner 클래스의 기본생성자
		public Inner() {
			super();
			System.out.println("Inner 내부 클래스의 생성자 호출");
		}
		
		//Inner 클래스의 메소드
		void innerMethod() {
			System.out.println("Inner 내부 클래스의 메소드 호출");
			//외부 클래스 Outer의 멤버에 접근 가능
			method();
			var1 = 1;
			System.out.println(var1);
		}
		
		
		
		
		
		//Outer 클래스의 메소드
		void method(){
			System.out.println("Outer 클래스의 메소드 호출");
			System.out.println(var1);
		}
		
	}
	
	
}
