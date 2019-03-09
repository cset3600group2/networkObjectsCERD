package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.virtualmachines.VMNode;

enum OSWINLIN {
    WINDOWS, LINUX
}

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }




    public void setOS_VER_SRC(VMNode vmNode, OSWINLIN os){
        switch (os) {
            case WINDOWS:
                vmNode.setOs("WINDOWS");
                break;
            case LINUX:
                vmNode.setOs("LINUX");
                break;
        }
        if (vmNode.getOs() == "WINDOWS"){
            vmNode.setVer("7.0");
            vmNode.setSrc("/srv/VMLibrary/win7");
        }
        else{
            vmNode.setVer("7.3");
            vmNode.setSrc("/srv/VMLibrary/JeOS");
        }



        //  /srv/VMLibrary/JeOS

    }

}

