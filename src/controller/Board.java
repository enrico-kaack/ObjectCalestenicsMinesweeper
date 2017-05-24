package controller;

import datatypes.Bombs;
import datatypes.VisibleFields;

public class Board {
	private final Bombs bombs = new Bombs();
	private final VisibleFields visibleFields = new VisibleFields();

	
	public Board() {

	}
	
	public void lost(){
		System.out.println("You hit a bomb.");
		System.exit(0);
	}

}
