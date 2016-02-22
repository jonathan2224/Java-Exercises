public class PascalsTriangle {
	public static int[][] computeTriangle(int input) {
		if (input<0) {
			throw new IllegalArgumentException();
		}
		
		int[][] result = new int[input][];
		int i = -1;
		while(i<input-1) {
			if (i==-1)
				result[i+1] = new int[]{1};
			else
				result[i+1] = (buildRow(result[i]));
			i++;
		}
		return result;
		
	}
	
	private static int[] buildRow(int[] prevRow) {
		int[] result = new int[prevRow.length+1];
		
		for (int i = 0; i<=prevRow.length;i++) {
			if (i==0) 
				result[i]=1;
			else if (i==prevRow.length)
				result[i]=1;
			else
				result[i]=prevRow[i]+prevRow[i-1];
		}
		return result;
	}
	
	public static boolean isTriangle(int[][] testTri) {
		int[][] compTri = computeTriangle(testTri.length);
		boolean result = true;
		
		for(int x=0;x<testTri.length;x++) {
			for (int y=0;y<testTri[x].length;y++) {
				if(compTri[x][y]!=testTri[x][y]) {
					result = false;
				}
			}
		}
		
		return result;
	}
}
