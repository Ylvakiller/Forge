package submarine;

import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=submarine.MODID, name=submarine.MODNAME, version=submarine.MODVER) //Tell forge "Oh hey, there's a new mod here to load."
public class submarine {
	 //Set the ID of the mod (Should be lower case).
    public static final String MODID = "submarine";
    //Set the "Name" of the mod.
    public static final String MODNAME = "submarine Mod";
    //Set the version of the mod.
    public static final String MODVER = "0.0.1";
    
    @cpw.mods.fml.common.Mod.Instance(value = submarine.MODID) //Tell Forge what instance to use.
    public static submarine instance;
           
    public static Item itemTable;
    
    
    @cpw.mods.fml.common.Mod.EventHandler
    public void preInit(cpw.mods.fml.common.event.FMLPreInitializationEvent event)
    {
    	//item/block init and registering
        // Config handling 
    	itemTable = new ItemTable().setUnlocalizedName("ItemTable").setTextureName("submarine:itemtable"); //item.itemTable
    	GameRegistry.registerItem(itemTable, itemTable.getUnlocalizedName().substring(5)); //gets rid of the item.
    }
       
    @cpw.mods.fml.common.Mod.EventHandler
    public void load(cpw.mods.fml.common.event.FMLInitializationEvent event)
    {
    	//Proxy, TileEntity, entity, GUI and packet registering
    }
    
    @cpw.mods.fml.common.Mod.EventHandler
    public void postInit(cpw.mods.fml.common.event.FMLPostInitializationEvent event)
    {
    
    }
	
}
