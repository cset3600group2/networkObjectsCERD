package sample;

public class HostVM extends VMNode{
    private String intrfc;
    HostVM(OSWINLIN os){
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
}