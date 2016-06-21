package app.saverfid.com.saverfid;

/**
 * Created by Daniel on 21/06/16.
 */
public class RoomModel {
    private int id;
    private String name;


    public RoomModel() {
    }

    public RoomModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
