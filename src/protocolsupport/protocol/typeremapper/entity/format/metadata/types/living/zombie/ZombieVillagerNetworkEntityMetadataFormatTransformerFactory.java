package protocolsupport.protocol.typeremapper.entity.format.metadata.types.living.zombie;

import protocolsupport.api.ProtocolVersion;
import protocolsupport.protocol.typeremapper.entity.format.metadata.object.value.NetworkEntityMetadataObjectIndexValueBooleanToByteTransformer;
import protocolsupport.protocol.typeremapper.entity.format.metadata.object.value.NetworkEntityMetadataObjectIndexValueNoOpTransformer;
import protocolsupport.protocol.typeremapper.entity.format.metadata.object.value.NetworkEntityMetadataObjectIndexValueVillagerDataToVarIntTransformer;
import protocolsupport.protocol.types.networkentity.metadata.NetworkEntityMetadataObjectIndex;
import protocolsupport.protocol.utils.ProtocolVersionsHelper;

public class ZombieVillagerNetworkEntityMetadataFormatTransformerFactory extends ZombieNetworkEntityMetadataFormatTransformerFactory {

	public static final ZombieVillagerNetworkEntityMetadataFormatTransformerFactory INSTANCE = new ZombieVillagerNetworkEntityMetadataFormatTransformerFactory();

	protected ZombieVillagerNetworkEntityMetadataFormatTransformerFactory() {
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.ZombieVillager.CONVERTING, 18), ProtocolVersionsHelper.UP_1_15);
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.ZombieVillager.CONVERTING, 17), ProtocolVersionsHelper.ALL_1_14);
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.ZombieVillager.CONVERTING, 15), ProtocolVersionsHelper.RANGE__1_11__1_13_2);
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.ZombieVillager.CONVERTING, 14), ProtocolVersion.MINECRAFT_1_10);
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.ZombieVillager.CONVERTING, 13), ProtocolVersionsHelper.ALL_1_9);
		add(new NetworkEntityMetadataObjectIndexValueBooleanToByteTransformer(NetworkEntityMetadataObjectIndex.ZombieVillager.CONVERTING, 14), ProtocolVersionsHelper.DOWN_1_8);

		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.ZombieVillager.VDATA, 19), ProtocolVersionsHelper.UP_1_15);
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.ZombieVillager.VDATA, 18), ProtocolVersionsHelper.ALL_1_14);
		add(new NetworkEntityMetadataObjectIndexValueVillagerDataToVarIntTransformer(NetworkEntityMetadataObjectIndex.ZombieVillager.VDATA, 16), ProtocolVersionsHelper.RANGE__1_11__1_13_2);
	}

}
