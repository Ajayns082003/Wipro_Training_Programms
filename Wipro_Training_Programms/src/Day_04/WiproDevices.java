
//Abstract  class another example
package Day_04;

interface Wipro_systems{
	void deviceType();
	void Compliespeed();
}
class Desktop implements Wipro_systems{
	public void deviceType() {
		System.out.println("wipro provides device :Desktop");
	}
	public void Compliespeed() {
		System.out.println("Code is complied faster in Desktop");
	}
}

class Laptop implements Wipro_systems{
	public void deviceType() {
		System.out.println("wipro provides device :Laptop");
	}
	public void Compliespeed() {
		System.out.println("Code is complied slower in Laptop");
	}
}
public class WiproDevices {
	public static void main(String[] args) {
		Wipro_systems w1 = new Desktop();
		w1.deviceType();
		w1.Compliespeed();
		
		System.out.println();
		
		Wipro_systems w2 = new Laptop();
			w2.deviceType();
			w2.Compliespeed();
		}
}
