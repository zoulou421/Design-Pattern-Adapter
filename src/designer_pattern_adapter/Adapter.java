package designer_pattern_adapter;
/*scope object:composition
 * 
public class Adapter implements Standard{
	
    private OldClassImpl oldCalssImpl=new OldClassImpl();
	@Override
	public void operation(int nb1, int nb2) {
		double result=oldCalssImpl.account((double)nb1, (double)nb2);
		oldCalssImpl.print(result);
		
	}

}*/

//Scope class:heritage
public class Adapter extends OldClassImpl implements Standard {
	
	@Override
	public void operation(int nb1, int nb2) {
		double result=super.account((double)nb1, (double)nb2);
		super.print(result);
		
	}

}
