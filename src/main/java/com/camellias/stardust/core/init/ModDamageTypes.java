package com.camellias.stardust.core.init;

import net.minecraft.util.DamageSource;

public class ModDamageTypes
{
	public static final DamageSource SPACE_VACUUM = new DamageSource("space_vacuum")
			.setDamageAllowedInCreativeMode().setDamageBypassesArmor().setDamageIsAbsolute();
}
