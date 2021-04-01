package co.marchet.trcgangs.commands;

import org.bukkit.entity.Player;

public abstract class SubCommand {

    public abstract String getCommand();
    public abstract String getDescription();
    public abstract void execute(Player player, String[] args);

}
