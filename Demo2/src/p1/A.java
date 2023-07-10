package p1;

public class A {
	public int a1=100;//in same package
	private int b1=200;// only in single class
	protected int c1=300;// same package + same class
	int d1=400;//same package
	void display() {
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);

	}
}
class B extends A{
	void display() {
        System.out.println(a1);
//        System.out.println(b1); private
        System.out.println(c1);
        System.out.println(d1);

	}
}
class C{
	void display() {
		A a=new A();
        System.out.println(a.a1);
//        System.out.println(a.b1);
        System.out.println(a.c1);
        System.out.println(a.d1);

	}
}