package com.pickbreaker.myFirstMod.client.gui;

import com.pickbreaker.myFirstMod.handler.ConfigurationHandler;
import com.pickbreaker.myFirstMod.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

/**
 * Created by Benedikt on 08.02.2015.
 */
public class ModGuiConfig extends GuiConfig {

    public ModGuiConfig(GuiScreen parentScreen) {
        super(parentScreen, new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), Reference.MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}