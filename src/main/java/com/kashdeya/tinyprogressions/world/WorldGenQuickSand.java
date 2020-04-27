package com.kashdeya.tinyprogressions.world;

public class WorldGenQuickSand {
//
//
//extends ChunkGeneratorOverworld {
//	
//	public WorldGenQuickSand(World worldIn, long seed, boolean mapFeaturesEnabledIn, String generatorOptions) {
//		super(worldIn, seed, mapFeaturesEnabledIn, generatorOptions);
//		// TODO Auto-generated constructor stub
//		this.world = worldIn;
//		this.rand = new Random(seed);
//	}
//
//	private final World world;
//	private final Random rand;
//	
//	@Override
//	public void populate(int x, int z)
//    {
//        int i = x * 16;
//        int j = z * 16;
//        BlockPos blockpos = new BlockPos(i, 0, j);
//        Biome biome = this.world.getBiome(blockpos.add(16, 0, 16));
//        this.rand.setSeed(this.world.getSeed());
//        long k = this.rand.nextLong() / 2L * 2L + 1L;
//        long l = this.rand.nextLong() / 2L * 2L + 1L;
//        this.rand.setSeed((long)x * k + (long)z * l ^ this.world.getSeed());
//        boolean flag = false;
//        ChunkPos chunkpos = new ChunkPos(x, z);
//
//        net.minecraftforge.event.ForgeEventFactory.onChunkPopulate(true, this, this.world, this.rand, x, z, flag);
//        
//		if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, this.world, this.rand, x, z, flag, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAKE))
//	    {
//	        int i1 = this.rand.nextInt(16) + 8;
//	        int j1 = this.rand.nextInt(256);
//	        int k1 = this.rand.nextInt(16) + 8;
//	        (new WorldGenLakes(TechBlocks.quick_sand)).generate(this.world, this.rand, blockpos.add(i1, j1, k1));
//	    }
//		
//	       net.minecraftforge.event.ForgeEventFactory.onChunkPopulate(false, this, this.world, this.rand, x, z, flag);
//
//	        BlockFalling.fallInstantly = false;
//    }
}