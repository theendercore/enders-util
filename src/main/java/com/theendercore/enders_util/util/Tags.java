package com.theendercore.enders_util.util;

import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.Registry;

import static com.theendercore.enders_util.EndersUtil.nameSpace;

public class Tags {
    public static final TagKey<Block> MOSS_PASSABLE = ofBlock("moss_passable");

    private static TagKey<Block> ofBlock(String id) {
        return TagKey.of(Registry.BLOCK_KEY, nameSpace(id));
    }
}
