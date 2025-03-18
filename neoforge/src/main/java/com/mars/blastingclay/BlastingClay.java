package com.mars.blastingclay;


import com.mars.blastingclay.CommonClass;
import com.mars.blastingclay.Constants;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class BlastingClay {
    public BlastingClay(IEventBus eventBus) {
        CommonClass.init();
    }
}
