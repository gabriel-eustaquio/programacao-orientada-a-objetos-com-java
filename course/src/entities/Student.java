package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public String finalGrade() {
		double aux = this.grade1 + this.grade2 + this.grade3;
		if (aux > 60.0) {
			return "FINAL GRADE = " + aux + " PASS";
		}
		
		return "FINAL GRADE = " + aux + " FAILED MISSING " + (60.0 - aux) + " POINTS"; 
	}
	
	public String toString() {
		return this.finalGrade();
	}

}
