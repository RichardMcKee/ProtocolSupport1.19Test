package protocolsupport.protocol.packet.middle.base.clientbound.play;

import io.netty.buffer.ByteBuf;
import protocolsupport.protocol.codec.ArrayCodec;
import protocolsupport.protocol.codec.MiscDataCodec;
import protocolsupport.protocol.packet.middle.base.clientbound.ClientBoundMiddlePacket;
import protocolsupport.protocol.utils.EnumConstantLookup;

public abstract class MiddleUnlockRecipes extends ClientBoundMiddlePacket {

	protected MiddleUnlockRecipes(IMiddlePacketInit init) {
		super(init);
	}

	protected Action action;
	protected boolean craftRecipeBookOpen;
	protected boolean craftRecipeBookFiltering;
	protected boolean smeltingRecipeBookOpen;
	protected boolean smeltingRecipeBookFiltering;
	protected boolean blastFurnaceRecipeBookOpen;
	protected boolean blastFurnaceRecipeBookFiltering;
	protected boolean smokerRecipeBookOpen;
	protected boolean smokerRecipeBookFiltering;
	protected String[] recipes1;
	protected String[] recipes2;

	@Override
	protected void decode(ByteBuf serverdata) {
		action = MiscDataCodec.readVarIntEnum(serverdata, Action.CONSTANT_LOOKUP);
		craftRecipeBookOpen = serverdata.readBoolean();
		craftRecipeBookFiltering = serverdata.readBoolean();
		smeltingRecipeBookOpen = serverdata.readBoolean();
		smeltingRecipeBookFiltering = serverdata.readBoolean();
		blastFurnaceRecipeBookOpen = serverdata.readBoolean();
		blastFurnaceRecipeBookFiltering = serverdata.readBoolean();
		smokerRecipeBookOpen = serverdata.readBoolean();
		smokerRecipeBookFiltering = serverdata.readBoolean();
		recipes1 = ArrayCodec.readVarIntVarIntUTF8StringArray(serverdata);
		if (action == Action.INIT) {
			recipes2 = ArrayCodec.readVarIntVarIntUTF8StringArray(serverdata);
		}
	}

	protected enum Action {
		INIT, ADD, REMOVE;
		public static final EnumConstantLookup<Action> CONSTANT_LOOKUP = new EnumConstantLookup<>(Action.class);
	}

}
