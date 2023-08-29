package bwzSH;

public class Huhn extends Vogel{
    private String name;
    public Huhn(String name){
        this.name = name;
        System.out.println(name+" fliegt");
    }

    @Override
    public String getFarbe() {
        return super.getFarbe();
    }
@Override
    public void fliegen() {
           System.out.println(name+" the fooking biggest");
    }

    @Override
    public String getSchnabelform() {
        return super.getSchnabelform();
    }
}
