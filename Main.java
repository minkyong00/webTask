package innerTest01;

public class Main {
	public static void main(String[] args) {
		//Outer 클래스와 Inner 클래스의 객체 생성
		Outer outerObj = new Outer();
		
		
		//내부클래스 객체화(외부 클래스의 주소값 필요)
		Outer.Inner innerObj = outerObj.new Inner();
		
		System.out.println(outerObj);
		System.out.println(innerObj);
		
		System.out.println("Outer 클래스의 var1 : " + outerObj.var1);
		System.out.println("Outer 클래스의 var2 : " + innerObj.var2);
	}
}
