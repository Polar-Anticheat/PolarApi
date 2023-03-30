package top.polar.api.event;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.polar.api.check.ApiCheckType;
import top.polar.api.stats.StatisticalPlayerData;

@Getter
public class DetectionAlertEvent extends Event implements Cancellable {

    @Getter
    private static final HandlerList handlerList = new HandlerList();

    private final String playerName;
    @Nullable
    private final Player player;
    private final ApiCheckType apiCheckType;
    @Setter
    private String chatMessage;
    @Nullable
    @Setter
    private String debugDetails;
    @Setter
    private String clickRunCommand;
    private final double violationLevel;
    private final StatisticalPlayerData statisticalPlayerData;
    @Setter
    private boolean cancelled;

    public DetectionAlertEvent(String playerName, @Nullable Player player, ApiCheckType apiCheckType,
                               String chatMessage, @Nullable String debugDetails, String clickRunCommand,
                               double violationLevel, StatisticalPlayerData statisticalPlayerData) {
        super(true);
        this.playerName = playerName;
        this.player = player;
        this.apiCheckType = apiCheckType;
        this.chatMessage = chatMessage;
        this.debugDetails = debugDetails;
        this.clickRunCommand = clickRunCommand;
        this.violationLevel = violationLevel;
        this.statisticalPlayerData = statisticalPlayerData;
    }

    @Override
    @NotNull
    public HandlerList getHandlers() {
        return handlerList;
    }

    @NotNull
    public static HandlerList getHandlerList() {
        return handlerList;
    }
}
