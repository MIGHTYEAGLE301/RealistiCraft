package com.mightyeagle.realisticraft.items;

import com.mightyeagle.realisticraft.init.ModItems;
import com.mightyeagle.realisticraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class ItemCopperIngot extends RCItem {
    public ItemCopperIngot() {
        super();
        this.setUnlocalizedName("copperIngot");
        this.setTextureName(Reference.TEXTURE_PATH + "item.copperingot");
    }



}


