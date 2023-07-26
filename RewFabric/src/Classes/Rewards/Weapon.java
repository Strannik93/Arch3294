package Classes.Rewards;

import Classes.iGameItem;

public class Weapon implements iGameItem {

    @Override
    public void open() {
        System.out.println("Weapon!");
    }
    
}
