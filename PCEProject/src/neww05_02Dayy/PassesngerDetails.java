package neww05_02Dayy;
 

public class PassesngerDetails implements Comparable
{
	int passid;
	String passname;
	String passFrom;
	String passDesti;
	String medium;
	
	public PassesngerDetails(int passid, String passname,String passFrom,String passDesti,String medium)
	{
		this.passid = passid;
		this.passname = passname;
		this.passFrom = passFrom;
		this.passDesti = passDesti;
		this.medium = medium;
	}
	
	public int getPassid()
	{
		return passid;
	}
	public String getPassname()
	{
		return passname;
	}	
	public String getPassfrom()
	{
		return passFrom;
	}	
	public String getPadddesti()
	{
		return passDesti;
	}	
	public String getMedium()
	{
		return medium;
	}
	public String toString() {
		return passid+" "+passname+" "+passFrom+" "+passDesti+" "+medium;
	}

	@Override
	public int compareTo(Object o) {
		if(this.passid>((PassesngerDetails)(o)).passid){
			return 1;
		}
		else {
			return -1;
		}		
	}


}
