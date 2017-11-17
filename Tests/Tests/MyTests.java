package Tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Implements.PhilatelistMy;
import philatelist.PostStamp;

public class MyTests {
	
	List<PostStamp> psListas=new ArrayList<>();
	PhilatelistMy mano = new PhilatelistMy();

	
	
	
	@Test
	//List Contains PostStamp
	public void psListAdds() {
		PostStamp myP= new PostStamp("Preke",100,150);
		mano.addToCollection(myP);
		
		assertEquals(1,mano.getNumberOfPostStampsInCollection());
		
	}
	

	
	@Test
	public void calculatesCorrectListSize() {
		PostStamp my1 = new PostStamp("vienas", 10, 10);
		PostStamp my2 = new PostStamp("Du", 20, 20);
		PostStamp my3 = new PostStamp("Trys", 30, 30);
		mano.addToCollection(my1);
		mano.addToCollection(my2);
		mano.addToCollection(my3);
		assertEquals(3,mano.getNumberOfPostStampsInCollection());
		
	}
	
	@Test
	public void averagePrice() {
		PostStamp my1 = new PostStamp("vienas", 10, 10);
		PostStamp my2 = new PostStamp("Du", 20, 20);
		PostStamp my3 = new PostStamp("Trys", 30, 30);
		
		mano.addToCollection(my3);
		mano.addToCollection(my1);
		mano.addToCollection(my2);
		
		assertEquals(20,mano.getAveragePostStampPrice(),0.01);
	}
	
	@Test 
	public void doesNotAddWithSameInfo() {
		PostStamp my1 = new PostStamp("vienas", 10, 10);
		PostStamp my2 = new PostStamp("Du", 20, 20);
		PostStamp my3 = new PostStamp("Trys", 30, 30);
		PostStamp my4 = new PostStamp("vienas",10,10);
		
		mano.addToCollection(my3);
		mano.addToCollection(my1);
		mano.addToCollection(my2);
		mano.addToCollection(my4);
		
		
		assertEquals(3,mano.getNumberOfPostStampsInCollection());
		assertEquals(20,mano.getAveragePostStampPrice(),0.01);
		
		
	}
	
	@Test 
	public void mostExpensive() {
		PostStamp my1 = new PostStamp("vienas", 10, 10);
		PostStamp my2 = new PostStamp("Du", 20, 20);
		PostStamp my3 = new PostStamp("Trys", 30, 30);
		PostStamp my4 = new PostStamp("vienas",10,10);
		
		mano.addToCollection(my3);
		mano.addToCollection(my1);
		mano.addToCollection(my2);
		mano.addToCollection(my4);
		
		
		
		assertEquals(my3,mano.getTheMostExpensivePostStamByMarketValue());
		
		
	}
	

	
	
	
	

}
