public class RevisedHistoricalEvent extends HistoricalEvent {
    

    public static final String DEFAULT_REVISED_DESCRIPTION = "Revised historical event description deafult.";
    public static final String DEFAULT_CITATION = "Academic resource/citation.";

    private String revisedDescription;
    private String citation; 



    public RevisedHistoricalEvent(String description, Date eventDay, String revisedDescription, String citation) {
        super(description, eventDay);
        this.setRevisedDescription(revisedDescription);
        this.setCitation(citation);
    }

    public RevisedHistoricalEvent() {
        super(); 
        this.revisedDescription = DEFAULT_REVISED_DESCRIPTION;
        this.citation = DEFAULT_CITATION;
    }

    public RevisedHistoricalEvent(RevisedHistoricalEvent other) {
        super(other.getDescription(), other.getEventDay()); 
        this.revisedDescription = other.revisedDescription;
        this.citation = other.citation;
    }




    @Override 
    public String toString() {
        return "The following \"history\" was told for many years:\n\n" +
                super.toString()
                + "\n\n\nBy correcting history, not just rewriting it, we are revising it to embark on the process of righting a wrong. \nHere is the revised history:\n"
                + this.revisedDescription + "\n\nSource: " + this.citation;
    }

    public String getRevisedDescription() {
        return revisedDescription;
    }

    public void setRevisedDescription(String revisedDescription) {
        this.revisedDescription = revisedDescription;
    }

    public String getCitation() {
        return citation;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }

    public void setAll(String description, Date eventDay, String revisedDescription, String citation) {
        super.setAll(description, eventDay);
        this.setRevisedDescription(revisedDescription);
        this.setCitation(citation);
    }
    @Override
    public boolean equals(Object other) {
        RevisedHistoricalEvent otherEvent = (RevisedHistoricalEvent) other;
        return super.equals(other) && this.revisedDescription.equals(otherEvent.revisedDescription)
                && this.citation.equals(otherEvent.citation);
    }
    
    public void teach() {
        System.out.println(this.toString());
    }

}
