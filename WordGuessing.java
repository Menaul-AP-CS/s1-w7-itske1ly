public class WordGuessing {
    private String wordToBeGuessed;
    private String userString = "_____";// 5 underscores
  
    //we will say that secret must be five characters
    public WordGuessing(String secret) {
      secret = wordToBeGuessed;
    }
  
    public void update(String letter) {
  
    }
  
    //public String getUserString(){
      
    //}
    public String firstLetter(String word){
      
      String n = word.substring(0,1);
      return n;
    }
    public String lastLetter(String word){
      String n = word.substring(word.length()-1);
      return n;
    }
    public String middlePart(String word){
      String n = word.substring(1 , word.length()-1);
      return n;
    }
    public int findLetter(String word,String letter){
      int n = word.indexOf(letter);
      return n;
    }
    public String replaceAt(String word, int index,String letter){
      String firstLetter = word.substring(0,index);
      String lastLetters = word.substring(index + 1);
      return firstLetter + letter + lastLetters;
    }
    public String hideLetter(String word, String letter){
      int index = word.indexOf(letter);
      String firstLetter = word.substring(0 , index);
      String lastLetters = word.substring(index + 1);
      return  firstLetter + "_" + lastLetters;
    }
    public String getUserString(){
      return userString;
    }
    public void update(String letter){
      String x=wordToBeGuessed.indexOf(letter)
    }
    /*public boolean letterExist(String letter){
      if (secretWord.indexOf(letter)!= -1){
        return true;
      }else {
        return false;
      }
    }*/
  }

  