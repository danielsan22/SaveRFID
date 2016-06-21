package app.saverfid.com.saverfid;

import java.io.Serializable;

/**
 * Created by Daniel on 21/06/16.
 */
public class RoomModel implements Serializable{

    private int idSalon;
    private String RFID;
    private int estatus;
    private String nombre;
    private int maxPersonas;
    private int intensidad;

    public RoomModel() {
    }


    public RoomModel(int idSalon, String RFID, int estatus, String nombre, int maxPersonas, int intensidad) {
        this.idSalon = idSalon;
        this.RFID = RFID;
        this.estatus = estatus;
        this.nombre = nombre;
        this.maxPersonas = maxPersonas;
        this.intensidad = intensidad;
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

    public int getMaxPersonas() {
        return maxPersonas;
    }

    public void setMaxPersonas(int maxPersonas) {
        this.maxPersonas = maxPersonas;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }
}
