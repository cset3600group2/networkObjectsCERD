package sample;

public class VMInterface {
        private String name;
        private boolean isConnected = false; //attached to a hub with same subnet through cable
        private String ipAddress;
        //private String subnet; for fw/switch



        public void setInterfaceName(String name){
            this.name = name;
        }
        public String getInterfaceName(){
            return this.name;
        }
        public void setIpAddress(){
            return;
        }
        public String getIpAddress(){
            return this.ipAddress;
        }
        public void setConnected(){
            this.isConnected = true;
        }
        public boolean getConnected(){
            return this.isConnected;
        }

        public void connectInterface(){
            //called by event handler when a cable is clicked, followed by a click on the canvas objects
        }

}


