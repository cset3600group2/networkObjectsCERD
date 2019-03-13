package sample;
public class Test  {
    public static void main(String[] args) {
        HostVM[] testVm = new HostVM[5];
        for(int i = 0; i < testVm.length; i++) {
            testVm[i] = new HostVM();
            testVm[i].setName("Blah-"+i);
            testVm[i].setVer("1.0");
            testVm[i].setSrc("/test/src");
        }

        //I get errors when writing to the root of C.
        //Change this to your my docs or desktop for testing
        ConfigGenerator.writeFile(testVm,"C:\\Users\\mgroa\\Desktop\\test.cfg");
    }

}