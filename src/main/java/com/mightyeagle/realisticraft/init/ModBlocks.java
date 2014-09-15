package com.mightyeagle.realisticraft.init;

import com.mightyeagle.realisticraft.blocks.RCBlock;
import com.mightyeagle.realisticraft.blocks.CopperBlock;
import com.mightyeagle.realisticraft.blocks.TinBlock;
import com.mightyeagle.realisticraft.blocks.UraniumBlock;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final RCBlock copperBlock = new CopperBlock();
    public static final RCBlock tinBlock = new TinBlock();
    public static final RCBlock uraniumBlock = new UraniumBlock();

    public static void init()
    {
        GameRegistry.registerBlock(copperBlock,"copperBlock");
        GameRegistry.registerBlock(tinBlock, "tinBlock");
        GameRegistry.registerBlock(uraniumBlock, "uraniumBlock");
    }
}
