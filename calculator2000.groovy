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
	double result = Calculator.add(x1,y1)
	println "The result of " + x1 + " + " +y1 " is " + result "."
	break;
	case 2: "I haven't added this function to the java class yet."
	break;
	case 3: println "Ending program…."
	finished = true
	break;
	default: "That is an invalid entry, please try again."	
	break;
	}
}