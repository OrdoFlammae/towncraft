package io.github.ordoflammae.towncraft;

import io.github.ordoflammae.towncraft.entity.mob.CitizenEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TownCraft implements ModInitializer {
    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "towncraft";
    public static final String MOD_NAME = "towncraft";

    public static final EntityType<CitizenEntity> CITIZEN = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(MOD_ID, "citizen"),
            FabricEntityTypeBuilder.create(SpawnGroup.AMBIENT, CitizenEntity::new)
                    .dimensions(EntityDimensions.changing(0.6F, 1.8F))
                    .build()
    );

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing...");

        FabricDefaultAttributeRegistry.register(CITIZEN, CitizenEntity.createMobAttributes());
    }

    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }
}