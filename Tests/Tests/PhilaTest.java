package Tests;

import Implements.PhilatelistMy;
import philatelist.Philatelist;
import philatelist.PhilatelistBaseTest;

public class PhilaTest extends PhilatelistBaseTest{

	@Override
	protected Philatelist getPhilatelist() {
		// TODO Auto-generated method stub
		return new PhilatelistMy();
	}

}
