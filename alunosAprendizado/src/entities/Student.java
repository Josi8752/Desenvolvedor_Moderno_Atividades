package entities;

public class Student {

	
	public String name;
	public double note1;
	public double note2;
	public double note3;
	
	
	public double endNote() {
		return note1 +note2 + note3;
	}
	public double situationStudent() {
		if (endNote() < 60.0) {
			return 60.0 - endNote();
		}
		else {
			return  0.0;
		}
	}
}
