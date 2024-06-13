package designer_pattern_adapter;

public class App {

	public static void main(String[] args) {
		Client cli=new Client();
		cli.setStandard(new StandardImpl1());
		cli.process(10, 10);
		
		cli.setStandard(new StandardImpl2());
		cli.process(10, 10);
		
		//ADPATER USED
		cli.setStandard(new Adapter());
		cli.process(10, 10);

	}

}
