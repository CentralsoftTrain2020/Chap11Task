package kazuhoSaito.mondai2;

public class Syain {

	String name;
	int salary;
	Address adrress;

	public Syain(String name, int salary,Address adrress) {
		super();
		this.name = name;
		this.salary = salary;
		this.adrress=adrress;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Syain [name=" + name + ", salary=" + salary + ", adrress=" + adrress.toString() + "]";
	}




}
