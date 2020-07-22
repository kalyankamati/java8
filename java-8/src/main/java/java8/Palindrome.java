package java8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Palindrome {
	public static void main(String args[])
	{
	List<String> strList= Arrays.asList("aba","String","tomato","add","anand","anna","bab");
	List<String> list2 = pal(strList);
	for(String i:list2)
	
		System.out.println(i);
		
}
	static List<String> pal(List<String> l3)
	{
		List<String> l4=new ArrayList<String>();
		for(String i:l3)
		{
			String t=i.replaceAll("\\s+","").toLowerCase();
			if(IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!=t.charAt(t.length()-j-1)))
				l4.add(i);
		}
		return l4;
		
	}

}
