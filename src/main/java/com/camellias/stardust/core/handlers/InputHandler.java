package com.camellias.stardust.core.handlers;

import com.camellias.stardust.common.entities.misc.EntitySpaceShip;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.MovementInput;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class InputHandler
{
	@SubscribeEvent
	public void onSPlayerTick(PlayerTickEvent event)
	{
		if(event.player.world.isRemote)
		{
			World world = event.player.world;
			
			if(event.player instanceof EntityPlayerSP)
			{
				EntityPlayerSP player = (EntityPlayerSP) event.player;
				MovementInput input = player.movementInput;
				
				if(player.getRidingEntity() instanceof EntitySpaceShip)
				{
					EntitySpaceShip spaceship = (EntitySpaceShip) player.getRidingEntity();
					spaceship.updateInputs(input.forwardKeyDown, input.backKeyDown, input.leftKeyDown, input.rightKeyDown, input.jump);
				}
			}
		}
	}
}
