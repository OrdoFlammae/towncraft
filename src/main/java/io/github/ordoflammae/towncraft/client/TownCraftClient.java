package io.github.ordoflammae.towncraft.client;

import io.github.ordoflammae.towncraft.TownCraft;
import io.github.ordoflammae.towncraft.client.render.entity.CitizenEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class TownCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(TownCraft.CITIZEN, (entityRenderDispatcher, context) -> {
            return new CitizenEntityRenderer(entityRenderDispatcher);
        });
    }
}
