import javax.swing.JOptionPane;
public class math {
	double num1;
	double num2;
	double result;
	double remainder;
	
	void add() {
		num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a number: "));   
		num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a second number: "));
		result = num1 + num2;
		JOptionPane.showMessageDialog(null, "The answer is "+ result);
	}
	void sub() {
		num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a number: "));   
		num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a second number: "));
		result = num1 - num2;
		JOptionPane.showMessageDialog(null, "The answer is "+ result);
	}
	void multiply() {
		num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a number: "));   
		num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a second number: "));
		result = num1 * num2;
		JOptionPane.showMessageDialog(null, "The answer is "+ result);
	}
	void divide() {
		num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a number: "));
		num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a second number: "));
		if(num1 == 0) {
			JOptionPane.showMessageDialog(null, "Access Denied");
		}
		else {
			num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a number: "));   
			num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a second number: "));
			result = num1 / num2;
			remainder = num1 % num2;
			JOptionPane.showMessageDialog(null, "The quotient is "+ result+" remainder is "+remainder);
		}
	}
}
