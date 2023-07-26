import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Classes.ItemGenerator;
import Classes.Rewards.ArmourFabric;
import Classes.Rewards.BootsFabric;
import Classes.Rewards.GemFabric;
import Classes.Rewards.GoldFabric;
import Classes.Rewards.HelmFabric;
import Classes.Rewards.ShieldFabric;
import Classes.Rewards.WeaponFabric;

public class App {
    public static void main(String[] args) throws Exception {
        Random rnd = ThreadLocalRandom.current();
        List<ItemGenerator> fabList = new ArrayList<>();
        ItemGenerator fab = new GoldFabric();
        fabList.add(fab);
        ItemGenerator fab2 = new GemFabric();
        fabList.add(fab2);
        ItemGenerator fab3 = new ShieldFabric();
        fabList.add(fab3);
        ItemGenerator fab4 = new WeaponFabric();
        fabList.add(fab4);
        ItemGenerator fab5 = new HelmFabric();
        fabList.add(fab5);
        ItemGenerator fab6 = new ArmourFabric();
        fabList.add(fab6);
        ItemGenerator fab7 = new BootsFabric();
        fabList.add(fab7);
        int n = 20;
        for (int i = 0; i < n; i++) {
            // int index = Math.abs(rnd.nextInt()%2==0?0:1); //тернарно, если в списке 2 элемента
            int index = Math.abs(rnd.nextInt(0,fabList.size()));
            fabList.get(index).openReward();
        }
    }
}
