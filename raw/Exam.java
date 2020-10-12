package raw;

public class Exam {
	private Object code;

	public Object getCode() {
		return code;
	}

	public void setCode(Object code) {
		this.code = code;
	}
	
	
	
	
	public Exam(Object code) {
		this.code = code;
	}
	
	public Exam() {
		
	}

	public void printCode() {
		System.out.println("The Type of Exam Code is: "+code.getClass().getSimpleName());
		System.out.println("The Exam code is:"+code);
	}
}
