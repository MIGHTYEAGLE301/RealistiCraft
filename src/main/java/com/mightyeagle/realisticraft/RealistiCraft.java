package com.mightyeagle.realisticraft;

import com.mightyeagle.realisticraft.handler.ConfigurationHandler;
import com.mightyeagle.realisticraft.init.ModItems;
import com.mightyeagle.realisticraft.proxy.IProxy;
import com.mightyeagle.realisticraft.reference.Reference;
import com.mightyeagle.realisticraft.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME , version= Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class RealistiCraft
{

    @Mod.Instance(Reference.MOD_ID)
    public static  RealistiCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        ModItems.init();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
