//Question 9.13
public class Location {
	int row;
	int column;
	double maxValue;
	
	Location(int row, int column, double maxValue) { //JA: Typo
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
	
	public static Location locationLargest(double[][] a) {
		Location location1 = new Location(0, 0, a[0][0]);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > location1.maxValue){
					location1 = new Location (i, j, a[i][j]);
				}
			}
		}
		return location1;
	}
}
