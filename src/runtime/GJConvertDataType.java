package runtime;

/**
 * This class
 * @author
 * @since April-28-2022
 * @version 1.0
 */
public class GJConvertDataType 
{
	public Object sample;
	
	public GJConvertDataType(Object v) {
		// TODO Auto-generated constructor stub
		this.sample = v;
	}
	
	public String convertToString()
	{
		return String.valueOf(sample);
	}
	
	public Integer convertToInt()
	{
		return (Integer)sample;	
	}
	
	public Boolean convertToBoolean()
	{		
		return (Boolean)sample;
	}
	
	@Override
	public int hashCode()
	{
		return (sample == null)?0:sample.hashCode();
	}
	
	public String findType()
	{
		if(Integer.class == sample.getClass()) {
			return "Integer";			
		} else if (Boolean.class == sample.getClass()) {
			return "Boolean";			
		} else {
			return "String";
		}
	}
		
	@Override
	public boolean equals(Object xyz)
	{
		if(sample == xyz)
		{
			return true;
		}
		
		if(sample == null || xyz == null || xyz.getClass()!=sample.getClass())
		{
			return true;
		}
		GJConvertDataType other = (GJConvertDataType)xyz;
		return this.sample.equals(other.sample);
	}
}
