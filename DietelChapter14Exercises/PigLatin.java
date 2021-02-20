import java.sql.Array;
import java.util.Arrays;

public class PigLatin {
    StringBuilder sentenceConverter;
    String sentence;
    String[]words;

    public void enterSentence(String sentence) {
        this.sentence=sentence;
    }


    public String getSentence() {
        return sentence;
    }
    public void splitSentence() {
        words=sentence.split(" ");
    }

    public void convertSentenceToPigLatin() {

    for(int counter=0; counter<words.length;counter++){
        sentenceConverter= new StringBuilder(words[counter]);
        sentenceConverter.append(words[counter].charAt(0)).append("ay");
        sentenceConverter.deleteCharAt(0);
        words[counter]=sentenceConverter.toString();
    }
    }
    public void printLatinWord(){
      splitSentence();
      convertSentenceToPigLatin();
     StringBuilder finalSentence= new StringBuilder();
     for(int counter=0;counter<words.length;counter++){
         finalSentence.append(words[counter]).append(" ");
     }
        System.out.println(finalSentence);
    }

    public String[] getSplitWord() {
        return words;
    }
}
