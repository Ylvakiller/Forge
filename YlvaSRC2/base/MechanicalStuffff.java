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

@Mod(modid=MechanicalStuffff.MODID, name=MechanicalStuffff.MODNAME, version=MechanicalStuffff.MODVER) //Tell forge "Oh hey, there's a new mod here to load."
public class MechanicalStuffff {
	//Set the ID of the mod (Should be lower case).
    public static final String MODID = "MechanicalSuit";
    //Set the "Name" of the mod.
    public static final String MODNAME = "MechanicalSuit";
    //Set the version of the mod.
    public static final String MODVER = "0.01";

    
    public static Block ArmorBench;
    public static MechanicalTab mechanicalTab;
    
    @Instance(value = MechanicalStuffff.MODID) //Tell Forge what instance to use.
    public static MechanicalStuffff instance;
        
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	mechanicalTab = new MechanicalTab(CreativeTabs.getNextID(),"MechanicalTab");
    	ArmorBench = new ArmorBench().setCreativeTab(mechanicalTab);
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
