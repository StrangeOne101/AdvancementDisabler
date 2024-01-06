# Advancement Disabler
A Paper Spigot plugin that disables advancements in certain worlds, or if a user doesn't have a specific permission

# Requirements
- Paper Spigot 1.18+
- Java 17+

# Usage
Configure the config file at `/plugins/AdvancementDisabler/config.yml`.

```yml
DisabledWorlds:
- ExampleWorld1
PermissionRequired: false
```

**DisabledWorlds** - The list of worlds advancements are disabled in. Is case sensitive.<br>
**PermissionRequired** - Whether to test if players have the `advancementdisabler.haspermission` permission. If they don't have it, advancements won't progress.
