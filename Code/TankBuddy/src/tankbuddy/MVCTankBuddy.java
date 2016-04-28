package tankbuddy;

public class MVCTankBuddy {
    
    public static void main(String[] args) {
    	
    	MVCView theView = new MVCView();
    	MVCViewStart theView1 = new MVCViewStart();
    	MVCViewInlog theView2 = new MVCViewInlog();
    	MVCViewReg theView3 = new MVCViewReg();
        
    	TankBuddy theModel = new TankBuddy();
        
        MVCController theController = new MVCController(theView,theView1,theView2,theView3,theModel);
        
        theView1.setVisible(true);
        
    }
}