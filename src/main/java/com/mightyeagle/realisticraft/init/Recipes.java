package com.mightyeagle.realisticraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        //Blocks made out of single material category
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.copperBlock),"mmm","mmm","mmm",'m',new ItemStack(ModItems.copperIngot));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tinBlock),"mmm","mmm","mmm",'m',new ItemStack(ModItems.tinIngot));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.uraniumBlock),"mmm","mmm","mmm",'m',new ItemStack(ModItems.uraniumIngot));


        //Wrench
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.wrench), new ItemStack(ModItems.copperIngot), new ItemStack(ModItems.greenHandle));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.greenHandle), new ItemStack(Items.stick), new ItemStack(Items.dye, 1, 10));
    }
}
