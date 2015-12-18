import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class cielrcpt{
 public static void main(String args[]) throws IOException{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int t = Integer.parseInt(br.readLine());
  StringBuilder op = new StringBuilder();
  for(int i=0;i<t;i++){
   int n = Integer.parseInt(br.readLine());
   String s = Integer.toBinaryString(n);
   String lsb,hsb;
   if(s.length()>11){
   	lsb = s.substring(s.length()-11, s.length()); 
    hsb = s.substring(0, s.length()-11); 
   }
   else {
   	lsb = s;
   	hsb = "0";
   }
   int hValue = Integer.parseInt(hsb, 2);
   int lValue = (int)lsb.chars().filter(num->num == '1').count(); 
   op.append(hValue + lValue + "\n");
  }
  System.out.println(op);
 }
}
