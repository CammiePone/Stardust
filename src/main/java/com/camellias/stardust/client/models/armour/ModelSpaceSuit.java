package com.camellias.stardust.client.models.armour;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ModelSpaceSuit extends ModelBiped
{
	public final EntityEquipmentSlot slot;
	
	public ModelRenderer HeadWear;
	
    public ModelRenderer ChestPlate;
    public ModelRenderer ChestPlateRightArm;
    public ModelRenderer ChestPlateLeftArm;
    
    public ModelRenderer RightLeg;
    public ModelRenderer LeftLeg;
    
    public ModelRenderer RightBoot;
    public ModelRenderer LeftBoot;
	
    public ModelRenderer PackTop;
    public ModelRenderer PackMiddle;
    public ModelRenderer PackRight;
    public ModelRenderer PackLeft;
    
    public ModelSpaceSuit(EntityEquipmentSlot slot)
    {
    	this.slot = slot;
    	
        this.textureWidth = 96;
        this.textureHeight = 64;
        
        this.HeadWear = new ModelRenderer(this, 0, 0);
        this.HeadWear.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadWear.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.4F);
        
        this.ChestPlate = new ModelRenderer(this, 0, 48);
        this.ChestPlate.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ChestPlate.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.5F);
        
        this.ChestPlateLeftArm = new ModelRenderer(this, 32, 48);
        this.ChestPlateLeftArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ChestPlateLeftArm.addBox(-1.0F, -1.8F, -2.0F, 4, 12, 4, 0.3F);
        
        this.ChestPlateRightArm = new ModelRenderer(this, 32, 32);
        this.ChestPlateRightArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ChestPlateRightArm.addBox(-3.0F, -1.8F, -2.0F, 4, 12, 4, 0.3F);
        
        this.LeftLeg = new ModelRenderer(this, 0, 32);
        this.LeftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftLeg.addBox(-2.0F, 0.1F, -2.0F, 4, 12, 4, 0.3F);
        
        this.RightLeg = new ModelRenderer(this, 0, 16);
        this.RightLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightLeg.addBox(-2.0F, 0.1F, -2.0F, 4, 12, 4, 0.3F);
        
        this.LeftBoot = new ModelRenderer(this, 48, 48);
        this.LeftBoot.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftBoot.addBox(-2.0F, 7.5F, -2.0F, 4, 5, 4, 0.5F);
        
        this.RightBoot = new ModelRenderer(this, 48, 32);
        this.RightBoot.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightBoot.addBox(-2.0F, 7.5F, -2.0F, 4, 5, 4, 0.5F);
        
        this.PackLeft = new ModelRenderer(this, 72, 48);
        this.PackLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PackLeft.addBox(0.75F, 2.2F, 1.8F, 3, 7, 3, 0.25F);
        this.setRotateAngle(PackLeft, 0.17453292519943295F, 0.0F, 0.0F);
        
        this.PackMiddle = new ModelRenderer(this, 54, 0);
        this.PackMiddle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PackMiddle.addBox(-1.0F, 2.0F, 3.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(PackMiddle, 0.2617993877991494F, 0.0F, 0.0F);
        
        this.PackRight = new ModelRenderer(this, 84, 48);
        this.PackRight.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PackRight.addBox(-3.75F, 2.2F, 1.8F, 3, 7, 3, 0.25F);
        this.setRotateAngle(PackRight, 0.17453292519943295F, 0.0F, 0.0F);
        
        this.PackTop = new ModelRenderer(this, 72, 58);
        this.PackTop.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PackTop.addBox(-3.5F, 0.1F, 1.4F, 7, 2, 4, 0.0F);
        this.setRotateAngle(PackTop, -0.17453292519943295F, 0.0F, 0.0F);
        
        
        
        this.bipedHead.addChild(HeadWear);
        
        this.bipedBody.addChild(ChestPlate);
        
        this.bipedRightArm.addChild(ChestPlateRightArm);
        
        this.bipedLeftArm.addChild(ChestPlateLeftArm);
        
        this.bipedRightLeg.addChild(RightLeg);
        this.bipedLeftLeg.addChild(LeftLeg);
        
        this.bipedRightLeg.addChild(RightBoot);
        this.bipedLeftLeg.addChild(LeftBoot);
        
        this.bipedBody.addChild(PackTop);
        this.bipedBody.addChild(PackRight);
        this.bipedBody.addChild(PackLeft);
        this.bipedBody.addChild(PackMiddle);
    }
    
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
    	this.HeadWear.showModel = slot == EntityEquipmentSlot.HEAD;
		
		this.ChestPlate.showModel = slot == EntityEquipmentSlot.CHEST;
		this.ChestPlateRightArm.showModel = slot == EntityEquipmentSlot.CHEST;
		this.ChestPlateLeftArm.showModel = slot == EntityEquipmentSlot.CHEST;
		this.PackTop.showModel = slot == EntityEquipmentSlot.CHEST;
		this.PackRight.showModel = slot == EntityEquipmentSlot.CHEST;
		this.PackLeft.showModel = slot == EntityEquipmentSlot.CHEST;
		this.PackMiddle.showModel = slot == EntityEquipmentSlot.CHEST;
		
		if(slot == EntityEquipmentSlot.LEGS)
		{
			this.RightLeg.showModel = slot == EntityEquipmentSlot.LEGS;
			this.LeftLeg.showModel = slot == EntityEquipmentSlot.LEGS;
		}
		else
		{
			this.RightBoot.showModel = slot == EntityEquipmentSlot.FEET;
			this.LeftBoot.showModel = slot == EntityEquipmentSlot.FEET;
		}
    	
        super.render(entity, f, f1, f2, f3, f4, f5);
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
    		float headPitch, float scaleFactor, Entity entity)
    {
    	if(entity instanceof EntityArmorStand)
    	{
			EntityArmorStand entityarmorstand = (EntityArmorStand) entity;
			this.bipedHead.rotateAngleX = 0.017453292F * entityarmorstand.getHeadRotation().getX();
			this.bipedHead.rotateAngleY = 0.017453292F * entityarmorstand.getHeadRotation().getY();
			this.bipedHead.rotateAngleZ = 0.017453292F * entityarmorstand.getHeadRotation().getZ();
			this.bipedHead.setRotationPoint(0.0F, 1.0F, 0.0F);
			
			this.bipedBody.rotateAngleX = 0.017453292F * entityarmorstand.getBodyRotation().getX();
			this.bipedBody.rotateAngleY = 0.017453292F * entityarmorstand.getBodyRotation().getY();
			this.bipedBody.rotateAngleZ = 0.017453292F * entityarmorstand.getBodyRotation().getZ();
			
			this.bipedLeftArm.rotateAngleX = 0.017453292F * entityarmorstand.getLeftArmRotation().getX();
			this.bipedLeftArm.rotateAngleY = 0.017453292F * entityarmorstand.getLeftArmRotation().getY();
			this.bipedLeftArm.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftArmRotation().getZ();
			
			this.bipedRightArm.rotateAngleX = 0.017453292F * entityarmorstand.getRightArmRotation().getX();
			this.bipedRightArm.rotateAngleY = 0.017453292F * entityarmorstand.getRightArmRotation().getY();
			this.bipedRightArm.rotateAngleZ = 0.017453292F * entityarmorstand.getRightArmRotation().getZ();
			
			this.bipedLeftLeg.rotateAngleX = 0.017453292F * entityarmorstand.getLeftLegRotation().getX();
			this.bipedLeftLeg.rotateAngleY = 0.017453292F * entityarmorstand.getLeftLegRotation().getY();
			this.bipedLeftLeg.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftLegRotation().getZ();
			this.bipedLeftLeg.setRotationPoint(1.9F, 11.0F, 0.0F);
			
			this.bipedRightLeg.rotateAngleX = 0.017453292F * entityarmorstand.getRightLegRotation().getX();
			this.bipedRightLeg.rotateAngleY = 0.017453292F * entityarmorstand.getRightLegRotation().getY();
			this.bipedRightLeg.rotateAngleZ = 0.017453292F * entityarmorstand.getRightLegRotation().getZ();
			this.bipedRightLeg.setRotationPoint(-1.9F, 11.0F, 0.0F);
			
			copyModelAngles(this.bipedHead, this.bipedHeadwear);
		}
    	
    	else
    	{
    		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
    	}
    }
    
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
