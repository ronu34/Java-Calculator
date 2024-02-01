
import javax.swing.JOptionPane;
public class Main {
	static String unit;
	public static void main(String[] args) {
	    // Input first number
		JOptionPane.showMessageDialog(null, "Welcome to Java Calcylator V4");
	    String operation = JOptionPane.showInputDialog(null,"Enter Operation Symbol or name :"); 


	   double result = 0;
	   
	   switch(operation) {
	   case "Shapes":
		   unit = JOptionPane.showInputDialog(null,"What unit do you want");
		   String areaOperation = JOptionPane.showInputDialog(null,"Enter the name of the shape  :"); 
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
			   break;
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
			   
		   case "triangle" :
			   String which_triangle = JOptionPane.showInputDialog(null,"Which triangle ?");
			   switch (which_triangle) {
			   case "right angled triangle" :
				   String operation_of_rightTriangle = which_triangle = JOptionPane.showInputDialog(null,"What triangle operation ?");
				   switch (operation_of_rightTriangle) {
				   case "find hyphothenuse" :
					   double base_of_Righttriangle = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter base length :"));
					   double height_of_Righttriangle = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter height length :"));
					   double hypotheuseWhithoutsq = (base_of_Righttriangle*base_of_Righttriangle) + (height_of_Righttriangle * height_of_Righttriangle );
					   double hypothenuse = Math.sqrt(hypotheuseWhithoutsq);
					   JOptionPane.showMessageDialog(null, "Hypothenuse is "  +hypothenuse+ unit);
					   break;
				   case "find height" :
					   int OptionToFindHeightRightTriangle =Integer.parseInt(JOptionPane.showInputDialog(null,"Type 1 to find height from pythogras theoram or type 2 to find height from its area"));
					   if (OptionToFindHeightRightTriangle == 1) {
						   double HypothenusRightTriangle = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the hypothenuse:"));
						   double BaseRightTriangle = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the Base:"));
						   double HeightFindByPhythograssTheoramWithoutSq = (HypothenusRightTriangle * HypothenusRightTriangle )-(BaseRightTriangle*BaseRightTriangle);
						   double HeightFindByPhythograssTheoram = Math.sqrt(HeightFindByPhythograssTheoramWithoutSq);
						   JOptionPane.showMessageDialog(null, "The Height is "+HeightFindByPhythograssTheoram+" " + unit);
					   }
					   else if (OptionToFindHeightRightTriangle == 2) {
						   double AreaOfRIghtTriangle = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the area : "));
						   double BaseRightTri = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the base :"));
						   double HeightOfRightTri = AreaOfRIghtTriangle /(BaseRightTri /2);
						   JOptionPane.showMessageDialog(null, "The height is: "+ HeightOfRightTri+unit);
					   }
					   else {
						   JOptionPane.showMessageDialog(null, "Wrong Option");
					   }
					   
					   break;
				   case "find base" :
					   int OptionToFindBaseRightTriangle =Integer.parseInt(JOptionPane.showInputDialog(null,"Type 1 to find base from pythogras theoram or type 2 to find height from its area"));
					   if (OptionToFindBaseRightTriangle == 1) {
						   double HypothenusRightTriangle = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the hypothenuse:"));
						   double BaseRightTriangle = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the Base:"));
						   double HeightFindByPhythograssTheoramWithoutSq = (HypothenusRightTriangle * HypothenusRightTriangle )-(BaseRightTriangle*BaseRightTriangle);
						   double HeightFindByPhythograssTheoram = Math.sqrt(HeightFindByPhythograssTheoramWithoutSq);
						   JOptionPane.showMessageDialog(null, "The Height is "+HeightFindByPhythograssTheoram+" " + unit);
					   }
					   else if (OptionToFindBaseRightTriangle == 2) {
						   double AreaOfRIghtTriangle = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the area : "));
						   double HeightRightTri = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the height :"));
						   double BaseOfRightTri = AreaOfRIghtTriangle /(HeightRightTri /2);
						   JOptionPane.showMessageDialog(null, "The height is: "+ BaseOfRightTri+unit);
					   }
					   else {
						   JOptionPane.showMessageDialog(null, "Wrong Option");
					   }
					   break;
				   case "find perimeter" :
					   double base_of_Righttriangle_perimeter = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter base length :"));
					   double height_of_Righttriangle_perimeter = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter height length :"));
					   double hypotheuse_perimeter = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter hypothenuse :"));
					   double perimeter_of_rightAngle = base_of_Righttriangle_perimeter + height_of_Righttriangle_perimeter+hypotheuse_perimeter;
					   JOptionPane.showMessageDialog(null, "Perimeter is "  +perimeter_of_rightAngle + unit);
					   break;
				   case "find area" :
					   double AORTB = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter base:"));
					   double AORTH = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Height:"));
					   double AORTA = AORTB * AORTH /2;
					   JOptionPane.showMessageDialog(null, "THE area is "+AORTA+" "+unit);
					   break;
					default :
						JOptionPane.showMessageDialog(null, "operation not found");

						
				   }
				   break;
			   case "rhombus":
				   rhombus Rhombus = new rhombus(); 
				   int optrhom = Integer.parseInt(JOptionPane.showInputDialog(null,"Type 1 for perimeter or 2 for area:"));
				   if (optrhom == 1) {
					   Rhombus.perimeter();
				   }
				   else if (optrhom == 2) {
					   Rhombus.area();
				   }
				   else {
					   Rhombus.invalid();
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
