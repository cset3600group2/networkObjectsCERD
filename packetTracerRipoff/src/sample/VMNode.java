package sample;

public abstract class VMNode {
    protected String name;
    protected String os;
    protected String ver;
    protected String src;

    VMNode(){//empty constructor, visually stimulating!

    }

    public String getOs(){
        return this.os;
    }
    public void setOs(String os){
        this.os = os;
    }
    public String getSrc(){
        return this.src;
    }
    public void setSrc(String src){this.src = src;}
    public String getName(){
        return this.name;
    }
    public void setName(String name){this.name = name;}
    public String getVer(){ return this.ver; }
    public void setVer(String ver){this.ver = ver;}
}
