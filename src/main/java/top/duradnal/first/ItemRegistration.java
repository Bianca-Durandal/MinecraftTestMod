package top.duradnal.first;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import top.duradnal.first.Items.ObsidianBar;
import top.duradnal.first.food.CopperIngot;

public class ItemRegistration {
    public static final DeferredRegister<Item> ITEMEVEBT = new DeferredRegister<>(ForgeRegistries.ITEMS, "first");

    public static RegistryObject<Item> registryObsbar = ITEMEVEBT.register("obsidian_bar", ObsidianBar::new);
    public static RegistryObject<Item> registryCopper = ITEMEVEBT.register("copper_ingot", CopperIngot::new);
}
