public class ListPool1 {

public void messageInListPool() { 
		System.out.println("This is a ListPool object.");
	}
	private static class MyLinkedList { 
		private static int maxNumOfLists = 100; 
		private int currentNumOfLists;
		// Top-level class // Instance method
		// (1) Static class // Static variable // Instance variable
		public static void messageInLinkedList() { 
			System.out.println("This is MyLinkedList class.");
		}
		interface ILink { 
			int MAX_NUM_OF_NODES = 2000; 
		} 
		protected static class Node implements ILink {
			private int max = MAX_NUM_OF_NODES;
			public void messageInNode() {
				// int currentLists = currentNumOfLists; int maxLists = maxNumOfLists;
				int maxNodes = max;
				// messageInListPool(); 
				messageInLinkedList();
			}
			public static void main (String[] args) { 
		int maxLists = maxNumOfLists;
				// Static method
				// (2) Static interface // (3) Static class
				// int maxNodes = max;
				messageInLinkedList();
			}
			
		} // Node
	} // MyLinkedList 
	
	
} // ListPool
