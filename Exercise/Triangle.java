public class ClassNameHere{
public static void triangle(int size){
         int x = 1;
      while (x <= size) {
         int i = 1;
            while ( i <= x ){
            System.out.print("*");
            i = i+1;
            }
         System.out.println("");
         x = x+1;
      }
}






public static void main(String[] args) {
      triangle(10);
   }
}

