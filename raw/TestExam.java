package raw;

public class TestExam {

	public static void main(String[] args) {
		Exam e1=new Exam("181 Java");
		Exam e2=new Exam(18);
		e1.printCode();
		e2.printCode();
		
		Integer e=(Integer)e2.getCode();
		System.out.println(e);
		Integer e3= (Integer)e1.getCode();// Runtime error because unsafe type casting from String to Integer
		System.out.println(e3); 
	}

}
