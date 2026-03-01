# Azimuth

Azimuth is a Create addon library focused on extending Create's capabilities and improving API accessibility for addon developers.

[Read the full docs here!](https://azimuth.azmod.net)

It provides three main systems:

- **Super Block Entity Behaviours** for composable, high-capability behaviour components.
- **Advancements** for Create-style advancement definitions and awarding.
- **More Outlines** for additional animated outline helpers, especially useful in Ponder scenes.

## Compatibility

- **Minecraft:** `1.21.1`
- **NeoForge:** `21.1.x`
- **Java:** `21`

## Add Azimuth to your mod

Add Azimuth to your `build.gradle` dependencies block (replace `<version>` with the version you want):

```groovy
dependencies {
	implementation "com.cake.azimuth:azimuth:<version>"
}
```

You can also declare it as a required dependency in your `neoforge.mods.toml`:

```toml
[[dependencies.yourmodid]]
	modId = "azimuth"
	type = "required"
	versionRange = "[<version>,)"
	ordering = "AFTER"
	side = "BOTH"
```

Azimuth does not require explicit initialization. Add the dependency and use the APIs.

## What's included

### Super Block Entity Behaviours

`SuperBlockEntityBehaviour` extends Create's behaviour model for `SmartBlockEntity` with a fuller lifecycle and integration points, including:

- tick and lifecycle hooks
- behaviour lookups across positions/block entities
- optional block break hooks
- behaviour injection via applicators
- extension interfaces for kinetics, rendering, and schematic item requirements

This is designed to let you compose block-entity-scale functionality without always introducing a new block entity type.

### Advancements

Azimuth exposes a Create-compatible advancement workflow built around:

- `AzimuthAdvancementProvider`
- `AzimuthAdvancement`
- `AzimuthAdvancementBehaviour`

You can define advancement trees, hook lang + datagen output, award manually when using built-in triggers, and award from block entities through behaviour tracking.

### Outlines

Azimuth adds additional Catnip outliner types for richer visual guidance:

- `ExpandingLineOutline`: midpoint-out animated line growth with ease-out motion
- `ExpandingLineOutlineInstruction`: a ready-to-use Ponder `TickingInstruction` wrapper

## Development

Useful Gradle commands:

```bash
./gradlew build
./gradlew runClient
./gradlew runData
```

If dependencies become desynced locally:

```bash
./gradlew --refresh-dependencies
./gradlew clean
```

## Documentation

Authoritative docs are maintained in the Azimuth docs project (`AzimuthDocs/docs`), including:

- Getting Started
- Super Behaviours
- Advancements
- Outlines
