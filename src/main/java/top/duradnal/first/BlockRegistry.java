package top.duradnal.first;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import top.duradnal.first.block.GlassJar;
import top.duradnal.first.block.ObsidianBlock;
import top.duradnal.first.block.ObsidianFrame;
import top.duradnal.first.block.ObsidianRubikCubeBlock;

public class BlockRegistry {

    public static final DeferredRegister<Block> BLOCKEVENT = new DeferredRegister<>(ForgeRegistries.BLOCKS, "first");

    public static RegistryObject<Block> obsidianBlock = BLOCKEVENT.register("obsidian_block", ObsidianBlock::new);
    public static RegistryObject<Block> obsidianRubikCubeBlock = BLOCKEVENT.register("obsidian_rubik_cube", ObsidianRubikCubeBlock::new);
    public static RegistryObject<Block> obsidianFrame = BLOCKEVENT.register("obsidian_frame", ObsidianFrame::new);
    public static RegistryObject<Block> glassJar=BLOCKEVENT.register("glass_jar", GlassJar::new);
}
