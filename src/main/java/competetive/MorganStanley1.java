package competetive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * * Complete the 'findSubsequence' function below.
 *      *
 *      * The function is expected to return an INTEGER_ARRAY.
 *      * The function accepts INTEGER_ARRAY arr as parameter.
 *
 *
 *Input (stdin)
 * 4
 * 1
 * 1
 * 1
 * 3
 * Your Output (stdout)
 * 1
 * 1
 * Expected Output
 * 1
 * 1
 */
public class MorganStanley1 {


    public static void main(String[] args) {
      try {
          //Stream w = Stream.of("one", "two", "three");
//          AtomicInteger a= new AtomicInteger();
//          a.decrementAndGet();

          final Pattern p= Pattern.compile(".com",Pattern.MULTILINE);
          final Matcher m = p.matcher("www.sdss.com");

          HashMap<String,Integer> countIp= new HashMap<>();
          while(m.find()){
              String ip= m.group(1);
              if(countIp.containsKey(ip))
                countIp.put(ip,countIp.get(ip)+1);
              else
                  countIp.put(ip,1);
          }

          System.out.println(countIp.size());
      }catch (Exception e){
          System.out.println(e.getCause());
      }

    }
}
