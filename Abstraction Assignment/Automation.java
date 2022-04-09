package week3.day2;

public class Automation extends MultipleLanguage {

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java is a Language");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium is a TestTool");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby is another Language");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation auto = new Automation();
		auto.Java();
		auto.Selenium();
		auto.ruby();
		auto.python();
	}
}
