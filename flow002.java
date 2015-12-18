import java.util.Scanner;

class flow002{
 public static void main(String str[]){
  Scanner scan = new Scanner(System.in);
  int t = scan.nextInt();
  for(int i=0;i<t;i++){
   System.out.println(scan.nextInt()%scan.nextInt());  
  }
 }
}
