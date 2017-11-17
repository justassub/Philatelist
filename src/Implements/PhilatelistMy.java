package Implements;

import java.util.ArrayList;
import java.util.List;

import philatelist.Philatelist;
import philatelist.PostStamp;

public class PhilatelistMy implements Philatelist {
	
	List<PostStamp> psList=new ArrayList<>();

	@Override
	public void addToCollection(PostStamp arg0) {
		if (arg0==null||arg0.getName()==null||arg0.getName().isEmpty()) {
			throw new IllegalArgumentException();
		} 
		
		if(!psList.contains(arg0)){
			psList.add(arg0);
		}
	
		
		
	}

	@Override
	public double getAveragePostStampPrice() {
		double Sum=0;
		for (PostStamp ps : psList) {
			Sum=Sum+ps.getMarketPrice();
		}
		
		
		return Sum/psList.size();
	}

	@Override
	public int getNumberOfPostStampsInCollection() {
		
		
		
		return psList.size();
	}

	@Override
	public PostStamp getTheMostExpensivePostStamByMarketValue() {
		int index=0;
		double mostExpensiveStamp=0;
		for (int i=0;i<psList.size();i++) {
			if (psList.get(i).getMarketPrice()>mostExpensiveStamp) {
				mostExpensiveStamp=psList.get(i).getMarketPrice();
				index=i;
			}
			}
		
		
		return psList.get(index);
	}

}
