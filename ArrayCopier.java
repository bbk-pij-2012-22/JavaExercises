public class ArrayCopier
{
	public static int[] copy(int[] src, int[] dst)
	{
	if (src.length == dst.length)
		{
		for (int a = 0; a <= src.length - 1;a++)
			{
			dst[a] = src[a];
			}
		}
	else if (src.length < dst.length)
		{
		int cont = 0;
		for (int a = 0; a <= src.length - 1;a++)
			{
			dst[a] = src[a];
			cont = a;
			}
		for (int b = (cont+1); b <= dst.length - 1; b++)
			{
			dst[b] = 0;
			}
		}
	else if (src.length > dst.length)
		{
		for (int a = 0; a <= dst.length - 1;a++)
			{
			dst[a] = src[a];
			}
		}
	return dst;
	}

        public static void main(String[] args) 
	{ 
	int[] source = new int[] {1,2,3,4,5};
	int[] destination =  new int[] {1,1,1,1,1};
        ArrayCopier myCopier = new ArrayCopier();
	destination = myCopier.copy(source,destination);
	System.out.println("Arrays are of equal length:");
	for (int z = 0; z <= destination.length - 1; z++)
		{
		System.out.print(destination[z]);
		}
	System.out.println();
	int[] source2 = new int[] {1,2,3,4};
	int[] destination2 =  new int[] {1,1,1,1,1};
	destination2 = myCopier.copy(source2,destination2);
	System.out.println("Source array is shorter than destination array:");
	for (int z = 0; z <= destination2.length - 1; z++)
		{
		System.out.print(destination2[z]);
		}
	System.out.println();
	int[] source3 = new int[] {9,8,7,6,5,4,3,2,1};
	int[] destination3 =  new int[] {1,1,1,1,1};
	destination3 = myCopier.copy(source3,destination3);
	System.out.println("Source array is longer than destination array:");
	for (int z = 0; z <= destination3.length - 1; z++)
		{
		System.out.print(destination3[z]);
		}
	
        }
}
