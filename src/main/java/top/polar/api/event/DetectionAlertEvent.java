package top.polar.api.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.polar.api.check.ApiCheckType;
import top.polar.api.stats.StatisticalPlayerData;

@Getter
public class DetectionAlertEvent extends Event {

    @Getter
    private static final HandlerList HANDLER_LIST = new HandlerList();

    private String playerName;
    @Nullable
    private Player player;
    private ApiCheckType apiCheckType;
    @Nullable
    private String debugDetails;
    private double violationLevel;
    private StatisticalPlayerData statisticalPlayerData;

    public DetectionAlertEvent(String playerName, @Nullable Player player, ApiCheckType apiCheckType,
                               @Nullable String debugDetails, double violationLevel,
                               StatisticalPlayerData statisticalPlayerData) {
        super(true);
        this.playerName = playerName;
        this.player = player;
        this.apiCheckType = apiCheckType;
        this.debugDetails = debugDetails;
        this.violationLevel = violationLevel;
        this.statisticalPlayerData = statisticalPlayerData;
    }

    public DetectionAlertEvent() {
        super(true);
    }

    @Override
    @NotNull
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }
}
