import java.util.*;
public class HangmanGame
{
   Scanner input = new Scanner(System.in);
   public static void main(String[] args)
   {
   String word=enterWord();
   }
   public static String enterWord()
   {
      System.out.println("Enter your word, changing letters into underscores, leave spaces: ");
      String word=input.nextLine();
      while(breakSearch(word))
      {
         System.out.println("Try again: ");
         word=input.nextLine();
      }
      return word;
   }
   private boolean breakSearch(String a)
   {
      for(int i=0;i<a.length();i++)
         if(a.charAt(i)!=' '||a.charAt(i)!='_')
            return true;
      return false;
   }
}