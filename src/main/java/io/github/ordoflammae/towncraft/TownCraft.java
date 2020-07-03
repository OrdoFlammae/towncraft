package io.github.ordoflammae.towncraft;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TownCraft implements ModInitializer {
    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "towncraft";
    public static final String MOD_NAME = "towncraft";

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing...");
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }
}