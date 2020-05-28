package kazuhoSaito.mondai1;

public class Syain {

	String name;
	int salary;

	public Syain(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Syain [name=" + name + ", salary=" + salary + "]";
	}


}
