package co.marchet.trcgangs.commands.sub;

import co.marchet.trcgangs.commands.SubCommand;
import org.bukkit.entity.Player;

public class CreateGangCommand extends SubCommand {
    @Override
    public String getCommand() {
        return "create";
    }

    @Override
    public String getDescription() {
        return "The command used to create a gang.";
    }

    @Override
    public void execute(Player player, String[] args) {

    }
}
