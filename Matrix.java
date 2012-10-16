
class Matrix
{
	int[][] myArray;
	public Matrix(int x, int y)
		{
		this.myArray = new int[x][y];
		}

	public void setElement(int x, int y, int newValue)
		{
		if ((x < myArray.length && x > 0) && (y < myArray[0].length && y > 0))
			{
				myArray[x][y] = newValue;
			}
		}
		
		
		
		
	public void setRow(int x, String newValues)
		{
			int counter = 0;
			for (int a = 0; a < newValues.length(); a++)
				{
					if (Character.isDigit(newValues.charAt(a)) == true)
						{
							counter++;
						}
				}
			int[] onlyValues = new int[counter];
			for (int a = 0; a < newValues.length(); a++)
				{
					counter = 0;
					if (Character.isDigit(newValues.charAt(a)))
						{
							char h = newValues.charAt(a);
							int b = Character.getNumericValue(h);
							onlyValues[counter] = b;
							counter++;
						}
				}		
			if ((x < myArray.length && x > 0) && (onlyValues.length == myArray[0].length))
				{
					myArray[x] = onlyValues;
				}
		}
		
		
		
	public void setColumn(int x, String newValues)
		{
			int counter = 0;
			for (int a = 0; a < newValues.length(); a++)
				{
					if (Character.isDigit(newValues.charAt(a)) == true)
						{
							counter++;
						}
				}
			int[] onlyValues = new int[counter];
			for (int a = 0; a < newValues.length(); a++)
				{
					counter = 0;
					if (Character.isDigit(newValues.charAt(a)))
						{
							char h = newValues.charAt(a);
							int b = Character.getNumericValue(h);
							onlyValues[counter] = b;
							counter++;
						}
				}		
			if ((x < myArray[0].length && x > 0) && (onlyValues.length == myArray.length))
				{
					for (int i = 0; i < onlyValues.length; i++)
						{
							myArray[i][x] = onlyValues[i];
						}
				}
		}
		
		
	public String toString()
		{
			int totalNums = myArray.length * myArray[0].length;
			String[] resultString = new String[(totalNums * 2 - 1) + 2];
			resultString[0] = "[";
			int stringPos = 1;
			for (int a = 0; a < myArray.length; a++)
				{
					if (stringPos > 1)
						{
							resultString[stringPos] = ";";
							stringPos++;
						}
						for (int i = 0; i < myArray[0].length; i++)
							{
								int vehicle = myArray[a][i];
								String str = Integer.toString(vehicle);
								resultString[stringPos] = str;
								stringPos++;
								resultString[stringPos] = ",";
								stringPos++;
							}
				}
			String retResult = Arrays.toString(resultString);
			return retResult;
	
			
		}
}




























