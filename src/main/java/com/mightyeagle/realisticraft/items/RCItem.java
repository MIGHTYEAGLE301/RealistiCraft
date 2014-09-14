package com.mightyeagle.realisticraft.items;

import com.mightyeagle.realisticraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RCItem extends Item
{
    public RCItem()
    {
        super();
    }


    @Override
    public String getUnlocalizedName()
    {
        return String.format("item%s%s ", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    @Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }


    private Object getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
