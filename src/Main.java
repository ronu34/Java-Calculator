import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
	    // Input first number
		JOptionPane.showMessageDialog(null, "Welcome to Java Calcylator V3");
	    String operation = JOptionPane.showInputDialog(null,"Enter Operation Symbol or name :"); 


	   double result = 0;
	   
	   switch(operation) {
	   case "Shapes":
		   String unit = JOptionPane.showInputDialog(null,"What unit do you want");
		   String areaOperation = JOptionPane.showInputDialog(null,"Enter the name of the shape to  find its area :"); 
		   switch(areaOperation) {
		   case "Sqaure":
			   String area_or_perimeter = JOptionPane.showInputDialog(null,"What do you want area or perimeter ?");
			   switch(area_or_perimeter) {
			   case "area":
				   double sidelength = Double.parseDouble(JOptionPane.showInputDialog(null,"What is length of a side ? "));
				   result = sidelength * sidelength;
				   JOptionPane.showMessageDialog(null,"The area is " + result+" "+unit+".sq" );
				   break;
			   case "perimeter" :
				   double sidelengthP = Double.parseDouble(JOptionPane.showInputDialog(null,"What is length of a side ? "));
				   result = sidelengthP * 4;
				   JOptionPane.showMessageDialog(null,"The perimeter is " + result+unit);
				   break;
			   default:
				   JOptionPane.showMessageDialog(null, area_or_perimeter + " is not an option");
				  
				 
				   
			   }
		   case "circle":
			   
			   double pie = Math.PI;
			   double radius = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter radius(Dont add the unit):"));
			   String what_part_to_find = JOptionPane.showInputDialog(null,"What  do you want of circle area or circumference");
			   switch(what_part_to_find) {
			   case "circumference":
				   double circumfernce = 2 * radius * pie;
				   JOptionPane.showMessageDialog(null, "Circumference is " + circumfernce + " "+unit);
				   break;
			   case "area":
				   double area_of_circle = radius * radius * pie;
				   JOptionPane.showMessageDialog(null, "Circumference is " + area_of_circle + " "+unit+".sq " );
				   break;
			   }
			   break;
			   default :
				   JOptionPane.showMessageDialog(null, "Wrong Option" );
		   case "triangle" :
			   String which_triangle = JOptionPane.showInputDialog(null,"Which triangle ?");
			   switch (which_triangle) {
			   case "right angled triangle" :
				   String operation_of_rightTriangle = which_triangle = JOptionPane.showInputDialog(null,"What triangle operation ?");
				   switch (operation_of_rightTriangle) {
				   case "find hyphothenuse" :
					   double base_of_Righttriangle = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter base length :"));
					   double height_of_Righttriangle = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter height length :"));
					   double hypotheuse = (base_of_Righttriangle*base_of_Righttriangle) + (height_of_Righttriangle * height_of_Righttriangle );
					   JOptionPane.showMessageDialog(null, "Hypothenuse is "  +hypotheuse + unit);
					   break;
				   case "find height" :
					   JOptionPane.showMessageDialog(null, "Coming Soon !!!!!!!!");
					   break;
				   case "find base" :
					   JOptionPane.showMessageDialog(null, "Coming Soon !!!!!!!!");
					   break;
				   case "find perimeter" :
					   double base_of_Righttriangle_perimeter = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter base length :"));
					   double height_of_Righttriangle_perimeter = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter height length :"));
					   double hypotheuse_perimeter = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter hypothenuse :"));
					   double perimeter_of_rightAngle = base_of_Righttriangle_perimeter + height_of_Righttriangle_perimeter+hypotheuse_perimeter;
					   JOptionPane.showMessageDialog(null, "Perimeter is "  +perimeter_of_rightAngle + unit);
					   break;
				   case "find area" :
					   JOptionPane.showMessageDialog(null, "Coming Soon!!!!!!!!!!!!!!1");
					   break;
					default :
						JOptionPane.showMessageDialog(null, "operation not found");
					   
				   }
			   default :
					JOptionPane.showMessageDialog(null, "operation not found");
					return;
			   }
			   
		   }
	   case"normal" :
	        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a number"));

	        // Input second number
	        double num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a number"));

	        // Input operator
	        String operator = JOptionPane.showInputDialog(null,"Enter a operation");

	        double result2 = 0;
		   switch (operator) {
           case "+":
               result = num1 + num2;
               break;
           case "-":
               result = num1 - num2;
               break;
           case "*":
               result = num1 * num2;
               break;
           case "/":
               if (num2 != 0) {
                   result = num1 / num2;
               } else {
            	   JOptionPane.showMessageDialog(null,"Error: Division by zero is not allowed.");
                   return;
               }
               break;
           default:
        	   JOptionPane.showMessageDialog(null,"Error: Invalid operator.");
               return;
       }

       // Display the result
       JOptionPane.showMessageDialog(null,"Result: " + result2);
	   
		   break;
		   default:
			   JOptionPane.showMessageDialog(null, operation + " is not an operation");
			  
		   
	   }
	   
	}

}
