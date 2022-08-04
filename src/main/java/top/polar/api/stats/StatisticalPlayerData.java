package top.polar.api.stats;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.bukkit.GameMode;
import org.bukkit.Location;

import javax.annotation.Nullable;

@Getter
@AllArgsConstructor
@Nullable
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StatisticalPlayerData {

    String clientVersion;
    String clientName;
    int ping;
    Location location;
    GameMode gameMode;
    long ticksExisted;

}
