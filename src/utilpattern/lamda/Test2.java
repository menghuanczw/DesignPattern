package utilpattern.lamda;

public class Test2 {

	public static void lamda(Method m,String s1,String s2) {
		m.method(s1, s2);
	}
	public static void main(String[] args) {
		lamda((String s,String d) -> { s = s+d;System.out.println(s);return s;},"1","2");

	}

}

interface Method{
	String method(String s1,String s2);
}