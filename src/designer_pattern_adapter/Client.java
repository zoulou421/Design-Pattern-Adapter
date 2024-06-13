package designer_pattern_adapter;

public class Client {
 private Standard standard;
 public void process(int a, int b) {
	 standard.operation(a, b);
 }
public void setStandard(Standard standard) {
	this.standard = standard;
}
 
 
}
