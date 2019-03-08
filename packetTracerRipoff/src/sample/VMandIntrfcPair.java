package sample;


public class VMandIntrfcPair{
    private HostVM hostVmNode;
    private VMInterface intrfce;
    private FirewallVM fwVmNode;

    public VMandIntrfcPair(HostVM node, VMInterface intrfce){
        this.hostVmNode = node;
        this.intrfce = intrfce;
    }
    public VMandIntrfcPair(FirewallVM node, VMInterface intrfce){
        this.fwVmNode = node;
        this.intrfce = intrfce;
    }
    public HostVM getHostVmNode(){ return hostVmNode; }
    public FirewallVM getFwVmNode(){ return fwVmNode; }
    public VMInterface getIntrfce(){ return intrfce; }

    public void setHostVmNode(HostVM hostVmNode){ this.hostVmNode = hostVmNode; }
    public void setFwVmNode(FirewallVM fwVmNode){ this.fwVmNode = fwVmNode; }
    public void setIntrfce(VMInterface intrfce){ this.intrfce = intrfce; }
}
