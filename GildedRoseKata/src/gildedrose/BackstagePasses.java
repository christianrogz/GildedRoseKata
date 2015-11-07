package gildedrose;

public class BackstagePasses implements Strategy{
	@Override
	public void update(Item item) {
		if (item.getSellIn() < 11) {
			if (item.getQuality() < 50) {
				item.setQuality(item.getQuality() + 1);								
			}										
		}
		if (item.getSellIn() < 6) {
			if (item.getQuality() < 50) {
				item.setQuality(item.getQuality() + 1);								
			}										
		}
		if (item.getSellIn() > 10) {
			if (item.getQuality() < 50) {
				item.setQuality(item.getQuality() + 1);
			}
		}else {
			if (item.getQuality() < 50) {
				item.setQuality(item.getQuality() + 1);
			}
		}		
		if (item.getSellIn() < 1) {
			item.setQuality(0);
		}
	}
}
