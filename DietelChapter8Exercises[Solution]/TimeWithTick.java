import java.util.InputMismatchException;

public class TimeWithTick {
    private int seconds;
    private int minute;
    private int hour;

    public TimeWithTick() {
    }

    public TimeWithTick(int seconds, int minute, int hour) {
        if(seconds>=0&&seconds<=60){
        this.seconds = seconds;}
        if(minute>=0&&minute<=60){
        this.minute = minute;}
        if(hour>=0&&hour<=24){ this.hour = hour;}
    }

    public void setSeconds(int seconds) {
        try {
            if(seconds>=0&&seconds<=60){
                this.seconds = seconds;}
        }catch (InputMismatchException inputMismatchException){
            System.err.println("Invalid input enter a number");
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setMinutes(int minute) {
        try {
            if(minute>=0&&minute<=60){
                this.minute = minute;}
        }catch (InputMismatchException inputMismatchException){
            System.err.println("Invalid input enter a number");
        }
    }

    public int getMinutes() {
        return minute;
    }

    public void setHour(int hour) {
       try {
           if(hour>=0&&hour<=24){
               this.hour = hour;}
       }catch (InputMismatchException inputMismatchException){
           System.err.println("Invalid input enter a number");
       }
    }

    public int getHour() {
        return hour;
    }

    public void tickSeconds() {
        if(seconds==60){
            intoTheNextMinute();
        }else{
        seconds+=1;}
    }

    private void intoTheNextMinute() {
        minute+=1;
        seconds=0;
    }

    public void incrementMinutes() {
        if(minute==60){
            intoTheNextHour();
        }else{
        minute+=1;}
    }

    private void intoTheNextHour() {
        hour+=1;
        minute=0;
    }

    public void incrementHour() {
        if(hour==24){
            intoNextDay();
        }else{
            hour+=1;
        }
        
    }

    private void intoNextDay() {
        hour=0;
    }

    public int getHourInAmAndPm() {
        int timeInHour = (hour>12?hour%12:hour);
        return timeInHour;
    }
    private String getHourInAmandPmSpecifier(){
        String format=(hour>12?"Pm":"Am");
        return format;
    }

    @Override
    public String toString() {
        return String.format("The time is %d:%d:%d%s",getHourInAmAndPm(),getMinutes(),getSeconds(),getHourInAmandPmSpecifier());
    }
}
