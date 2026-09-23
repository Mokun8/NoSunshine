public class NoSunshine{
   public static void main(String[] args){
   aNo();
   Line("It's not warm when she's away");
   aNo();
   Line("And she's always gone too long");
   aTime();
   Break();
   Line("Wonder this time where she's gone\nWonder if she's gone to stay");
   aNo();
   Line("And this house just ain't no home");
   aTime();
   Break();
   Line("And I know, I know, I know, I know");
   iKnow();
   iKnow();
   iKnow();
   iKnow();
   Line("I know, I know");
   Break();
   Line("Hey, I ought to leave young thing alone\nBut ain't no sunshine when she's gone, whoa-whoa");
   aNo();
   Line("Only darkness every day");
   Break();
   aTime();
   aTime();
   aTime();
   aTime();
   }
   public static void aNo(){
   System.out.println("Ain't no sunshine when she's gone");
   }
   public static void aTime(){
   System.out.println("Anytime she goes away");
   }
   public static void iKnow(){
   System.out.println("I know, I know, I know, I know, I know");
   }
   public static void Break(){
   System.out.println();
   }
   public static void Line(String lyric){
   System.out.println(lyric);
   }
 }