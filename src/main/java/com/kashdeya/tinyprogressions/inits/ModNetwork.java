package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.main.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

public class ModNetwork {
	public static final ResourceLocation CHANNEL_NAME = new ResourceLocation(Reference.MOD_ID, "network");

	public static final String NETWORK_VERSION = new ResourceLocation(Reference.MOD_ID, "1").toString();

	public static SimpleChannel getNetworkChannel() {
		
		
		
		final SimpleChannel channel = NetworkRegistry.ChannelBuilder.named(CHANNEL_NAME)
				.clientAcceptedVersions(version -> true)
				.serverAcceptedVersions(version -> true)
				.networkProtocolVersion(() -> NETWORK_VERSION)
				.simpleChannel();
		
		
		
//	my old crap for reference
//		channel.messageBuilder(PacketEnviroProperty.class, 1)
//				.decoder(PacketEnviroProperty::decode)
//				.encoder(PacketEnviroProperty::encode)
//				.consumer(PacketEnviroProperty::handle)
//				.add();
		
//		channel.messageBuilder(Hydration_Packets.class, 2)
//				.decoder(Hydration_Packets::decode)
//				.encoder(Hydration_Packets::encode)
//				.consumer(Hydration_Packets::handle)
//				.add();
//
//		channel.messageBuilder(FluidTankContentsMessage.class, 2)
//				.decoder(FluidTankContentsMessage::decode)
//				.encoder(FluidTankContentsMessage::encode)
//				.consumer(FluidTankContentsMessage::handle)
//				.add();
//
//		channel.messageBuilder(SetLockCodeMessage.class, 3)
//				.decoder(SetLockCodeMessage::decode)
//				.encoder(SetLockCodeMessage::encode)
//				.consumer(SetLockCodeMessage::handle)
//				.add();
//
//		channel.messageBuilder(UpdateChunkEnergyValueMessage.class, 4)
//				.decoder(UpdateChunkEnergyValueMessage::decode)
//				.encoder(UpdateChunkEnergyValueMessage::encode)
//				.consumer(UpdateChunkEnergyValueMessage::handle)
//				.add();
//
//
//		channel.messageBuilder(BulkUpdateContainerFluidTanksMessage.class, 5)
//				.decoder(BulkUpdateContainerFluidTanksMessage::decode)
//				.encoder(BulkUpdateContainerFluidTanksMessage::encode)
//				.consumer(BulkUpdateContainerFluidTanksMessage::handle)
//				.add();
//
//		channel.messageBuilder(UpdateContainerFluidTankMessage.class, 6)
//				.decoder(UpdateContainerFluidTankMessage::decode)
//				.encoder(UpdateContainerFluidTankMessage::encode)
//				.consumer(UpdateContainerFluidTankMessage::handle)
//				.add();
//
//
//		channel.messageBuilder(BulkUpdateContainerHiddenBlockRevealersMessage.class, 7)
//				.decoder(BulkUpdateContainerHiddenBlockRevealersMessage::decode)
//				.encoder(BulkUpdateContainerHiddenBlockRevealersMessage::encode)
//				.consumer(BulkUpdateContainerHiddenBlockRevealersMessage::handle)
//				.add();
//
//		channel.messageBuilder(UpdateContainerHiddenBlockRevealerMessage.class, 8)
//				.decoder(UpdateContainerHiddenBlockRevealerMessage::decode)
//				.encoder(UpdateContainerHiddenBlockRevealerMessage::encode)
//				.consumer(UpdateContainerHiddenBlockRevealerMessage::handle)
//				.add();
//
//
//		channel.messageBuilder(BulkUpdateContainerLastUseTimesMessage.class, 9)
//				.decoder(BulkUpdateContainerLastUseTimesMessage::decode)
//				.encoder(BulkUpdateContainerLastUseTimesMessage::encode)
//				.consumer(BulkUpdateContainerLastUseTimesMessage::handle)
//				.add();
//
//		channel.messageBuilder(UpdateContainerLastUseTimeMessage.class, 10)
//				.decoder(UpdateContainerLastUseTimeMessage::decode)
//				.encoder(UpdateContainerLastUseTimeMessage::encode)
//				.consumer(UpdateContainerLastUseTimeMessage::handle)
//				.add();
//
//
//		channel.messageBuilder(BulkUpdateContainerPigSpawnerFinitesMessage.class, 11)
//				.decoder(BulkUpdateContainerPigSpawnerFinitesMessage::decode)
//				.encoder(BulkUpdateContainerPigSpawnerFinitesMessage::encode)
//				.consumer(BulkUpdateContainerPigSpawnerFinitesMessage::handle)
//				.add();
//
//		channel.messageBuilder(UpdateContainerPigSpawnerFiniteMessage.class, 12)
//				.decoder(UpdateContainerPigSpawnerFiniteMessage::decode)
//				.encoder(UpdateContainerPigSpawnerFiniteMessage::encode)
//				.consumer(UpdateContainerPigSpawnerFiniteMessage::handle)
//				.add();
//
//		channel.messageBuilder(OpenClientScreenMessage.class, 13)
//				.decoder(OpenClientScreenMessage::decode)
//				.encoder(OpenClientScreenMessage::encode)
//				.consumer(OpenClientScreenMessage::handle)
//				.add();

		return channel;
	}
}