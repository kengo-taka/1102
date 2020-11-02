import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		HourlyEmployee h1 = new HourlyEmployee("Aidan", 
				"Dandan", "aidan@gmail.com", "2020-04-01", 111222333, 15, 10);
		HourlyEmployee h2 = new HourlyEmployee("Aidan2", 
				"Dandan2", "aidan2@gmail.com", "2020-04-02", 444222333, 13, 19);
		
		SalesEmployee s1 = new SalesEmployee("Aidan3", 
				"Dandan3", "aidan3@gmail.com", "2020-04-03", 411222333, 10,100);
		SalesEmployee s2 = new SalesEmployee("Aidan4", 
				"Dandan4", "aidan4@gmail.com", "2020-05-02", 444222333, 20,200);
		
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(h1);
		list.add(h2);
		list.add(s1);
		list.add(s2);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println("---------------------");
		}
		
		
	}

}
