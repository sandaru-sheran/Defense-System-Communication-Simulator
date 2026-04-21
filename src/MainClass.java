



public class MainClass {
    public static void main(String[] args) {
        ControllerClass cc = new ControllerClass();
        cc.addInterface(new SubmarineForm(cc));
        cc.addInterface(new MainControllerForm(cc));
        cc.addInterface(new TankForm(cc));
        cc.addInterface(new HelicopterForm(cc));
        
        
    }
}
