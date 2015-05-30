package mechanicalStufffff;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=MechanicalStuffff.MODID, name=MechanicalStuffff.MODNAME, version=MechanicalStuffff.MODVER) //Tell forge "Oh hey, there's a new mod here to load."
public class MechanicalStuffff {
	//Set the ID of the mod (Should be lower case).
    public static final String MODID = "Mechanical Stufffs";
    //Set the "Name" of the mod.
    public static final String MODNAME = "Mechanical Stufffs";
    //Set the version of the mod.
    public static final String MODVER = "42";

    @Instance(value = MechanicalStuffff.MODID) //Tell Forge what instance to use.
    public static MechanicalStuffff instance;
        
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        
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
