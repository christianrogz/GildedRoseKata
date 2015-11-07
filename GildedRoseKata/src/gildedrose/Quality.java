package gildedrose;

public class Quality implements Strategy{
	@Override
	public void update(Item item) {
		if (item.getQuality() > 0) {
			if(item.getSellIn() < 1) {
				item.setQuality(item.getQuality() - 2);
			}else {
				item.setQuality(item.getQuality() - 1);
			}
			
		}
	}
	
	/*public void reduceSellIn(Item item) {
		item.setSellIn(item.getSellIn() - 1);
	}*/

}
