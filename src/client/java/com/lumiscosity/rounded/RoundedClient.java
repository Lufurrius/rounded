package com.lumiscosity.rounded;

import com.lumiscosity.rounded.blocks.RegisterBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class RoundedClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(RegisterBlocks.LUSTERSHROOM_PLANT, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(RegisterBlocks.DEAD_BLADDERWRACK, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(RegisterBlocks.BLADDERWRACK, RenderLayer.getCutout());
	}
}