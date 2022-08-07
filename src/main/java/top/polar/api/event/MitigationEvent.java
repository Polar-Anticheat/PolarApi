package top.polar.api.event;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.polar.api.check.ApiCheckType;

@Getter
public class MitigationEvent extends Event implements Cancellable {

    @Getter
    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final String playerName;
    @Nullable
    private final Player player;
    private final ApiCheckType apiCheckType;
    private final MitigationType mitigationType;
    @Setter
    private boolean cancelled;

    public MitigationEvent(String playerName, @Nullable Player player, ApiCheckType apiCheckType, MitigationType mitigationType) {
        super(true);
        this.playerName = playerName;
        this.player = player;
        this.apiCheckType = apiCheckType;
        this.mitigationType = mitigationType;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public enum MitigationType {
        MOVEMENT, VELOCITY, ATTACK, NONE
    }
}
