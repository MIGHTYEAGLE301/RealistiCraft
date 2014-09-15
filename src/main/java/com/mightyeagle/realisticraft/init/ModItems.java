package com.mightyeagle.realisticraft.init;

import com.mightyeagle.realisticraft.items.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final RCItem copperIngot = new ItemCopperIngot();
    public static final RCItem tinIngot = new ItemTinIngot();
    public static final RCItem uraniumIngot = new ItemUraniumIngot();
    public static final RCItem wrench = new ItemWrench();
    public static final RCItem greenHandle = new ItemGreenHandle();

    public static void init()
    {
        GameRegistry.registerItem(copperIngot, "copperIngot");
        GameRegistry.registerItem(tinIngot, "tinIngot");
        GameRegistry.registerItem(uraniumIngot, "uraniumIngot");
        GameRegistry.registerItem(wrench, "wrench");
        GameRegistry.registerItem(greenHandle, "greenHandle");
    }
}
