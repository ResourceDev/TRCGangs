package co.marchet.trcgangs.objects;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GangStorage {

    //The gang which the storage belongs to.
    public Gang gang;
    //Stores the storage in (slot, item) format.
    public HashMap<Integer, ItemStack> storage = new HashMap<>();
    //Stores the size of the storage
    int rows;
    //Lists players currently in the storage
    List<Player> inStorage = new ArrayList<>();

    public GangStorage(Gang gang, int rows) {
        this.rows = rows;
        this.gang = gang;
    }

    //Stuff for adding individual items to storage
    public void addItemToStorage(ItemStack itemStack) {
        int slots = rows*9;
        boolean added = false;
        for (int a = 0; a<slots; a++) {
            ItemStack itemStack1 = storage.get(a);
            if (itemStack1 == null && !added) {
                storage.put(a, itemStack);
            }
        }
    }

    public void setItemInStorage(int slot, ItemStack itemStack) {
        storage.put(slot, itemStack);
    }

}
