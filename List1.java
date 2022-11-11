import java.util.*;
import java.util.stream.*;

public class List1
{
  public static void main(String args[])
  {
     List<String> names =
                Arrays.asList("Reflection","Collection","Stream");
     List<String> result = names.stream().filter(s->s.startsWith("S")).
                          collect(Collectors.toList());
    System.out.println(result);
    }
}