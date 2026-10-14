package com.klyozzpremium.guineapigmod;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GuineaPigRenderer extends MobRenderer<GuineaPigEntity, GuineaPigModel<GuineaPigEntity>> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(GuineaPigMod.MOD_ID, "textures/entity/guineapig/guineapig.png");

    public GuineaPigRenderer(EntityRendererProvider.Context context) {
        super(context, new GuineaPigModel<>(context.bakeLayer(GuineaPigModel.LAYER_LOCATION)), 0.3f);
    }

    @Override
    public ResourceLocation getTextureLocation(GuineaPigEntity entity) {
        return TEXTURE;
    }
}