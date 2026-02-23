package net.zoeydismal.zrosegold.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.zoeydismal.zrosegold.ZRoseGoldMod;

public class ModTags {
    public static class blocks {
        public static final TagKey<Block> NEEDS_ROSEGOLD_TOOL = tag("needs_rosegold_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ZRoseGoldMod.MOD_ID, name));
        }
    }
}
