package co.marchet.trcgangs.objects;

import de.leonhard.storage.Yaml;
import lombok.Getter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Gang {

    @Getter private UUID gangUUID;
    @Getter private Yaml gangData;
    @Getter private int tier;
    @Getter private int level;
    private int totalBlocksBroken;
    private int creationDay;
    private int creationMonth;
    private int creationYear;
    private String UTCTimeStamp;
    private int epochTimeStamp;
    @Getter private HashMap<Integer, Integer> blockLevels = new HashMap<>();
    @Getter private List<UUID> gangMembers = new ArrayList<>();

    public Gang() {
        //Defining the amount of blocks needed for each blocklevel.
        this.blockLevels.put(1, 1000000);
        this.blockLevels.put(2, 5000000);
        this.blockLevels.put(3, 10000000);
        this.blockLevels.put(4, 50000000);

        gangUUID = UUID.randomUUID();
        gangData = new Yaml(gangUUID.toString(), "plugins/TRCGangs/data");
    }

}
