package sample;

public class HubInterface extends VMInterface{
    private String subnet;

    public void setSubnet(String subnet){
        this.subnet = subnet;
    }
    public String getSubnet(){
        return this.subnet;
    }
}
