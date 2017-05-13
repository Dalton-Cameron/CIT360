package test;

public class MVCtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model m = new Model("Cameron", "Dalton");
		View v = new View("MVC testing");
		Controller c = new Controller(m, v);
		c.initController();
	}

}
