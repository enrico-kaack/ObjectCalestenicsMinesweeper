package datatypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bombs {
	List<Coordinate> bombs;

	
	public Bombs() {
		List<Coordinate> completeList =generateCompleteList();
		bombs = new ArrayList<Coordinate>();
		for (int i = 0; i < 10; i++) {
			addRandomMine(completeList);
		}
	}
	
	
	private void addRandomMine(List<Coordinate> completeList){
		Random random = new Random();
		int size = completeList.size();
		int randomInt = random.nextInt(size);
		Coordinate coordinate = completeList.get(randomInt);
		completeList.remove(randomInt);
		
		bombs.add(coordinate);
		
	}
	
	
	private List<Coordinate> generateCompleteList(){
		List<Coordinate> list = new ArrayList<Coordinate>();
		
		for (int i = 0; i < 100; i++) {
			int x = i%10;
			int y = (int)i/10;
			
			Coordinate coord = new Coordinate(new XCoordinate(x), new YCoordinate(y));
			list.add(coord);
			
		}
		return list;
	}
}
