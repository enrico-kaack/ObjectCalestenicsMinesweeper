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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + y;
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
		YCoordinate other = (YCoordinate) obj;
		if (y != other.y)
			return false;
		return true;
	}
	
	

}
