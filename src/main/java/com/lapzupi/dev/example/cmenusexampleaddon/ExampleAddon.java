package com.lapzupi.dev.example.cmenusexampleaddon;

import com.lapzupi.dev.configurablemenus.addons.ItemAddon;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public final class ExampleAddon extends ItemAddon {

    @Override
    public @NotNull ItemStack getItemStack(final String id) {
        return new ItemStack(Material.valueOf(id));
    }

    @Contract(pure = true)
    @Override
    public @NotNull String getPrefix() {
        return "example";
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
        return "https://github.com/Lapzupi/CM-Example-Addon";
    }
}
