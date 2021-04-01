package co.marchet.trcgangs;

import co.marchet.trcgangs.objects.Gang;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GangHandler {

    private Main main;
    List<Gang> gangs = new ArrayList<>();

    public GangHandler(Main main) {
        this.main = main;
    }

    public void loadGangsfromFile() {

    }

    public void addGang(Gang gang) {
        gangs.add(gang);
    }

    public void removeGang(Gang gang) {
        gangs.remove(gang);
    }

    public Gang getFromUUID(UUID uuid) {
        for (Gang gang : gangs) {
            if (uuid.equals(gang.getGangUUID())) {
                return gang;
            }
        }
        return null;
    }

    public Gang getGangFromPlayerUUID(UUID uuid) {
        for (Gang gang : gangs) {
            for (UUID uuid1 : gang.getGangMembers()) {
                if (uuid.equals(uuid1)) {
                    return gang;
                }
            }
        }
        return null;
    }
}
