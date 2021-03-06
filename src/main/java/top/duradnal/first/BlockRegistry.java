package top.duradnal.first;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import top.duradnal.first.block.ObsidianBlock;
import top.duradnal.first.block.ObsidianRubikCubeBlock;

public class BlockRegistry {

    public static final DeferredRegister<Block> BLOCKEVENT = new DeferredRegister<>(ForgeRegistries.BLOCKS, "first");

    public static RegistryObject<Block> ObsidianBlock = BLOCKEVENT.register("obsidian_block", ObsidianBlock::new);
    public static RegistryObject<Block> ObsidianRubikCubeBlock = BLOCKEVENT.register("obsidian_rubik_cube", ObsidianRubikCubeBlock::new);
}
