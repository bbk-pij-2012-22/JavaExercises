<<<<<<< HEAD
boolean finished = false
Calculator myCalc = new Calculator()
while (!finished)
{
println "Please choose from the following options: "
println "Enter 1 to add 2 integers."
println "Enter 2 to subtract one integer from another."
println "..3 to multiply.."
println "4 to divide"
println "5 to find the modulus.."
println "or 0 to exit."
String entry = System.console().readLine()
int option = Integer.parseInt(entry)
switch(option)
    {
    case 0: println "Ending program..."
    finished = true
    break;
    case 1: println "Please enter the first integer: "
    String x = System.console().readLine()
    int x1 = Integer.parseInt(x)
    println "Please enter the second integer: "
    String y = System.console().readLine()
    int y1 = Integer.parseInt(y)
    double result = myCalc.add(x1,y1)
    println "The result of " + x1 + " + " + y1 + " is " + result + "."
    break;
    case 2: println "Please enter first integer: "
    String x = System.console().readLine()
    int x1 = Integer.parseInt(x)
    println "Please enter the second integer: "
    String y = System.console().readLine()
    int y1 = Integer.parseInt(y)
    double result1 = myCalc.subtract(x1,y1)
    println x1 + "-" + y1 + " = " + result1
    break;
    case 3:  println "Please enter first integer: "
    String x = System.console().readLine()
    int x1 = Integer.parseInt(x)
    println "Please enter the second integer: "
    String y = System.console().readLine()
    int y1 = Integer.parseInt(y)
    double result1 = myCalc.multiply(x1,y1)
    println x1 + "*" + y1 + " = " + result1
    break;
    case 4:  println "Please enter first integer: "
    String x = System.console().readLine()
    int x1 = Integer.parseInt(x)
    println "Please enter the second integer: "
    String y = System.console().readLine()
    int y1 = Integer.parseInt(y)
    double result1 = myCalc.divide(x1,y1)
    println x1 + "/" + y1 + " = " + result1
    break;
    case 5:  println "Please enter first integer: "
    String x = System.console().readLine()
    int x1 = Integer.parseInt(x)
    println "Please enter the second integer: "
    String y = System.console().readLine()
    int y1 = Integer.parseInt(y)
    double result1 = myCalc.modulo(x1,y1)
    println x1 + "%" + y1 + " = " + result1
    break;
    default: "That is an invalid entry, please try again."    
    break;
    }
=======
boolean finished = false
while (!finished)
{
println "Please choose from the following options: "
println "Enter 1 to add 2 integers."
println "Enter 2 to subtract one integer from another."
String entry = System.console().readLine()
int option = Integer.parseInt(entry)
switch(option)
	{
	case 1: println "Please enter the first integer: "
	String x = System.console().readLine()
	int x1 = Integer.parseInt(x)
	println "Please enter the second integer: "
	String y = System.console().readLine()
	int y1 = Integer.parseInt(y)
	double result = Calculator.add(x1, y1)
	println "The result of " + x1 + " + " +y1 " is " + result "."
	break;
	case 2: "Please enter the first integer: "
	String x = System.console().readLine()
	int x1 = Integer.parseInt(x)
	println "Please enter the number you would like to subtract from " + x + "."	
	String y = System.console().readLine()
	int y1 = Integer.parseInt(y)
	result = Calculator.subtract(x1, y1)
	break;
	case 3: println "Ending program…."
	finished = true
	break;
	default: "That is an invalid entry, please try again."	
	break;
	}
>>>>>>> issues with private before double - "illegal start of expression"
}