package neww05_02Dayy;

import java.util.Comparator;

public class SortComplexObject implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int res = (((PassesngerDetails)(o1)).passname).compareTo((((PassesngerDetails)(o2)).passname));
		if(res>0)
		{
			return 1;
		}
		else {
			return -1;
		}
	}

}
