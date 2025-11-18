    
    /**
     * Write a description of class NumberDisplay here.
     *
     * @author (your name)
     * @version (a version number or a date)
     */
    public class NumberDisplay
    {
        public NumberDisplay(int rollOver) 
        {
            limit = rollOver;
            value = 0;
        }
        
        public int getValue() 
        {
            return value;
        }
        
        public void setValue(int newVal)
        {
            if (newVal >= 0 && newVal < limit) {
                value = newVal;
            }
        }
        
        public String getDisplayValue()
        {
            String display = String.valueOf(value);
            if (value < 10) {
                display = "0" + display;
            }
            return display;
        }
        
        public void increment()
        {
            value = (value + 1) % limit;
        }
        
        private int limit;
        private int value;
    }