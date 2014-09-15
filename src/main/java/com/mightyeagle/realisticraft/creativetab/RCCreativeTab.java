package com.mightyeagle.realisticraft.creativetab;


import com.mightyeagle.realisticraft.init.ModItems;
import com.mightyeagle.realisticraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RCCreativeTab
{
    public static final CreativeTabs RC_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.wrench;
        }
    };
}
