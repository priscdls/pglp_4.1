package Priscille_DAOULAS.pglp_4_1;

import java.util.ArrayList;

public class CompositePersonnel implements InterfacePersonnel {
	private ArrayList<InterfacePersonnel> list = new ArrayList<InterfacePersonnel>();
	
	public void print() {
		for(InterfacePersonnel intP : list) {
			intP.print();
		}
	}
	
	public void add(InterfacePersonnel intP) {
		list.add(intP);
	}
	
	public void remove(InterfacePersonnel intP) {
		list.remove(intP);
	}
}
