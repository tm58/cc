import java.util.*;
//import org.apache.commons.lang.StringUtils;
import java.lang.*;


class luckfour{
 public static void main(String str[]){
  Scanner scan = new Scanner(System.in);
  int t = scan.nextInt();
  for(int i=0;i<t;i++){
   String a = scan.next();
//   System.out.println(a.chars().filter(num->num == Character.getNumericValue('4')).count());
   System.out.println(a.chars().filter(num->num == '4').count());
//   System.out.println(StringUtils.countMatches(a, "4"));
  }
 }
}
