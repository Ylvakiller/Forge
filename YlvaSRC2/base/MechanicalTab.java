package base;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import blocks.*;

public class MechanicalTab extends CreativeTabs {

	public MechanicalTab(int id, String unloaclizedName) {
		super(id, unloaclizedName);
		// TODO Auto-generated constructor stub
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return Items.blaze_rod;
	}

}
