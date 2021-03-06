package top.duradnal.first;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import top.duradnal.first.items.ObsidianBar;
import top.duradnal.first.arms.RainbowSword;
import top.duradnal.first.food.CopperIngot;

public class ItemRegistration {

    public static final DeferredRegister<Item> ITEMEVEBT = new DeferredRegister<>(ForgeRegistries.ITEMS, "first");

    public static RegistryObject<Item> registryObsbar = ITEMEVEBT.register("obsidian_bar", ObsidianBar::new);
    public static RegistryObject<Item> registryCopper = ITEMEVEBT.register("copper_ingot", CopperIngot::new);
    public static RegistryObject<Item> registryRainbowSword = ITEMEVEBT.register("rainbow_sword", RainbowSword::new);

    public static RegistryObject<Item> registryObsBlock =ITEMEVEBT.register("obsidian_block",()->{
        return new BlockItem(BlockRegistry.ObsidianBlock.get(),new Item.Properties().group(ModGroup.obsidianGroup));
    });
    public static RegistryObject<Item>registryObsRubikCubeBlock =ITEMEVEBT.register("obs_rub_block",()->{
        return new BlockItem(BlockRegistry.ObsidianRubikCubeBlock.get(),new Item.Properties().group(ModGroup.obsidianGroup));
    });
}
