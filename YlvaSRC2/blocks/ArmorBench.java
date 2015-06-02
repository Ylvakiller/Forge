package blocks;

import base.MechanicalSuit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class ArmorBench extends Block {

	public ArmorBench() {
		super(Material.rock);
		super.setBlockName("ArmorBench");
		super.setCreativeTab(MechanicalSuit.mechanicalTab);
	}

}
