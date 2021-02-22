package top.duradnal.first.itemlist;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import top.duradnal.first.ItemRegistration;

public class ObsidianGroup extends ItemGroup {
    public ObsidianGroup() {
        super("obsidian_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistration.registryObsbar.get());
    }
}
