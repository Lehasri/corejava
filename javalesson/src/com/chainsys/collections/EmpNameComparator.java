package com.chainsys.collections;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<EmpComparable> {

	@Override
	public int compare(EmpComparable o1, EmpComparable o2) {
		// TODO Auto-generated method stub
		int result=0;
		result=o1.Name.compareTo(o2.Name);
		return result;
	}

}
