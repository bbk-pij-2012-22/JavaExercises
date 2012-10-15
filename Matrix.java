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
			int[] finalvalues;
			int numberCount = 0;
			for (int a = 0; a < newValues.length; a++)
				{
					if (newValues.charAt(a).isNumber)
					numberCount++;
				}
			String[] numbers = new int[numberCount];
			int counter = 0;
			finalValues = new int[numbers];
			for (int a = 0; a < newValues.length; a++)
					{
						if (newValues.charAt(a).isNumber)
							{
								numbers[counter] = newValues.charAt(a);
								char char1 = numbers.charAt(counter);
								int int1 = (int) char1;
								finalValues[counter] = int1;
								counter++;
							}
					}

			if ((x < myArray.length && x > 0) && (finalValues.length == myArray[0].length))
				{
					myArray[x] = finalValues;
				}

		}
}