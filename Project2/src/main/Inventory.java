package main;
import java.util.ArrayList;

public class Inventory {
	public static ArrayList<String> inventory = new ArrayList<String>();
	
	public static void checkInv(String NAME){
		System.out.print(NAME + " has ");
		if (inventory.size() <= 1) {
			if (inventory.size() == 1) {
				System.out.println(inventory.get(0) + ".");
			}
			else {
				System.out.println("nothing...");
			}
		}
		else {
			for(int i = 0; i < inventory.size()-2; i++) {
				System.out.print(inventory.get(i) + ", ");
			}
			System.out.print(inventory.get(inventory.size() - 2) + " and " + 
			inventory.get(inventory.size() - 1));
		}
	}
	
	public static void addItemToInv(String item, String NAME){
		if(hasItem(item));
		else {
			inventory.add(item);
			System.out.println(item + " has been added to " + NAME + " /'s inventory");
		}
	}
	
	public static boolean hasItem(String item){
		for (int i = 0; i < inventory.size(); i++) {
			if (item.equals(inventory.get(i))){
				return true;
			}
		}
		return false;
	}
	
	public static void RemoveInventory(String item){
		inventory.remove(item);
	}
	public static void ClearInventory() {
		inventory.removeAll(inventory);
	}
}
