package com.kashdeya.tinyprogressions.items;

import java.util.List;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityFireworkRocket;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.google.common.collect.Sets;
import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class BirthdayPickaxe extends ItemTool {
	
	private static final Set effective_against = Sets.newHashSet(new Block[] {Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE});
	private final Item.ToolMaterial material;
	private final float attackDamage;
    
	public BirthdayPickaxe(Item.ToolMaterial material)
	{
		super(material, effective_against);
        this.setMaxDamage(2561);
        this.material = material;
        this.maxStackSize = 1;
        this.setHarvestLevel("pickaxe", 4);
		this.setUnlocalizedName("BirthdayPickaxe");
		this.attackDamage = 1.5F + material.getDamageVsEntity();
	    this.setCreativeTab(tinyprogressions.tabTP);
	}
	 
	public boolean canHarvest(IBlockState blockIn)
	{
	    Block block = blockIn.getBlock();
	    return block == Blocks.OBSIDIAN;
	}
	  
	public float getStr(ItemStack stack, IBlockState state)
	{
	    Block block = state.getBlock();
	    if (block == Blocks.OBSIDIAN) {
	    	return this.efficiencyOnProperMaterial;
	    }
	    return 0.0F;
	}
	
	/**
     * Returns the amount of damage this item will deal. One heart of damage is equal to 2 damage points.
     */
    public float getDamageVsEntity()
    {
        return this.material.getDamageVsEntity();
    }
    
    /**
     * Return whether this item is repairable in an anvil.
     */
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Blocks.OBSIDIAN);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
    
    @Override
	@SideOnly(Side.CLIENT)
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean flag) {
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.birthday_1").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.birthday_2").getFormattedText());
	}
    
    /**
     * Check whether this Item can harvest the given Block
     */
    @Override
    public boolean canHarvestBlock(IBlockState blockIn)
    {
        Block block = blockIn.getBlock();

        if (block != Blocks.DIAMOND_BLOCK && block != Blocks.DIAMOND_ORE)
        {
            if (block != Blocks.EMERALD_ORE && block != Blocks.EMERALD_BLOCK)
            {
                if (block != Blocks.GOLD_BLOCK && block != Blocks.GOLD_ORE)
                {
                    if (block != Blocks.IRON_BLOCK && block != Blocks.IRON_ORE)
                    {
                        if (block != Blocks.LAPIS_BLOCK && block != Blocks.LAPIS_ORE)
                        {
                            if (block != Blocks.REDSTONE_ORE && block != Blocks.LIT_REDSTONE_ORE)
                            {
                                Material material = blockIn.getMaterial();
                                return material == Material.ROCK ? true : (material == Material.IRON ? true : material == Material.ANVIL);
                            }
                            else
                            {
                                return this.toolMaterial.getHarvestLevel() >= 2;
                            }
                        }
                        else
                        {
                            return this.toolMaterial.getHarvestLevel() >= 1;
                        }
                    }
                    else
                    {
                        return this.toolMaterial.getHarvestLevel() >= 1;
                    }
                }
                else
                {
                    return this.toolMaterial.getHarvestLevel() >= 2;
                }
            }
            else
            {
                return this.toolMaterial.getHarvestLevel() >= 2;
            }
        }
        else
        {
            return this.toolMaterial.getHarvestLevel() >= 2;
        }
    }
    
    @Override
    public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
    	Material material = state.getMaterial();
        return material != Material.IRON && material != Material.ANVIL && material != Material.ROCK ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
    }
    
    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (!playerIn.canPlayerEdit(pos, facing, stack))
        {
            return EnumActionResult.FAIL;
        }
        else
        {
        	boolean flag = worldIn.getBlockState(pos).getBlock().isReplaceable(worldIn, pos);
            BlockPos blockpos = flag ? pos : pos.offset(facing);
            
        	if (!worldIn.isRemote && playerIn.getName().equalsIgnoreCase("dark" + "osto"))
            {
                worldIn.setBlockState(blockpos, Blocks.CAKE.getDefaultState());
                playerIn.addChatMessage(new TextComponentString("HAPPY BIRTHDAY DARKOSTO" + TextFormatting.GREEN + TextFormatting.BOLD));
                EntityFireworkRocket firework = new EntityFireworkRocket(playerIn.worldObj);
    			firework.setPosition(playerIn.posX, playerIn.posY, playerIn.posZ);
    			playerIn.worldObj.spawnEntityInWorld(firework);
            }
        	else
        	{
        		worldIn.setBlockState(blockpos, Blocks.CAKE.getDefaultState());
        	}

            stack.damageItem(854, playerIn);
            return EnumActionResult.SUCCESS;
        }
    }

}
