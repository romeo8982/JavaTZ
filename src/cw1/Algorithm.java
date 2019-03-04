package cw1;

import java.util.List;

public abstract class Algorithm {
	
	Instance instance;
	
	public void AddInstance(Instance instance){
		this.instance=instance;
	};
	public abstract List<Item> GetSolution();
	
	public float BackpackValue(List<Item> list)
	{
		float value=0;
		for(int i=0;i<list.size();)
		{
			value=+list.get(i).value;
		}
		return value;
	}
}
