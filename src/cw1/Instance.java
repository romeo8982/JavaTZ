package cw1;

import java.util.ArrayList;
import java.util.List;

public class Instance {
	List<Item> Items = new ArrayList<Item>();
	int capacity;
	public void AddItem(Item item)
	{
		Items.add(item);
	};
	public void RemoveItem(int index)
	{
		Items.remove(index);
	};
	public int GetCapacity()
	{
		return capacity;
	}
	public void SetCapacity(int capacity)
	{
		this.capacity=capacity;
	}
}
