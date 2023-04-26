class Bikenew{  
	
   void run(){System.out.println("running");}  
}  
     
class Honda extends Bikenew{  
   void run(){System.out.println("running safely with 100kmph");}  
}

public class Final_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Honda honda= new Honda();  
		   honda.run();  

	}

}
