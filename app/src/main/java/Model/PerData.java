package Model;

/**
 * Created by Priyanka on 1/3/2017.
 */

public class PerData {
    private String Name= "", PerId= "";

    public PerData() {
    }

    public PerData(String name, String perId) {
        this.Name = name;
        this.PerId = perId;
    }

    public String getName() {
        return Name;
    }

    public String getPerId() {
        return PerId;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setPerId(String perId) {
        this.PerId = perId;
    }
}
