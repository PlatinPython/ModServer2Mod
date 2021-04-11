package platinpython.modserver2mod.util.registries;

import java.util.function.Supplier;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SandBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import platinpython.modserver2mod.ModServer2Mod;
import platinpython.modserver2mod.block.TaigaBushBlock;
import platinpython.modserver2mod.util.RegistryHandler;

public class BlockRegistry {
	public static final RegistryObject<Block> LIMESTONE = register("limestone",
			() -> new Block(Block.Properties.from(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> LIMESTONE_BRICKS = register("limestone_bricks",
			() -> new Block(Block.Properties.from(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> LIMESTONE_CARVED = register("limestone_carved",
			() -> new Block(Block.Properties.from(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> LIMESTONE_COBBLESTONE = register("limestone_cobblestone",
			() -> new Block(Block.Properties.from(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> LIMESTONE_CREEPER = register("limestone_creeper",
			() -> new Block(Block.Properties.from(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> LIMESTONE_PILLAR = register("limestone_pillar",
			() -> new Block(Block.Properties.from(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> LIMESTONE_SANDSTONE = register("limestone_sandstone",
			() -> new Block(Block.Properties.from(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> LIMESTONE_SQUARE_TILES = register("limestone_square_tiles",
			() -> new Block(Block.Properties.from(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> LIMESTONE_STONEBRICKS = register("limestone_stonebricks",
			() -> new Block(Block.Properties.from(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> LIMESTONE_STONEBRICKS_ROUND = register("limestone_stonebricks_round",
			() -> new Block(Block.Properties.from(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> LIMESTONE_TILES = register("limestone_tiles",
			() -> new Block(Block.Properties.from(Blocks.SANDSTONE)));

	public static final RegistryObject<Block> REDDISH_SAND = register("reddish_sand",
			() -> new SandBlock(1, Block.Properties.from(Blocks.RED_SAND)));
	public static final RegistryObject<Block> REDDISH_SANDSTONE = register("reddish_sandstone",
			() -> new Block(Block.Properties.from(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> REDDISH_SANDSTONE_BRICKS = register("reddish_sandstone_bricks",
			() -> new Block(Block.Properties.from(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> REDDISH_SANDSTONE_CARVED_PATTERN = register(
			"reddish_sandstone_carved_pattern", () -> new Block(Block.Properties.from(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> REDDISH_SANDSTONE_CARVED = register("reddish_sandstone_carved",
			() -> new Block(Block.Properties.from(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> REDDISH_SANDSTONE_COBBLESTONE = register("reddish_sandstone_cobblestone",
			() -> new Block(Block.Properties.from(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> REDDISH_SANDSTONE_CREEPER = register("reddish_sandstone_creeper",
			() -> new Block(Block.Properties.from(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> REDDISH_SANDSTONE_SMOOTH = register("reddish_sandstone_smooth",
			() -> new Block(Block.Properties.from(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> REDDISH_SANDSTONE_SQUARE_TILES = register(
			"reddish_sandstone_square_tiles", () -> new Block(Block.Properties.from(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> REDDISH_SANDSTONE_STONEBRICKS = register("reddish_sandstone_stonebricks",
			() -> new Block(Block.Properties.from(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> REDDISH_SANDSTONE_STONEBRICKS_ROUND = register(
			"reddish_sandstone_stonebricks_round", () -> new Block(Block.Properties.from(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> REDDISH_SANDSTONE_TILES = register("reddish_sandstone_tiles",
			() -> new Block(Block.Properties.from(Blocks.RED_SANDSTONE)));

	public static final RegistryObject<Block> STONE_BLOCK = register("stone_block",
			() -> new Block(Block.Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> STONE_BRICK = register("stone_brick",
			() -> new Block(Block.Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> STONE_CREEPER = register("stone_creeper",
			() -> new Block(Block.Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> STONE_PILLAR = register("stone_pillar",
			() -> new Block(Block.Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> STONE_TILES = register("stone_tiles",
			() -> new Block(Block.Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> STONEBRICK_ROUND = register("stonebrick_round",
			() -> new Block(Block.Properties.from(Blocks.STONE)));

	public static final RegistryObject<Block> STUCCO = register("stucco",
			() -> new Block(Block.Properties.from(Blocks.TERRACOTTA)));
	public static final RegistryObject<Block> STUCCO_APPLE = register("stucco_apple",
			() -> new Block(Block.Properties.from(Blocks.TERRACOTTA)));
	public static final RegistryObject<Block> STUCCO_BONBON = register("stucco_bonbon",
			() -> new Block(Block.Properties.from(Blocks.TERRACOTTA)));
	public static final RegistryObject<Block> STUCCO_CHERRY = register("stucco_cherry",
			() -> new Block(Block.Properties.from(Blocks.TERRACOTTA)));
	public static final RegistryObject<Block> STUCCO_CITRON = register("stucco_citron",
			() -> new Block(Block.Properties.from(Blocks.TERRACOTTA)));
	public static final RegistryObject<Block> STUCCO_DEEP = register("stucco_deep",
			() -> new Block(Block.Properties.from(Blocks.TERRACOTTA)));
	public static final RegistryObject<Block> STUCCO_LAVENDER = register("stucco_lavender",
			() -> new Block(Block.Properties.from(Blocks.TERRACOTTA)));
	public static final RegistryObject<Block> STUCCO_MAROON = register("stucco_maroon",
			() -> new Block(Block.Properties.from(Blocks.TERRACOTTA)));
	public static final RegistryObject<Block> STUCCO_MINT = register("stucco_mint",
			() -> new Block(Block.Properties.from(Blocks.TERRACOTTA)));
	public static final RegistryObject<Block> STUCCO_PEACH = register("stucco_peach",
			() -> new Block(Block.Properties.from(Blocks.TERRACOTTA)));
	public static final RegistryObject<Block> STUCCO_PETROL = register("stucco_petrol",
			() -> new Block(Block.Properties.from(Blocks.TERRACOTTA)));

	public static final RegistryObject<Block> RED_STEEL_GIRDER = register("red_steel_girder",
			() -> new Block(Block.Properties.from(Blocks.IRON_BLOCK)));

	public static final RegistryObject<Block> TAIGA_BUSH = register("taiga_bush", TaigaBushBlock::new);

	public static void register() {
	}

	private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
		return RegistryHandler.BLOCKS.register(name, block);
	}

	private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
		RegistryObject<T> ret = registerNoItem(name, block);
		RegistryHandler.ITEMS.register(name,
				() -> new BlockItem(ret.get(), new Item.Properties().group(ModServer2Mod.ITEM_GROUP_RANDOM)));
		return ret;
	}
}
