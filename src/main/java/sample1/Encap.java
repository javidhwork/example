package sample1;

public class Encap {
	private String Ename;
	
	public String get_name() {
		return this.Ename;
	}
	
	public void set_name(String Ename) {
		this.Ename= Ename;
	}
	int Eid;
	float sal;
	int deptno;
	String desg;
	
	void work()
	{
		System.out.println(this.Ename + " is working");
		
	}

	public Encap(String Ename, int Eid, float sal, int deptno, String desg) {
		
		this.Ename = Ename;
		this.Eid = Eid;
		this.sal = sal;
		this.deptno = deptno;
		this.desg = desg;
	}

	public Encap(String Ename, int Eid, int deptno) {
		this(Ename, Eid, 2000 ,deptno ,"manual tester");
		
	}

	 

}
