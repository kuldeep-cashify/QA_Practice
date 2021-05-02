package In.Cashify.inheritance;

import In.Cashify.Abstract_Class;

public class Inherit_abstract extends Abstract_Class {
	
	public Inherit_abstract() {
		this(34);
		this.abstract_inherit();
		System.out.println("         ");
		System.out.println("Child Constructor");
	}
	
	public Inherit_abstract(int i ) {
		super();
	System.out.println("Parameter constructor");	
		
	
	}

	@Override
	public void abstract_inherit() {
		
	System.out.println(" Overriding the abstract class");	
	}
	
	public void Self_work() {
		System.out.println("                   ");	
		System.out.println("Role of QA engineer");	
		System.out.println("1). Self Study of Automation part");
		System.out.println("2). Study what tought by the Lead");
		System.out.println("3). Handle all the jira ticket");
		}
	
	public static void main(String[] args) {
		Inherit_abstract a1=new Inherit_abstract();
		a1.Self_work();
		a1.Testing_Lead();
		
		
	}

	
}
