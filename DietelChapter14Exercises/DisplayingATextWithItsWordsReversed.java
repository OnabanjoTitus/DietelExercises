

public class DisplayingATextWithItsWordsReversed {
    private String sentence;
    private String[] words;
    private char[] characters;
    private StringBuilder reversed= new StringBuilder();
    public void enterSentence(String sentence) {
        try {
            this.sentence = sentence;

        words = new String[sentence.length()];}
        catch (NullPointerException nullPointerException){
            throw new  NullCannotBeReversedException("A null Object Cannot Be reversed");

        }
    }


    public String getSentence() {
        return sentence;
    }

    public String[] getWord() {
        return words;
    }

    public void splitWords() {
        words = sentence.split(" ");
    }

    public void reverseWords() {

        for (int counter = 0; counter < words.length; counter++) {
            characters= new char[words[counter].length()];
            for(int count=0;count<words[counter].length();count++){
              characters[count]=words[counter].charAt(count);

            }
          reversed.append(reverseCharacters(characters)).append(" ");
        }
        words = reversed.toString().split(" ");
    }

    private char[] reverseCharacters(char[] characterArray) {
        char[]charactersArray= new char[characterArray.length];
        int hold=0;
        for(int counter=characterArray.length-1;counter>=0;counter--){

            charactersArray[hold]=characterArray[counter];
            hold++;
        }
        return charactersArray;
    }

    public static class NullCannotBeReversedException extends NullPointerException{
        public NullCannotBeReversedException(String message) {
            super(message);


        }
    }

}