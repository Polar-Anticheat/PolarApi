package top.polar.api.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import top.polar.api.check.ApiCheckType;
import top.polar.api.stats.StatisticalPlayerData;

import javax.annotation.Nullable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DetectionAlertEvent extends Event {

    @Getter
    private static final HandlerList HANDLER_LIST = new HandlerList();

    private Player player;
    private ApiCheckType apiCheckType;
    @Nullable
    private String debugDetails;
    private double violationLevel;
    private StatisticalPlayerData statisticalPlayerData;

    @Override
    @NotNull
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }
}
