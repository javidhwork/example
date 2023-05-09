package sample1;

class Inheritance1 {
	
	static int a = 30;
	int b = 40;
	}

class Inheritance2 extends Inheritance1 {
	
	static int i = 33;
	 int j = 55;
}

class Inheritance3 extends Inheritance2 {
	
	static int q = 13;
	int r = 24;
}

class Inheritance{

	public static void main(String[] args) {
	
	Inheritance3 obj1 = new Inheritance3(); //Inheritance1 + 2 + 3
	System.out.println("Inheritance3 class ref");
	System.out.println(obj1.a);
	System.out.println(obj1.b);
	System.out.println(obj1.i);
	System.out.println(obj1.j);
	System.out.println(obj1.q);
	System.out.println(obj1.r);
	
	Inheritance2 obj2 = obj1; //Inheritance2(super) <---- Inheritance3(sub class) UPCASTING (restricted till Inheritance2)
	//by using obj2 inheritance1 + 2........... not inheritance 3
	System.out.println("Inheritance2 class ref");
	System.out.println(obj2.a);
	System.out.println(obj2.a);
	System.out.println(obj2.b);
	System.out.println(obj2.i);
	System.out.println(obj2.j);
	
	Inheritance1 obj3 = obj1;
	System.out.println("Inheritance3 class ref");
	System.out.println(obj3.a);
	System.out.println(obj3.b);
	
	
	Encap obj = new Encap("javidh",17,100000,3,"testee");
	   System.out.println("ename: "+ obj.get_name());
	   System.out.println("Eid: " + obj.Eid);
	   System.out.println("sal: " + obj.sal);
	   System.out.println("Deptno: " + obj.deptno);
	   System.out.println("desg: " + obj.desg);
	   obj.set_name("john wick");
	   System.out.println("ename: "+ obj.get_name());
	   obj.work();
	
	
	
}
}