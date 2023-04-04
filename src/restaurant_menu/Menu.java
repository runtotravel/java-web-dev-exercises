package restaurant_menu;
import java.util.ArrayList;
import java.util.Date;


public class Menu {
    private Date dateUpdated;
    private ArrayList items;
    private Date mostRecent;

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public ArrayList getItems() {
        return items;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }

    public Date getMostRecent() {
        return mostRecent;
    }

    public void setMostRecent(Date mostRecent) {
        this.mostRecent = mostRecent;
    }


}
