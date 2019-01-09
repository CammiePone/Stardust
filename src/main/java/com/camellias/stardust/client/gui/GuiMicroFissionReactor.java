package com.camellias.stardust.client.gui;

import com.camellias.stardust.Reference;
import com.camellias.stardust.common.container.ContainerMicroFissionReactor;
import com.camellias.stardust.common.tileentities.TileMicroFissionReactor;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiMicroFissionReactor extends GuiContainer
{
	private static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/gui/microfission_reactor.png");
	private final InventoryPlayer player;
	private final TileMicroFissionReactor tileentity;
	
	public GuiMicroFissionReactor(InventoryPlayer player, TileMicroFissionReactor tileentity) 
	{
		super(new ContainerMicroFissionReactor(player, tileentity));
		this.player = player;
		this.tileentity = tileentity;
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float ticks)
	{
		this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, ticks);
		this.renderHoveredToolTip(mouseX, mouseY);
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) 
	{
		float depletedPercent = this.tileentity.burnTime * 0.008333F;
		
		String tileName = this.tileentity.getDisplayName().getUnformattedText();
		this.fontRenderer.drawString(tileName, (this.xSize / 2 - this.fontRenderer.getStringWidth(tileName) / 2) -5, 6, 8421504);
		this.fontRenderer.drawString(this.player.getDisplayName().getUnformattedText(), 7, this.ySize - 96 + 2, 8421504);
		
		this.fontRenderer.drawString(String.format("%.1f", depletedPercent) + "%", 67, 35, 2686720);
		this.fontRenderer.drawString(" Reactive", 93, 35, 2686720);
		
		if(this.tileentity.getEnergyStored() < 1000000)
		{
			this.fontRenderer.drawString(String.format("%.2f", this.tileentity.getEnergyStored() / 1_000F), 87, 56, 2686720);
			this.fontRenderer.drawString(" kFE", 119, 56, 2686720);
		}
		if(this.tileentity.getEnergyStored() >= 1000000)
		{
			this.fontRenderer.drawString(String.format("%.3f", this.tileentity.getEnergyStored() / 1_000_000F), 87, 56, 2686720);
			this.fontRenderer.drawString(" mFE", 118, 56, 2686720);
		}
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
	{
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(TEXTURES);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
		
		int k = this.getEnergyStoredScaled(75);
		this.drawTexturedModalRect(this.guiLeft + 152, this.guiTop + 7, 176, 31, 16, 75 - k);
	}
	
	private int getEnergyStoredScaled(int pixels)
	{
		int i = this.tileentity.getEnergyStored();
		int j = this.tileentity.getMaxEnergyStored();
		return i != 0 && j != 0 ? i * pixels / j : 0; 
	}
}
