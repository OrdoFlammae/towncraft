package io.github.ordoflammae.towncraft.client.render.entity;

import io.github.ordoflammae.towncraft.TownCraft;
import io.github.ordoflammae.towncraft.client.render.entity.model.CitizenEntityModel;
import io.github.ordoflammae.towncraft.entity.mob.CitizenEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class CitizenEntityRenderer extends MobEntityRenderer<CitizenEntity, CitizenEntityModel> {
    private static final Identifier TEXTURE = new Identifier(TownCraft.MOD_ID, "textures/entity/citizen.png");

    public CitizenEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new CitizenEntityModel(), 0.5F);
    }

    @Override
    public Identifier getTexture(CitizenEntity entity) {
        return TEXTURE;
    }
}
