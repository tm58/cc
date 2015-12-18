import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

class snape{
 public static void main(String args[]) throws IOException{
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  int t = Integer.parseInt(reader.readLine());
  StringBuilder op = new StringBuilder();
  String ip[];
  for(int i=0;i<t;i++){
   ip = reader.readLine().split(" ");
   int b = Integer.parseInt(ip[0]);
   int ls = Integer.parseInt(ip[1]);
   double max = Math.sqrt(b*b + ls*ls);
   double min = Math.sqrt(ls*ls - b*b);
   op.append(min+" " + max +"\n");
  }
  System.out.println(op);
 }
}
