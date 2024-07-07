package interFacee;

public class hp implements laptop {

    public void keyboard() {
        System.out.println("  hp keyboard code");
    }

    public void copy() {
        System.out.println("hp copy code ");
    }

    public void paste() {
        System.out.println("hp paste code ");
    }

    public void cut() {
        System.out.println(" hp cut code");

    }

    @Override
    public void sucessful() {

        System.out.println(" hp success code");
    }

    @Override
    public void tested() {

        System.out.println(" hp tested code");
    }

}


