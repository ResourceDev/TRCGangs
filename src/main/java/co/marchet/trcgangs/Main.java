package co.marchet.trcgangs;

import co.marchet.trcgangs.commands.CommandHandler;
import de.leonhard.storage.LightningBuilder;
import de.leonhard.storage.Yaml;
import de.leonhard.storage.internal.settings.ConfigSettings;
import de.leonhard.storage.internal.settings.DataType;
import de.leonhard.storage.internal.settings.ReloadSettings;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.logging.Logger;

public final class Main extends JavaPlugin {

    public static Logger LOGGER = Bukkit.getLogger();
    @Getter private Yaml config;
    @Getter public GangHandler gangHandler;

    @Override
    public void onEnable() {
        // Plugin startup logic
        LOGGER.info("TRCGangs v1.0 is starting up.");
        File file = new File(getDataFolder(), "config.yml");
        config = LightningBuilder.fromFile(file).addInputStream(getResource("config.yml")).setConfigSettings(ConfigSettings.PRESERVE_COMMENTS).setDataType(DataType.SORTED).setReloadSettings(ReloadSettings.INTELLIGENT).createYaml();
        this.gangHandler = new GangHandler(this);
        CommandHandler commandHandler = new CommandHandler(this);
        getCommand("gangs").setExecutor(commandHandler);
        getCommand("gangs").setTabCompleter(commandHandler);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
