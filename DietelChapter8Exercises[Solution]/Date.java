import java.time.Year;

public class Date {
    private int Month;
    private int day;
    private int year;
    private String wordMonth;
    private int allYearDay;
    private String wordDate="";
    private String getLongDate="";

    public Date(int month, int day, int year) {
        Month = month;
        this.day = day;
        this.year = year;
        setLocalDate(Month,day,year);
        setAllDateTime(day,month,year);
        String Monthly=String.format("%d",Month);
        setInWordDate(Monthly,day,year);
    }
    public Date(String wordMonth,int day,int year) {
        this.day = day;
        this.year = year;
        this.wordMonth = wordMonth;
        setInWordDate(wordMonth,day,year);
    }
    public Date(int allYearDay,int year) {
        this.year = year;
        this.allYearDay = allYearDay;
        setLongDate(allYearDay,year);
    }
    public String getLongDate(){
        return getLongDate;
    }

    private String setLongDate(int allYearDay, int year) {
        return getLongDate+=String.format("%d%5d",allYearDay,year);
    }

    public String getAllTheDates(){
      String total_dates="";
        total_dates+=getInWordDate();
        total_dates+=getGetLongDate();
        total_dates+=getLocalDate();
      return total_dates;
    }
    private String setLocalDate(int day,int Month,int year){
        String date="";
        date+=String.format("%d/%d/%d%n",day,Month,year);
        return date;

    }

  public String getLocalDate(){
      return setLocalDate(Month,day,year);
    }


    private String setInWordDate(String Month,int day, int year){
        String wordMonth="";
        switch (Month){
            case "1"->{wordMonth+="January";
            }
            case "2"->{ wordMonth+="February";
            }
            case "3"->{wordMonth+="March";
            }
            case "4"->{wordMonth+="April";
            }
            case  "5"->{wordMonth+="May";
            }
            case "6"->{wordMonth+="June";
            }
            case "7"->{wordMonth+="July";
            }
            case "8"->{wordMonth+="August";
            }
            case "9"->{wordMonth+="September";
            }
            case "10"->{wordMonth+="October";
            }
            case "11"->{wordMonth+="November";
            }
            case "12"->{wordMonth+="December";
            }
        }
        return wordDate+=String.format("%n%s%2d,%5d%n",wordMonth,day,year);
    }
    public String getInWordDate(){
        return wordDate;
    }


    private String setAllDateTime(int day,int Month,int year){

        switch ((Month-1)){
            case 12: day+=31;
            case 11: day+=30;
            case 10: day+=31;
            case 9: day+=30;
            case 8: day+=31;
            case 7: day+=31;
            case 6: day+=30;
            case 5: day+=31;
            case 4: day+=30;
            case 3: day+=31;
            case 2: day+=28;
            case 1: day+=31;
        }
        return getLongDate+=String.format("%d%d%n",day,year);
    }

    private String getGetLongDate(){
        return getLongDate;
    }
}
