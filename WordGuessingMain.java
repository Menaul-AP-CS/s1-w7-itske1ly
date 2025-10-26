public class WordGuessingMain{
    public static void main(String[] args){
            WordGuessing myWord = new WordGuessing("interesting");

            String word = "interesting";
 
            /*System.out.println(myWord.firstLetter(word));
            System.out.println(myWord.lastLetter(word));
            System.out.println(myWord.middlePart(word));
            System.out.println(myWord.findLetter(word, "r"));
            System.out.println(myWord.replaceAt(word , 5 , "a"));
            System.out.println(myWord.hideLetter(word, "e"));*/



            WordGuessing game = new WordGuessing("apple");
            System.out.println(game.getUserString()); // should print "_____"
            game.update("p");
            System.out.println(game.getUserString()); // should print "_p___" (notice how this only updates the first "p"!)
    }
}