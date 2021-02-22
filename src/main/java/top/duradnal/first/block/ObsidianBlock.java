package top.duradnal.first.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.PushReaction;

public class ObsidianBlock extends Block {

    private static Material mine=new Material(MaterialColor.BLUE,false,true,true,true,true,false,false, PushReaction.NORMAL);

    public ObsidianBlock(){
        super(Properties.create(mine).hardnessAndResistance(5));
    }
}
