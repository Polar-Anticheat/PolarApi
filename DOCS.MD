### Introduction

This API consists of 4 events, each gets called whenever a corresponding event happens internally, within the anticheat
software.

### AntiCheat

Looking for Polar AntiCheat instead of its API? Polar can be purchased at https://polar.top .

### Usage

Listen for any of the four events in a standard Bukkit listener. Watch out for `@Nullable` annotations, which indicate
that a field needs to be null-checked.

**Make sure** to register your listener AFTER polar has fully enabled. Since Polar gets initialised asynchronously, you
will have to register a callback. An example is shown below:

```java
import org.bukkit.plugin.java.JavaPlugin;
import top.polar.api.loader.LoaderApi;

public class YourPluginMainClass extends JavaPlugin {

    @Override
    public void onEnable() {
        LoaderApi.registerEnableCallback(() -> {
            // Register your Polar listener here
        });
    }
}
```

### Events

- `DetectionAlertEvent` - gets called right before a cheat detection alert is sent.
- `MitigationEvent` - gets called when the anticheat tries to prevent a player from taking advantage of their cheats.
  This can be in the form of a setback or a cancellation of a hit. The event can be cancelled to prevent the mitigation.
- `OffenderBanEvent` / `OffenderKickEvent` get called right before the AntiCheat is about to ban/kick a hacker. This
  event can be cancelled, which will result in no punishment being issued.

### Important

Do **not** shade the API inside your plugin. Ensure that you add `PolarLoader` to your dependencies list and **NOT**
Polar

### Installation

We suggest using Maven or Gradle dependency managers to install Polar API.

#### Maven Guide

Add the following to your `<repositories>`:

```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```

And add the following to your `<dependencies>`:

```xml
<dependency>
    <groupId>com.github.Polar-Anticheat</groupId>
    <artifactId>PolarApi</artifactId>
    <version>master-SNAPSHOT</version>
    <scope>provided</scope>
</dependency>
```

#### Gradle Guide

Add the following to your `repositories {}`:

```
maven { url 'https://jitpack.io' }
```

Add the following to your `dependencies {}`:

```
compileOnly 'com.github.Polar-Anticheat:PolarApi:master-SNAPSHOT'
```