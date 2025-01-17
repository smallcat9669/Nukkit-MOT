package cn.nukkit.network.protocol;

/**
 * @since 594
 */
public class AgentAnimationPacket extends DataPacket {
    public static final int NETWORK_ID = ProtocolInfo.AGENT_ANIMATION_PACKET;

    public byte animation;
    public long runtimeEntityId;

    public final byte TYPE_ARM_SWING = 0;

    public final byte TYPE_SHRUG = 1;

    @Override
    public byte pid() {
        return ProtocolInfo.__INTERNAL__AGENT_ANIMATION_PACKET;
    }

    @Override
    public int packetId() {
        return NETWORK_ID;
    }

    @Override
    public void decode() {
        this.animation = (byte) this.getByte();
        this.runtimeEntityId = this.getEntityRuntimeId();
    }

    @Override
    public void encode() {
        this.putByte(this.animation);
        this.putEntityRuntimeId(this.runtimeEntityId);
    }
}