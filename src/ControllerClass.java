


import java.util.ArrayList;

public class ControllerClass implements DefenceInterface{

private ArrayList<DefenceInterface> interfaceList = new ArrayList<>();

    private String mainClassMasages="";
    private String FromMainMassages="";
    private boolean clearAria=false;
    private int thretLevel=0;

public boolean addInterface(DefenceInterface def){
    return interfaceList.add(def);
    
}

public void setClearAria(boolean b){
    this.clearAria=b;
    if (clearAria){
        ariaClearCheckbox(true);
    }else{
        ariaClearCheckbox(false);
    }
}

public void setFromMainMassages(String str){
   this.FromMainMassages+=str;
    updateOtherText(FromMainMassages);
}

public void setMainMassage(String massage){
    this.mainClassMasages+= massage;
    updateMainText(mainClassMasages);
}

public void setThreatLevel(int i){
    thretLevel=i;
    unlockButtons(thretLevel);
}

public void trigerUnlockButton(){
    unlockButtons(thretLevel);
}

    @Override
    public void updateMainText(String str) {
        for(DefenceInterface i: interfaceList){
            i.updateMainText(str);
        }
    }

    @Override
    public void updateOtherText(String str) {
        for(DefenceInterface i: interfaceList){
            i.updateOtherText(str);
        }
    }

    @Override
    public void ariaClearCheckbox(boolean b) {
        for(DefenceInterface i: interfaceList){
            i.ariaClearCheckbox(b);
        }
    }

    @Override
    public void unlockButtons(int level) {
        for(DefenceInterface i: interfaceList){
            i.unlockButtons(level);
        }
    }
    
  

}
