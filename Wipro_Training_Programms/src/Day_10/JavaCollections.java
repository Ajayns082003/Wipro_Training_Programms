package Day_10;

import java.util.ArrayList;

public class JavaCollections {
	
	class Department{
		private String name;
		private double sales;
		private double expenses;
		
		
		public Department(String name, double sales, double expenses) {
			this.name =name;
			this.sales=sales;
			this.expenses=expenses;
		}
		
		public double getProfit() {
			return sales - expenses;
		}
		
		public String getName() {
			return name;
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Department> dept = new ArrayList<>();
		
		dept.add(new JavaCollections().new Department("Sales", 25000, 15000));
		dept.add(new JavaCollections().new Department("Marketing", 15000, 10000));
		dept.add(new JavaCollections().new Department("Research", 20000, 12000));
	
	for(Department d: dept) {
		System.out.println(d.getName()+" Profit "+d.getProfit());
	}
	
	dept.sort((d1, d2)->Double.compare(d1.getProfit(), d2.getProfit()));
	System.out.println("Sorting Done---->");
	
	for(Department d: dept) {
		System.out.println(d.getName()+" Profit "+d.getProfit());
	}
	}
}
