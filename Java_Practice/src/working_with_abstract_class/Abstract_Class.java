package working_with_abstract_class;

public abstract class Abstract_Class {
	
	private String name;
	private int age;

	protected void setAge(int a) {
		age=a;
	}
	
	public void setName(String n) {
		name=n;
		
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
class Example extends Abstract_Class{
	 public static void main(String[] args) {
			Example ex=new Example();
			ex.setAge(20);
			ex.setName("Anshuman Bedanta");
			System.out.println(ex.getName());
			System.out.println(ex.getAge());

		}
}
