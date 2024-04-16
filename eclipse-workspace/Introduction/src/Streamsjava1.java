import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Streamsjava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names= new ArrayList<String>();
		names.add("Alekya");
		names.add("ram");
		names.add("Ashrith");
		names.add("Alok");
		names.add("suprith");
		names.add("Adam");
		
		List<String> name=Arrays.asList("vinod","alad","vad","komad","prithesh");
		name.stream().filter(s->s.endsWith("d")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//sorting the order list
		List<String> names1= Arrays.asList("akash","manoj","arpith","mahakal","nalesh","darpan");
		names1.stream().sorted().forEach(s->System.out.println(s));
		// string concatenation syntax
		List<String> collection = Stream.concat(name.stream(), names1.stream()).sorted().collect(Collectors.toList());
		System.out.println(collection);
		//unique numbers
		List<Integer> values=Arrays.asList(1,22,22,2,2,4,6,8,9,9,7,7,5,5);
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
		//to print only 3rd index from the result then use collect
		List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
	    System.out.println(li.get(1));
		

	}
	

}
