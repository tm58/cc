import java.util.*;

class trisq{
 public static void main(String s[]){
  Scanner scan = new Scanner(System.in);
  int t = scan.nextInt();
  for(int i=0;i<t;i++){
   int b = scan.nextInt();
   int num = 0;
    while(b>3){
     num += ((b-2)/2)>0?((b-2)/2):0;
     b -= 2;
    }
   System.out.println(num);
  }
 }
}

