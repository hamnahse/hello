// Nama: Hamnah; NPM: 1402013037

public class loop1 extends Thread {
	private String myName;
        static long time1, time2;
        
	public loop1(String name)
	{
		myName = name;
	}
	
	public void run(){
                time1 = System.currentTimeMillis();
                for (int i = 1; i<= 100; i++){
                   	System.out.println(myName + " (" + i + ")");
                }
                time2 = System.currentTimeMillis();
                System.out.println("Time for " + myName + " is " + (time2 - time1) + " msec");
	}
      
	public static void main(String[] args)
	{
            for (int i = 1; i<=5; i++){
                loop1 t1 = new loop1("Thread - " + i);
                  t1.start();
                } 
            }
	}


