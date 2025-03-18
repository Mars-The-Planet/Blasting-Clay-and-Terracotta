package com.mars.blastingclay;

import com.mars.deimos.config.DeimosConfig;
import com.mars.deimos.datagen.DeimosRecipeGenerator;
import net.minecraft.resources.ResourceLocation;

import static com.mars.blastingclay.Constants.MOD_ID;

public class CommonClass {
    public static void init() {
        DeimosConfig.init(MOD_ID, BlastingClayConfig.class);

        for(String rawMetal : BlastingClayConfig.blasting_list){
            String[] rawMetalSet =  ((rawMetal).replaceAll("\\s","")).split(",");
            DeimosRecipeGenerator.createBlastingJson(rawMetalSet[0], rawMetalSet[1], 100, Float.parseFloat(rawMetalSet[2]));
        }
    }
}
