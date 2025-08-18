package Day_05;

interface Wipro {
 void Preskill(); 
}

class OfferLetter implements Wipro {
 public void Preskill() {
     System.out.println("You need to complete the Pre-Skill to get Onboard.");
 }
}


public class Using_void {
 public static void main(String[] args) {
     OfferLetter ol = new OfferLetter();
     ol.Preskill();
 }
}
