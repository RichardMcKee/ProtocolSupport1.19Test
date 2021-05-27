package protocolsupport.protocol.typeremapper.entity.format.metadata.types.object;

import protocolsupport.protocol.typeremapper.entity.format.metadata.object.value.NetworkEntityMetadataObjectIndexValueNoOpTransformer;
import protocolsupport.protocol.typeremapper.entity.format.metadata.types.base.BaseNetworkEntityMetadataFormatTransformerFactory;
import protocolsupport.protocol.types.networkentity.metadata.NetworkEntityMetadataObjectIndex;
import protocolsupport.protocol.utils.ProtocolVersionsHelper;

public class EnderCrystalNetworkEntityMetadataFormatTransformerFactory extends BaseNetworkEntityMetadataFormatTransformerFactory {

	public static final EnderCrystalNetworkEntityMetadataFormatTransformerFactory INSTANCE = new EnderCrystalNetworkEntityMetadataFormatTransformerFactory();

	protected EnderCrystalNetworkEntityMetadataFormatTransformerFactory() {
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.EnderCrystal.TARGET, 7), ProtocolVersionsHelper.UP_1_14);
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.EnderCrystal.TARGET, 6), ProtocolVersionsHelper.RANGE__1_10__1_13_2);
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.EnderCrystal.TARGET, 5), ProtocolVersionsHelper.ALL_1_9);

		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.EnderCrystal.SHOW_BOTTOM, 8), ProtocolVersionsHelper.UP_1_14);
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.EnderCrystal.SHOW_BOTTOM, 7), ProtocolVersionsHelper.RANGE__1_10__1_13_2);
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.EnderCrystal.SHOW_BOTTOM, 6), ProtocolVersionsHelper.ALL_1_9);
	}

}
