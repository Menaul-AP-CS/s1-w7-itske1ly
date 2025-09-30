public class WordGuessingMain{
    public static void main(String[] args){
        WordGuessing myWord = new WordGuessing("interesting");
        
        //first method
        String x = myWord.firstLetter("KELLY");
        System.out.println(x);
        
        //second method
        String x1 = myWord.lastLetter("dance");
        System.out.println(x1);

        //third method
        String x3 = myWord.middlePart("perfect");
        System.out.println(x3);

        //fourth method
        int x4 = myWord.findLetter("science", "n");
        System.out.println(x4);

      
      
      
      
      
      
      
        //PART D TESTING
       /*  Wordguessing game = new Wordguessing("kick");
        System.out.println(game.getUserString()); //should print "____"
        game.update("p");
        System.out.println(game.getUserString()); // should print "_pp__"

*/

    }
}