public class Motor {
    private int leistung;
    private float hubraum;

    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public float getHubraum() {
        return hubraum;
    }

    public void setHubraum(float hubraum) {
        this.hubraum = hubraum;
    }

    public Motor(){}
    public void print(){
        System.out.println("PS: "+leistung);
        System.out.println("Hubraum: "+hubraum);
    }

}
