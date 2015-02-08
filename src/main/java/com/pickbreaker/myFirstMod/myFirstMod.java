package com.pickbreaker.myFirstMod;

import com.pickbreaker.myFirstMod.handler.ConfigurationHandler;
import com.pickbreaker.myFirstMod.proxy.IProxy;
import com.pickbreaker.myFirstMod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION,guiFactory = Reference.GUI_FACTORY_CLASS)
public class myFirstMod {
    @Mod.Instance("myFirstMod")
    public static myFirstMod instance;
    @SidedProxy(clientSide="com.pickbreaker.myFirstMod.proxy.ClientProxy", serverSide="com.pickbreaker.myFirstMod.proxy.ServerProxy")
    public static IProxy proxy;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
