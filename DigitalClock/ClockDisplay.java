
/**
 * Write a description of class ClockDisplay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    public ClockDisplay()
    {
        hour = new NumberDisplay(24);
        minute = new NumberDisplay(60);
        updateDisplay();
    }
    
    public ClockDisplay(int setHour, int setMinute)
    {
        hour = new NumberDisplay(24);
        minute = new NumberDisplay(60);
        setTime(setHour, setMinute);
   }

    public void timeTick()
    {
        minute.increment();
        if (minute.getValue() == 0) {
            hour.increment();
        }
        updateDisplay();
    }
    
    public void setTime(int setHour, int setMinute)
    {
        hour.setValue(setHour);
        minute.setValue(setMinute);
        updateDisplay();
    }
    
    public String getTime()
    {
        return displayString;
    }
    
    private void updateDisplay()
    {
        displayString = hour.getDisplayValue() + ":" + minute.getDisplayValue();
    }
    
    private NumberDisplay hour;
    private NumberDisplay minute;
    private String displayString;
}