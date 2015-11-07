package gildedrose;

public class Context {
	private Strategy strategy;

	   public Context(Strategy strategy){
	      this.strategy = strategy;
	   }

	   public void executeStrategy(Item item){
	      /*return*/ strategy.update(item);
	   }
}
