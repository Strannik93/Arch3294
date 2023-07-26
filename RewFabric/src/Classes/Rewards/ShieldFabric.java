package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class ShieldFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Shield();
    }
    
}
