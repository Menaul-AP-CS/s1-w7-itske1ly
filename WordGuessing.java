public class WordGuessing {
    private String wordToBeGuessed;
    private String userString = "_____";// 5 underscores
  
    //we will say that secret must be five characters
    public WordGuessing(String secret) {
  
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
      String n = word.substring(1,word.length()-1);
      return n;
    }
    public String middlePart(String word){
      String n = word.substring(word.length()-1);
      return n;
    }
    public int findLetter(String word,String letter){
      int n = word.indexOf(letter);
      return n;
    }
  }
  