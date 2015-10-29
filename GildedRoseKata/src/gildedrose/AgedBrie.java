package gildedrose;

public class AgedBrie extends Quality{
	@Override
	public void update(Item item) {
		if (item.getQuality() < 48) {
			if(item.getSellIn() <1) {
				item.setQuality(item.getQuality() + 2);
			}else {
				item.setQuality(item.getQuality() + 1);
			}
			
		}else {
			item.setQuality(50);
		}
	}

}
