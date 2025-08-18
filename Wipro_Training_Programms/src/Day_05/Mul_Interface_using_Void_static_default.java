package Day_05;

interface TV {
	void show();
 default void channel() {
     System.out.println("Channel number 1 is Star-Sports");
 }

 static void info() {
     System.out.println("Swtich on the Tv");
 }
}

interface Mobile {
	void show();
 default void Channel() {
     System.out.println("Channel number 2 is Wild-Life");
 }

 static void info() {
     System.out.println("Open Jio-TV");
 }
}


public class Mul_Interface_using_Void_static_default implements TV, Mobile {

 @Override
 public void show() {
     System.out.println("We can Watch Live Channels in these way:");
 }

 public static void main(String[] args) {
     Mul_Interface_using_Void_static_default mi = new Mul_Interface_using_Void_static_default();

     mi.show(); //void
     
     System.out.println();
    
     Mobile.info(); //static
     mi.channel(); //default

     System.out.println();
    
     TV.info();   // static 
     mi.Channel(); //default
    
     
     
 }
}

