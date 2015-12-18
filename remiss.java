import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class remiss{
 public static void main(String args[]) throws IOException{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int t = Integer.parseInt(br.readLine());
  StringBuilder op = new StringBuilder();
  String ip[];
  for(int i=0;i<t;i++){
   ip = br.readLine().split(" ");
   int a = Integer.parseInt(ip[0]);
   int b = Integer.parseInt(ip[1]);
   if(a>b)
    op.append(a +" " + (a+b) + "\n");
   else
    op.append(b +" " + (a+b) + "\n");
  }
  System.out.println(op);
 }
}
