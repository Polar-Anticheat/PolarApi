package top.polar.api.event;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import top.polar.api.check.ApiCheckType;

@Getter
@RequiredArgsConstructor
public class MitigationEvent extends Event implements Cancellable {

    @Getter
    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final Player player;
    private final ApiCheckType apiCheckType;
    private final MitigationType mitigationType;
    @Setter
    private boolean cancelled;

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public enum MitigationType {
        SETBACK, HIT_CANCEL
    }

}
