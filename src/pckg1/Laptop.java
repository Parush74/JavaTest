package pckg1;

class  Test{
	public int i;
	public Test(){
		i = 1;
	}
}

class TestBase extends Test {
	public int t;
	public TestBase() {
		t = 2;
	}
}

public class Laptop 
{   
	public static void main(String[] args) 
	{  
	  Test t = new TestBase();
	  System.out.println(t.i);
      System.out.println("Test Application");
	};
			

    }





