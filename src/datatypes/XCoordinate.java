package datatypes;

public class XCoordinate {
	private int x;
	
	public XCoordinate(int xCoordinate) {
		setX(xCoordinate);
	}
	
	private void setX(int x){
		if (x>10) {
			System.err.println("X Invalid " + x);
			return;
		}
		if (x<0){
			System.err.println("X Invalid " + x);
			return;
		}
		this.x =x;
	}

}
