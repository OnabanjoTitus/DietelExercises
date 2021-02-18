public class ComparingStrings {
private String firstString;
private String secondString;
private int comparison;
    public void setFirstString(String firstString) {
        this.firstString=firstString;
    }

    public void setSecondString(String secondString) {
        this.secondString=secondString;
    }

    public String getFirstString() {
        return firstString;
    }

    public String getSecondString() {
        return secondString;
    }

    public void compareFirstStringToSecondString() {
       comparison= firstString.compareTo(secondString);
    }

    public int getComparison() {
        return comparison;
    }
}
