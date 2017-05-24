package datatypes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VisibleFields {
	private Set<Coordinate> visibleFields = new HashSet<Coordinate>();
	
	public VisibleFields() {
	}
	
	public void addVisibleField(Coordinate inputCoordinate, List<Bombs> bombs){
		visibleFields.add(inputCoordinate);
		
		inputCoordinate.getBombCount(bombs);
	}

}
