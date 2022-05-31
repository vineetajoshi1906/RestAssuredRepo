package javaprogam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams {

	public static void main(String[] args) {
      List <String> names=new ArrayList<String>();
      names.add("Vineeta");
      names.add("Sucheta");
      names.add("Anjali");
      names.add("Vinod");
      names.add("vivaan");
      names.add("Vihaan");
      
      List<Integer>alist=Arrays.asList(2,5,7,8,4,5,2,3);
      alist.stream().distinct().forEach(s->System.out.print(s+","));
      alist.stream().distinct().sorted().limit(3).forEach(s->System.out.print(s));
      List names.stream().filter(s->s.startsWith("V")).map(s->s.toUpperCase()).collect(Collectors.toList());

	}

}
