package protocolsupport.protocol.typeremapper.entity.format.metadata.types.living.horse;

import protocolsupport.protocol.typeremapper.entity.format.metadata.object.value.NetworkEntityMetadataObjectIndexValueNoOpTransformer;
import protocolsupport.protocol.types.networkentity.metadata.NetworkEntityMetadataObjectIndex;
import protocolsupport.protocol.utils.ProtocolVersionsHelper;

public class CargoHorseNetworkEntityMetadataFormatTransformerFactory extends BaseHorseNetworkEntityMetadataFormatTransformerFactory {

	public static final CargoHorseNetworkEntityMetadataFormatTransformerFactory INSTANCE = new CargoHorseNetworkEntityMetadataFormatTransformerFactory();

	protected CargoHorseNetworkEntityMetadataFormatTransformerFactory() {
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.CargoHorse.HAS_CHEST, 18), ProtocolVersionsHelper.UP_1_15);
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.CargoHorse.HAS_CHEST, 17), ProtocolVersionsHelper.ALL_1_14);
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.CargoHorse.HAS_CHEST, 15), ProtocolVersionsHelper.RANGE__1_11__1_13_2);
	}

}
