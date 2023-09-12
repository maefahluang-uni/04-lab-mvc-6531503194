package th.mfu;

import java.util.Date;

public class Concert {

    //TODO: add attributes
    private int id ;
    private String title;
    private String performer;
    private Date date;
    private String description;

    public Concert() {
    }
    public Concert(String title, String description) {
        //TODO: set attributes
        this.title = title;
        this.description = description;

    }
 
    //TODO: add getters and setters for all attributes
    // You can use Source action/generate getter setter function
    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for performer
    public String getPerformer() {
        return performer;
    }

    // Setter for performer
    public void setPerformer(String performer) {
        this.performer = performer;
    }
     // Getter for date
     public Date getDate() {
        return date;
    }

    // Setter for date
    public void setDate(Date date) {
        this.date = date;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

}
