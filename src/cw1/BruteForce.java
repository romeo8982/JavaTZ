package cw1;

import java.util.List;

public class BruteForce extends Algorithm {

	@Override
	public List<Item> GetSolution() {
		List<Item> opt = null;
		
		int size=instance.GetCapacity();
		
		for(int i=0;i<=2<<size;i++)
		{
			for(int j=1;j<size;j++)
			{
				if((2<<j&i)==0)
				{
					if(size+instance.Items.get(i).waight>size)
					{
						opt.add(instance.Items.get(i));
					}
				}
			}
		}
		return opt;
	}

}
