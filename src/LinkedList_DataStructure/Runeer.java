package LinkedList_DataStructure;

public class Runeer {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(36);
		list.insert(45);
		list.insert(12);
		
		list.insertAtStart(25);
		//list.insertAt(2,50);
		list.insertAt(0,10);// if index value is zero then consider that node is starting node
		list.deleteAt(2);
		
		list.show();

	}

}
