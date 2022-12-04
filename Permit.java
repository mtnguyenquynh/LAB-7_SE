import java.io.*;

public class Permit {
    private String permitNr;
    private String regNr;
    private Employee owner;
    private String area;

    public Permit(String permitNr, String regNr, String area, Employee owner) {
        this.permitNr = permitNr;
        this.regNr = regNr;
        this.area = area;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Permit{" +
                "permitNr='" + permitNr + '\'' +
                ", regNr='" + regNr + '\'' +
                ", owner=" + owner +
                '}';
    }

    public String getPermitNr() {
        return permitNr;
    }

    public String getRegNr() {
        return regNr;
    }

    public Employee getOwner() {
        return owner;
    }
}
