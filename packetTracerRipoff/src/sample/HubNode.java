package sample;

import javafx.util.Pair;

import java.util.List;

public class HubNode {
    private String name;
    private List<VMandIntrfcPair> vMandIntrfcPair;  //holds all of the connected VMNodes and interfaces to simplify config and save file parsing (e.g inf : Gemini.eth0, Nfs.eth0, Intfw.eth1)
    private String subnet; //the network address itself
    private String netmask; //the network subnet
    HubNode(){};//empty constructor

    /*inf : Gemini.eth0, Nfs.eth0, Intfw.eth1
    subnet : "192.168.10.0"
    netmask : "255.255.255.0"*/


    public void connectInterface(FirewallVM vmNode, VMInterface vmInterface){//Applies subnet checking, called by the class itself, not by an instance
        //called by event handler when a cable is clicked, followed by a click on the canvas objects
            boolean subnetMatch = true;//TO BE CHANGED
            if(subnetMatch) {
                vmInterface.setConnected();
                this.vMandIntrfcPair.add(new VMandIntrfcPair(vmNode, vmInterface));
            }
            else{
                System.out.println("Interfaces are not on the same subnet");
            }
    }

    public void connectInterface(HostVM vmNode, VMInterface vmInterface){//Applies subnet checking, called by the class itself, not by an instance
        //called by event handler when a cable is clicked, followed by a click on the canvas objects
            boolean subnetMatch = true;//TO BE CHANGED
            if(subnetMatch) {
                vmInterface.setConnected();
                this.vMandIntrfcPair.add(new VMandIntrfcPair(vmNode, vmInterface));
            }
            else{
                System.out.println("Interfaces are not on the same subnet");
            }

    }

    public List<VMandIntrfcPair> getVMandIntrfcPairs(){
        return this.vMandIntrfcPair;
    }

    public void disconnectInterface(VMandIntrfcPair vMandIntrfcPair){

        //remove from the list at its given indice, if it doesn't exist, throw an exception
    }



}
