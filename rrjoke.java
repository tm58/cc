import java.util.*;

class rrjoke {
 public static void main(String str[]){
  Scanner scan = new Scanner(System.in);
  int t = scan.nextInt();
  for(int i=0; i<t;i++){
   int n = scan.nextInt();
   int [][] points = new int[n][3];
   for(int j=0;j<n;j++){
    points[j][0] = scan.nextInt();
    points[j][1] = scan.nextInt();
    points[j][2] = j+1;
   }
   Arrays.sort(points, new java.util.Comparator<int[]>() {
    @Override
    public int compare(int[] a, int[] b) {
     int value = Integer.valueOf(a[0]).compareTo(Integer.valueOf(b[0]));
     if (value==0){
      return Integer.valueOf(a[1]).compareTo(Integer.valueOf(b[1]));
     }
     return value; 
    }
   });
   int op =points[0][2];
   for(int j=1;j<n;j++){
    //System.out.println(op + " " + points[j][0] + " " + points[j][1] + " " + points[j][2]);
    op ^= points[j][2];
   }
   System.out.println(op);
  }
 }
}
