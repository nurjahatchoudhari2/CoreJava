package new24_01demonthredin;

public class Main {

        public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Application started");
		
		CodeEnter t1 = new CodeEnter();
		CodeEnter t2 = new CodeEnter();
		CodeEnter t3 = new CodeEnter();
		
		t1.setName("Type");
		t2.setName("Spellcheck");
		t3.setName("Save");
		
		t2.setDaemon(true);
		t3.setDaemon(true);
		t2.setPriority(1);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
		 
		
		System.out.println("Application Terminated");
	}
}
