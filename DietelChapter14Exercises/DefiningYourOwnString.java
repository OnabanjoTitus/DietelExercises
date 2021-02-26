public class DefiningYourOwnString {
private String string;
private char [] chars;
    public void setString(String string) {
        this.string=string;
    }

    public String getString() {
        return string;
    }


    public int getIndexOfString(String find) {
        int number=0;
        try{stringConverter();
        number=getTheFirstIndexOfTheWord(chars,find);}catch (NullPointerException nullPointerException){
            throw new NoIndexForNull("There is no index for null");
        }
        return number;
    }

    private void stringConverter(){
        chars= new char[string.length()];
        for(int counter=0;counter<string.length();counter++){
            chars[counter]=string.charAt(counter);
        }
    }
    private int getTheFirstIndexOfTheWord(char[] chars, String find) {
        int number=0;
       char item=find.charAt(0);
        for(int counter=0;counter<chars.length;counter++){
            if(item==chars[counter]){
                number=counter;
                break;
            }
        }
        return number;
    }

    public int getTheLastIndexOfString(String find) {
        int number=0;
       try{ stringConverter();
        number=getTheLastIndex(chars,find);}
       catch (NullPointerException nullPointerException){
           throw new NoIndexForNull("There is no index for null");
       }
        return number;
    }

    private int getTheLastIndex(char[] chars, String find) {
        int number=0;
        char item=find.charAt(0);
        for(int counter=0;counter<chars.length;counter++){
            if(item==chars[counter]){
                number=counter;
            }
        }
        return number;
    }
    public static class NoIndexForNull extends NullPointerException {
        public NoIndexForNull(String message){
            super(message);
        }
    }
}
