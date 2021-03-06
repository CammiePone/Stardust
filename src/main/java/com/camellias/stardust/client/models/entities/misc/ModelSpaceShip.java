package com.camellias.stardust.client.models.entities.misc;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSpaceShip extends ModelBase
{
	public ModelRenderer RotationPoint;
	public ModelRenderer BodyMain;
	public ModelRenderer BodyTopRail;
	public ModelRenderer FrontHexagonFront;
	public ModelRenderer BackHexagonFront;
	public ModelRenderer NoseTip;
	public ModelRenderer Backplate4;
	public ModelRenderer MainThruster;
	public ModelRenderer LandingGearFrontLeg;
	public ModelRenderer LandingGearRightLeg;
	public ModelRenderer LandingGearRightLeg_1;
	public ModelRenderer BackOverhang;
	public ModelRenderer RightWingBase;
	public ModelRenderer LeftWingBase;
	public ModelRenderer WindShield;
	public ModelRenderer CockpitEngineBlockFront;
	public ModelRenderer RightWingTip;
	public ModelRenderer LeftWingTip;
	public ModelRenderer CockpitRightSide;
	public ModelRenderer CockpitLeftSide;
	public ModelRenderer CockpitTop;
	public ModelRenderer CockpitBack;
	public ModelRenderer CockpitFrameRight1;
	public ModelRenderer CockpitFrameLeft1;
	public ModelRenderer CockpitFrameRight2;
	public ModelRenderer CockpitFrameLeft2;
	public ModelRenderer CockpitFrameRight3;
	public ModelRenderer CockpitFrameLeft3;
	public ModelRenderer CockpitFrameTop;
	public ModelRenderer CockpitEngineBlockMain;
	public ModelRenderer CockpitEngineCubeBack;
	public ModelRenderer RightBooster;
	public ModelRenderer LeftBooster;
	public ModelRenderer BoosterConnector;
	public ModelRenderer RightBoosterFin;
	public ModelRenderer RightBoosterEnd;
	public ModelRenderer LeftBoosterFin;
	public ModelRenderer LeftBoosterEnd;
	public ModelRenderer FrontRightUpperSlant;
	public ModelRenderer FrontLeftUpperSlant;
	public ModelRenderer FrontRightLowerSlant;
	public ModelRenderer FrontLeftLowerSlant;
	public ModelRenderer FrontRightSide;
	public ModelRenderer FrontLeftSide;
	public ModelRenderer FrontBottom;
	public ModelRenderer BackRightUpperSlant;
	public ModelRenderer BackLeftUpperSlant;
	public ModelRenderer BackRightLowerSlant;
	public ModelRenderer BackLeftLowerSlant;
	public ModelRenderer BackRightSide;
	public ModelRenderer BackLeftSide;
	public ModelRenderer BackBottom;
	public ModelRenderer MainWingRightBase;
	public ModelRenderer MainWingRightTip;
	public ModelRenderer MainWingLeftBase;
	public ModelRenderer MainWingLeftTip;
	public ModelRenderer TopThruster;
	public ModelRenderer BottomThruster;
	public ModelRenderer shape87;
	public ModelRenderer TopThrusterEnd;
	public ModelRenderer BottomThrusterEnd;
	public ModelRenderer LandingGearFrontFoot;
	public ModelRenderer LandingGearRightFoot;
	public ModelRenderer LandingGearLeftFoot;
	
	public ModelSpaceShip()
	{
		this.textureWidth = 512;
		this.textureHeight = 512;
		
		this.CockpitFrameTop = new ModelRenderer(this, 0, 407);
		this.CockpitFrameTop.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CockpitFrameTop.addBox(-8.0F, -31.5F, -1.0F, 16, 2, 2, 0.0F);
		
		this.CockpitBack = new ModelRenderer(this, 56, 497);
		this.CockpitBack.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CockpitBack.addBox(-8.0F, -32.5F, -6.8F, 16, 4, 11, 0.0F);
		this.setRotateAngle(CockpitBack, -0.6108652381980153F, 0.0F, 0.0F);
		
		this.BodyTopRail = new ModelRenderer(this, 0, 404);
		this.BodyTopRail.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BodyTopRail.addBox(-10.0F, -13.0F, -36.0F, 20, 2, 86, 0.0F);
		
		this.WindShield = new ModelRenderer(this, 0, 433);
		this.WindShield.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.WindShield.addBox(-8.0F, -29.5F, 0.0F, 16, 18, 1, 0.0F);
		this.setRotateAngle(WindShield, -0.17453292519943295F, 0.0F, 0.0F);
		
		this.FrontRightLowerSlant = new ModelRenderer(this, 400, 64);
		this.FrontRightLowerSlant.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.FrontRightLowerSlant.addBox(-23.5F, 0.5F, -56.0F, 4, 12, 52, 0.0F);
		this.setRotateAngle(FrontRightLowerSlant, 0.0F, 0.0F, -0.7853981633974483F);
		
		this.shape87 = new ModelRenderer(this, 0, 180);
		this.shape87.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape87.addBox(-7.0F, 2.0F, 6.0F, 24, 6, 3, 0.0F);
		
		this.LeftWingBase = new ModelRenderer(this, 126, 470);
		this.LeftWingBase.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LeftWingBase.addBox(9.0F, -12.0F, -4.0F, 16, 2, 18, 0.0F);
		
		this.MainWingLeftBase = new ModelRenderer(this, 308, 260);
		this.MainWingLeftBase.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.MainWingLeftBase.addBox(20.0F, 14.0F, 16.0F, 36, 4, 34, 0.0F);
		
		this.BoosterConnector = new ModelRenderer(this, 250, 408);
		this.BoosterConnector.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BoosterConnector.addBox(-13.0F, -22.0F, 32.0F, 26, 6, 6, 0.0F);
		
		this.MainWingRightTip = new ModelRenderer(this, 380, 300);
		this.MainWingRightTip.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.MainWingRightTip.addBox(-94.5F, 14.0F, 11.5F, 36, 4, 28, 0.0F);
		this.setRotateAngle(MainWingRightTip, 0.0F, 0.17453292519943295F, 0.0F);
		
		this.TopThrusterEnd = new ModelRenderer(this, 0, 48);
		this.TopThrusterEnd.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.TopThrusterEnd.addBox(-3.0F, -8.0F, 4.0F, 16, 4, 2, 0.0F);
		
		this.RightBooster = new ModelRenderer(this, 246, 456);
		this.RightBooster.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RightBooster.addBox(-23.0F, -26.0F, 24.0F, 10, 12, 24, 0.0F);
		
		this.BackRightUpperSlant = new ModelRenderer(this, 182, 0);
		this.BackRightUpperSlant.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BackRightUpperSlant.addBox(-10.0F, 1.0F, -8.0F, 5, 18, 104, 0.0F);
		this.setRotateAngle(BackRightUpperSlant, 0.0F, 0.0F, 0.7853981633974483F);
		
		this.CockpitEngineBlockMain = new ModelRenderer(this, 0, 323);
		this.CockpitEngineBlockMain.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CockpitEngineBlockMain.addBox(-10.0F, -24.0F, 17.7F, 20, 20, 22, 0.0F);
		this.setRotateAngle(CockpitEngineBlockMain, 0.3490658503988659F, 0.0F, 0.0F);
		
		this.RightWingBase = new ModelRenderer(this, 0, 470);
		this.RightWingBase.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RightWingBase.addBox(-25.0F, -12.0F, -4.0F, 16, 2, 18, 0.0F);
		
		this.RightBoosterFin = new ModelRenderer(this, 228, 480);
		this.RightBoosterFin.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RightBoosterFin.addBox(-17.0F, -42.0F, 20.0F, 1, 4, 8, 0.0F);
		this.setRotateAngle(RightBoosterFin, -0.4363323129985824F, 0.0F, 0.0F);
		
		this.LandingGearRightLeg_1 = new ModelRenderer(this, 104, 150);
		this.LandingGearRightLeg_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LandingGearRightLeg_1.addBox(13.5F, 40.0F, 43.0F, 4, 18, 4, 0.0F);
		this.setRotateAngle(LandingGearRightLeg_1, 0.3490658503988659F, 0.0F, 0.0F);
		
		this.LandingGearFrontLeg = new ModelRenderer(this, 56, 146);
		this.LandingGearFrontLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LandingGearFrontLeg.addBox(-2.0F, 35.0F, -23.0F, 4, 14, 4, 0.0F);
		this.setRotateAngle(LandingGearFrontLeg, -0.3490658503988659F, 0.0F, 0.0F);
		
		this.CockpitRightSide = new ModelRenderer(this, 60, 438);
		this.CockpitRightSide.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CockpitRightSide.addBox(-9.0F, -29.5F, 1.0F, 1, 18, 12, 0.0F);
		
		this.MainWingRightBase = new ModelRenderer(this, 308, 260);
		this.MainWingRightBase.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.MainWingRightBase.addBox(-56.0F, 14.0F, 16.0F, 36, 4, 34, 0.0F);
		
		this.RightWingTip = new ModelRenderer(this, 0, 452);
		this.RightWingTip.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RightWingTip.addBox(-44.0F, -12.0F, -6.3F, 20, 2, 16, 0.0F);
		this.setRotateAngle(RightWingTip, 0.0F, 0.17453292519943295F, 0.0F);
		
		this.BackLeftLowerSlant = new ModelRenderer(this, 212, 122);
		this.BackLeftLowerSlant.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BackLeftLowerSlant.addBox(29.2F, 4.4F, -8.0F, 4, 18, 96, 0.0F);
		this.setRotateAngle(BackLeftLowerSlant, 0.0F, 0.0F, 0.7853981633974483F);
		
		this.CockpitFrameRight2 = new ModelRenderer(this, 0, 421);
		this.CockpitFrameRight2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CockpitFrameRight2.addBox(-10.0F, -31.5F, 1.0F, 2, 2, 10, 0.0F);
		
		this.BackOverhang = new ModelRenderer(this, 0, 124);
		this.BackOverhang.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BackOverhang.addBox(-8.0F, -12.1F, 80.0F, 16, 4, 16, 0.0F);
		
		this.FrontRightSide = new ModelRenderer(this, 400, 128);
		this.FrontRightSide.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.FrontRightSide.addBox(-16.2F, 2.0F, -56.0F, 4, 15, 52, 0.0F);
		
		this.MainThruster = new ModelRenderer(this, 32, 224);
		this.MainThruster.setRotationPoint(-5.0F, 6.0F, 84.0F);
		this.MainThruster.addBox(-9.0F, 0.0F, 0.0F, 28, 10, 6, 0.0F);
		
		this.BackLeftSide = new ModelRenderer(this, 88, 212);
		this.BackLeftSide.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BackLeftSide.addBox(16.5F, 6.5F, -8.0F, 4, 20, 100, 0.0F);
		
		this.CockpitFrameLeft1 = new ModelRenderer(this, 76, 468);
		this.CockpitFrameLeft1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CockpitFrameLeft1.addBox(8.0F, -31.5F, -1.0F, 2, 20, 2, 0.0F);
		
		this.BackRightLowerSlant = new ModelRenderer(this, 212, 122);
		this.BackRightLowerSlant.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BackRightLowerSlant.addBox(-33.3F, 4.4F, -8.0F, 4, 18, 96, 0.0F);
		this.setRotateAngle(BackRightLowerSlant, 0.0F, 0.0F, -0.7853981633974483F);
		
		this.BodyMain = new ModelRenderer(this, 148, 326);
		this.BodyMain.setRotationPoint(0.0F, 0.0F, -14.0F);
		this.BodyMain.addBox(-8.0F, -12.1F, -86.0F, 16, 20, 166, 0.0F);
		
		this.CockpitEngineCubeBack = new ModelRenderer(this, 0, 293);
		this.CockpitEngineCubeBack.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CockpitEngineCubeBack.addBox(-10.0F, 11.1F, 35.0F, 20, 20, 10, 0.0F);
		this.setRotateAngle(CockpitEngineCubeBack, 0.7853981633974483F, 0.0F, 0.0F);
		
		this.MainWingLeftTip = new ModelRenderer(this, 380, 300);
		this.MainWingLeftTip.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.MainWingLeftTip.addBox(58.5F, 14.0F, 11.5F, 36, 4, 28, 0.0F);
		this.setRotateAngle(MainWingLeftTip, 0.0F, -0.17453292519943295F, 0.0F);
		
		this.RotationPoint = new ModelRenderer(this, 0, 0);
		this.RotationPoint.setRotationPoint(0.0F, -18.0F, 12.0F);
		this.RotationPoint.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
		
		this.LeftBoosterEnd = new ModelRenderer(this, 228, 420);
		this.LeftBoosterEnd.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LeftBoosterEnd.addBox(15.0F, -24.0F, 48.0F, 6, 8, 4, 0.0F);
		
		this.BackRightSide = new ModelRenderer(this, 88, 212);
		this.BackRightSide.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BackRightSide.addBox(-20.5F, 6.5F, -8.0F, 4, 20, 100, 0.0F);
		
		this.LandingGearLeftFoot = new ModelRenderer(this, 56, 108);
		this.LandingGearLeftFoot.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LandingGearLeftFoot.addBox(11.5F, 38.0F, 56.0F, 8, 4, 12, 0.0F);
		this.setRotateAngle(LandingGearLeftFoot, -0.3490658503988659F, 0.0F, 0.0F);
		
		this.LeftBooster = new ModelRenderer(this, 246, 420);
		this.LeftBooster.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LeftBooster.addBox(13.0F, -26.0F, 24.0F, 10, 12, 24, 0.0F);
		
		this.CockpitFrameRight3 = new ModelRenderer(this, 0, 411);
		this.CockpitFrameRight3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CockpitFrameRight3.addBox(-10.0F, -32.1F, -9.1F, 2, 2, 8, 0.0F);
		this.setRotateAngle(CockpitFrameRight3, -0.6108652381980153F, 0.0F, 0.0F);
		
		this.CockpitEngineBlockFront = new ModelRenderer(this, 0, 365);
		this.CockpitEngineBlockFront.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CockpitEngineBlockFront.addBox(-10.0F, -28.6F, 8.0F, 20, 26, 16, 0.0F);
		this.setRotateAngle(CockpitEngineBlockFront, -0.3490658503988659F, 0.0F, 0.0F);
		
		this.BottomThrusterEnd = new ModelRenderer(this, 0, 48);
		this.BottomThrusterEnd.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BottomThrusterEnd.addBox(-3.0F, 14.0F, 4.0F, 16, 4, 2, 0.0F);
		
		this.NoseTip = new ModelRenderer(this, 134, 0);
		this.NoseTip.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.NoseTip.addBox(-8.0F, -12.1F, -92.0F, 16, 16, 6, 0.0F);
		
		this.Backplate4 = new ModelRenderer(this, 0, 0);
		this.Backplate4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Backplate4.addBox(-17.0F, -8.0F, 84.0F, 34, 38, 0, 0.0F);
		
		this.FrontBottom = new ModelRenderer(this, 376, 195);
		this.FrontBottom.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.FrontBottom.addBox(-8.0F, 21.3F, -56.0F, 16, 4, 52, 0.0F);
		
		this.FrontLeftUpperSlant = new ModelRenderer(this, 400, 0);
		this.FrontLeftUpperSlant.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.FrontLeftUpperSlant.addBox(6.0F, 1.0F, -56.0F, 4, 12, 52, 0.0F);
		this.setRotateAngle(FrontLeftUpperSlant, 0.0F, 0.0F, -0.7853981633974483F);
		
		this.FrontHexagonFront = new ModelRenderer(this, 462, 0);
		this.FrontHexagonFront.setRotationPoint(0.0F, 1.5F, 0.0F);
		this.FrontHexagonFront.addBox(-12.5F, -0.5F, -52.0F, 25, 22, 0, 0.0F);
		
		this.LeftBoosterFin = new ModelRenderer(this, 228, 444);
		this.LeftBoosterFin.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LeftBoosterFin.addBox(16.0F, -42.0F, 20.0F, 1, 4, 8, 0.0F);
		this.setRotateAngle(LeftBoosterFin, -0.4363323129985824F, 0.0F, 0.0F);
		
		this.BackLeftUpperSlant = new ModelRenderer(this, 182, 0);
		this.BackLeftUpperSlant.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BackLeftUpperSlant.addBox(5.0F, 1.0F, -8.0F, 5, 18, 104, 0.0F);
		this.setRotateAngle(BackLeftUpperSlant, 0.0F, 0.0F, -0.7853981633974483F);
		
		this.FrontLeftLowerSlant = new ModelRenderer(this, 400, 64);
		this.FrontLeftLowerSlant.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.FrontLeftLowerSlant.addBox(19.5F, 0.5F, -56.0F, 4, 12, 52, 0.0F);
		this.setRotateAngle(FrontLeftLowerSlant, 0.0F, 0.0F, 0.7853981633974483F);
		
		this.CockpitFrameRight1 = new ModelRenderer(this, 76, 468);
		this.CockpitFrameRight1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CockpitFrameRight1.addBox(-10.0F, -31.5F, -1.0F, 2, 20, 2, 0.0F);
		
		this.LandingGearFrontFoot = new ModelRenderer(this, 56, 108);
		this.LandingGearFrontFoot.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LandingGearFrontFoot.addBox(-4.0F, 38.0F, -42.0F, 8, 4, 12, 0.0F);
		this.setRotateAngle(LandingGearFrontFoot, 0.3490658503988659F, 0.0F, 0.0F);
		
		this.CockpitLeftSide = new ModelRenderer(this, 60, 438);
		this.CockpitLeftSide.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CockpitLeftSide.addBox(8.0F, -29.5F, 1.0F, 1, 18, 12, 0.0F);
		
		this.FrontLeftSide = new ModelRenderer(this, 400, 128);
		this.FrontLeftSide.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.FrontLeftSide.addBox(12.2F, 2.0F, -56.0F, 4, 15, 52, 0.0F);
		
		this.CockpitTop = new ModelRenderer(this, 0, 499);
		this.CockpitTop.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CockpitTop.addBox(-8.0F, -30.5F, 1.0F, 16, 1, 12, 0.0F);
		
		this.BackHexagonFront = new ModelRenderer(this, 330, 0);
		this.BackHexagonFront.setRotationPoint(0.0F, -5.8F, 0.0F);
		this.BackHexagonFront.addBox(-17.0F, -0.5F, -4.0F, 34, 36, 0, 0.0F);
		
		this.BackBottom = new ModelRenderer(this, 0, 0);
		this.BackBottom.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BackBottom.addBox(-8.0F, 35.2F, -8.0F, 16, 4, 96, 0.0F);
		
		this.TopThruster = new ModelRenderer(this, 64, 200);
		this.TopThruster.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.TopThruster.addBox(-4.0F, -9.0F, 0.0F, 18, 6, 4, 0.0F);
		
		this.BottomThruster = new ModelRenderer(this, 64, 200);
		this.BottomThruster.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BottomThruster.addBox(-4.0F, 13.0F, 0.0F, 18, 6, 4, 0.0F);
		
		this.LandingGearRightLeg = new ModelRenderer(this, 104, 150);
		this.LandingGearRightLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LandingGearRightLeg.addBox(-17.5F, 40.0F, 43.0F, 4, 18, 4, 0.0F);
		this.setRotateAngle(LandingGearRightLeg, 0.3490658503988659F, 0.0F, 0.0F);
		
		this.RightBoosterEnd = new ModelRenderer(this, 228, 456);
		this.RightBoosterEnd.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.RightBoosterEnd.addBox(-21.0F, -24.0F, 48.0F, 6, 8, 4, 0.0F);
		
		this.LeftWingTip = new ModelRenderer(this, 126, 452);
		this.LeftWingTip.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LeftWingTip.addBox(24.0F, -12.0F, -6.3F, 20, 2, 16, 0.0F);
		this.setRotateAngle(LeftWingTip, 0.0F, -0.17453292519943295F, 0.0F);
		
		this.LandingGearRightFoot = new ModelRenderer(this, 0, 108);
		this.LandingGearRightFoot.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LandingGearRightFoot.addBox(-19.5F, 38.0F, 56.0F, 8, 4, 12, 0.0F);
		this.setRotateAngle(LandingGearRightFoot, -0.3490658503988659F, 0.0F, 0.0F);
		
		this.CockpitFrameLeft3 = new ModelRenderer(this, 0, 411);
		this.CockpitFrameLeft3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CockpitFrameLeft3.addBox(8.0F, -32.1F, -9.1F, 2, 2, 8, 0.0F);
		this.setRotateAngle(CockpitFrameLeft3, -0.6108652381980153F, 0.0F, 0.0F);
		
		this.CockpitFrameLeft2 = new ModelRenderer(this, 0, 421);
		this.CockpitFrameLeft2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.CockpitFrameLeft2.addBox(8.0F, -31.5F, 1.0F, 2, 2, 10, 0.0F);
		
		this.FrontRightUpperSlant = new ModelRenderer(this, 400, 0);
		this.FrontRightUpperSlant.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.FrontRightUpperSlant.addBox(-10.0F, 1.0F, -56.0F, 4, 12, 52, 0.0F);
		this.setRotateAngle(FrontRightUpperSlant, 0.0F, 0.0F, 0.7853981633974483F);
		
		
		
		this.WindShield.addChild(this.CockpitFrameTop);
		this.WindShield.addChild(this.CockpitBack);
		this.BodyMain.addChild(this.BodyTopRail);
		this.BodyTopRail.addChild(this.WindShield);
		this.FrontHexagonFront.addChild(this.FrontRightLowerSlant);
		this.MainThruster.addChild(this.shape87);
		this.BodyTopRail.addChild(this.LeftWingBase);
		this.BackLeftSide.addChild(this.MainWingLeftBase);
		this.CockpitEngineBlockMain.addChild(this.BoosterConnector);
		this.MainWingRightBase.addChild(this.MainWingRightTip);
		this.TopThruster.addChild(this.TopThrusterEnd);
		this.CockpitEngineBlockMain.addChild(this.RightBooster);
		this.BackHexagonFront.addChild(this.BackRightUpperSlant);
		this.CockpitEngineBlockFront.addChild(this.CockpitEngineBlockMain);
		this.BodyTopRail.addChild(this.RightWingBase);
		this.RightBooster.addChild(this.RightBoosterFin);
		this.BodyMain.addChild(this.LandingGearRightLeg_1);
		this.BodyMain.addChild(this.LandingGearFrontLeg);
		this.WindShield.addChild(this.CockpitRightSide);
		this.BackRightSide.addChild(this.MainWingRightBase);
		this.RightWingBase.addChild(this.RightWingTip);
		this.BackHexagonFront.addChild(this.BackLeftLowerSlant);
		this.WindShield.addChild(this.CockpitFrameRight2);
		this.BodyMain.addChild(this.BackOverhang);
		this.FrontHexagonFront.addChild(this.FrontRightSide);
		this.BodyMain.addChild(this.MainThruster);
		this.BackHexagonFront.addChild(this.BackLeftSide);
		this.WindShield.addChild(this.CockpitFrameLeft1);
		this.BackHexagonFront.addChild(this.BackRightLowerSlant);
		this.RotationPoint.addChild(this.BodyMain);
		this.CockpitEngineBlockMain.addChild(this.CockpitEngineCubeBack);
		this.MainWingLeftBase.addChild(this.MainWingLeftTip);
		this.LeftBooster.addChild(this.LeftBoosterEnd);
		this.BackHexagonFront.addChild(this.BackRightSide);
		this.LandingGearRightLeg_1.addChild(this.LandingGearLeftFoot);
		this.CockpitEngineBlockMain.addChild(this.LeftBooster);
		this.WindShield.addChild(this.CockpitFrameRight3);
		this.BodyTopRail.addChild(this.CockpitEngineBlockFront);
		this.BottomThruster.addChild(this.BottomThrusterEnd);
		this.BodyMain.addChild(this.NoseTip);
		this.BodyMain.addChild(this.Backplate4);
		this.FrontHexagonFront.addChild(this.FrontBottom);
		this.FrontHexagonFront.addChild(this.FrontLeftUpperSlant);
		this.BodyMain.addChild(this.FrontHexagonFront);
		this.LeftBooster.addChild(this.LeftBoosterFin);
		this.BackHexagonFront.addChild(this.BackLeftUpperSlant);
		this.FrontHexagonFront.addChild(this.FrontLeftLowerSlant);
		this.WindShield.addChild(this.CockpitFrameRight1);
		this.LandingGearFrontLeg.addChild(this.LandingGearFrontFoot);
		this.WindShield.addChild(this.CockpitLeftSide);
		this.FrontHexagonFront.addChild(this.FrontLeftSide);
		this.WindShield.addChild(this.CockpitTop);
		this.BodyMain.addChild(this.BackHexagonFront);
		this.BackHexagonFront.addChild(this.BackBottom);
		this.MainThruster.addChild(this.TopThruster);
		this.MainThruster.addChild(this.BottomThruster);
		this.BodyMain.addChild(this.LandingGearRightLeg);
		this.RightBooster.addChild(this.RightBoosterEnd);
		this.LeftWingBase.addChild(this.LeftWingTip);
		this.LandingGearRightLeg.addChild(this.LandingGearRightFoot);
		this.WindShield.addChild(this.CockpitFrameLeft3);
		this.WindShield.addChild(this.CockpitFrameLeft2);
		this.FrontHexagonFront.addChild(this.FrontRightUpperSlant);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		this.RotationPoint.offsetY = - 1.5F;
		this.RotationPoint.offsetZ = -0.75F;
		this.RotationPoint.render(f5);
	}
	
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity)
	{
		RotationPoint.rotateAngleY = netHeadYaw * 0.017453292F;
		RotationPoint.rotateAngleX = headPitch * 0.017453292F;
	}
	
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
	{
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
