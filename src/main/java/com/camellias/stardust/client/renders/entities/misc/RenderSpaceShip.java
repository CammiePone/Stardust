package com.camellias.stardust.client.renders.entities.misc;

import com.camellias.stardust.Reference;
import com.camellias.stardust.client.models.entities.misc.ModelSpaceShip;
import com.camellias.stardust.common.entities.misc.EntitySpaceShip;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSpaceShip extends Render<EntitySpaceShip>
{
	private static final ModelSpaceShip MODEL = new ModelSpaceShip();
	private static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MODID, "textures/entity/space_ship.png");
	
	public RenderSpaceShip(RenderManager renderManager)
	{
		super(renderManager);
	}
	
	@Override
	public ResourceLocation getEntityTexture(EntitySpaceShip entity)
	{
		return TEXTURE;
	}
	
	@Override
	public void doRender(EntitySpaceShip entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		GlStateManager.pushMatrix();
		GlStateManager.translate(x, y + 1.5D, z + 1D);
		GlStateManager.rotate(180.0F - (entityYaw), 0.0F, 1.0F, 0.0F);
        GlStateManager.scale(-1.0F, -1.0F, 1.0F);
		bindEntityTexture(entity);
		MODEL.render(entity, partialTicks, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GlStateManager.popMatrix();
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}
	
	public void setupRotation(float f1, float f2)
    {
        
    }
	
	public void setupTranslation(double d0, double d1, double d2)
    {
        
    }
}
