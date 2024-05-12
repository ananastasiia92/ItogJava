package Picnic;

public class WordCount {
    private int totalNumberOfWords;

    public WordCount() {
        this.totalNumberOfWords = 0;
    }

    public void countWord(String word){
        totalNumberOfWords++;
    }

    public int getTotalNumberOfWords(){
        return totalNumberOfWords;
    }


}