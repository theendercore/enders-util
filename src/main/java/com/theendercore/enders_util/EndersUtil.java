package com.theendercore.enders_util;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

import java.util.logging.Logger;

public class EndersUtil implements ModInitializer {

    public static String MODID = "enders_util";
    public static Logger LOGGER = Logger.getLogger(MODID);
    public static Identifier nameSpace(String path){
        return new Identifier(MODID, path);
    }
    @Override
    public void onInitialize() {
        LOGGER.info("Crawling out of the void!");
    }
}
