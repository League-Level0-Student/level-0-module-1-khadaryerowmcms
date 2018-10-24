package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class UnBirthday {
public static void main(String[] args) {
	String Bday=JOptionPane.showInputDialog("Hi");

	if(Bday.equals("11/24")){
JOptionPane.showMessageDialog(null, "Happy Bday");
} 
else {
	JOptionPane.showMessageDialog(null,"very merry unbday");
} 
}
}