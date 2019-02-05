public class Inventoryimp implements Inventory{
	private class Storage{

		private int rows = 5;
		private int coloums = 5;
		private int hotbarSize = 5;

		private int size;

		private Object[] itemHolder;

		private boolean invenFull = false;

		public Storage(int rows, int coloums, int hotbarSize){
			this.rows = rows;
			this.coloums = coloums;
			this.hotbarSize = hotbarSize;
			initialize();
		}

		public Storage(){
			initialize();
		}

		private void initialize(){
			size = rows*coloums + hotbarSize;
			itemHolder = new Object[size];
		}

		public void add(Object item){
			
		}


		private boolean slotOccupied(int slotNumber){
			return (itemHolder[slotNumber] !=  null);
		}
	}

	public void Inventory(){
		Storage inven = new Storage();
	}

	public void Inventory(int rows, int coloums, int hotbarSize){
		Storage inven = new Storage(rows, coloums, hotbarSize);
	}
}