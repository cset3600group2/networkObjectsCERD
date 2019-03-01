package sample;


import java.util.List;

public class FirewallVM extends VMNode {

    private List<VMInterface> intrfces;
    FirewallVM(OSWINLIN os){
        super(os);
    }

    public void setIntrfc(){
        // this.intrfc = "192.168.0.0"; TO BE CHANGED based on gui action event
        return;
    }
    public void setName(){
        // this.name = "windowsorlinuxHost"; TO BE CHANGED based on gui action event
        return;
    }
    public void addIntrfc(String ipAddress){
        //this.intrfces.add
    }




}
