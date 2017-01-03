package pranita;
import jaxb.*;
public class Main {

	 public static void main(String args[]){
		Employeejaxb ob = new Employeejaxb();
		ob.marshal();
		ob.unmarshal();
	 }
}
