package app.saverfid.com.saverfid;

/**
 * Created by Daniel on 21/06/16.
 */
public class RoomModel {

    private int idSalon;
    private String RFID;
    private int estatus;
    private String nombre;

    public RoomModel() {
    }


    public RoomModel(int idSalon, String RFID, int estatus, String nombre) {
        this.idSalon = idSalon;
        this.RFID = RFID;
        this.estatus = estatus;
        this.nombre = nombre;
    }

    public int getIdSalon() {
        return idSalon;
    }

    public void setIdSalon(int idSalon) {
        this.idSalon = idSalon;
    }

    public String getRFID() {
        return RFID;
    }

    public void setRFID(String RFID) {
        this.RFID = RFID;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
