package io.github.ordoflammae.towncraft.client.render.entity.model;

import io.github.ordoflammae.towncraft.entity.mob.CitizenEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.model.BipedEntityModel;

public class CitizenEntityModel extends BipedEntityModel<CitizenEntity> {
    public CitizenEntityModel() {
        super(RenderLayer::getEntityTranslucent, 0, 0, 64, 64);
    }
}
