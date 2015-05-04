package application.session.manager;

public enum Authentication {
    None(0),
    AdlibPbk(1),
    AdlibDatabase(2),
    ActiveDirectory(3), 
    HTTP(4);

    private int value;

    private Authentication(int val){
         value = val;
     }

    public int getValue(){
         return value;
     }
}
