<img src="https://i.imgur.com/Q1muxTC.png" width=100 alt="Logo" style="float: left; margin-right: 20px" />

## Polar API
<p style="margin-top: -15px">Public API for Polar, an advanced cheat prevention software</p>

### Introduction
This API consists of 4 events, each gets called whenever a corresponding event happens internally, within the anticheat 
software.

### AntiCheat
Looking for Polar AntiCheat instead of its API? Polar can be purchased at https://polar.top .

### Usage
Listen for any of the four events in a standard Bukkit listener.
Watch out for `@Nullable` annotations, which indicate that a field needs to be null-checked.

### Events
- `DetectionAlertEvent` - gets called right before a cheat detection alert is sent.
- `MitigationEvent` - gets called when the anticheat tries to prevent a player from taking advantage of their cheats. 
This can be in the form of a setback or a cancellation of a hit. The event can be cancelled to prevent the mitigation.
- `OffenderBanEvent` / `OffenderKickEvent` get called right before the AntiCheat is about to ban/kick a hacker.
This event can be cancelled, which will result in no punishment being issued.

### Important
Do **not** shade the API inside your plugin. Ensure that you add `PolarLoader` to your dependencies list and **NOT** 
Polar

### Installation
Guide on how to use jitpack will be here