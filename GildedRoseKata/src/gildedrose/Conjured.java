package gildedrose;

public class Conjured implements Strategy{
	@Override
	public void update(Item item) {		
		if (item.getSellIn() < 1) {
			if(item.getQuality() < 4) {
				item.setQuality(0);
			}else {
				item.setQuality(item.getQuality() - 4);
			}			
		}else {
			if (item.getQuality() > 1) {
				item.setQuality(item.getQuality() - 2);
			}else {			
				item.setQuality(0);
			}
		}
	}
}
