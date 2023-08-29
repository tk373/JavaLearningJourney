import java.sql.Array;

public class Auto {
    private String nrSchild;
    private Motor motor;



    private Rad[]reader  = new Rad[4];

    public Rad[] getReader(int index) {
        return reader;
    }



    public String getNrSchild() {
        return nrSchild;
    }

    public void setNrSchild(String nrSchild) {
        this.nrSchild = nrSchild;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void print(){}
    public Auto(){}

}
