
public class DateClass {
    private int month;
    private int day;
    private int year;

    public DateClass(int month, int day, int year) {
        if (month > 0 && month <= 12) {
            this.month = month;
        }
        this.day = day;
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        }
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        if (day > 0 && day <= 31) {
            this.day = day;
        }
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year >1000 && year <= 9999) {
            this.year = year;
        }
    }
  public void displayDate(){
      System.out.printf("%d/%d/%d",day,month,year);
  }
}
