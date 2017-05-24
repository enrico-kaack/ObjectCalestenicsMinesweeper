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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		XCoordinate other = (XCoordinate) obj;
		if (x != other.x)
			return false;
		return true;
	}

	
	
}
