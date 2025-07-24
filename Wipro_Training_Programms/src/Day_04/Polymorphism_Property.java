package Day_04;

class Rent {
	double Rent;
	int expenses;
	double electricity;
	
	public void rent_money(int Rent,int expenses) {
		this.Rent=Rent;
		this.expenses=expenses;
		System.out.println("rent is "+Rent);
		System.out.println("expenses are "+expenses);
		System.out.println("Total expenses by adding rent and expenses " +Rent+expenses);
	}
	
	public void rent_money(double Rent,double electricity) {
		this.Rent=Rent;
		this.electricity=electricity;
		System.out.println("rent is "+Rent);
		System.out.println("expenses are "+electricity);
		System.out.println("Total expenses by adding rent and electricty "+Rent+electricity);
}
}

public class Polymorphism_Property {
	public static void main(String[] args) {
		Rent r = new Rent();
		r.rent_money(5000, 2000);
		System.out.println();
		r.rent_money(5000.0, 1000.0);
	}

}
