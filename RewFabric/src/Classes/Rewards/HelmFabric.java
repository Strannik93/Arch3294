package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class HelmFabric extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Helm();
    }
    
}
