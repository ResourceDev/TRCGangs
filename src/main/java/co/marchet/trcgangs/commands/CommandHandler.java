package co.marchet.trcgangs.commands;

import co.marchet.trcgangs.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CommandHandler implements CommandExecutor, TabCompleter {

    List<SubCommand> commands = new ArrayList<>();
    public CommandHandler(Main main) {

    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (args.length <= 1) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
            }
        }

        return false;
    }

    @Nullable
    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String alias, @NotNull String[] args) {

        if (args.length <= 1) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
            }
        }

        return null;
    }
}
