package sample;

import java.util.List;

public class HubNode {
    private String name;
    private List<HubInterface> inf; //add hostnames a dot delimeter as cables are connected (e.g inf : Gemini.eth0, Nfs.eth0, Intfw.eth1)
    private String subnet; //the network address itself
    private String netmask; //the network subnet
    private String intrfc;
    HubNode(){};//empty constructor

    /*inf : Gemini.eth0, Nfs.eth0, Intfw.eth1
    subnet : "192.168.10.0"
    netmask : "255.255.255.0"*/

}
