package com.mightyeagle.realisticraft.init;

import com.mightyeagle.realisticraft.blocks.RCBlock;
import com.mightyeagle.realisticraft.blocks.CopperBlock;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final RCBlock copperBlock = new CopperBlock();

    public static void init() { GameRegistry.registerBlock(copperBlock,"copperblock");}
}
