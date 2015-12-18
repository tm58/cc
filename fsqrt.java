import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

class fsqrt{
 public static void main(String args[]) throws IOException{
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  int t = Integer.parseInt(reader.readLine());
  StringBuilder op = new StringBuilder();
  for(int i=0;i<t;i++){
   int n = Integer.parseInt(reader.readLine());
   op.append((int)Math.sqrt(n) + "\n");
  }
  System.out.println(op);
 }
}
