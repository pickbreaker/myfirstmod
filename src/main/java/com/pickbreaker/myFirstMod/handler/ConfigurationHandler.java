package com.pickbreaker.myFirstMod.handler;

import com.pickbreaker.myFirstMod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Benedikt on 07.02.2015.
 */
public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue=false;

    public static void init(File configFile){
        if (configuration==null) {
            configuration = new Configuration(configFile);
        }
    }
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
{
loadConfiguration();
}
    }
    public void loadConfiguration()
    {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value");

                if (configuration.hasChanged())
                {
                    configuration.save();
                }
    }
}
