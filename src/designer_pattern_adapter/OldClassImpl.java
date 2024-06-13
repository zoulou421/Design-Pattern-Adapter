package designer_pattern_adapter;

public class OldClassImpl{

	
	public double  account(double nb1, double nb2) {
		return 2*nb1+nb2;
	}
	
	public void  print(double nb) {
		System.out.println("------OLD IMPLEMENTATION 1-----------");
		System.out.println(nb);
		System.out.print("-------------------");
	}

}

//scope class:heritage