package Type4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P37_StringConvertAndJoin {
	

		public static void main(String[] args) {


			List<String> G7 = Arrays.asList("USA", "Japan", "france", "germany", "Italy", "U.K.", "Canada");
			
			
			  String result = G7.stream()
			  .map(s->s.equalsIgnoreCase("USA") || s.equalsIgnoreCase("U.K") ?s:s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase())
			  .collect(Collectors.joining(", "));
			  
			  System.out.println(result);	
		}

	}



