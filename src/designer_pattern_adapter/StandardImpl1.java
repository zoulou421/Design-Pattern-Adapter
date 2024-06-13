package designer_pattern_adapter;

public class StandardImpl1 implements Standard{

	@Override
	public void operation(int nb1, int nb2) {
		// TODO Auto-generated method stub
		double result=nb1+nb2;
		System.out.println("------STANDARD IMPLEMENTATION 1-----------");
		System.out.println("Result="+result);
		System.out.print("-------------------");
		
	}

}
