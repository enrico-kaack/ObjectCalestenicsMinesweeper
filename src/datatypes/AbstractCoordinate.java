package datatypes;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCoordinate {
	private int value;

	public AbstractCoordinate(int value) {
		this.value = value;
	}
	
	public List<Coordinate> getNeighboors(XCoordinate xCoordinate, YCoordinate yCoordinate){
		
		return getNeighboors(xCoordinate, yCoordinate);
	}
	
	private List<Coordinate> getNeighboors(AbstractCoordinate xCoordinate, AbstractCoordinate yCoordinate){
		List<Coordinate> list = new ArrayList<>();
		
		list.add(new Coordinate(new XCoordinate(xCoordinate.value-1), new YCoordinate(yCoordinate.value-1)));
		list.add(new Coordinate(new XCoordinate(xCoordinate.value), new YCoordinate(yCoordinate.value-1)));
		list.add(new Coordinate(new XCoordinate(xCoordinate.value+1), new YCoordinate(yCoordinate.value-1)));
		list.add(new Coordinate(new XCoordinate(xCoordinate.value-1), new YCoordinate(yCoordinate.value)));
		list.add(new Coordinate(new XCoordinate(xCoordinate.value+1), new YCoordinate(yCoordinate.value)));
		list.add(new Coordinate(new XCoordinate(xCoordinate.value-1), new YCoordinate(yCoordinate.value+1)));
		list.add(new Coordinate(new XCoordinate(xCoordinate.value), new YCoordinate(yCoordinate.value+1)));
		list.add(new Coordinate(new XCoordinate(xCoordinate.value+1), new YCoordinate(yCoordinate.value+1)));
		
		
		return list;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
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
		AbstractCoordinate other = (AbstractCoordinate) obj;
		if (value != other.value)
			return false;
		return true;
	}
	
	
	
	
	

}
