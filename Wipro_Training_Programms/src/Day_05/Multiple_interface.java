package Day_05;

interface Java {
 void Program();
}

interface Python {
 void Program();
}

interface C {
void Program();
}


class Language implements Java, Python, C {
@Override
public void Program() {
	 System.out.println("Hello Everyone! Welcome to Coding World");
	
}
}


public class Multiple_interface {
 public static void main(String[] args) {
     Language obj = new Language();
     Java j = obj;
     j.Program();
     
     Python p = obj;
     p.Program();
     
     C c = obj;
     c.Program();
      
 }
}

