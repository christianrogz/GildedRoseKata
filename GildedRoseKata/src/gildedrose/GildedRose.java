package gildedrose;

import java.util.List;

public class GildedRose {
	
	public Quality quality = new Quality();
	public AgedBrie agedBrie = new AgedBrie();
	public Sulfuras sulfuras = new Sulfuras();
	public BackstagePasses backstagePasses = new BackstagePasses();
	public Conjured conjured = new Conjured();
	
	public void updateQuality(List<Item> items) {
		Context context = null;
		for (Item item : items) {	
			
			
			/* Singleton solo puede crear un objeto
			 * Factory crea un objeto para poder crear otros objetos
			 * Builder crea objetos apartir de objetos
			 * Adapter relacionar dos interfaces diferentes
			 * Facade llamar a un objeto para crer otro objeto con casi las mismas caracteristicas
			 * Proxy un intermediario para accesar a otro objeto
			 * Command una interfaz que encapsula comandos repetidos para distintos objetos
			 * Strategy interfaz para elejir diferentes objetos segun el cual se necesite
			 */
				
			
			if(item.getName().equals("NORMAL ITEM"))
			{
				context = new Context(new Quality());
				context.executeStrategy(item);
				//quality.update(item);
			}
			if(item.getName().equals("Aged Brie"))
			{
				context = new Context(new AgedBrie());
				context.executeStrategy(item);
				//agedBrie.update(item);
			}
			if(item.getName().equals("Sulfuras, Hand of Ragnaros"))
			{
				context = new Context(new Sulfuras());
				context.executeStrategy(item);
				//sulfuras.update(item);
			}
			if(item.getName().equals("Backstage passes to a TAFKAL80ETC concert"))
			{
				context = new Context(new BackstagePasses());
				context.executeStrategy(item);
				//backstagePasses.update(item);
			}
			if(item.getName().equals("Conjured Mana Cake"))
			{
				context = new Context(new Conjured());
				context.executeStrategy(item);
				//conjured.update(item);
			}	
			
			
			
			
			
			
			if(!item.getName().equals("Sulfuras, Hand of Ragnaros"))
			{
				if(item.getSellIn() < 1)
				{
					// reduceSellIn dos veces mas rapido
					item.setSellIn(item.getSellIn() - 2);
				} else {
					item.setSellIn(item.getSellIn() - 1);
				}
			}
			
			
			
			
			
			/*

			if (!item.getName().equals("Aged Brie") && !item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
				if (item.getQuality() > 0) {
					if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
						item.setQuality(item.getQuality() - 1);
					}
				}
			} else {
				if (item.getQuality() < 50) {
					item.setQuality(item.getQuality() + 1);

					if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
						if (item.getSellIn() < 11) {
//							if (item.getQuality() < 50) {
//								//item.setQuality(item.getQuality() + 1);								
//							}
							quality.update(item);							
						}

						if (item.getSellIn() < 6) {
//							if (item.getQuality() < 50) {
//								item.setQuality(item.getQuality() + 1);
//							}
							quality.update(item);							
						}
					}
				}
			}

//			if (item.getName() != "Sulfuras, Hand of Ragnaros") {
//				item.setSellIn(item.getSellIn() - 1);
//			}

			if (item.getSellIn() < 0) {
				if (item.getName() != "Aged Brie") {
					if (item.getName() != "Backstage passes to a TAFKAL80ETC concert") {
						if (item.getQuality() > 0) {
							if (item.getName() != "Sulfuras, Hand of Ragnaros") {
								item.setQuality(item.getQuality() - 1);
							}
						}
					} else {
						item.setQuality(item.getQuality() - item.getQuality());
					}
				} else {
					if (item.getQuality() < 50) {
						item.setQuality(item.getQuality() + 1);
					}
				}
			}
			
			*/
			
			
			
		}	
		
	}

}
