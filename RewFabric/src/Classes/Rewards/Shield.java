package Classes.Rewards;

import Classes.iGameItem;

public class Shield implements iGameItem {

    @Override
    public void open() {
        System.out.println("Shield!");
    }
    
}
