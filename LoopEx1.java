package loopExamples;

public class LoopEx1 {
	
	void display(String name, int count)
	{
		for(int index=1;index<=count;index++)
		{
			System.out.println(name + ":"+ index);
		}
	}
	
	void displayUsingwhile(String name , int count)
	{
		int index = 1;
		while(index<=count)
		{
			System.out.println(name + ":"+ index);
			index++;
		}
		
	}
	
	 public static void main(String[] args) {
		LoopEx1 loopEx1 = new LoopEx1();
		loopEx1.display("Kapil", 10 );
		loopEx1.displayUsingwhile("kapil kanojiya", 5);
	}

}
