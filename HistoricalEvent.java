public class HistoricalEvent {
    public static final String DEFAULT_DESCRIPTION = "Historical event description default.";
    public static final Date DEFAULT_EVENT_DAY = new Date();

    private String description;
    private Date eventDay;
    

    public HistoricalEvent(String description, Date eventDay) {
        this.setAll(description, eventDay);
    }

    public HistoricalEvent() {
        this(DEFAULT_DESCRIPTION, DEFAULT_EVENT_DAY);
    }

    public HistoricalEvent(HistoricalEvent original) {
        this.setAll(original.description, original.eventDay);
    }


    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setEventDay(Date eventDay) {
        this.eventDay = new Date(eventDay);
    }

    public void setAll(String description, Date eventDay) {
        this.setEventDay(eventDay);
        this.setDescription(description);

    }

    public String getDescription() {
        return this.description;
    }

    public Date getEventDay() {
        return new Date(this.eventDay);
    }


    @Override
    public String toString() {
        return "On " + this.eventDay + ": " + this.description;
    }
    // used chatGPT for equals method
    @Override
    public boolean equals(Object other) {

        if (this == other) {
            return true; 
        }
        if (other == null || getClass() != other.getClass()) {
            return false; 
        }
    
        
        HistoricalEvent event = (HistoricalEvent) other;
    
        
        return this.description.equals(event.description) && this.eventDay.equals(event.eventDay);
    }
}
