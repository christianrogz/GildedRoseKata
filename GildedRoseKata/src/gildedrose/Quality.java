package gildedrose;

public class Quality {
	Item item;
	public void update() {
		if (item.getQuality() < 50) {
			item.setQuality(item.getQuality() + 1);
		}
	}

}
