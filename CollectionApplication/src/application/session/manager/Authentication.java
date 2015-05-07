package application.session.manager;
/*
 * @author vikram wankhede
 * @date 4/5/2015
 */

// Enum data type is used to store various authentication type
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
