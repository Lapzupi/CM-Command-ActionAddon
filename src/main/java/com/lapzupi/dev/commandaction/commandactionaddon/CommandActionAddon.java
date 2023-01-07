package com.lapzupi.dev.commandaction.commandactionaddon;

import com.lapzupi.dev.configurablemenus.addons.ActionAddon;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public final class CommandActionAddon extends ActionAddon {
    @Override
    public void onClick(final Player player, final @NotNull String args) {
        //command:player:
        //command:console:
        if (args.startsWith("player:")) {
            String param = args.split("player:")[1];
            Bukkit.dispatchCommand(player,param);
            return;
        }

        if(args.startsWith("console:")) {
            String param = args.split("console:")[1];
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(),param);
        }

    }

    @Contract(pure = true)
    @Override
    public @NotNull String getPrefix() {
        return "command";
    }

    @Contract(pure = true)
    @Override
    public @Nullable String getPluginName() {
        return null;
    }

    @Override
    public boolean canRegister() {
        return true;
    }

    @Contract(pure = true)
    @Override
    public @NotNull String getAuthor() {
        return "Lapzupi Development Team";
    }

    @Contract(pure = true)
    @Override
    public @NotNull String getVersion() {
        return "1.0.0";
    }

    @Override
    public String getUrl() {
        return "https://github.com/Lapzupi/CM-Command-ActionAddon";
    }
}
