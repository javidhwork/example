package sample1;

public class Encap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encap obj1 = new Encap("javidh",17,100000,3,"testee");
	   System.out.println("ename: "+ obj1.get_name());
	   System.out.println("Eid: " + obj1.Eid);
	   System.out.println("sal: " + obj1.sal);
	   System.out.println("Deptno: " + obj1.deptno);
	   System.out.println("desg: " + obj1.desg);
	   obj1.set_name("john wick");
	   System.out.println("ename: "+ obj1.get_name());
	   obj1.work();
	   

	}

}
