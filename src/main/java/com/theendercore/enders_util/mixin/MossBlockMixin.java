package com.theendercore.enders_util.mixin;

import com.theendercore.enders_util.util.Tags;
import net.minecraft.block.BlockState;
import net.minecraft.block.MossBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MossBlock.class)
public class MossBlockMixin {
    @Inject(at = @At("HEAD"), method = "isFertilizable", cancellable = true)
    private void isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient, CallbackInfoReturnable<Boolean> callback) {
        if (world.getBlockState(pos.up()).isIn(Tags.MOSS_PASSABLE)) {
            MinecraftClient.getInstance().inGameHud.getChatHud().addMessage(world.getBlockState(pos.up()).getBlock().getName());
        }
        callback.setReturnValue(world.getBlockState(pos.up()).isIn(Tags.MOSS_PASSABLE));
    }
}
