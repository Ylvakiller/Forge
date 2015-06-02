package base;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import blocks.*;

@Mod(modid=MechanicalSuit.MODID, name=MechanicalSuit.MODNAME, version=MechanicalSuit.MODVERSION) //Tell forge "Oh hey, there's a new mod here to load."
public class MechanicalSuit {
	//Set the ID of the mod (Should be lower case).
    public static final String MODID = "mechanicalsuit";
    //Set the "Name" of the mod.
    public static final String MODNAME = "mechanicalsuit";
    //Set the version of the mod.
    public static final String MODVERSION = "0.01";

    
    public static Block ArmorBench;
    public static MechanicalTab mechanicalTab;
    
    @Instance(value = MechanicalSuit.MODID) //Tell Forge what instance to use.
    public static MechanicalSuit instance;
        
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	mechanicalTab = new MechanicalTab(CreativeTabs.getNextID(),"MechanicalTab");
    	ArmorBench = new ArmorBench();
        GameRegistry.registerBlock(ArmorBench, ArmorBench.getUnlocalizedName().substring(5));
        
        
        
    }
        
    @EventHandler
    public void load(FMLInitializationEvent event)
    {

    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
