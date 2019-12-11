package DomainClasses;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Place {
	private String name;
	private ArrayList <Position> allPosition;
	private ArrayList <Manager> managers;
	private ArrayList <StudentWorker> allStudents;
	private DailyRecord daily;
	
	public Place(String name) {
		// creating instance of place
		this.name = name;
	}
	
	public void addPosition(String pos, int noOfSlots) {
		allPosition.add(new Position(pos, noOfSlots, this.name));
	}
	
	public String getAllPosition() {
		String result = "";
		for (Position i: allPosition) {
			//Display students name 
			result += i.toString() + "\n";
		}
		
		return result;
	}
	
	public String getAllStudents() {
		String result = "";
		for (StudentWorker i: allStudents) {
			//Display students name 
			result += i.getInfo().toString() + "\n";
		}
		
		return result;
		
		
	}
	
}
