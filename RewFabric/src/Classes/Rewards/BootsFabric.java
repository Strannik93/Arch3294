package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class BootsFabric extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Boots();
    }
    
}
