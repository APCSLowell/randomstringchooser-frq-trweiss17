import java.util.*;
public class RandomStringChooser
{
  private String [] words;
  private int wordsLeft;

  public RandomStringChooser(String[] words2){
    words= words2;

    for(int i= 0; i< words.length; i++)
      words[i] = words2[i];

      wordsLeft= words.length;
    }

    public String getNext(){

      if(wordsLeft ==0)
        return "NONE";
      int index = (int) (Math.random()*wordsLeft);

      String chosen= words[index];
      words[index]= words[wordsLeft -1];

      wordsLeft--;

      return chosen;
    }
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
