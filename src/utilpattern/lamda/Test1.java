package utilpattern.lamda;

public class Test1 {

	public static void lamda(Imethod imethod) {
		imethod.method();
	}
	public static void lamda2(Imethod2 imethod2) {
		imethod2.method("hello");
	}
	public static void main(String[] args) {
		lamda(() -> System.out.println("m:"+"hello"));
		lamda2((s) -> System.out.println("m2:"+s));
	}

}

interface Imethod{
	void method();
}

interface Imethod2{
	void method(String s);
}
