package top.duradnal.first;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("first")
public class First {
    public First(){
        ItemRegistration.OBSBAR.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
