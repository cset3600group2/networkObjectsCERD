package sample;

public class HostVM extends VMNode{
    private VMInterface intrfc = new VMInterface();

    HostVM(){
        this.intrfc.setInterfaceLabel("eth0");//allows only one interface, and always has this name
    }

}
