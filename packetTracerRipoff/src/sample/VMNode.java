package sample;

public abstract class VMNode {
    protected String name;
    private String os;
    private String ver;
    private String src;


    VMNode(OSWINLIN os){
        switch (os) {
            case WINDOWS:
                this.os = "WINDOWS";
                break;
            case LINUX:
                this.os = "LINUX";
                break;
        }
        if (this.os == "WINDOWS"){ //SUBJECT TO CHANGE WAITING ON EMAIL FROM MR.AMBIGUOUS
            this.ver = "7.0";
            this.src = "/srv/VMLibrary/win7";
        }
        else{
            this.ver = "7.3";
            this.src = "/srv/VMLibrary/JeOS";
        }



        //  /srv/VMLibrary/JeOS

    }

    public String getOs(){
        return this.os;
    }
    public String getSrc(){
        return this.src;
    }
    public String getName(){
        return this.name;
    }
    public String getVer(){
        return this.ver;
    }
}
