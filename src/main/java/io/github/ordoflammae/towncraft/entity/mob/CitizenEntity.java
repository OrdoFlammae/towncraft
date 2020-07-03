package io.github.ordoflammae.towncraft.entity.mob;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntityWithAi;
import net.minecraft.world.World;

public class CitizenEntity extends MobEntityWithAi {
    public CitizenEntity(EntityType<? extends MobEntityWithAi> type, World world) {
        super(type, world);
    }
}
