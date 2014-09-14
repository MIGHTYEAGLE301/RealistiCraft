package com.mightyeagle.realisticraft.init;

import com.mightyeagle.realisticraft.items.ItemCopperIngot;
import com.mightyeagle.realisticraft.items.RCItem;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final RCItem copperIngot = new ItemCopperIngot();

    public static void init()
    {
        GameRegistry.registerItem(copperIngot, "copperingot");
    }
}
