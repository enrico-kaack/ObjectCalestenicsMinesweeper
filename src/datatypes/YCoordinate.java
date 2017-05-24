package datatypes;

public class YCoordinate {
	private int y;
	
	public YCoordinate(int yCoordinate) {
		setY(yCoordinate);
	}
	
	private void setY(int y){
		if (y>10) {
			System.err.println("Y Invalid " + y);
			return;
		}
		if (y<0){
			System.err.println("Y Invalid " + y);
			return;
		}
		this.y =y;
	}

}
