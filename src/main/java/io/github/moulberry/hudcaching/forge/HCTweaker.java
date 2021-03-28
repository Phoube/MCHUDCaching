package io.github.moulberry.hudcaching.forge;

import net.minecraft.launchwrapper.Launch;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

import java.util.Map;

public class HCTweaker implements IFMLLoadingPlugin {

    public HCTweaker() {
        MixinBootstrap.init();
        Mixins.addConfiguration("mixins.hudcaching.json");
    }

    @Override
    public String[] getASMTransformerClass() {
        return new String[]{"io.github.moulberry.hudcaching.asm.ClassTransformer"};
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {

    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
