class Matrix
{
	int[][] myArray;
	public Matrix(int x, int y)
		{
		this.myArray = new int[x][y];
		}

	public void setElement(int x, int y, int z)
		{
		if (myArray.length - 1 <= x && myArray.length - 1 > 0) && (myArray[0].length - 1 <= y && myArray[0].length - 1 > 0)
			{
				myArray[x][y] = z;
			}
}