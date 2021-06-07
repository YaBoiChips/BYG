package corgiaoc.byg.core;

import corgiaoc.byg.BYG;
import corgiaoc.byg.client.textures.BYGMaterials;
import corgiaoc.byg.common.properties.BYGBlockProperties;
import corgiaoc.byg.common.properties.EtherBulbsBlock;
import corgiaoc.byg.common.properties.blocks.*;
import corgiaoc.byg.common.properties.blocks.end.*;
import corgiaoc.byg.common.properties.blocks.end.bulbisgardens.TallBulbisBlock;
import corgiaoc.byg.common.properties.blocks.end.impariusgrove.FungalImpariusFilamentBlock;
import corgiaoc.byg.common.properties.blocks.end.impariusgrove.ImpariusMushroomBranchBlock;
import corgiaoc.byg.common.properties.blocks.end.impariusgrove.ImpariusVineBlock;
import corgiaoc.byg.common.properties.blocks.end.impariusgrove.ImpariusVinePlantBlock;
import corgiaoc.byg.common.properties.blocks.end.nightshade.NightshadeBerryBushBlock;
import corgiaoc.byg.common.properties.blocks.end.shattereddesert.OddityCactusBlock;
import corgiaoc.byg.common.properties.blocks.end.shulkrenforest.ShulkrenVineBlock;
import corgiaoc.byg.common.properties.blocks.end.shulkrenforest.ShulkrenVinePlantBlock;
import corgiaoc.byg.common.properties.blocks.end.viscalisle.SculkGrowthBlock;
import corgiaoc.byg.common.properties.blocks.nether.CrystalBlock;
import corgiaoc.byg.common.properties.blocks.nether.crimson.CrimsonBerryBushBlock;
import corgiaoc.byg.common.properties.blocks.nether.embur.EmburVineBlock;
import corgiaoc.byg.common.properties.blocks.nether.embur.EmburVinePlantBlock;
import corgiaoc.byg.common.properties.blocks.nether.warped.WarpedCactusBlock;
import corgiaoc.byg.common.world.feature.overworld.mushrooms.util.BYGHugeMushroom;
import corgiaoc.byg.common.world.feature.overworld.mushrooms.util.BYGMushroomToHugeMushroom;
import corgiaoc.byg.common.world.feature.overworld.trees.TreeSpawners;
import corgiaoc.byg.common.world.feature.overworld.trees.util.TreeSpawner;
import corgiaoc.byg.core.world.BYGConfiguredFeatures;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.EntityType;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

@SuppressWarnings("deprecation")
public class BYGBlocks {
    public static List<Block> blocksList = new ArrayList<>();


    public static List<Block> flowerPotBlocks = new ArrayList<>();
    public static List<ResourceLocation> flowerIDs = new ArrayList<>();

    public static final Block ASPEN_PLANKS = createPlanks("aspen_planks");
    public static final Block BAOBAB_PLANKS = createPlanks("baobab_planks");
    public static final Block BLUE_ENCHANTED_PLANKS = createPlanks("blue_enchanted_planks");
    public static final Block CHERRY_PLANKS = createPlanks("cherry_planks");
    public static final Block CIKA_PLANKS = createPlanks("cika_planks");
    public static final Block CYPRESS_PLANKS = createPlanks("cypress_planks");
    public static final Block EBONY_PLANKS = createPlanks("ebony_planks");
    public static final Block FIR_PLANKS = createPlanks("fir_planks");
    public static final Block GREEN_ENCHANTED_PLANKS = createPlanks("green_enchanted_planks");
    public static final Block HOLLY_PLANKS = createPlanks("holly_planks");
    public static final Block JACARANDA_PLANKS = createPlanks("jacaranda_planks");
    public static final Block MAHOGANY_PLANKS = createPlanks("mahogany_planks");
    public static final Block MANGROVE_PLANKS = createPlanks("mangrove_planks");
    public static final Block MAPLE_PLANKS = createPlanks("maple_planks");
    public static final Block PINE_PLANKS = createPlanks("pine_planks");
    public static final Block RAINBOW_EUCALYPTUS_PLANKS = createPlanks("rainbow_eucalyptus_planks");
    public static final Block REDWOOD_PLANKS = createPlanks("redwood_planks");
    public static final Block SKYRIS_PLANKS = createPlanks("skyris_planks");
    public static final Block WILLOW_PLANKS = createPlanks("willow_planks");
    public static final Block WITCH_HAZEL_PLANKS = createPlanks("witch_hazel_planks");
    public static final Block ZELKOVA_PLANKS = createPlanks("zelkova_planks");
    public static final Block SYTHIAN_PLANKS = createPlanks("sythian_planks");
    public static final Block EMBUR_PLANKS = createPlanks("embur_planks");
    public static final Block PALM_PLANKS = createPlanks("palm_planks");
    public static final Block LAMENT_PLANKS = createPlanks("lament_planks");
    public static final Block BULBIS_PLANKS = createPlanks("bulbis_planks");
    public static final Block NIGHTSHADE_PLANKS = createPlanks("nightshade_planks");
    public static final Block ETHER_PLANKS = createPlanks("ether_planks");
    public static final Block IMPARIUS_PLANKS = createPlanks("imparius_planks");

    public static final Block ASPEN_BOOKSHELF = createBookshelf("aspen_bookshelf");
    public static final Block BAOBAB_BOOKSHELF = createBookshelf("baobab_bookshelf");
    public static final Block BLUE_ENCHANTED_BOOKSHELF = createBookshelf("blue_enchanted_bookshelf");
    public static final Block CHERRY_BOOKSHELF = createBookshelf("cherry_bookshelf");
    public static final Block CIKA_BOOKSHELF = createBookshelf("cika_bookshelf");
    public static final Block CYPRESS_BOOKSHELF = createBookshelf("cypress_bookshelf");
    public static final Block EBONY_BOOKSHELF = createBookshelf("ebony_bookshelf");
    public static final Block FIR_BOOKSHELF = createBookshelf("fir_bookshelf");
    public static final Block GREEN_ENCHANTED_BOOKSHELF = createBookshelf("green_enchanted_bookshelf");
    public static final Block HOLLY_BOOKSHELF = createBookshelf("holly_bookshelf");
    public static final Block JACARANDA_BOOKSHELF = createBookshelf("jacaranda_bookshelf");
    public static final Block MAHOGANY_BOOKSHELF = createBookshelf("mahogany_bookshelf");
    public static final Block MANGROVE_BOOKSHELF = createBookshelf("mangrove_bookshelf");
    public static final Block MAPLE_BOOKSHELF = createBookshelf("maple_bookshelf");
    public static final Block PINE_BOOKSHELF = createBookshelf("pine_bookshelf");
    public static final Block RAINBOW_EUCALYPTUS_BOOKSHELF = createBookshelf("rainbow_eucalyptus_bookshelf");
    public static final Block REDWOOD_BOOKSHELF = createBookshelf("redwood_bookshelf");
    public static final Block SKYRIS_BOOKSHELF = createBookshelf("skyris_bookshelf");
    public static final Block WILLOW_BOOKSHELF = createBookshelf("willow_bookshelf");
    public static final Block WITCH_HAZEL_BOOKSHELF = createBookshelf("witch_hazel_bookshelf");
    public static final Block ZELKOVA_BOOKSHELF = createBookshelf("zelkova_bookshelf");
    public static final Block SYTHIAN_BOOKSHELF = createBookshelf("sythian_bookshelf");
    public static final Block EMBUR_BOOKSHELF = createBookshelf("embur_bookshelf");
    public static final Block PALM_BOOKSHELF = createBookshelf("palm_bookshelf");
    public static final Block LAMENT_BOOKSHELF = createBookshelf("lament_bookshelf");
    public static final Block BULBIS_BOOKSHELF = createBookshelf("bulbis_bookshelf");
    public static final Block NIGHTSHADE_BOOKSHELF = createBookshelf("nightshade_bookshelf");
    public static final Block ETHER_BOOKSHELF = createBookshelf("ether_bookshelf");
    public static final Block IMPARIUS_BOOKSHELF = createBookshelf("imparius_bookshelf");

    public static final Block ASPEN_DOOR = createDoor("aspen_door");
    public static final Block BAOBAB_DOOR = createDoor("baobab_door");
    public static final Block BLUE_ENCHANTED_DOOR = createDoor("blue_enchanted_door");
    public static final Block CHERRY_DOOR = createDoor("cherry_door");
    public static final Block CIKA_DOOR = createDoor("cika_door");
    public static final Block CYPRESS_DOOR = createDoor("cypress_door");
    public static final Block EBONY_DOOR = createDoor("ebony_door");
    public static final Block FIR_DOOR = createDoor("fir_door");
    public static final Block GREEN_ENCHANTED_DOOR = createDoor("green_enchanted_door");
    public static final Block HOLLY_DOOR = createDoor("holly_door");
    public static final Block JACARANDA_DOOR = createDoor("jacaranda_door");
    public static final Block MAHOGANY_DOOR = createDoor("mahogany_door");
    public static final Block MANGROVE_DOOR = createDoor("mangrove_door");
    public static final Block MAPLE_DOOR = createDoor("maple_door");
    public static final Block PINE_DOOR = createDoor("pine_door");
    public static final Block RAINBOW_EUCALYPTUS_DOOR = createDoor("rainbow_eucalyptus_door");
    public static final Block REDWOOD_DOOR = createDoor("redwood_door");
    public static final Block SKYRIS_DOOR = createDoor("skyris_door");
    public static final Block WILLOW_DOOR = createDoor("willow_door");
    public static final Block WITCH_HAZEL_DOOR = createDoor("witch_hazel_door");
    public static final Block ZELKOVA_DOOR = createDoor("zelkova_door");
    public static final Block SYTHIAN_DOOR = createDoor("sythian_door");
    public static final Block EMBUR_DOOR = createDoor("embur_door");
    public static final Block PALM_DOOR = createDoor("palm_door");
    public static final Block LAMENT_DOOR = createDoor("lament_door");
    public static final Block BULBIS_DOOR = createDoor("bulbis_door");
    public static final Block NIGHTSHADE_DOOR = createDoor("nightshade_door");
    public static final Block ETHER_DOOR = createDoor("ether_door");
    public static final Block IMPARIUS_DOOR = createDoor("imparius_door");

    public static final Block ASPEN_PRESSURE_PLATE = createWoodPressurePlate("aspen_pressure_plate");
    public static final Block BAOBAB_PRESSURE_PLATE = createWoodPressurePlate("baobab_pressure_plate");
    public static final Block BLUE_ENCHANTED_PRESSURE_PLATE = createWoodPressurePlate("blue_enchanted_pressure_plate");
    public static final Block CHERRY_PRESSURE_PLATE = createWoodPressurePlate("cherry_pressure_plate");
    public static final Block CIKA_PRESSURE_PLATE = createWoodPressurePlate("cika_pressure_plate");
    public static final Block CYPRESS_PRESSURE_PLATE = createWoodPressurePlate("cypress_pressure_plate");
    public static final Block EBONY_PRESSURE_PLATE = createWoodPressurePlate("ebony_pressure_plate");
    public static final Block FIR_PRESSURE_PLATE = createWoodPressurePlate("fir_pressure_plate");
    public static final Block GREEN_ENCHANTED_PRESSURE_PLATE = createWoodPressurePlate("green_enchanted_pressure_plate");
    public static final Block HOLLY_PRESSURE_PLATE = createWoodPressurePlate("holly_pressure_plate");
    public static final Block JACARANDA_PRESSURE_PLATE = createWoodPressurePlate("jacaranda_pressure_plate");
    public static final Block MAHOGANY_PRESSURE_PLATE = createWoodPressurePlate("mahogany_pressure_plate");
    public static final Block MANGROVE_PRESSURE_PLATE = createWoodPressurePlate("mangrove_pressure_plate");
    public static final Block MAPLE_PRESSURE_PLATE = createWoodPressurePlate("maple_pressure_plate");
    public static final Block PINE_PRESSURE_PLATE = createWoodPressurePlate("pine_pressure_plate");
    public static final Block RAINBOW_EUCALYPTUS_PRESSURE_PLATE = createWoodPressurePlate("rainbow_eucalyptus_pressure_plate");
    public static final Block REDWOOD_PRESSURE_PLATE = createWoodPressurePlate("redwood_pressure_plate");
    public static final Block SKYRIS_PRESSURE_PLATE = createWoodPressurePlate("skyris_pressure_plate");
    public static final Block WILLOW_PRESSURE_PLATE = createWoodPressurePlate("willow_pressure_plate");
    public static final Block WITCH_HAZEL_PRESSURE_PLATE = createWoodPressurePlate("witch_hazel_pressure_plate");
    public static final Block ZELKOVA_PRESSURE_PLATE = createWoodPressurePlate("zelkova_pressure_plate");
    public static final Block SYTHIAN_PRESSURE_PLATE = createWoodPressurePlate("sythian_pressure_plate");
    public static final Block EMBUR_PRESSURE_PLATE = createWoodPressurePlate("embur_pressure_plate");
    public static final Block PALM_PRESSURE_PLATE = createWoodPressurePlate("palm_pressure_plate");
    public static final Block LAMENT_PRESSURE_PLATE = createWoodPressurePlate("lament_pressure_plate");
    public static final Block BULBIS_PRESSURE_PLATE = createWoodPressurePlate("bulbis_pressure_plate");
    public static final Block NIGHTSHADE_PRESSURE_PLATE = createWoodPressurePlate("nightshade_pressure_plate");
    public static final Block ETHER_PRESSURE_PLATE = createWoodPressurePlate("ether_pressure_plate");
    public static final Block IMPARIUS_PRESSURE_PLATE = createWoodPressurePlate("imparius_pressure_plate");

    public static final Block ASPEN_BUTTON = createWoodButton("aspen_button");
    public static final Block BAOBAB_BUTTON = createWoodButton("baobab_button");
    public static final Block BLUE_ENCHANTED_BUTTON = createWoodButton("blue_enchanted_button");
    public static final Block CHERRY_BUTTON = createWoodButton("cherry_button");
    public static final Block CIKA_BUTTON = createWoodButton("cika_button");
    public static final Block CYPRESS_BUTTON = createWoodButton("cypress_button");
    public static final Block EBONY_BUTTON = createWoodButton("ebony_button");
    public static final Block FIR_BUTTON = createWoodButton("fir_button");
    public static final Block GREEN_ENCHANTED_BUTTON = createWoodButton("green_enchanted_button");
    public static final Block HOLLY_BUTTON = createWoodButton("holly_button");
    public static final Block JACARANDA_BUTTON = createWoodButton("jacaranda_button");
    public static final Block MAHOGANY_BUTTON = createWoodButton("mahogany_button");
    public static final Block MANGROVE_BUTTON = createWoodButton("mangrove_button");
    public static final Block MAPLE_BUTTON = createWoodButton("maple_button");
    public static final Block PINE_BUTTON = createWoodButton("pine_button");
    public static final Block RAINBOW_EUCALYPTUS_BUTTON = createWoodButton("rainbow_eucalyptus_button");
    public static final Block REDWOOD_BUTTON = createWoodButton("redwood_button");
    public static final Block SKYRIS_BUTTON = createWoodButton("skyris_button");
    public static final Block WILLOW_BUTTON = createWoodButton("willow_button");
    public static final Block WITCH_HAZEL_BUTTON = createWoodButton("witch_hazel_button");
    public static final Block ZELKOVA_BUTTON = createWoodButton("zelkova_button");
    public static final Block SYTHIAN_BUTTON = createWoodButton("sythian_button");
    public static final Block EMBUR_BUTTON = createWoodButton("embur_button");
    public static final Block PALM_BUTTON = createWoodButton("palm_button");
    public static final Block LAMENT_BUTTON = createWoodButton("lament_button");
    public static final Block BULBIS_BUTTON = createWoodButton("bulbis_button");
    public static final Block NIGHTSHADE_BUTTON = createWoodButton("nightshade_button");
    public static final Block ETHER_BUTTON = createWoodButton("ether_button");
    public static final Block IMPARIUS_BUTTON = createWoodButton("imparius_button");

    public static final Block ASPEN_TRAPDOOR = createTrapDoor("aspen_trapdoor");
    public static final Block BAOBAB_TRAPDOOR = createTrapDoor("baobab_trapdoor");
    public static final Block BLUE_ENCHANTED_TRAPDOOR = createTrapDoor("blue_enchanted_trapdoor");
    public static final Block CHERRY_TRAPDOOR = createTrapDoor("cherry_trapdoor");
    public static final Block CIKA_TRAPDOOR = createTrapDoor("cika_trapdoor");
    public static final Block CYPRESS_TRAPDOOR = createTrapDoor("cypress_trapdoor");
    public static final Block EBONY_TRAPDOOR = createTrapDoor("ebony_trapdoor");
    public static final Block FIR_TRAPDOOR = createTrapDoor("fir_trapdoor");
    public static final Block GREEN_ENCHANTED_TRAPDOOR = createTrapDoor("green_enchanted_trapdoor");
    public static final Block HOLLY_TRAPDOOR = createTrapDoor("holly_trapdoor");
    public static final Block JACARANDA_TRAPDOOR = createTrapDoor("jacaranda_trapdoor");
    public static final Block MAHOGANY_TRAPDOOR = createTrapDoor("mahogany_trapdoor");
    public static final Block MANGROVE_TRAPDOOR = createTrapDoor("mangrove_trapdoor");
    public static final Block MAPLE_TRAPDOOR = createTrapDoor("maple_trapdoor");
    public static final Block PINE_TRAPDOOR = createTrapDoor("pine_trapdoor");
    public static final Block RAINBOW_EUCALYPTUS_TRAPDOOR = createTrapDoor("rainbow_eucalyptus_trapdoor");
    public static final Block REDWOOD_TRAPDOOR = createTrapDoor("redwood_trapdoor");
    public static final Block SKYRIS_TRAPDOOR = createTrapDoor("skyris_trapdoor");
    public static final Block WILLOW_TRAPDOOR = createTrapDoor("willow_trapdoor");
    public static final Block WITCH_HAZEL_TRAPDOOR = createTrapDoor("witch_hazel_trapdoor");
    public static final Block ZELKOVA_TRAPDOOR = createTrapDoor("zelkova_trapdoor");
    public static final Block SYTHIAN_TRAPDOOR = createTrapDoor("sythian_trapdoor");
    public static final Block EMBUR_TRAPDOOR = createTrapDoor("embur_trapdoor");
    public static final Block PALM_TRAPDOOR = createTrapDoor("palm_trapdoor");
    public static final Block LAMENT_TRAPDOOR = createTrapDoor("lament_trapdoor");
    public static final Block BULBIS_TRAPDOOR = createTrapDoor("bulbis_trapdoor");
    public static final Block NIGHTSHADE_TRAPDOOR = createTrapDoor("nightshade_trapdoor");
    public static final Block ETHER_TRAPDOOR = createTrapDoor("ether_trapdoor");
    public static final Block IMPARIUS_TRAPDOOR = createTrapDoor("imparius_trapdoor");

    public static final Block ASPEN_CRAFTING_TABLE = createCraftingTable("aspen_crafting_table");
    public static final Block BAOBAB_CRAFTING_TABLE = createCraftingTable("baobab_crafting_table");
    public static final Block BLUE_ENCHANTED_CRAFTING_TABLE = createCraftingTable("blue_enchanted_crafting_table");
    public static final Block CHERRY_CRAFTING_TABLE = createCraftingTable("cherry_crafting_table");
    public static final Block CIKA_CRAFTING_TABLE = createCraftingTable("cika_crafting_table");
    public static final Block CYPRESS_CRAFTING_TABLE = createCraftingTable("cypress_crafting_table");
    public static final Block EBONY_CRAFTING_TABLE = createCraftingTable("ebony_crafting_table");
    public static final Block FIR_CRAFTING_TABLE = createCraftingTable("fir_crafting_table");
    public static final Block GREEN_ENCHANTED_CRAFTING_TABLE = createCraftingTable("green_enchanted_crafting_table");
    public static final Block HOLLY_CRAFTING_TABLE = createCraftingTable("holly_crafting_table");
    public static final Block JACARANDA_CRAFTING_TABLE = createCraftingTable("jacaranda_crafting_table");
    public static final Block MAHOGANY_CRAFTING_TABLE = createCraftingTable("mahogany_crafting_table");
    public static final Block MANGROVE_CRAFTING_TABLE = createCraftingTable("mangrove_crafting_table");
    public static final Block MAPLE_CRAFTING_TABLE = createCraftingTable("maple_crafting_table");
    public static final Block PINE_CRAFTING_TABLE = createCraftingTable("pine_crafting_table");
    public static final Block RAINBOW_EUCALYPTUS_CRAFTING_TABLE = createCraftingTable("rainbow_eucalyptus_crafting_table");
    public static final Block REDWOOD_CRAFTING_TABLE = createCraftingTable("redwood_crafting_table");
    public static final Block SKYRIS_CRAFTING_TABLE = createCraftingTable("skyris_crafting_table");
    public static final Block WILLOW_CRAFTING_TABLE = createCraftingTable("willow_crafting_table");
    public static final Block WITCH_HAZEL_CRAFTING_TABLE = createCraftingTable("witch_hazel_crafting_table");
    public static final Block ZELKOVA_CRAFTING_TABLE = createCraftingTable("zelkova_crafting_table");
    public static final Block SYTHIAN_CRAFTING_TABLE = createCraftingTable("sythian_crafting_table");
    public static final Block EMBUR_CRAFTING_TABLE = createCraftingTable("embur_crafting_table");
    public static final Block PALM_CRAFTING_TABLE = createCraftingTable("palm_crafting_table");
    public static final Block LAMENT_CRAFTING_TABLE = createCraftingTable("lament_crafting_table");
    public static final Block BULBIS_CRAFTING_TABLE = createCraftingTable("bulbis_crafting_table");
    public static final Block NIGHTSHADE_CRAFTING_TABLE = createCraftingTable("nightshade_crafting_table");
    public static final Block ETHER_CRAFTING_TABLE = createCraftingTable("ether_crafting_table");
    public static final Block IMPARIUS_CRAFTING_TABLE = createCraftingTable("imparius_crafting_table");

    public static final Block ASPEN_FENCE_GATE = createFenceGate("aspen_fence_gate");
    public static final Block BAOBAB_FENCE_GATE = createFenceGate("baobab_fence_gate");
    public static final Block BLUE_ENCHANTED_FENCE_GATE = createFenceGate("blue_enchanted_fence_gate");
    public static final Block CHERRY_FENCE_GATE = createFenceGate("cherry_fence_gate");
    public static final Block CIKA_FENCE_GATE = createFenceGate("cika_fence_gate");
    public static final Block CYPRESS_FENCE_GATE = createFenceGate("cypress_fence_gate");
    public static final Block EBONY_FENCE_GATE = createFenceGate("ebony_fence_gate");
    public static final Block FIR_FENCE_GATE = createFenceGate("fir_fence_gate");
    public static final Block GREEN_ENCHANTED_FENCE_GATE = createFenceGate("green_enchanted_fence_gate");
    public static final Block HOLLY_FENCE_GATE = createFenceGate("holly_fence_gate");
    public static final Block JACARANDA_FENCE_GATE = createFenceGate("jacaranda_fence_gate");
    public static final Block MAHOGANY_FENCE_GATE = createFenceGate("mahogany_fence_gate");
    public static final Block MANGROVE_FENCE_GATE = createFenceGate("mangrove_fence_gate");
    public static final Block MAPLE_FENCE_GATE = createFenceGate("maple_fence_gate");
    public static final Block PINE_FENCE_GATE = createFenceGate("pine_fence_gate");
    public static final Block RAINBOW_EUCALYPTUS_FENCE_GATE = createFenceGate("rainbow_eucalyptus_fence_gate");
    public static final Block REDWOOD_FENCE_GATE = createFenceGate("redwood_fence_gate");
    public static final Block SKYRIS_FENCE_GATE = createFenceGate("skyris_fence_gate");
    public static final Block WILLOW_FENCE_GATE = createFenceGate("willow_fence_gate");
    public static final Block WITCH_HAZEL_FENCE_GATE = createFenceGate("witch_hazel_fence_gate");
    public static final Block ZELKOVA_FENCE_GATE = createFenceGate("zelkova_fence_gate");
    public static final Block SYTHIAN_FENCE_GATE = createFenceGate("sythian_fence_gate");
    public static final Block EMBUR_FENCE_GATE = createFenceGate("embur_fence_gate");
    public static final Block PALM_FENCE_GATE = createFenceGate("palm_fence_gate");
    public static final Block LAMENT_FENCE_GATE = createFenceGate("lament_fence_gate");
    public static final Block BULBIS_FENCE_GATE = createFenceGate("bulbis_fence_gate");
    public static final Block NIGHTSHADE_FENCE_GATE = createFenceGate("nightshade_fence_gate");
    public static final Block ETHER_FENCE_GATE = createFenceGate("ether_fence_gate");
    public static final Block IMPARIUS_FENCE_GATE = createFenceGate("imparius_fence_gate");

    public static final Block ASPEN_SLAB = createWoodSlab("aspen_slab");
    public static final Block BAOBAB_SLAB = createWoodSlab("baobab_slab");
    public static final Block BLUE_ENCHANTED_SLAB = createWoodSlab("blue_enchanted_slab");
    public static final Block CHERRY_SLAB = createWoodSlab("cherry_slab");
    public static final Block CIKA_SLAB = createWoodSlab("cika_slab");
    public static final Block CYPRESS_SLAB = createWoodSlab("cypress_slab");
    public static final Block EBONY_SLAB = createWoodSlab("ebony_slab");
    public static final Block FIR_SLAB = createWoodSlab("fir_slab");
    public static final Block GREEN_ENCHANTED_SLAB = createWoodSlab("green_enchanted_slab");
    public static final Block HOLLY_SLAB = createWoodSlab("holly_slab");
    public static final Block JACARANDA_SLAB = createWoodSlab("jacaranda_slab");
    public static final Block MAHOGANY_SLAB = createWoodSlab("mahogany_slab");
    public static final Block MANGROVE_SLAB = createWoodSlab("mangrove_slab");
    public static final Block MAPLE_SLAB = createWoodSlab("maple_slab");
    public static final Block PINE_SLAB = createWoodSlab("pine_slab");
    public static final Block RAINBOW_EUCALYPTUS_SLAB = createWoodSlab("rainbow_eucalyptus_slab");
    public static final Block REDWOOD_SLAB = createWoodSlab("redwood_slab");
    public static final Block SKYRIS_SLAB = createWoodSlab("skyris_slab");
    public static final Block WILLOW_SLAB = createWoodSlab("willow_slab");
    public static final Block WITCH_HAZEL_SLAB = createWoodSlab("witch_hazel_slab");
    public static final Block ZELKOVA_SLAB = createWoodSlab("zelkova_slab");
    public static final Block SYTHIAN_SLAB = createWoodSlab("sythian_slab");
    public static final Block EMBUR_SLAB = createWoodSlab("embur_slab");
    public static final Block PALM_SLAB = createWoodSlab("palm_slab");
    public static final Block LAMENT_SLAB = createWoodSlab("lament_slab");
    public static final Block BULBIS_SLAB = createWoodSlab("bulbis_slab");
    public static final Block NIGHTSHADE_SLAB = createWoodSlab("nightshade_slab");
    public static final Block ETHER_SLAB = createWoodSlab("ether_slab");
    public static final Block IMPARIUS_SLAB = createWoodSlab("imparius_slab");

    public static final Block ASPEN_STAIRS = createWoodStairs("aspen_stairs");
    public static final Block BAOBAB_STAIRS = createWoodStairs("baobab_stairs");
    public static final Block BLUE_ENCHANTED_STAIRS = createWoodStairs("blue_enchanted_stairs");
    public static final Block CHERRY_STAIRS = createWoodStairs("cherry_stairs");
    public static final Block CIKA_STAIRS = createWoodStairs("cika_stairs");
    public static final Block CYPRESS_STAIRS = createWoodStairs("cypress_stairs");
    public static final Block EBONY_STAIRS = createWoodStairs("ebony_stairs");
    public static final Block FIR_STAIRS = createWoodStairs("fir_stairs");
    public static final Block GREEN_ENCHANTED_STAIRS = createWoodStairs("green_enchanted_stairs");
    public static final Block HOLLY_STAIRS = createWoodStairs("holly_stairs");
    public static final Block JACARANDA_STAIRS = createWoodStairs("jacaranda_stairs");
    public static final Block MAHOGANY_STAIRS = createWoodStairs("mahogany_stairs");
    public static final Block MANGROVE_STAIRS = createWoodStairs("mangrove_stairs");
    public static final Block MAPLE_STAIRS = createWoodStairs("maple_stairs");
    public static final Block PINE_STAIRS = createWoodStairs("pine_stairs");
    public static final Block RAINBOW_EUCALYPTUS_STAIRS = createWoodStairs("rainbow_eucalyptus_stairs");
    public static final Block REDWOOD_STAIRS = createWoodStairs("redwood_stairs");
    public static final Block SKYRIS_STAIRS = createWoodStairs("skyris_stairs");
    public static final Block WILLOW_STAIRS = createWoodStairs("willow_stairs");
    public static final Block WITCH_HAZEL_STAIRS = createWoodStairs("witch_hazel_stairs");
    public static final Block ZELKOVA_STAIRS = createWoodStairs("zelkova_stairs");
    public static final Block SYTHIAN_STAIRS = createWoodStairs("sythian_stairs");
    public static final Block EMBUR_STAIRS = createWoodStairs("embur_stairs");
    public static final Block PALM_STAIRS = createWoodStairs("palm_stairs");
    public static final Block LAMENT_STAIRS = createWoodStairs("lament_stairs");
    public static final Block BULBIS_STAIRS = createWoodStairs("bulbis_stairs");
    public static final Block NIGHTSHADE_STAIRS = createWoodStairs("nightshade_stairs");
    public static final Block ETHER_STAIRS = createWoodStairs("ether_stairs");
    public static final Block IMPARIUS_STAIRS = createWoodStairs("imparius_stairs");

    public static final Block ASPEN_FENCE = createFence("aspen_fence");
    public static final Block BAOBAB_FENCE = createFence("baobab_fence");
    public static final Block BLUE_ENCHANTED_FENCE = createFence("blue_enchanted_fence");
    public static final Block CHERRY_FENCE = createFence("cherry_fence");
    public static final Block CIKA_FENCE = createFence("cika_fence");
    public static final Block CYPRESS_FENCE = createFence("cypress_fence");
    public static final Block EBONY_FENCE = createFence("ebony_fence");
    public static final Block FIR_FENCE = createFence("fir_fence");
    public static final Block GREEN_ENCHANTED_FENCE = createFence("green_enchanted_fence");
    public static final Block HOLLY_FENCE = createFence("holly_fence");
    public static final Block JACARANDA_FENCE = createFence("jacaranda_fence");
    public static final Block MAHOGANY_FENCE = createFence("mahogany_fence");
    public static final Block MANGROVE_FENCE = createFence("mangrove_fence");
    public static final Block MAPLE_FENCE = createFence("maple_fence");
    public static final Block PINE_FENCE = createFence("pine_fence");
    public static final Block RAINBOW_EUCALYPTUS_FENCE = createFence("rainbow_eucalyptus_fence");
    public static final Block REDWOOD_FENCE = createFence("redwood_fence");
    public static final Block SKYRIS_FENCE = createFence("skyris_fence");
    public static final Block WILLOW_FENCE = createFence("willow_fence");
    public static final Block WITCH_HAZEL_FENCE = createFence("witch_hazel_fence");
    public static final Block ZELKOVA_FENCE = createFence("zelkova_fence");
    public static final Block SYTHIAN_FENCE = createFence("sythian_fence");
    public static final Block EMBUR_FENCE = createFence("embur_fence");
    public static final Block PALM_FENCE = createFence("palm_fence");
    public static final Block LAMENT_FENCE = createFence("lament_fence");
    public static final Block BULBIS_FENCE = createFence("bulbis_fence");
    public static final Block NIGHTSHADE_FENCE = createFence("nightshade_fence");
    public static final Block ETHER_FENCE = createFence("ether_fence");
    public static final Block IMPARIUS_FENCE = createFence("imparius_fence");

    public static final Block PEAT = createDirt("peat");
    public static final Block GLOWCELIUM = new BYGBlockProperties.BYGGlowcelium("glowcelium_block");
    public static final Block MEADOW_DIRT = createDirt("meadow_dirt");
    public static final Block ETHER_SOIL = createDirt("ether_soil");
    public static final Block MUD_BLOCK = new BYGBlockProperties.BYGMud("mud_block");
    public static final Block MUD_BRICKS = createDirt("mud_bricks");

    public static final Block ARAUCARIA_SAPLING = createSapling(BYGBlockTags.GROUND_ARAUCARIA_SAPLING, TreeSpawners.ARAUCARIA, "araucaria_sapling");
    public static final Block ASPEN_SAPLING = createSapling(BYGBlockTags.GROUND_ASPEN_SAPLING, TreeSpawners.ASPEN, "aspen_sapling");
    public static final Block BAOBAB_SAPLING = createSapling(BYGBlockTags.GROUND_BAOBAB_SAPLING, TreeSpawners.BAOBAB, "baobab_sapling");
    public static final Block BLUE_ENCHANTED_SAPLING = createSapling(BYGBlockTags.GROUND_BLUE_ENCHANTED_SAPLING, TreeSpawners.BLUE_ENCHANTED, "blue_enchanted_sapling");
    public static final Block BLUE_SPRUCE_SAPLING = createSapling(BYGBlockTags.GROUND_BLUE_SPRUCE_SAPLING, TreeSpawners.BLUE_SPRUCE, "blue_spruce_sapling");
    public static final Block BROWN_BIRCH_SAPLING = createSapling(BYGBlockTags.GROUND_BROWN_BIRCH_SAPLING, TreeSpawners.BROWN_BIRCH, "brown_birch_sapling");
    public static final Block BROWN_OAK_SAPLING = createSapling(BYGBlockTags.GROUND_BROWN_OAK_SAPLING, TreeSpawners.BROWN_OAK, "brown_oak_sapling");
    public static final Block BROWN_ZELKOVA_SAPLING = createSapling(BYGBlockTags.GROUND_BROWN_ZELKOVA_SAPLING, TreeSpawners.BROWN_ZELKOVA, "brown_zelkova_sapling");
    public static final Block CIKA_SAPLING = createSapling(BYGBlockTags.GROUND_CIKA_SAPLING, TreeSpawners.CIKA, "cika_sapling");
    public static final Block CYPRESS_SAPLING = createSapling(BYGBlockTags.GROUND_CYPRESS_SAPLING, TreeSpawners.CYPRESS, "cypress_sapling");
    public static final Block EBONY_SAPLING = createSapling(BYGBlockTags.GROUND_EBONY_SAPLING, TreeSpawners.EBONY, "ebony_sapling");
    public static final Block FIR_SAPLING = createSapling(BYGBlockTags.GROUND_FIR_SAPLING, TreeSpawners.FIR, "fir_sapling");
    public static final Block GREEN_ENCHANTED_SAPLING = createSapling(BYGBlockTags.GROUND_GREEN_ENCHANTED_SAPLING, TreeSpawners.GREEN_ENCHANTED, "green_enchanted_sapling");
    public static final Block HOLLY_SAPLING = createSapling(BYGBlockTags.GROUND_HOLLY_SAPLING, TreeSpawners.HOLLY, "holly_sapling");
    public static final Block FLOWERING_JACARANDA_BUSH = createFloweringJacarandaBush(1, TreeSpawners.JACARANDA, "flowering_jacaranda_bush");
    public static final Block FLOWERING_INDIGO_JACARANDA_BUSH = createFloweringIndigoJacarandaBush(1, TreeSpawners.INDIGO_JACARANDA, "flowering_indigo_jacaranda_bush");
    public static final Block JACARANDA_SAPLING = createSapling(BYGBlockTags.GROUND_JACARANDA_SAPLING, TreeSpawners.JACARANDA, "jacaranda_sapling");
    public static final Block INDIGO_JACARANDA_SAPLING = createSapling(BYGBlockTags.GROUND_INDIGO_JACARANDA_SAPLING, TreeSpawners.INDIGO_JACARANDA, "indigo_jacaranda_sapling");
    public static final Block JOSHUA_SAPLING = createSapling(BYGBlockTags.GROUND_JOSHUA_SAPLING, TreeSpawners.JOSHUA, "joshua_sapling");
    public static final Block MAHOGANY_SAPLING = createSapling(BYGBlockTags.GROUND_MAHOGANY_SAPLING, TreeSpawners.MAHOGONY, "mahogany_sapling");
    public static final Block MANGROVE_SAPLING = createSapling(BYGBlockTags.GROUND_MANGROVE_SAPLING, TreeSpawners.MANGROVE, "mangrove_sapling");
    public static final Block MAPLE_SAPLING = createSapling(BYGBlockTags.GROUND_MAPLE_SAPLING, TreeSpawners.MAPLE, "maple_sapling");
    public static final Block ORANGE_BIRCH_SAPLING = createSapling(BYGBlockTags.GROUND_ORANGE_BIRCH_SAPLING, TreeSpawners.ORANGE_BIRCH, "orange_birch_sapling");
    public static final Block ORANGE_OAK_SAPLING = createSapling(BYGBlockTags.GROUND_ORANGE_OAK_SAPLING, TreeSpawners.ORANGE_OAK, "orange_oak_sapling");
    public static final Block ORANGE_SPRUCE_SAPLING = createSapling(BYGBlockTags.GROUND_ORANGE_SPRUCE_SAPLING, TreeSpawners.ORANGE_SPRUCE, "orange_spruce_sapling");
    public static final Block ORCHARD_SAPLING = createSapling(BYGBlockTags.GROUND_ORCHARD_SAPLING, TreeSpawners.ORCHARD, "orchard_sapling");
    public static final Block PALO_VERDE_SAPLING = createSapling(BYGBlockTags.GROUND_PALO_VERDE_SAPLING, TreeSpawners.PALO_VERDE, "palo_verde_sapling");
    public static final Block PINE_SAPLING = createSapling(BYGBlockTags.GROUND_PINE_SAPLING, TreeSpawners.PINE, "pine_sapling");
    public static final Block PINK_CHERRY_SAPLING = createSapling(BYGBlockTags.GROUND_PINK_CHERRY_SAPLING, TreeSpawners.PINK_CHERRY, "pink_cherry_sapling");
    public static final Block RAINBOW_EUCALYPTUS_SAPLING = createSapling(BYGBlockTags.GROUND_RAINBOW_EUCALYPTUS_SAPLING, TreeSpawners.RAINBOW_EUCALYPTUS, "rainbow_eucalyptus_sapling");
    public static final Block RED_BIRCH_SAPLING = createSapling(BYGBlockTags.GROUND_RED_BIRCH_SAPLING, TreeSpawners.RED_BIRCH, "red_birch_sapling");
    public static final Block RED_MAPLE_SAPLING = createSapling(BYGBlockTags.GROUND_RED_MAPLE_SAPLING, TreeSpawners.RED_MAPLE, "red_maple_sapling");
    public static final Block RED_OAK_SAPLING = createSapling(BYGBlockTags.GROUND_RED_OAK_SAPLING, TreeSpawners.RED_OAK, "red_oak_sapling");
    public static final Block RED_SPRUCE_SAPLING = createSapling(BYGBlockTags.GROUND_RED_SPRUCE_SAPLING, TreeSpawners.RED_SPRUCE, "red_spruce_sapling");
    public static final Block REDWOOD_SAPLING = createSapling(BYGBlockTags.GROUND_REDWOOD_SAPLING, TreeSpawners.REDWOOD, "redwood_sapling");
    public static final Block SILVER_MAPLE_SAPLING = createSapling(BYGBlockTags.GROUND_SILVER_MAPLE_SAPLING, TreeSpawners.SILVER_MAPLE, "silver_maple_sapling");
    public static final Block SKYRIS_SAPLING = createSapling(BYGBlockTags.GROUND_SKYRIS_SAPLING, TreeSpawners.SKYRIS, "skyris_sapling");
    public static final Block WHITE_CHERRY_SAPLING = createSapling(BYGBlockTags.GROUND_WHITE_CHERRY_SAPLING, TreeSpawners.WHITE_CHERRY, "white_cherry_sapling");
    public static final Block WILLOW_SAPLING = createSapling(BYGBlockTags.GROUND_WILLOW_SAPLING, TreeSpawners.WILLOW, "willow_sapling");
    public static final Block WITCH_HAZEL_SAPLING = createSapling(BYGBlockTags.GROUND_WITCH_HAZEL_SAPLING, TreeSpawners.WITCH_HAZEL, "witch_hazel_sapling");
    public static final Block YELLOW_BIRCH_SAPLING = createSapling(BYGBlockTags.GROUND_YELLOW_BIRCH_SAPLING, TreeSpawners.YELLOW_BIRCH, "yellow_birch_sapling");
    public static final Block YELLOW_SPRUCE_SAPLING = createSapling(BYGBlockTags.GROUND_YELLOW_SPRUCE_SAPLING, TreeSpawners.YELLOW_SPRUCE, "yellow_spruce_sapling");
    public static final Block ZELKOVA_SAPLING = createSapling(BYGBlockTags.GROUND_ZELKOVA_SAPLING, TreeSpawners.ZELKOVA, "zelkova_sapling");
    public static final Block PALM_SAPLING = createSapling(BYGBlockTags.GROUND_PALM_SAPLING, TreeSpawners.PALM, "palm_sapling");
    public static final Block LAMENT_SAPLING = createSapling(BYGBlockTags.GROUND_LAMENT_SAPLING, TreeSpawners.LAMENT, "lament_sapling");
    public static final Block WITHERING_OAK_SAPLING = createSapling(BYGBlockTags.GROUND_WITHERING_OAK_SAPLING, TreeSpawners.WITHERING_OAK, "withering_oak_sapling");
    public static final Block ETHER_SAPLING = createSapling(BYGBlockTags.GROUND_ETHER_SAPLING, TreeSpawners.ETHER, "ether_sapling");
    public static final Block NIGHTSHADE_SAPLING = createSapling(BYGBlockTags.GROUND_NIGHTSHADE_SAPLING, TreeSpawners.NIGHTSHADE, "nightshade_sapling");

    public static final Block JACARANDA_BUSH = createJacarandaBush("jacaranda_bush");
    public static final Block INDIGO_JACARANDA_BUSH = createIndigoJacarandaBush("indigo_jacaranda_bush");


    public static final Block ARAUCARIA_LEAVES = createLeaves("araucaria_leaves");
    public static final Block ASPEN_LEAVES = createLeaves("aspen_leaves");
    public static final Block BAOBAB_LEAVES = createLeaves("baobab_leaves");
    public static final Block BLOOMING_WITCH_HAZEL_LEAVES = createGlowingLeaves("blooming_witch_hazel_leaves");
    public static final Block BLUE_ENCHANTED_LEAVES = createGlowingLeaves("blue_enchanted_leaves");
    public static final Block BLUE_SPRUCE_LEAVES = createLeaves("blue_spruce_leaves");
    public static final Block BROWN_BIRCH_LEAVES = createLeaves("brown_birch_leaves");
    public static final Block BROWN_OAK_LEAVES = createLeaves("brown_oak_leaves");
    public static final Block BROWN_ZELKOVA_LEAVES = createLeaves("brown_zelkova_leaves");
    public static final Block CIKA_LEAVES = createLeaves("cika_leaves");
    public static final Block CYPRESS_LEAVES = createLeaves("cypress_leaves");
    public static final Block EBONY_LEAVES = createLeaves("ebony_leaves");
    public static final Block FIR_LEAVES = createLeaves("fir_leaves");
    public static final Block FLOWERING_ORCHARD_LEAVES = createLeaves("flowering_orchard_leaves");
    public static final Block FLOWERING_PALO_VERDE_LEAVES = createLeaves("flowering_palo_verde_leaves");
    public static final Block GREEN_ENCHANTED_LEAVES = createGlowingLeaves("green_enchanted_leaves");
    public static final Block HOLLY_BERRY_LEAVES = createLeaves("holly_berry_leaves");
    public static final Block HOLLY_LEAVES = createLeaves("holly_leaves");
    public static final Block JACARANDA_LEAVES = createLeaves("jacaranda_leaves");
    public static final Block INDIGO_JACARANDA_LEAVES = createLeaves("indigo_jacaranda_leaves");
    public static final Block FLOWERING_JACARANDA_LEAVES = createLeaves("flowering_jacaranda_leaves");
    public static final Block FLOWERING_INDIGO_JACARANDA_LEAVES = createLeaves("flowering_indigo_jacaranda_leaves");
    public static final Block JOSHUA_LEAVES = createLeaves("joshua_leaves");
    public static final Block RIPE_JOSHUA_LEAVES = createLeaves("ripe_joshua_leaves");
    public static final Block MAHOGANY_LEAVES = createLeaves("mahogany_leaves");
    public static final Block MANGROVE_LEAVES = createLeaves("mangrove_leaves");
    public static final Block MAPLE_LEAVES = createLeaves("maple_leaves");
    public static final Block ORANGE_BIRCH_LEAVES = createLeaves("orange_birch_leaves");
    public static final Block ORANGE_OAK_LEAVES = createLeaves("orange_oak_leaves");
    public static final Block ORANGE_SPRUCE_LEAVES = createLeaves("orange_spruce_leaves");
    public static final Block ORCHARD_LEAVES = createLeaves("orchard_leaves");
    public static final Block PALO_VERDE_LEAVES = createLeaves("palo_verde_leaves");
    public static final Block PINE_LEAVES = createLeaves("pine_leaves");
    public static final Block PINK_CHERRY_LEAVES = createLeaves("pink_cherry_leaves");
    public static final Block RAINBOW_EUCALYPTUS_LEAVES = createLeaves("rainbow_eucalyptus_leaves");
    public static final Block RED_BIRCH_LEAVES = createLeaves("red_birch_leaves");
    public static final Block RED_MAPLE_LEAVES = createLeaves("red_maple_leaves");
    public static final Block RED_OAK_LEAVES = createLeaves("red_oak_leaves");
    public static final Block RED_SPRUCE_LEAVES = createLeaves("red_spruce_leaves");
    public static final Block REDWOOD_LEAVES = createLeaves("redwood_leaves");
    public static final Block RIPE_ORCHARD_LEAVES = createLeaves("ripe_orchard_leaves");
    public static final Block SILVER_MAPLE_LEAVES = createLeaves("silver_maple_leaves");
    public static final Block SKYRIS_LEAVES_GREEN_APPLE = createLeaves("green_apple_skyris_leaves");
    public static final Block SKYRIS_LEAVES = createLeaves("skyris_leaves");
    public static final Block WHITE_CHERRY_LEAVES = createLeaves("white_cherry_leaves");
    public static final Block WILLOW_LEAVES = createLeaves("willow_leaves");
    public static final Block WITCH_HAZEL_LEAVES = createLeaves("witch_hazel_leaves");
    public static final Block YELLOW_BIRCH_LEAVES = createLeaves("yellow_birch_leaves");
    public static final Block YELLOW_SPRUCE_LEAVES = createLeaves("yellow_spruce_leaves");
    public static final Block ZELKOVA_LEAVES = createLeaves("zelkova_leaves");
    public static final Block PALM_LEAVES = createLeaves("palm_leaves");
    public static final Block LAMENT_LEAVES = createLeaves("lament_leaves");
    public static final Block WITHERING_OAK_LEAVES = createLeaves("withering_oak_leaves");
    public static final Block FLOWERING_NIGHTSHADE_LEAVES = createGlowingLeaves("flowering_nightshade_leaves");
    public static final Block NIGHTSHADE_LEAVES = createLeaves("nightshade_leaves");
    public static final Block ETHER_LEAVES = createLeaves("ether_leaves");

    public static final Block GREEN_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("green_mushroom_block");
    public static final Block MILKCAP_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("weeping_milkcap_mushroom_block");
    public static final Block BLEWIT_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("wood_blewit_mushroom_block");
    public static final Block PUFF_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("black_puff_mushroom_block");
    public static final Block WHITE_MUSHROOM_STEM = new BYGBlockProperties.BlockHugeMushroom("white_mushroom_stem");
    public static final Block BROWN_MUSHROOM_STEM = new BYGBlockProperties.BlockHugeMushroom("brown_mushroom_stem");
    public static final Block BLUE_GLOWSHROOM_BLOCK = new BYGBlockProperties.BlockHugeGlowshroom("blue_glowshroom_block");
    public static final Block PURPLE_GLOWSHROOM_BLOCK = new BYGBlockProperties.BlockHugeGlowshroom("purple_glowshroom_block");
    public static final Block RED_GLOWSHROOM_STEM = new BYGBlockProperties.BlockHugeGlowshroomStem("red_glowshroom_stem");
    public static final Block YELLOW_GLOWSHROOM_STEM = new BYGBlockProperties.BlockHugeGlowshroomStem("yellow_glowshroom_stem");
    public static final Block SOUL_SHROOM_STEM = new BYGBlockProperties.BlockHugeNetherMushroomStem("soul_shroom_stem");
    public static final Block SOUL_SHROOM_BLOCK = new BYGBlockProperties.BlockHugeNetherMushroom("soul_shroom_block");
    public static final Block DEATH_CAP_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeNetherMushroom("death_cap_mushroom_block");
    public static final Block BULBIS_SHELL = new BYGBlockProperties.BulbisShell("bulbis_shell");
    public static final Block PURPLE_BULBIS_SHELL = new BYGBlockProperties.BulbisShell("purple_bulbis_shell");

    public static final Block CATTAIL = new BYGBlockProperties.BlockCattail("cattail");
    public static final Block REEDS = new BYGBlockProperties.BlockCattail("reeds");
    public static final Block REED_THATCH = new BYGBlockProperties.BYGThatch("reed_thatch");
    public static final Block REED_THATCH_CARPET = new BYGBlockProperties.ThatchCarpet("reed_thatch_carpet");
    public static final Block REED_THATCH_STAIRS = new BYGBlockProperties.ThatchStairs("reed_thatch_stairs");
    public static final Block REED_THATCH_SLAB = new BYGBlockProperties.ThatchSlab("reed_thatch_slab");
    public static final Block HORSEWEED = createFlower("horseweed", BYGBlockTags.GROUND_HORSEWEED);
    public static final Block MINI_CACTUS = createDesertPlant("mini_cactus", BYGBlockTags.GROUND_MINI_CACTUS);
    public static final Block PRICKLY_PEAR_CACTUS = createDesertPlant("prickly_pear_cactus", BYGBlockTags.GROUND_PRICKLY_PEAR_CACTUS);
    public static final Block WINTER_SUCCULENT = createFlower("winter_succulent", BYGBlockTags.GROUND_WINTER_SUCCULENT);
    public static final Block SHORT_GRASS = new BYGBlockProperties.BYGTallGrass("short_grass");
    public static final Block TALL_PRAIRIE_GRASS = createTallFlower("tall_prairie_grass", BYGBlockTags.GROUND_TALL_PRAIRIE_GRASS);
    public static final Block BLUE_GLOWCANE = new BYGBlockProperties.BYGBLUEGlowCane("blue_glowcane");
    public static final Block RED_GLOWCANE = new BYGBlockProperties.BYGREDGlowCane("red_glowcane");
    public static final Block PURPLE_GLOWCANE = new BYGBlockProperties.BYGPURPLEGlowCane("purple_glowcane");
    public static final Block PINK_GLOWCANE = new BYGBlockProperties.BYGPINKGlowCane("pink_glowcane");
    public static final Block POISON_IVY = new BYGBlockProperties.BYGPoisonIvy("poison_ivy");
    public static final Block SKYRIS_VINE = new BYGBlockProperties.BYGSkyrisVine("skyris_vine");
    public static final Block BLUEBERRY_BUSH = createBlueBerryBush("blueberry_bush");
    public static final Block TINY_LILYPADS = new BYGBlockProperties.BYGLily("tiny_lilypads");
    public static final Block WATER_SILK = new BYGBlockProperties.BYGWaterSilk("water_silk");
    public static final Block WEEPING_ROOTS = new BYGBlockProperties.BYGHangingVine("weeping_roots");
    public static final Block WEEPING_ROOTS_PLANT = new BYGBlockProperties.BYGHangingVinePlant("weeping_roots_plant");
    public static final Block WINTER_GRASS = new BYGBlockProperties.BYGWinterTallGrass("winter_grass");
    public static final Block WEED_GRASS = new BYGBlockProperties.BYGTallGrass("weed_grass");
    public static final Block WILTED_GRASS = new BYGBlockProperties.BYGTallGrass("wilted_grass");
    public static final Block SHORT_BEACH_GRASS = new BYGBlockProperties.BYGBeachGrass("short_beach_grass");
    public static final Block BEACH_GRASS = new BYGBlockProperties.BYGBeachGrass("beach_grass");
    public static final Block LEAF_PILE = new BYGBlockProperties.BYGLeafPile("leaf_pile");
    public static final Block CLOVER_PATCH = new BYGBlockProperties.BYGLeafPile("clover_patch");
    public static final Block FLOWER_PATCH = new BYGBlockProperties.BYGLeafPile("flower_patch");
    public static final Block BAOBAB_FRUIT_BLOCK = createBaobabFruitBlock("baobab_fruit_block");
    public static final Block ETHER_BULB = createEtherBulbBlock("ether_bulbs_block");

    public static final Block ANTHRACITE_BLOCK = new BYGBlockProperties.AnthraciteOre("anthracite_block");
    public static final Block ANTHRACITE_ORE = new BYGBlockProperties.AnthraciteOre("anthracite_ore");

    public static final Block NETHER_BRISTLE = new BYGBlockProperties.BYGDoubleDamagePlant("nether_bristle");
    public static final Block MOSSY_NETHERRACK = new BYGBlockProperties.BYGNetherrack("mossy_netherrack");

    public static final Block CRIMSON_BERRY_BUSH = createCrimsonBerryBush("crimson_berry_bush");
    public static final Block TALL_CRIMSON_ROOTS = new BYGBlockProperties.BYGDoubleNetherPlant("tall_crimson_roots");
    public static final Block BRIMSTONE = new BYGBlockProperties.BYGNetherrack("brimstone");
    public static final Block YELLOW_NETHER_BRICKS = new BYGBlockProperties.BYGNetherrack("yellow_nether_bricks");
    public static final Block BORIC_CAMPFIRE = createCampfireBlock(3, "boric_campfire");
    public static final Block BORIC_FIRE = new BYGBlockProperties.BoricFire("boric_fire");

    public static final Block HANGING_BONE = new BYGBlockProperties.HangingBones("hanging_bones");
    public static final Block QUARTZ_CRYSTAL = createDullCrystal("quartz_crystal");
    public static final Block QUARTZITE_SAND = new BYGBlockProperties.BYGQuartziteSand("quartzite_sand");
    public static final Block RAW_QUARTZ_BLOCK = new BYGBlockProperties.BYGStone("raw_quartz_block");

    public static final Block WAILING_VINES = new BYGBlockProperties.WailingVines("wailing_vine");
    public static final Block WAILING_GRASS = new BYGBlockProperties.WhalingGrass("wailing_grass");
    public static final Block MAGMATIC_STONE = new BYGBlockProperties.BYGNetherrack("magmatic_stone");
    public static final Block SCORCHED_BUSH = new BYGBlockProperties.ScorchedPlant("scorched_bush");
    public static final Block SCORCHED_GRASS = new BYGBlockProperties.ScorchedPlant("scorched_grass");

    public static final Block WARPED_CACTUS = createWarpedCactus("warped_cactus");
    public static final Block WARPED_BUSH = new BYGBlockProperties.BYGWarpedBush("warped_bush");
    public static final Block WARPED_CORAL_BLOCK = new BYGBlockProperties.BYGWarpedCoralBlock("warped_coral_block");
    public static final Block WARPED_CORAL = new BYGBlockProperties.BYGWarpedCoral("warped_coral");
    public static final Block WARPED_CORAL_FAN = new BYGBlockProperties.BYGWarpedFanCoral("warped_coral_fan");
    public static final Block WARPED_CORAL_WALL_FAN = new BYGBlockProperties.BYGWarpedWallFanCoral("warped_coral_wall_fan");
    public static final Block NYLIUM_SOUL_SAND = new BYGBlockProperties.BYGNyliumSoulSand("nylium_soul_sand");
    public static final Block NYLIUM_SOUL_SOIL = new BYGBlockProperties.BYGNyliumSoulSoil("nylium_soul_soil");

    public static final Block SYTHIAN_WART_BLOCK = new BYGBlockProperties.BYGWartBlock("sythian_wart_block");
    public static final Block SYTHIAN_ROOTS = new BYGBlockProperties.SythianPlant("sythian_roots");
    public static final Block SYTHIAN_SPROUT = new BYGBlockProperties.SythianPlant("sythian_sprout");
    public static final Block SYTHIAN_STALK_BLOCK = new BYGBlockProperties.SythianStalk("sythian_stalk_block");
    public static final Block SYTHIAN_SCAFFOLDING = new BYGBlockProperties.BYGScaffolding("sythian_scaffolding");
    public static final Block SYTHIAN_SAPLING = new BYGBlockProperties.SythianSapling("sythian_sapling");

    public static final Block HANGING_SYTHIAN_ROOTS = new BYGBlockProperties.BYGSythianHangingRoots("hanging_sythian_roots");
    public static final Block HANGING_SYTHIAN_ROOTS_PLANT = new BYGBlockProperties.BYGSythianHangingRootsPlant("hanging_sythian_roots_plant");

    public static final Block EMBUR_LILY = new BYGBlockProperties.BYGEmburLily("embur_lily");
    public static final Block EMBUR_GEL_BLOCK = createEmburGelBlock("embur_gel_block");
    public static final Block EMBUR_GEL_VINES = createEmburGelVine("embur_gel_vines");
    public static final Block EMBUR_GEL_VINES_PLANT = createEmburGelVinePlant("embur_gel_vines_plant");
    public static final Block EMBUR_GEL_BRANCH = createEmburGelBranch("embur_gel_branch");

    public static final Block EMBUR_SPROUTS = createBlock(new NetherSproutsBlock(AbstractBlock.Properties.of(Material.REPLACEABLE_FIREPROOF_PLANT, MaterialColor.COLOR_CYAN).noCollission().instabreak().sound(SoundType.NETHER_SPROUTS)), "embur_sprouts");
    public static final Block EMBUR_ROOTS = new BYGBlockProperties.BYGEmburPlant("embur_roots");
    public static final Block EMBUR_WART = createNetherMushroomPlant(new BYGMushroomToHugeMushroom.EmburWart(), "embur_wart");
    public static final Block TALL_EMBUR_ROOTS = new BYGBlockProperties.BYGDoubleNetherPlant("tall_embur_roots");

    public static final Block BLUE_NETHERRACK = new BYGBlockProperties.BYGBlueNetherrack("blue_netherrack");
    public static final Block BLUE_NETHERRACK_BRICKS = new BYGBlockProperties.BYGBlueNetherrackBricks("blue_nether_bricks");

    public static final Block BULBIS_SPROUTS = createIvisBulbisPlant("bulbis_sprouts");
    public static final Block IVIS_ROOTS = createIvisBulbisPlant("ivis_roots");
    public static final Block IVIS_SPROUT = createIvisBulbisPlant("ivis_sprout");
    public static final Block ENDER_LILY = new BYGBlockProperties.BYGEnderLily("ender_lily");

    public static final Block ETHER_FOLIAGE = new BYGBlockProperties.BYGLeafFoilage("ether_foliage");
    public static final Block TALL_ETHER_GRASS = createTallEtherPlant("tall_ether_grass");
    public static final Block ETHER_GRASS = createEtherPlant("ether_grass");
    public static final Block ETHER_BUSH = createEtherPlant("ether_bush");
    public static final Block THEREAL_BELLFLOWER = createEtherPlant("thereal_bellflower");
    public static final Block NIGHTSHADE_SPROUTS = createNightshadePlant("nightshade_sprouts");
    public static final Block NIGHTSHADE_ROOTS = createTallNightshadePlant("nightshade_roots");
    public static final Block NIGHTSHADE_BERRY_BUSH = createNightshadeBerryBush("nightshade_berry_bush");

    public static final Block PURPUR_STONE = new BYGBlockProperties.BYGStone("purpur_stone");
    public static final Block PURPUR_STONE_SLAB = createStoneSlab("purpur_stone_slab");
    public static final Block PURPUR_STONE_STAIRS = new BYGBlockProperties.BYGStoneStairs("purpur_stone_stairs");
    public static final Block PURPUR_STONE_WALL = createStoneWall("purpur_stone_wall");
    public static final Block ETHER_STONE = createEtherStone("ether_stone");
    public static final Block ETHER_STONE_SLAB = createStoneSlab("ether_stone_slab");
    public static final Block ETHER_STONE_STAIRS = new BYGBlockProperties.BYGStoneStairs("ether_stone_stairs");
    public static final Block ETHER_STONE_WALL = createStoneWall("ether_stone_wall");

    public static final Block COBBLED_ETHER_STONE = createEtherStone("cobbled_ether_stone");
    public static final Block COBBLED_ETHER_STONE_SLAB = createStoneSlab("cobbled_ether_stone_slab");
    public static final Block COBBLED_ETHER_STONE_STAIRS = new BYGBlockProperties.BYGStoneStairs("cobbled_ether_stone_stairs");
    public static final Block COBBLED_ETHER_STONE_WALL = createStoneWall("cobbled_ether_stone_wall");

    public static final Block CARVED_ETHER_STONE = createEtherStone("carved_ether_stone");
    public static final Block CARVED_ETHER_STONE_SLAB = createStoneSlab("carved_ether_stone_slab");
    public static final Block CARVED_ETHER_STONE_STAIRS = new BYGBlockProperties.BYGStoneStairs("carved_ether_stone_stairs");
    public static final Block CARVED_ETHER_STONE_WALL = createStoneWall("carved_ether_stone_wall");

    public static final Block LIGNITE_BLOCK = new BYGBlockProperties.AnthraciteOre("lignite_block");
    public static final Block LIGNITE_ORE = new BYGBlockProperties.AnthraciteOre("lignite_ore");

    public static final Block ODDITY_CACTUS = createOddityCactus("oddity_cactus");
    public static final Block ODDITY_BUSH = createOddityDesertPlant("oddity_bush");
    public static final Block END_SAND = createSand(16053687, "end_sand");

    public static final Block VERMILION_SCULK_TENDRILS = createSculkPlant("vermilion_sculk_tendrils");
    public static final Block VERMILION_SCULK_GROWTH = createSculkGrowth("vermilion_sculk_growth");
    public static final Block THERIUM_CRYSTAL = createTheriumCrystal("therium_crystal");
    public static final Block THERIUM_BLOCK = createTheriumBlock("therium_block");
    public static final Block THERIUM_LANTERN = new BYGBlockProperties.BYGLantern("therium_lantern");
    public static final Block THERIUM_LAMP = new BYGBlockProperties.BYGGlowCaneBlock("therium_lamp");
    public static final Block CHISELED_THERIUM = createChiseledTherium("chiseled_therium");
    public static final Block CHISELED_THERIUM_STAIRS = createChiseledTheriumStairs("chiseled_therium_stairs");
    public static final Block CHISELED_THERIUM_SLAB = createChiseledTheriumSlab("chiseled_therium_slab");
    public static final Block CHISELED_THERIUM_WALL = createChiseledTheriumWall("chiseled_therium_wall");
    public static final Block SHINY_CHISELED_THERIUM = createShinyChiseledTherium("shiny_chiseled_therium");
    public static final Block SHINY_CHISELED_THERIUM_STAIRS = createShinyChiseledTheriumStairs("shiny_chiseled_therium_stairs");
    public static final Block SHINY_CHISELED_THERIUM_SLAB = createShinyChiseledTheriumSlab("shiny_chiseled_therium_slab");
    public static final Block SHINY_CHISELED_THERIUM_WALL = createShinyChiseledTheriumWall("shiny_chiseled_therium_wall");
    public static final Block THERIUM_GLASS = createTheriumGlass("therium_glass");
    public static final Block THERIUM_GLASS_PANE = createTheriumGlassPane("therium_glass_pane");

    public static final Block CRYPTIC_CAMPFIRE = createCampfireBlock(4, "cryptic_campfire");
    public static final Block CRYPTIC_FIRE = new BYGBlockProperties.CrypticFire("cryptic_fire");
    public static final Block CRYPTIC_MAGMA_BLOCK = new BYGBlockProperties.BYGMagma("cryptic_magma_block");
    public static final Block CRYPTIC_STONE = new BYGBlockProperties.BYGStone("cryptic_stone");
    public static final Block CRYPTIC_STONE_SLAB = createStoneSlab("cryptic_stone_slab");
    public static final Block CRYPTIC_STONE_STAIRS = new BYGBlockProperties.BYGStoneStairs("cryptic_stone_stairs");
    public static final Block CRYPTIC_STONE_WALL = createStoneWall("cryptic_stone_wall");
    public static final Block CRYPTIC_VENT = createVent("cryptic_vent");
    public static final Block TALL_CRYPTIC_VENT = createTallVent("tall_cryptic_vent");
    public static final Block CRYPTIC_REDSTONE_ORE = createBlock(new RedstoneBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.NETHER_GOLD_ORE).strength(0.4F, 0.4F).harvestLevel(2).lightLevel((state) -> 13).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()), "cryptic_redstone_ore");
    public static final Block CRYPTIC_BRAMBLE = createStoneEndPlant("cryptic_bramble");

    public static final Block IMPARIUS_MUSHROOM_BLOCK = createImpariusMushroom("imparius_mushroom_block");
    public static final Block IMPARIUS_MUSHROOM_BRANCH = createImpariusMushroomBranch("imparius_mushroom_branch");
    public static final Block FUNGAL_IMPARIUS_BLOCK = createFungalImparius("fungal_imparius_block");
    public static final Block FUNGAL_IMPARIUS_FILAMENT_BLOCK = createFungalImpariusFilamentBlock("fungal_imparius_filament_block");
    public static final Block FUNGAL_IMPARIUS_FILAMENT = createFungalImpariusFilament("fungal_imparius_filament");
    public static final Block IMPARIUS_VINE = createImpariusVine("imparius_vine");
    public static final Block IMPARIUS_VINE_PLANT = createImpariusVinePlant("imparius_vine_plant");
    public static final Block IMPARIUS_BUSH = createImpariusPlant("imparius_bush");

    public static final Block SHULKREN_MOSS_BLANKET = createSculkGrowth("shulkren_moss_blanket");
    public static final Block SHULKREN_WART_BLOCK = new BYGBlockProperties.BYGWartBlock("shulkren_wart_block");
    public static final Block SHULKREN_VINE = createShulkrenVine("shulkren_vine");
    public static final Block SHULKREN_VINE_PLANT = createShulkrenVinePlant("shulkren_vine_plant");
    public static final Block PURPLE_SHROOMLIGHT = createShroomlight("purple_shroomlight");

    public static final Block BLUE_GLOWCANE_BLOCK = new BYGBlockProperties.BYGGlowCaneBlock("blue_glowcane_block");
    public static final Block RED_GLOWCANE_BLOCK = new BYGBlockProperties.BYGGlowCaneBlock("red_glowcane_block");
    public static final Block PINK_GLOWCANE_BLOCK = new BYGBlockProperties.BYGGlowCaneBlock("pink_glowcane_block");
    public static final Block PURPLE_GLOWCANE_BLOCK = new BYGBlockProperties.BYGGlowCaneBlock("purple_glowcane_block");

    public static final Block GLOWSTONE_LAMP = new BYGBlockProperties.BYGGlowCaneBlock("glowstone_lamp");
    public static final Block PERVADED_NETHERRACK = new BYGBlockProperties.BYGPervadedNetherrack("pervaded_netherrack");
    public static final Block GLOWSTONE_LANTERN = new BYGBlockProperties.BYGLantern("glowstone_lantern");
    public static final Block PACKED_BLACK_ICE = new BYGBlockProperties.BYGPackedIceBlock("packed_black_ice");
    public static final Block BLACK_ICE = new BYGBlockProperties.BYGIceBlock("black_ice");
    public static final Block FROST_MAGMA = new BYGBlockProperties.BYGFrostMagma("frost_magma");
    public static final Block SUBZERO_ASH = new BYGBlockProperties.BYGSubzeroAsh("subzero_ash");
    public static final Block SUBZERO_ASH_BLOCK = new BYGBlockProperties.BYGSubzeroAshBlock("subzero_ash_block");
    public static final Block LAMENT_SPROUTS = new BYGBlockProperties.BYGLamentPlant("lament_sprouts");
    public static final Block LAMENT_VINE = new BYGBlockProperties.BYGLamentVine("lament_vine");
    public static final Block LAMENT_VINE_PLANT = new BYGBlockProperties.BYGLamentVinePlant("lament_vine_plant");

    public static final Block PINK_CHERRY_FOLIAGE = new BYGBlockProperties.BYGLeafFoilage("pink_cherry_foliage");
    public static final Block WHITE_CHERRY_FOLIAGE = new BYGBlockProperties.BYGLeafFoilage("white_cherry_foliage");

    public static final Block WHITE_PETAL = createPetal("white_petal_block");
    public static final Block RED_PETAL = createPetal("red_petal_block");
    public static final Block PURPLE_PETAL = createPetal("purple_petal_block");
    public static final Block BLUE_PETAL = createPetal("blue_petal_block");
    public static final Block LIGHT_BLUE_PETAL = createPetal("light_blue_petal_block");
    public static final Block YELLOW_PETAL = createPetal("yellow_petal_block");
    public static final Block PLANT_STEM = createLog("plant_stem");
    public static final Block POLLEN_BLOCK = new BYGBlockProperties.BYGPollen("pollen_block");

    public static final Block BLACK_SAND = createSand(5197647, "black_sand");
    public static final Block BLACK_SANDSTONE = new BYGBlockProperties.BYGStone("black_sandstone");
    public static final Block BLACK_CHISELED_SANDSTONE = new BYGBlockProperties.BYGStone("black_chiseled_sandstone");
    public static final Block BLACK_CUT_SANDSTONE = new BYGBlockProperties.BYGStone("black_cut_sandstone");
    public static final Block BLACK_SMOOTH_SANDSTONE = new BYGBlockProperties.BYGStone("black_smooth_sandstone");

    public static final Block WHITE_SAND = createSand(15395562, "white_sand");
    public static final Block WHITE_SANDSTONE = new BYGBlockProperties.BYGStone("white_sandstone");
    public static final Block WHITE_CHISELED_SANDSTONE = new BYGBlockProperties.BYGStone("white_chiseled_sandstone");
    public static final Block WHITE_CUT_SANDSTONE = new BYGBlockProperties.BYGStone("white_cut_sandstone");
    public static final Block WHITE_SMOOTH_SANDSTONE = new BYGBlockProperties.BYGStone("white_smooth_sandstone");

    public static final Block BLUE_SAND = createSand(13559021, "blue_sand");
    public static final Block BLUE_SANDSTONE = new BYGBlockProperties.BYGStone("blue_sandstone");
    public static final Block BLUE_CHISELED_SANDSTONE = new BYGBlockProperties.BYGStone("blue_chiseled_sandstone");
    public static final Block BLUE_CUT_SANDSTONE = new BYGBlockProperties.BYGStone("blue_cut_sandstone");
    public static final Block BLUE_SMOOTH_SANDSTONE = new BYGBlockProperties.BYGStone("blue_smooth_sandstone");

    public static final Block PURPLE_SAND = createSand(12887002, "purple_sand");
    public static final Block PURPLE_SANDSTONE = new BYGBlockProperties.BYGStone("purple_sandstone");
    public static final Block PURPLE_CHISELED_SANDSTONE = new BYGBlockProperties.BYGStone("purple_chiseled_sandstone");
    public static final Block PURPLE_CUT_SANDSTONE = new BYGBlockProperties.BYGStone("purple_cut_sandstone");
    public static final Block PURPLE_SMOOTH_SANDSTONE = new BYGBlockProperties.BYGStone("purple_smooth_sandstone");

    public static final Block PINK_SAND = createSand(15585004, "pink_sand");
    public static final Block PINK_SANDSTONE = new BYGBlockProperties.BYGStone("pink_sandstone");
    public static final Block PINK_CHISELED_SANDSTONE = new BYGBlockProperties.BYGStone("pink_chiseled_sandstone");
    public static final Block PINK_CUT_SANDSTONE = new BYGBlockProperties.BYGStone("pink_cut_sandstone");
    public static final Block PINK_SMOOTH_SANDSTONE = new BYGBlockProperties.BYGStone("pink_smooth_sandstone");


    public static final Block ASPEN_LOG = createLog("aspen_log");
    public static final Block BAOBAB_LOG = createLog("baobab_log");
    public static final Block BLUE_ENCHANTED_LOG = createLog("blue_enchanted_log");
    public static final Block CHERRY_LOG = createLog("cherry_log");
    public static final Block CIKA_LOG = createLog("cika_log");
    public static final Block CYPRESS_LOG = createLog("cypress_log");
    public static final Block EBONY_LOG = createLog("ebony_log");
    public static final Block FIR_LOG = createLog("fir_log");
    public static final Block GREEN_ENCHANTED_LOG = createLog("green_enchanted_log");
    public static final Block HOLLY_LOG = createLog("holly_log");
    public static final Block JACARANDA_LOG = createLog("jacaranda_log");
    public static final Block MAHOGANY_LOG = createLog("mahogany_log");
    public static final Block MANGROVE_LOG = createLog("mangrove_log");
    public static final Block MAPLE_LOG = createLog("maple_log");
    public static final Block PALO_VERDE_LOG = createLog("palo_verde_log");
    public static final Block PINE_LOG = createLog("pine_log");
    public static final Block RAINBOW_EUCALYPTUS_LOG = createLog("rainbow_eucalyptus_log");
    public static final Block REDWOOD_LOG = createLog("redwood_log");
    public static final Block SKYRIS_LOG = createLog("skyris_log");
    public static final Block WILLOW_LOG = createLog("willow_log");
    public static final Block WITCH_HAZEL_LOG = createLog("witch_hazel_log");
    public static final Block ZELKOVA_LOG = createLog("zelkova_log");
    public static final Block SYTHIAN_STEM = new BYGBlockProperties.BYGNetherLog("sythian_stem");
    public static final Block EMBUR_PEDU = new BYGBlockProperties.BYGNetherLog("embur_pedu");
    public static final Block PALM_LOG = createLog("palm_log");
    public static final Block LAMENT_LOG = new BYGBlockProperties.BYGNetherLog("lament_log");
    public static final Block WITHERING_OAK_LOG = createLog("withering_oak_log");
    public static final Block BULBIS_STEM = new BYGBlockProperties.BYGNetherLog("bulbis_stem");
    public static final Block NIGHTSHADE_LOG = createLog("nightshade_log");
    public static final Block IMBUED_NIGHTSHADE_LOG = createLog("imbued_nightshade_log");
    public static final Block ETHER_LOG = createLog("ether_log");
    public static final Block IMPARIUS_STEM = new BYGBlockProperties.BYGNetherLog("imparius_stem");
    public static final Block FUNGAL_IMPARIUS_STEM = new BYGBlockProperties.BYGNetherLog("fungal_imparius_stem");


    public static final Block ASPEN_WOOD = createWood("aspen_wood");
    public static final Block BAOBAB_WOOD = createWood("baobab_wood");
    public static final Block BLUE_ENCHANTED_WOOD = createWood("blue_enchanted_wood");
    public static final Block CHERRY_WOOD = createWood("cherry_wood");
    public static final Block CIKA_WOOD = createWood("cika_wood");
    public static final Block CYPRESS_WOOD = createWood("cypress_wood");
    public static final Block EBONY_WOOD = createWood("ebony_wood");
    public static final Block FIR_WOOD = createWood("fir_wood");
    public static final Block GREEN_ENCHANTED_WOOD = createWood("green_enchanted_wood");
    public static final Block HOLLY_WOOD = createWood("holly_wood");
    public static final Block JACARANDA_WOOD = createWood("jacaranda_wood");
    public static final Block MAHOGANY_WOOD = createWood("mahogany_wood");
    public static final Block MANGROVE_WOOD = createWood("mangrove_wood");
    public static final Block MAPLE_WOOD = createWood("maple_wood");
    public static final Block PALO_VERDE_WOOD = createWood("palo_verde_wood");
    public static final Block PINE_WOOD = createWood("pine_wood");
    public static final Block RAINBOW_EUCALYPTUS_WOOD = createWood("rainbow_eucalyptus_wood");
    public static final Block REDWOOD_WOOD = createWood("redwood_wood");
    public static final Block SKYRIS_WOOD = createWood("skyris_wood");
    public static final Block WILLOW_WOOD = createWood("willow_wood");
    public static final Block WITCH_HAZEL_WOOD = createWood("witch_hazel_wood");
    public static final Block ZELKOVA_WOOD = createWood("zelkova_wood");
    public static final Block SYTHIAN_HYPHAE = new BYGBlockProperties.BYGNetherWood("sythian_hyphae");
    public static final Block EMBUR_HYPHAE = new BYGBlockProperties.BYGNetherWood("embur_hyphae");
    public static final Block PALM_WOOD = createWood("palm_wood");
    public static final Block LAMENT_WOOD = new BYGBlockProperties.BYGNetherWood("lament_wood");
    public static final Block WITHERING_OAK_WOOD = createWood("withering_oak_wood");
    public static final Block BULBIS_WOOD = new BYGBlockProperties.BYGNetherWood("bulbis_wood");
    public static final Block NIGHTSHADE_WOOD = createWood("nightshade_wood");
    public static final Block ETHER_WOOD = createWood("ether_wood");
    public static final Block IMPARIUS_HYPHAE = new BYGBlockProperties.BYGNetherWood("imparius_hyphae");
    public static final Block FUNGAL_IMPARIUS_HYPHAE = new BYGBlockProperties.BYGNetherWood("fungal_imparius_hyphae");

    public static final Block BLACK_PUFF = createMushroomPlant(new BYGMushroomToHugeMushroom.BlackPuff(), "black_puff");
    public static final Block WEEPING_MILKCAP = createMushroomPlant(new BYGMushroomToHugeMushroom.WeepingMilkCap(), "weeping_milkcap");
    public static final Block WOOD_BLEWIT = createMushroomPlant(new BYGMushroomToHugeMushroom.WoodBlewit(), "wood_blewit");
    public static final Block GREEN_MUSHROOM = createMushroomPlant(new BYGMushroomToHugeMushroom.GreenMushroom(), "green_mushroom");
    public static final Block BLUE_GLOWSHROOM = createMushroomPlant(new BYGMushroomToHugeMushroom.BlueGlowshroom(), "blue_glowshroom");
    public static final Block PURPLE_GLOWSHROOM = createMushroomPlant(new BYGMushroomToHugeMushroom.PurpleGlowshroom(), "purple_glowshroom");

    public static final Block SYTHIAN_FUNGUS = createNetherMushroomPlant(new BYGMushroomToHugeMushroom.SythianFungus(), "sythian_fungus");
    public static final Block SOUL_SHROOM = createNetherMushroomPlant(new BYGMushroomToHugeMushroom.SoulShroom(), "soul_shroom");
    public static final Block DEATH_CAP = createNetherMushroomPlant(new BYGMushroomToHugeMushroom.DeathCap(), "death_cap");

    public static final Block BULBIS_ODDITY = createMushroomPlant(new BYGMushroomToHugeMushroom.Bulbis(), "bulbis_oddity");
    public static final Block PURPLE_BULBIS_ODDITY = createMushroomPlant(new BYGMushroomToHugeMushroom.PurpleBulbis(), "purple_bulbis_oddity");
    public static final Block SHULKREN_FUNGUS = createMushroomPlant(new BYGMushroomToHugeMushroom.ShulkrenFungus(), "shulkren_fungus");
    public static final Block IMPARIUS_MUSHROOM = createMushroomPlant(new BYGMushroomToHugeMushroom.ImpariusMushroom(), "imparius_mushroom");
    public static final Block FUNGAL_IMPARIUS = createMushroomPlant(new BYGMushroomToHugeMushroom.FungalImparius(), "fungal_imparius");

    public static final Block BULBIS_ANOMALY = createTallBulbis("bulbis_anomaly");
    public static final Block PURPLE_BULBIS_ANOMALY = createTallBulbis("purple_bulbis_anomaly");

    public static final Block SOUL_SHROOM_SPORE = new BYGBlockProperties.BYGSoulShroomSpore("soul_shroom_spore");
    public static final Block SOUL_SHROOM_SPORE_END = new BYGBlockProperties.BYGSoulShroomSporeEnd("soul_shroom_spore_end");

    public static final Block RAW_PENDORITE_BLOCK = createRawPendoriteBlock("raw_pendorite_block");
    public static final Block PENDORITE_ORE = createPendoriteOre("pendorite_ore");
    public static final Block AMETRINE_ORE = createAmetrineOre("ametrine_ore");
    public static final Block PENDORITE_BLOCK = createPendoriteBlock("pendorite_block");
    public static final Block AMETRINE_BLOCK = createAmetrineBlock("ametrine_block");
    public static final Block BUDDING_AMETRINE_ORE = createBuddingAmetrineOre("budding_ametrine_ore");
    public static final Block AMETRINE_CLUSTER = createAmetrineCluster("ametrine_cluster");
    public static final Block DACITE = createDacite("dacite");
    public static final Block DACITE_SLAB = createStoneSlab("dacite_slab");
    public static final Block DACITE_STAIRS = new BYGBlockProperties.BYGStoneStairs("dacite_stairs");
    public static final Block DACITE_WALL = createStoneWall("dacite_wall");
    public static final Block DACITE_BRICKS = new BYGBlockProperties.BYGStone("dacite_bricks");
    public static final Block DACITE_BRICK_SLAB = createStoneSlab("dacite_brick_slab");
    public static final Block DACITE_BRICK_STAIRS = new BYGBlockProperties.BYGStoneStairs("dacite_brick_stairs");
    public static final Block DACITE_BRICK_WALL = createStoneWall("dacite_brick_wall");
    public static final Block DACITE_COBBLESTONE = new BYGBlockProperties.BYGStone("dacite_cobblestone");
    public static final Block DACITE_COBBLESTONE_SLAB = createStoneSlab("dacite_cobblestone_slab");
    public static final Block DACITE_COBBLESTONE_STAIRS = new BYGBlockProperties.BYGStoneStairs("dacite_cobblestone_stairs");
    public static final Block DACITE_COBBLESTONE_WALL = createStoneWall("dacite_cobblestone_wall");
    public static final Block DACITE_PILLAR = new BYGBlockProperties.BYGPillar("dacite_pillar");
    public static final Block DACITE_TILE = new BYGBlockProperties.BYGStone("dacite_tile");
    public static final Block DACITE_TILE_SLAB = createStoneSlab("dacite_tile_slab");
    public static final Block DACITE_TILE_STAIRS = new BYGBlockProperties.BYGStoneStairs("dacite_tile_stairs");
    public static final Block DACITE_TILE_WALL = createStoneWall("dacite_tile_wall");

    public static final Block RED_ROCK = createRedRock("red_rock");
    public static final Block RED_ROCK_SLAB = createStoneSlab("red_rock_slab");
    public static final Block RED_ROCK_STAIRS = new BYGBlockProperties.BYGStoneStairs("red_rock_stairs");
    public static final Block RED_ROCK_WALL = createStoneWall("red_rock_wall");
    public static final Block RED_ROCK_BRICKS = new BYGBlockProperties.BYGStone("red_rock_bricks");
    public static final Block RED_ROCK_BRICK_SLAB = createStoneSlab("red_rock_brick_slab");
    public static final Block RED_ROCK_BRICK_STAIRS = new BYGBlockProperties.BYGStoneStairs("red_rock_brick_stairs");
    public static final Block RED_ROCK_BRICK_WALL = createStoneWall("red_rock_brick_wall");
    public static final Block CRACKED_RED_ROCK_BRICKS = new BYGBlockProperties.BYGStone("cracked_red_rock_bricks");
    public static final Block CRACKED_RED_ROCK_BRICK_SLAB = createStoneSlab("cracked_red_rock_brick_slab");
    public static final Block CRACKED_RED_ROCK_BRICK_STAIRS = new BYGBlockProperties.BYGStoneStairs("cracked_red_rock_brick_stairs");
    public static final Block CRACKED_RED_ROCK_BRICK_WALL = createStoneWall("cracked_red_rock_brick_wall");
    public static final Block CHISELED_RED_ROCK_BRICKS = new BYGBlockProperties.BYGStone("chiseled_red_rock_bricks");
    public static final Block CHISELED_RED_ROCK_BRICK_SLAB = createStoneSlab("chiseled_red_rock_brick_slab");
    public static final Block CHISELED_RED_ROCK_BRICK_STAIRS = new BYGBlockProperties.BYGStoneStairs("chiseled_red_rock_brick_stairs");
    public static final Block CHISELED_RED_ROCK_BRICK_WALL = createStoneWall("chiseled_red_rock_brick_wall");
    public static final Block MOSSY_RED_ROCK_BRICKS = new BYGBlockProperties.BYGStone("mossy_red_rock_bricks");
    public static final Block MOSSY_RED_ROCK_BRICK_SLAB = createStoneSlab("mossy_red_rock_brick_slab");
    public static final Block MOSSY_RED_ROCK_BRICK_STAIRS = new BYGBlockProperties.BYGStoneStairs("mossy_red_rock_brick_stairs");
    public static final Block MOSSY_RED_ROCK_BRICK_WALL = createStoneWall("mossy_red_rock_brick_wall");

    public static final Block MOSSY_STONE = createMossyStone("mossy_stone");
    public static final Block MOSSY_STONE_SLAB = createStoneSlab("mossy_stone_slab");
    public static final Block MOSSY_STONE_STAIRS = new BYGBlockProperties.BYGStoneStairs("mossy_stone_stairs");
    public static final Block MOSSY_STONE_WALL = createStoneWall("mossy_stone_wall");

    public static final Block ROCKY_STONE = createRockyStone("rocky_stone");
    public static final Block ROCKY_SLAB = createStoneSlab("rocky_stone_slab");
    public static final Block ROCKY_STAIRS = new BYGBlockProperties.BYGStoneStairs("rocky_stone_stairs");
    public static final Block ROCKY_WALL = createStoneWall("rocky_stone_wall");

    public static final Block SCORIA_STONE = createScoria("scoria_stone");
    public static final Block SCORIA_SLAB = createScoriaStoneSlab("scoria_stone_slab");
    public static final Block SCORIA_STAIRS = createScoriaStoneStairs("scoria_stone_stairs");
    public static final Block SCORIA_WALL = createScoriaStoneWall("scoria_stone_wall");
    public static final Block SCORIA_COBBLESTONE = createScoria("scoria_cobblestone");
    public static final Block SCORIA_COBBLESTONE_SLAB = createScoriaStoneSlab("scoria_cobblestone_slab");
    public static final Block SCORIA_COBBLESTONE_STAIRS = createScoriaStoneStairs("scoria_cobblestone_stairs");
    public static final Block SCORIA_COBBLESTONE_WALL = createScoriaStoneWall("scoria_cobblestone_wall");
    public static final Block SCORIA_PILLAR = createScoriaStonePillar("scoria_pillar");
    public static final Block SCORIA_STONEBRICKS = createScoria("scoria_stonebricks");
    public static final Block SCORIA_STONEBRICK_SLAB = createScoriaStoneSlab("scoria_stonebrick_slab");
    public static final Block SCORIA_STONEBRICK_STAIRS = createScoriaStoneStairs("scoria_stonebrick_stairs");
    public static final Block SCORIA_STONEBRICK_WALL = createScoriaStoneWall("scoria_stonebrick_wall");
    public static final Block CRACKED_SCORIA_STONE_BRICKS = createScoria("cracked_scoria_stone_bricks");
    public static final Block EMERALDITE_ORE = createEmeralditeOre("emeraldite_ore");

    public static final Block SOAPSTONE = createSoapstone("soapstone");
    public static final Block SOAPSTONE_SLAB = createStoneSlab("soapstone_slab");
    public static final Block SOAPSTONE_STAIRS = new BYGBlockProperties.BYGStoneStairs("soapstone_stairs");
    public static final Block SOAPSTONE_WALL = createStoneWall("soapstone_wall");
    public static final Block POLISHED_SOAPSTONE = new BYGBlockProperties.BYGStone("polished_soapstone");
    public static final Block POLISHED_SOAPSTONE_SLAB = createStoneSlab("polished_soapstone_slab");
    public static final Block POLISHED_SOAPSTONE_STAIRS = new BYGBlockProperties.BYGStoneStairs("polished_soapstone_stairs");
    public static final Block POLISHED_SOAPSTONE_WALL = createStoneWall("polished_soapstone_wall");
    public static final Block SOAPSTONE_BRICKS = new BYGBlockProperties.BYGStone("soapstone_bricks");
    public static final Block SOAPSTONE_BRICK_SLAB = createStoneSlab("soapstone_brick_slab");
    public static final Block SOAPSTONE_BRICK_STAIRS = new BYGBlockProperties.BYGStoneStairs("soapstone_brick_stairs");
    public static final Block SOAPSTONE_BRICK_WALL = createStoneWall("soapstone_brick_wall");
    public static final Block SOAPSTONE_PILLAR = new BYGBlockProperties.BYGPillar("soapstone_pillar");
    public static final Block SOAPSTONE_TILE = new BYGBlockProperties.BYGStone("soapstone_tile");
    public static final Block SOAPSTONE_TILE_SLAB = createStoneSlab("soapstone_tile_slab");
    public static final Block SOAPSTONE_TILE_STAIRS = new BYGBlockProperties.BYGStoneStairs("soapstone_tile_stairs");
    public static final Block SOAPSTONE_TILE_WALL = createStoneWall("soapstone_tile_wall");

    public static final Block STRIPPED_ASPEN_LOG = createStrippedLog("stripped_aspen_log");
    public static final Block STRIPPED_BAOBAB_LOG = createStrippedLog("stripped_baobab_log");
    public static final Block STRIPPED_BLUE_ENCHANTED_LOG = createStrippedLog("stripped_blue_enchanted_log");
    public static final Block STRIPPED_CHERRY_LOG = createStrippedLog("stripped_cherry_log");
    public static final Block STRIPPED_CIKA_LOG = createStrippedLog("stripped_cika_log");
    public static final Block STRIPPED_CYPRESS_LOG = createStrippedLog("stripped_cypress_log");
    public static final Block STRIPPED_EBONY_LOG = createStrippedLog("stripped_ebony_log");
    public static final Block STRIPPED_FIR_LOG = createStrippedLog("stripped_fir_log");
    public static final Block STRIPPED_GREEN_ENCHANTED_LOG = createStrippedLog("stripped_green_enchanted_log");
    public static final Block STRIPPED_HOLLY_LOG = createStrippedLog("stripped_holly_log");
    public static final Block STRIPPED_JACARANDA_LOG = createStrippedLog("stripped_jacaranda_log");
    public static final Block STRIPPED_MAHOGANY_LOG = createStrippedLog("stripped_mahogany_log");
    public static final Block STRIPPED_MANGROVE_LOG = createStrippedLog("stripped_mangrove_log");
    public static final Block STRIPPED_MAPLE_LOG = createStrippedLog("stripped_maple_log");
    public static final Block STRIPPED_PALO_VERDE_LOG = createStrippedLog("stripped_palo_verde_log");
    public static final Block STRIPPED_PINE_LOG = createStrippedLog("stripped_pine_log");
    public static final Block STRIPPED_RAINBOW_EUCALYPTUS_LOG = createStrippedLog("stripped_rainbow_eucalyptus_log");
    public static final Block STRIPPED_SKYRIS_LOG = createStrippedLog("stripped_skyris_log");
    public static final Block STRIPPED_WILLOW_LOG = createStrippedLog("stripped_willow_log");
    public static final Block STRIPPED_REDWOOD_LOG = createStrippedLog("stripped_redwood_log");
    public static final Block STRIPPED_WITCH_HAZEL_LOG = createStrippedLog("stripped_witch_hazel_log");
    public static final Block STRIPPED_ZELKOVA_LOG = createStrippedLog("stripped_zelkova_log");
    public static final Block STRIPPED_SYTHIAN_STEM = new BYGBlockProperties.BYGNetherLog("stripped_sythian_stem");
    public static final Block STRIPPED_EMBUR_PEDU = new BYGBlockProperties.BYGNetherLog("stripped_embur_pedu");
    public static final Block STRIPPED_PALM_LOG = createStrippedLog("stripped_palm_log");
    public static final Block STRIPPED_LAMENT_LOG = new BYGBlockProperties.BYGNetherLog("stripped_lament_log");
    public static final Block STRIPPED_BULBIS_LOG = new BYGBlockProperties.BYGNetherLog("stripped_bulbis_stem");
    public static final Block STRIPPED_NIGHTSHADE_LOG = createStrippedLog("stripped_nightshade_log");
    public static final Block STRIPPED_ETHER_LOG = createStrippedLog("stripped_ether_log");

    public static final Block STRIPPED_ASPEN_WOOD = createWood("stripped_aspen_wood");
    public static final Block STRIPPED_BAOBAB_WOOD = createWood("stripped_baobab_wood");
    public static final Block STRIPPED_BLUE_ENCHANTED_WOOD = createWood("stripped_blue_enchanted_wood");
    public static final Block STRIPPED_CHERRY_WOOD = createWood("stripped_cherry_wood");
    public static final Block STRIPPED_CIKA_WOOD = createWood("stripped_cika_wood");
    public static final Block STRIPPED_CYPRESS_WOOD = createWood("stripped_cypress_wood");
    public static final Block STRIPPED_EBONY_WOOD = createWood("stripped_ebony_wood");
    public static final Block STRIPPED_FIR_WOOD = createWood("stripped_fir_wood");
    public static final Block STRIPPED_GREEN_ENCHANTED_WOOD = createWood("stripped_green_enchanted_wood");
    public static final Block STRIPPED_HOLLY_WOOD = createWood("stripped_holly_wood");
    public static final Block STRIPPED_JACARANDA_WOOD = createWood("stripped_jacaranda_wood");
    public static final Block STRIPPED_MAHOGANY_WOOD = createWood("stripped_mahogany_wood");
    public static final Block STRIPPED_MANGROVE_WOOD = createWood("stripped_mangrove_wood");
    public static final Block STRIPPED_MAPLE_WOOD = createWood("stripped_maple_wood");
    public static final Block STRIPPED_PALO_VERDE_WOOD = createWood("stripped_palo_verde_wood");
    public static final Block STRIPPED_PINE_WOOD = createWood("stripped_pine_wood");
    public static final Block STRIPPED_RAINBOW_EUCALYPTUS_WOOD = createWood("stripped_rainbow_eucalyptus_wood");
    public static final Block STRIPPED_SKYRIS_WOOD = createWood("stripped_skyris_wood");
    public static final Block STRIPPED_WILLOW_WOOD = createWood("stripped_willow_wood");
    public static final Block STRIPPED_REDWOOD_WOOD = createWood("stripped_redwood_wood");
    public static final Block STRIPPED_WITCH_HAZEL_WOOD = createWood("stripped_witch_hazel_wood");
    public static final Block STRIPPED_ZELKOVA_WOOD = createWood("stripped_zelkova_wood");
    public static final Block STRIPPED_SYTHIAN_HYPHAE = new BYGBlockProperties.BYGNetherWood("stripped_sythian_hyphae");
    public static final Block STRIPPED_EMBUR_HYPHAE = new BYGBlockProperties.BYGNetherWood("stripped_embur_hyphae");
    public static final Block STRIPPED_PALM_WOOD = createWood("stripped_palm_wood");
    public static final Block STRIPPED_LAMENT_WOOD = new BYGBlockProperties.BYGNetherWood("stripped_lament_wood");
    public static final Block STRIPPED_BULBIS_WOOD = new BYGBlockProperties.BYGNetherWood("stripped_bulbis_wood");
    public static final Block STRIPPED_NIGHTSHADE_WOOD = createWood("stripped_nightshade_wood");
    public static final Block STRIPPED_ETHER_WOOD = createWood("stripped_ether_wood");

    public static final Block TALL_ALLIUM = createTallFlower("tall_allium", BYGBlockTags.GROUND_TALL_ALLIUM);
    public static final Block TALL_PINK_ALLIUM = createTallFlower("tall_pink_allium", BYGBlockTags.GROUND_TALL_PINK_ALLIUM);
    public static final Block ALLIUM_FLOWER_BUSH = new BYGBlockProperties.BYGAllium("allium_flower_bush");
    public static final Block AMARANTH = new BYGBlockProperties.BYGAmaranth("amaranth");
    public static final Block ALPINE_BELLFLOWER = createFlower("alpine_bellflower", BYGBlockTags.GROUND_ALPINE_BELLFLOWER);
    public static final Block ANGELICA = createFlower("angelica", BYGBlockTags.GROUND_ANGELICA);
    public static final Block AZALEA = createTallFlower("azalea", BYGBlockTags.GROUND_AZALEA);
    public static final Block BEGONIA = createFlower("begonia", BYGBlockTags.GROUND_BEGONIA);
    public static final Block BISTORT = createFlower("bistort", BYGBlockTags.GROUND_BISTORT);
    public static final Block BLUE_SAGE = createFlower("blue_sage", BYGBlockTags.GROUND_BLUE_SAGE);
    public static final Block CALIFORNIA_POPPY = createFlower("california_poppy", BYGBlockTags.GROUND_CALIFORNIA_POPPY);
    public static final Block CROCUS = createFlower("crocus", BYGBlockTags.GROUND_CROCUS);
    public static final Block BLACK_ROSE = createFlower("black_rose", BYGBlockTags.GROUND_BLACK_ROSE);
    public static final Block CYAN_AMARANTH = new BYGBlockProperties.BYGAmaranth("cyan_amaranth");
    public static final Block CYAN_ROSE = createFlower("cyan_rose", BYGBlockTags.GROUND_ALPINE_BELLFLOWER);
    public static final Block CYAN_TULIP = createFlower("cyan_tulip", BYGBlockTags.GROUND_ALPINE_BELLFLOWER);
    public static final Block DAFFODIL = createFlower("daffodil", BYGBlockTags.GROUND_ALPINE_BELLFLOWER);
    public static final Block DELPHINIUM = createTallFlower("delphinium", BYGBlockTags.GROUND_DELPHINIUM);
    public static final Block FAIRY_SLIPPER = new BYGBlockProperties.BYGFairySlipperFlower("fairy_slipper");
    public static final Block FIRECRACKER_FLOWER_BUSH = createFlower("firecracker_flower_bush", BYGBlockTags.GROUND_FIRECRACKER_FLOWER_BUSH);
    public static final Block FOXGLOVE = createTallFlower("foxglove", BYGBlockTags.GROUND_FOXGLOVE);
    public static final Block GOLDEN_SPINED_CACTUS = createDesertPlant("golden_spined_cactus", BYGBlockTags.GROUND_GOLDEN_SPINED_CACTUS);
    public static final Block GREEN_TULIP = createFlower("green_tulip", BYGBlockTags.GROUND_GREEN_TULIP);
    public static final Block GUZMANIA = createFlower("guzmania", BYGBlockTags.GROUND_GUZMANIA);
    public static final Block INCAN_LILY = createFlower("incan_lily", BYGBlockTags.GROUND_INCAN_LILY);
    public static final Block IRIS = createFlower("iris", BYGBlockTags.GROUND_IRIS);
    public static final Block JAPANESE_ORCHID = createTallFlower("japanese_orchid", BYGBlockTags.GROUND_JAPANESE_ORCHID);
    public static final Block KOVAN_FLOWER = createFlower("kovan_flower", BYGBlockTags.GROUND_KOVAN_FLOWER);
    public static final Block LAZARUS_BELLFLOWER = createFlower("lazarus_bellflower", BYGBlockTags.GROUND_LAZARUS_BELLFLOWER);
    public static final Block LOLIPOP_FLOWER = createFlower("lolipop_flower", BYGBlockTags.GROUND_LOLIPOP_FLOWER);
    public static final Block MAGENTA_AMARANTH = new BYGBlockProperties.BYGAmaranth("magenta_amaranth");
    public static final Block MAGENTA_TULIP = createFlower("magenta_tulip", BYGBlockTags.GROUND_MAGENTA_TULIP);
    public static final Block ORANGE_AMARANTH = new BYGBlockProperties.BYGAmaranth("orange_amaranth");
    public static final Block ORANGE_DAISY = createFlower("orange_daisy", BYGBlockTags.GROUND_ORANGE_DAISY);
    public static final Block ORSIRIA_ROSE = createFlower("osiria_rose", BYGBlockTags.GROUND_ORSIRIA_ROSE);
    public static final Block PEACH_LEATHER_FLOWER = createFlower("peach_leather_flower", BYGBlockTags.GROUND_PEACH_LEATHER_FLOWER);
    public static final Block PINK_ALLIUM = createFlower("pink_allium", BYGBlockTags.GROUND_PINK_ALLIUM);
    public static final Block PINK_ALLIUM_FLOWER_BUSH = new BYGBlockProperties.BYGPinkAllium("pink_allium_flower_bush");
    public static final Block PINK_ANEMONE = createFlower("pink_anemone", BYGBlockTags.GROUND_PINK_ANEMONE);
    public static final Block PINK_DAFFODIL = createFlower("pink_daffodil", BYGBlockTags.GROUND_PINK_DAFFODIL);
    public static final Block PINK_ORCHID = createFlower("pink_orchid", BYGBlockTags.GROUND_PINK_ORCHID);
    public static final Block PRAIRIE_GRASS = new BYGBlockProperties.BYGPrairieGrass("prairie_grass");
    public static final Block PROTEA_FLOWER = createFlower("protea_flower", BYGBlockTags.GROUND_PROTEA_FLOWER);
    public static final Block PURPLE_AMARANTH = new BYGBlockProperties.BYGAmaranth("purple_amaranth");
    public static final Block PURPLE_ORCHID = createFlower("purple_orchid", BYGBlockTags.GROUND_PURPLE_ORCHID);
    public static final Block PURPLE_SAGE = createFlower("purple_sage", BYGBlockTags.GROUND_PURPLE_SAGE);
    public static final Block PURPLE_TULIP = createFlower("purple_tulip", BYGBlockTags.GROUND_PURPLE_TULIP);
    public static final Block RED_CORNFLOWER = createFlower("red_cornflower", BYGBlockTags.GROUND_RED_CORNFLOWER);
    public static final Block RED_ORCHID = createFlower("red_orchid", BYGBlockTags.GROUND_RED_ORCHID);
    public static final Block RICHEA = createFlower("richea", BYGBlockTags.GROUND_RICHEA);
    public static final Block ROSE = createFlower("rose", BYGBlockTags.GROUND_ROSE);
    public static final Block SNOWDROPS = new BYGBlockProperties.BYGSnowyPlant("snowdrops");
    public static final Block SILVER_VASE_FLOWER = createFlower("silver_vase_flower", BYGBlockTags.GROUND_SILVER_VASE_FLOWER);
    public static final Block TORCH_GINGER = createFlower("torch_ginger", BYGBlockTags.GROUND_TORCH_GINGER);
    public static final Block VIOLET_LEATHER_FLOWER = createFlower("violet_leather_flower", BYGBlockTags.GROUND_VIOLET_LEATHER_FLOWER);
    public static final Block WHITE_ANEMONE = createFlower("white_anemone", BYGBlockTags.GROUND_WHITE_ANEMONE);
    public static final Block WHITE_SAGE = createFlower("white_sage", BYGBlockTags.GROUND_WHITE_SAGE);
    public static final Block WINTER_CYCLAMEN = new BYGBlockProperties.BYGSnowyPlant("winter_cyclamen");
    public static final Block WINTER_ROSE = new BYGBlockProperties.BYGSnowyPlant("winter_rose");
    public static final Block WINTER_SCILLA = new BYGBlockProperties.BYGSnowyPlant("winter_scilla");
    public static final Block YELLOW_DAFFODIL = createFlower("yellow_daffodil", BYGBlockTags.GROUND_YELLOW_DAFFODIL);
    public static final Block YELLOW_TULIP = createFlower("yellow_tulip", BYGBlockTags.GROUND_YELLOW_TULIP);

    public static final Block PODZOL_DACITE = createStoneSpreadable(DACITE, null, "podzol_dacite");
    public static final Block OVERGROWN_DACITE = createStoneSpreadable(DACITE, null, "overgrown_dacite");
    public static final Block OVERGROWN_STONE = createStoneSpreadable(Blocks.STONE, null, "overgrown_stone");
    public static final Block OVERGROWN_CRIMSON_BLACKSTONE = createNetherStoneSpreadable(Blocks.BLACKSTONE, null, "overgrown_crimson_blackstone");
    public static final Block MYCELIUM_NETHERRACK = createNetherSpreadable(Blocks.NETHERRACK, BYGConfiguredFeatures.SpreadableBlockConfigs.MYCELIUM_NETHERRACK_CONFIG, "mycelium_netherrack");
    public static final Block OVERGROWN_NETHERRACK = createNetherSpreadable(Blocks.NETHERRACK, BYGConfiguredFeatures.SpreadableBlockConfigs.OVERGROWN_NETHERRACK_CONFIG, "overgrown_netherrack");
    public static final Block IVIS_PHYLIUM = createEndStoneSpreadable(Blocks.END_STONE, MaterialColor.COLOR_PURPLE, BYGConfiguredFeatures.SpreadableBlockConfigs.IVIS_CONFIG, "ivis_phylium");
    public static final Block EMBUR_NYLIUM = createNetherSpreadable(BLUE_NETHERRACK, BYGConfiguredFeatures.SpreadableBlockConfigs.EMBUR_ROOTS, "embur_nylium");
    public static final Block SYTHIAN_NYLIUM = createNetherSpreadable(Blocks.NETHERRACK, BYGConfiguredFeatures.SpreadableBlockConfigs.SYTHIAN_CONFIG, "sythian_nylium");
    public static final Block MEADOW_GRASSBLOCK = createDirtSpreadable(MEADOW_DIRT, BYGConfiguredFeatures.SpreadableBlockConfigs.MEADOW_CONFIG, "meadow_grass_block");
    public static final Block NIGHTSHADE_PHYLIUM = createEndStoneSpreadable(Blocks.END_STONE, MaterialColor.COLOR_BLUE, BYGConfiguredFeatures.SpreadableBlockConfigs.NIGHTSHADE_CONFIG, "nightshade_phylium");
    public static final Block ETHER_PHYLIUM = createEndDirtSpreadable(BYGBlocks.ETHER_SOIL, BYGConfiguredFeatures.SpreadableBlockConfigs.ETHER_CONFIG, "ether_phylium");
    public static final Block VERMILION_SCULK = createEndStoneSpreadable(BYGBlocks.ETHER_STONE, MaterialColor.COLOR_RED, BYGConfiguredFeatures.SpreadableBlockConfigs.VERMILION_SCULK_CONFIG, "vermilion_sculk");
    public static final Block SHULKREN_PHYLIUM = createEndStoneSpreadable(Blocks.END_STONE, MaterialColor.COLOR_LIGHT_GREEN, BYGConfiguredFeatures.SpreadableBlockConfigs.VERMILION_SCULK_CONFIG, "shulkren_phylium");
    public static final Block MEADOW_GRASS_PATH = createBlock(new GrassPathBlock(AbstractBlock.Properties.of(Material.DIRT).strength(0.65F).sound(SoundType.GRASS).isViewBlocking((state, reader, pos) -> true).isSuffocating((state, reader, pos) -> true)), "meadow_grass_path");
    public static final Block BULBIS_PHYCELIUM = createEndStoneSpreadable(Blocks.END_STONE, MaterialColor.TERRACOTTA_WHITE, BYGConfiguredFeatures.SpreadableBlockConfigs.BULBIS_CONFIG, "bulbis_phycelium");
    public static final Block IMPARIUS_PHYLIUM = createEndStoneSpreadable(Blocks.END_STONE, MaterialColor.COLOR_CYAN, BYGConfiguredFeatures.SpreadableBlockConfigs.BULBIS_CONFIG, "imparius_phylium");

    public static final Block TRAVERTINE = createTravertine("travertine");
    public static final Block TRAVERTINE_SLAB = createTravertineSlab("travertine_slab");
    public static final Block TRAVERTINE_STAIRS = createTravertineStairs("travertine_stairs");
    public static final Block TRAVERTINE_WALL = createTravertineWall("travertine_wall");
    public static final Block POLISHED_TRAVERTINE = createPolishedTravertine("polished_travertine");
    public static final Block POLISHED_TRAVERTINE_SLAB = createPolishedTravertineSlab("polished_travertine_slab");
    public static final Block POLISHED_TRAVERTINE_STAIRS = createPolishedTravertineStairs("polished_travertine_stairs");
    public static final Block POLISHED_TRAVERTINE_WALL = createPolishedTravertineWall("polished_travertine_wall");
    public static final Block CHISELED_TRAVERTINE = createChiseledTravertine("chiseled_travertine");
    public static final Block CHISELED_TRAVERTINE_STAIRS = createChiseledTravertineStairs("chiseled_travertine_stairs");
    public static final Block CHISELED_TRAVERTINE_SLAB = createChiseledTravertineSlab("chiseled_travertine_slab");
    public static final Block CHISELED_TRAVERTINE_WALL = createChiseledTravertineWall("chiseled_travertine_wall");

    static Block createScoriaStoneSlab(String id) {
        Block createBlock = new SlabBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_RED).sound(SoundType.STONE).strength(2.0f, 6.0f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createScoriaStoneStairs(String id) {
        Block createBlock = new StairsBlock(Blocks.COBBLESTONE.defaultBlockState(),AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_RED).sound(SoundType.STONE).strength(2.0f, 6.0f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createScoriaStoneWall(String id) {
        Block createBlock = new WallBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_RED).sound(SoundType.STONE).strength(2.0f, 6.0f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createScoriaStonePillar(String id) {
        Block createBlock = new RotatedPillarBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_RED).sound(SoundType.STONE).strength(1.5f, 6.0f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createEmburGelBlock(String id) {
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_YELLOW).randomTicks().sound(SoundType.HONEY_BLOCK).noOcclusion().speedFactor(1.3f));
        //Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), createBlock);
        createBlock.setRegistryName(new ResourceLocation(BYG.MOD_ID, id)); //Forge
        blocksList.add(createBlock);
        return createBlock;
    }

    static Block createEmburGelVine(String id) {
        Block createBlock = new EmburVineBlock(AbstractBlock.Properties.of(Material.LEAVES, MaterialColor.TERRACOTTA_YELLOW).instabreak().randomTicks().sound(SoundType.HONEY_BLOCK).noCollission().harvestTool(ToolType.HOE));
        //Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), createBlock);
        createBlock.setRegistryName(new ResourceLocation(BYG.MOD_ID, id)); //Forge
        blocksList.add(createBlock);
        return createBlock;
    }

    static Block createEmburGelVinePlant(String id) {
        Block createBlock = new EmburVinePlantBlock(AbstractBlock.Properties.of(Material.LEAVES, MaterialColor.TERRACOTTA_YELLOW).instabreak().randomTicks().sound(SoundType.HONEY_BLOCK).noCollission().harvestTool(ToolType.HOE));
        //Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), createBlock);
        createBlock.setRegistryName(new ResourceLocation(BYG.MOD_ID, id)); //Forge
        blocksList.add(createBlock);
        return createBlock;
    }

    static Block createEmburGelBranch(String id) {
        Block createBlock = new ImpariusMushroomBranchBlock(AbstractBlock.Properties.of(Material.REPLACEABLE_PLANT, MaterialColor.TERRACOTTA_YELLOW).instabreak().sound(SoundType.HONEY_BLOCK).noOcclusion().noCollission().harvestTool(ToolType.HOE).lightLevel((state) -> 10));
        //Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), createBlock);
        createBlock.setRegistryName(new ResourceLocation(BYG.MOD_ID, id));
        blocksList.add(createBlock);
        return createBlock;
    }

    static Block createTheriumBlock(String id) {
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN).sound(SoundType.GLASS).noDrops().lightLevel((state) -> 12).strength(-1.0f, 3.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createTheriumGlass(String id) {
        Block createBlock = new GlassBlock(AbstractBlock.Properties.of(Material.GLASS, MaterialColor.COLOR_CYAN).sound(SoundType.GLASS).lightLevel((state) -> 12).noOcclusion().isValidSpawn(BYGBlocks::neverAllowSpawn).isRedstoneConductor(BYGBlocks::isntSolid).isSuffocating(BYGBlocks::isntSolid).isViewBlocking(BYGBlocks::isntSolid).strength(0.4f, 8.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createTheriumGlassPane(String id) {
        Block createBlock = new PaneBlock(AbstractBlock.Properties.of(Material.GLASS, MaterialColor.COLOR_CYAN).sound(SoundType.GLASS).lightLevel((state) -> 12).noOcclusion().strength(0.4f, 8.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createChiseledTherium(String id) {
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.GLASS).strength(1.5f, 9.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createChiseledTheriumStairs(String id) {
        Block createBlock = new StairsBlock(Blocks.PRISMARINE.defaultBlockState(), AbstractBlock.Properties.copy(Blocks.PRISMARINE).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.GLASS).strength(1.5f, 9.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createChiseledTheriumSlab(String id) {
        Block createBlock = new SlabBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.GLASS).strength(1.5f, 9.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createChiseledTheriumWall(String id) {
        Block createBlock = new WallBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.GLASS).strength(1.5f, 9.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createShinyChiseledTherium(String id) {
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.GLASS).lightLevel((state) -> 12).strength(1.5f, 9.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createShinyChiseledTheriumStairs(String id) {
        Block createBlock = new StairsBlock(Blocks.PRISMARINE.defaultBlockState(), AbstractBlock.Properties.copy(Blocks.PRISMARINE).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.GLASS).lightLevel((state) -> 12).strength(1.5f, 9.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createShinyChiseledTheriumSlab(String id) {
        Block createBlock = new SlabBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.GLASS).lightLevel((state) -> 12).strength(1.5f, 9.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createShinyChiseledTheriumWall(String id) {
        Block createBlock = new WallBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.GLASS).lightLevel((state) -> 12).strength(1.5f, 9.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createFence(String id) {
        Block createBlock = new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f, 3.0f).harvestTool(ToolType.AXE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createFenceGate(String id) {
        Block createBlock = new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f, 3.0f).harvestTool(ToolType.AXE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createSand(int dustColor, String id) {
        Block createBlock = new SandBlock(dustColor, AbstractBlock.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.2f).harvestTool(ToolType.SHOVEL));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createWoodSlab(String id) {
        Block createBlock = new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f, 3.0f).harvestTool(ToolType.PICKAXE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createStoneSlab(String id) {
        Block createBlock = new SlabBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0f, 6.0f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createStoneWall(String id) {
        Block createBlock = new WallBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0f, 6.0f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createWoodPressurePlate(String id) {
        Block createBlock = new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.of(Material.WOOD).sound(SoundType.WOOD).noCollission().strength(0.5F).harvestTool(ToolType.AXE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createWoodStairs(String id) {
        Block createBlock = new StairsBlock(Registry.BLOCK.get(new ResourceLocation(BYG.MOD_ID, id.replace("_stairs", "planks"))).defaultBlockState(), AbstractBlock.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).strength(2.0f, 3.0f).harvestTool(ToolType.AXE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createTrapDoor(String id) {
        Block createBlock = new TrapDoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).sound(SoundType.WOOD).strength(2.0f, 3.0f).noOcclusion().harvestTool(ToolType.AXE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createCraftingTable(String id) {
        Block createBlock = new BYGCraftingTableBlock(AbstractBlock.Properties.copy(Blocks.CRAFTING_TABLE).harvestTool(ToolType.AXE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createWoodButton(String id) {
        Block createBlock = new WoodButtonBlock(AbstractBlock.Properties.of(Material.DECORATION).sound(SoundType.WOOD).noCollission().strength(0.5F).harvestTool(ToolType.AXE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createBookshelf(String id) {
        Block createBlock = new BookshelfBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).sound(SoundType.WOOD).strength(2.0f, 3.0f).harvestTool(ToolType.AXE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createDoor(String id) {
        Block createBlock = new DoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).sound(SoundType.WOOD).strength(2.0f, 3.0f).noOcclusion().harvestTool(ToolType.AXE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createPlanks(String id) {
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).sound(SoundType.WOOD).strength(2.0f, 3.0f).harvestTool(ToolType.AXE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createWood(String id) {
        Block createBlock = new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).harvestTool(ToolType.AXE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createStrippedLog(String id) {
        Block createBlock = new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).strength(2.0f).harvestTool(ToolType.AXE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createLog(String id) {
        Block createBlock = new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).harvestTool(ToolType.AXE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createSoapstone(String id) {
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BLACK).sound(SoundType.STONE).strength(1.5f, 6.0f).harvestTool(ToolType.PICKAXE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createScoria(String id) {
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_RED).sound(SoundType.STONE).strength(1.5f, 6.0f).harvestTool(ToolType.PICKAXE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createDacite(String id) {
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).strength(1.5f, 6.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createEtherStone(String id) {
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_CYAN).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).strength(1.5f, 6.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createRockyStone(String id) {
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).strength(1.5f, 6.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createMossyStone(String id) {
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GREEN).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).strength(1.5f, 6.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createRedRock(String id) {
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_ORANGE).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).strength(1.5f, 6.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createAmetrineOre(String id) {
        Block createBlock = new BYGOreBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).harvestLevel(4).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).strength(1.5f, 6.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createBuddingAmetrineOre(String id) {
        Block createBlock = new BuddingAmetrineBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).randomTicks().harvestLevel(4).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).strength(1.5f, 6.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createAmetrineBlock(String id) {
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).isSuffocating(BYGBlocks::isntSolid).isViewBlocking(BYGBlocks::isntSolid).noOcclusion().harvestLevel(4).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).sound(SoundType.GLASS).strength(1.5f, 6.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createCampfireBlock(int type, String id) {
        Block createBlock = new BYGCampfireBlock(true, type, AbstractBlock.Properties.of(Material.WOOD, MaterialColor.PODZOL).strength(2.0F).sound(SoundType.WOOD).noOcclusion().lightLevel(litBlockEmission(14)));
        createBlock(createBlock, id);
        return createBlock;
    }


    static Block createPendoriteOre(String id) {
        Block createBlock = new BYGOreBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PURPLE).harvestLevel(4).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).strength(1.5f, 6.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createPendoriteBlock(String id) {
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL, MaterialColor.TERRACOTTA_PURPLE).harvestLevel(4).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).strength(1.5f, 6.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createRawPendoriteBlock(String id) {
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL, MaterialColor.TERRACOTTA_PURPLE).harvestLevel(4).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).sound(SoundType.ANCIENT_DEBRIS).strength(1.5f, 6.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createEmeralditeOre(String id) {
        Block createBlock = new BYGOreBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN).harvestLevel(3).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).strength(1.5f, 6.0f));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createMushroomPlant(BYGHugeMushroom mushroom, String id) {
        Block createBlock = new BYGMushroomPlantBlock(AbstractBlock.Properties.of(Material.PLANT).sound(SoundType.GRASS).strength(0.0f).noCollission().randomTicks(), mushroom, false);
        createBlock.setRegistryName(new ResourceLocation(BYG.MOD_ID, id)); //Forge
        createPottedBlock(createBlock, id);
        blocksList.add(createBlock);
        return createBlock;
    }

    static Block createNetherMushroomPlant(BYGHugeMushroom mushroom, String id) {
        Block createBlock = new BYGMushroomPlantBlock(AbstractBlock.Properties.of(Material.PLANT).sound(SoundType.FUNGUS).strength(0.0f).noCollission().randomTicks(), mushroom, true);
        createBlock.setRegistryName(new ResourceLocation(BYG.MOD_ID, id)); //Forge
        createPottedBlock(createBlock, id);
        blocksList.add(createBlock);
        return createBlock;
    }

    static Block createFlower(String id, ITag.INamedTag<Block> groundTag) {
        Block createBlock = new BYGFlowerBlock(AbstractBlock.Properties.of(Material.PLANT).sound(SoundType.GRASS).strength(0.0f).noCollission().noOcclusion(), groundTag);
        createBlock.setRegistryName(new ResourceLocation(BYG.MOD_ID, id)); //Forge
        createPottedBlock(createBlock, id);
        blocksList.add(createBlock);
        flowerIDs.add(new ResourceLocation(BYG.MOD_ID, id));
        return createBlock;
    }

    static Block createTallFlower(String id, ITag.INamedTag<Block> groundTag) {
        Block createBlock = new BYGTallFlowerBlock(AbstractBlock.Properties.of(Material.REPLACEABLE_PLANT).sound(SoundType.GRASS).strength(0.0f).noCollission().noOcclusion(), groundTag);
        createBlock(createBlock, id);
        flowerIDs.add(new ResourceLocation(BYG.MOD_ID, id));
        return createBlock;
    }

    static Block createStoneEndPlant(String id) {
        Block createBlock = new StoneEndPlantBlock(AbstractBlock.Properties.of(Material.PLANT).sound(SoundType.GRASS).strength(0.0f).noCollission().randomTicks().noOcclusion());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createTallBulbis(String id) {
        Block createBlock = new TallBulbisBlock(AbstractBlock.Properties.of(Material.REPLACEABLE_PLANT).sound(SoundType.SHROOMLIGHT).strength(0.0f).noCollission().noOcclusion());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createVent(String id) {
        Block createBlock = new VentBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0f, 6.0f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createTallVent(String id) {
        Block createBlock = new TallVentBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0f, 6.0f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createTheriumCrystal(String id) {
        Block createBlock = new TheriumCrystalBlock(AbstractBlock.Properties.of(Material.GLASS).sound(SoundType.GLASS).strength(0.1f).noOcclusion().requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).noCollission().lightLevel((state) -> 6));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createCrystal(String id) {
        Block createBlock = new CrystalBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.GLASS).strength(0.1f).noOcclusion().requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).noCollission().lightLevel((state) -> 6));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createAmetrineCluster(String id) {
        Block createBlock = new AmetrineClusterBlock(7, 3, AbstractBlock.Properties.of(BYGMaterials.AMETRINE).sound(SoundType.GLASS).strength(1.5f).randomTicks().harvestLevel(4).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).noCollission().lightLevel((state) -> 6));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createDullCrystal(String id) {
        Block createBlock = new CrystalBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(0.1f).noOcclusion().noCollission().harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createSculkGrowth(String id) {
        Block createBlock = new SculkGrowthBlock(AbstractBlock.Properties.of(Material.REPLACEABLE_FIREPROOF_PLANT).sound(SoundType.TWISTING_VINES).instabreak().randomTicks().noOcclusion().noCollission());
//        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), createBlock);
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createIvisBulbisPlant(String id) {
        Block createBlock = new IvisPlantBlock(AbstractBlock.Properties.of(Material.REPLACEABLE_FIREPROOF_PLANT).sound(SoundType.TWISTING_VINES).instabreak().noOcclusion().noCollission());
//        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), createBlock);
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createEtherPlant(String id) {
        Block createBlock = new EtherPlantBlock(AbstractBlock.Properties.of(Material.REPLACEABLE_FIREPROOF_PLANT).sound(SoundType.GRASS).instabreak().noOcclusion().noCollission());
//        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), createBlock);
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createTallEtherPlant(String id) {
        Block createBlock = new TallEtherPlantBlock(AbstractBlock.Properties.of(Material.REPLACEABLE_PLANT).sound(SoundType.GRASS).instabreak().noOcclusion().noCollission());
//        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), createBlock);
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createNightshadePlant(String id) {
        Block createBlock = new NightshadePlantBlock(AbstractBlock.Properties.of(Material.REPLACEABLE_FIREPROOF_PLANT).sound(SoundType.TWISTING_VINES).instabreak().noOcclusion().noCollission());
//        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), createBlock);
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createTallNightshadePlant(String id) {
        Block createBlock = new TallNightshadePlantBlock(AbstractBlock.Properties.of(Material.REPLACEABLE_PLANT).sound(SoundType.ROOTS).instabreak().noOcclusion().noCollission());
//        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), createBlock);
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createSculkPlant(String id) {
        Block createBlock = new SculkPlantBlock(AbstractBlock.Properties.of(Material.REPLACEABLE_FIREPROOF_PLANT).sound(SoundType.TWISTING_VINES).instabreak().noOcclusion().noCollission());
//        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), createBlock);
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createShulkrenPlant(String id) {
        Block createBlock = new ShulkrenPlantBlock(AbstractBlock.Properties.of(Material.REPLACEABLE_FIREPROOF_PLANT).sound(SoundType.TWISTING_VINES).instabreak().noOcclusion().noCollission());
//        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), createBlock);
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createImpariusPlant(String id) {
        Block createBlock = new ImpariusPlantBlock(AbstractBlock.Properties.of(Material.REPLACEABLE_FIREPROOF_PLANT).sound(SoundType.TWISTING_VINES).instabreak().noOcclusion().noCollission());
//        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), createBlock);
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createOddityDesertPlant(String id) {
        Block createBlock = new DesertOddityPlantBlock(AbstractBlock.Properties.of(Material.REPLACEABLE_FIREPROOF_PLANT).sound(SoundType.TWISTING_VINES).instabreak().noOcclusion().noCollission());
//        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), createBlock);
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createWarpedCactus(String id) {
        Block createBlock = new WarpedCactusBlock(AbstractBlock.Properties.of(Material.CACTUS).sound(SoundType.WOOL).strength(0.2f).randomTicks().noOcclusion().lightLevel((state) -> 8));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createOddityCactus(String id) {
        Block createBlock = new OddityCactusBlock(AbstractBlock.Properties.of(Material.CACTUS).sound(SoundType.WOOL).strength(0.2f).randomTicks().noOcclusion().lightLevel((state) -> 8));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createCrimsonBerryBush(String id) {
        Block createBlock = new CrimsonBerryBushBlock(AbstractBlock.Properties.of(Material.PLANT).sound(SoundType.SWEET_BERRY_BUSH).randomTicks().instabreak().noCollission());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createBlueBerryBush(String id) {
        Block createBlock = new BlueBerryBush(AbstractBlock.Properties.of(Material.PLANT).sound(SoundType.SWEET_BERRY_BUSH).randomTicks().instabreak().noCollission());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createBaobabFruitBlock(String id) {
        Block createBlock = new BaobabFruitBlock(AbstractBlock.Properties.of(Material.PLANT).sound(SoundType.SWEET_BERRY_BUSH).randomTicks().harvestTool(ToolType.HOE).instabreak().noCollission());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createEtherBulbBlock(String id) {
        Block createBlock = new EtherBulbsBlock(AbstractBlock.Properties.of(Material.PLANT).sound(SoundType.SWEET_BERRY_BUSH).randomTicks().harvestTool(ToolType.HOE).instabreak().lightLevel((state) -> 13).noCollission());

        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createNightshadeBerryBush(String id) {
        return createNightshadeBerryBush(5, id);
    }

    static Block createNightshadeBerryBush(int lightLevel, String id) {
        Block createBlock = new NightshadeBerryBushBlock(AbstractBlock.Properties.of(Material.PLANT).sound(SoundType.SWEET_BERRY_BUSH).lightLevel((state) -> lightLevel).randomTicks().instabreak().noCollission());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createSapling(ITag<Block> groundTag, TreeSpawner tree, String id) {
        Block createBlock = new BYGSapling(AbstractBlock.Properties.of(Material.PLANT).sound(SoundType.GRASS).strength(0.0f).noCollission().randomTicks(), groundTag, tree);
        createBlock.setRegistryName(new ResourceLocation(BYG.MOD_ID, id)); //Forge
        createPottedBlock(createBlock, id);
        blocksList.add(createBlock);
        return createBlock;
    }

    static Block createJacarandaBush(String id) {
        Block createBlock = new JacarandaBushBlock(AbstractBlock.Properties.of(Material.PLANT, MaterialColor.COLOR_PURPLE).sound(SoundType.SWEET_BERRY_BUSH).noOcclusion());
        createBlock.setRegistryName(new ResourceLocation(BYG.MOD_ID, id)); //Forge
        createPottedBlock(createBlock, id);
        blocksList.add(createBlock);
        return createBlock;
    }

    static Block createFloweringJacarandaBush(int taskRange, TreeSpawner tree, String id) {
        Block createBlock = new FloweringJacarandaBushBlock(AbstractBlock.Properties.of(Material.PLANT, MaterialColor.COLOR_PURPLE).sound(SoundType.SWEET_BERRY_BUSH).noOcclusion(), tree, taskRange);
        createBlock.setRegistryName(new ResourceLocation(BYG.MOD_ID, id)); //Forge
        createPottedBlock(createBlock, id);
        blocksList.add(createBlock);
        return createBlock;
    }

    static Block createIndigoJacarandaBush(String id) {
        Block createBlock = new IndigoJacarandaBushBlock(AbstractBlock.Properties.of(Material.PLANT, MaterialColor.COLOR_BLUE).sound(SoundType.SWEET_BERRY_BUSH).noOcclusion());
        createBlock.setRegistryName(new ResourceLocation(BYG.MOD_ID, id)); //Forge
        createPottedBlock(createBlock, id);
        blocksList.add(createBlock);
        return createBlock;
    }

    static Block createFloweringIndigoJacarandaBush(int taskRange, TreeSpawner tree, String id) {
        Block createBlock = new FloweringJacarandaBushBlock(AbstractBlock.Properties.of(Material.PLANT, MaterialColor.COLOR_BLUE).sound(SoundType.SWEET_BERRY_BUSH).noOcclusion(), tree, taskRange);
        createBlock.setRegistryName(new ResourceLocation(BYG.MOD_ID, id)); //Forge
        createPottedBlock(createBlock, id);
        blocksList.add(createBlock);
        return createBlock;
    }

    public static void createPottedBlock(Block blockForPot, String id) {
        Block createBlock = new FlowerPotBlock(blockForPot, AbstractBlock.Properties.of(Material.DECORATION).instabreak().noOcclusion());
//        Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, "potted_" + id), createBlock);
        createBlock.setRegistryName(new ResourceLocation(BYG.MOD_ID, "potted_" + id)); //Forge
        flowerPotBlocks.add(createBlock);
//        blocksList.add(createBlock);
    }

    static Block createShroomlight(String id) {
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.GRASS, MaterialColor.COLOR_PURPLE).strength(1.0F).sound(SoundType.SHROOMLIGHT).harvestTool(ToolType.HOE).lightLevel((state) -> 14));
        createBlock.setRegistryName(new ResourceLocation(BYG.MOD_ID, id));
        blocksList.add(createBlock);
        return createBlock;
    }

    static Block createImpariusVine(String id) {
        Block createBlock = new ImpariusVineBlock(AbstractBlock.Properties.of(Material.LEAVES).instabreak().randomTicks().sound(SoundType.WEEPING_VINES).noCollission().harvestTool(ToolType.HOE));
        //Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), createBlock);
        createBlock.setRegistryName(new ResourceLocation(BYG.MOD_ID, id)); //Forge
        blocksList.add(createBlock);
        return createBlock;
    }

    static Block createImpariusVinePlant(String id) {
        Block createBlock = new ImpariusVinePlantBlock(AbstractBlock.Properties.of(Material.LEAVES).instabreak().randomTicks().sound(SoundType.WEEPING_VINES).noCollission().harvestTool(ToolType.HOE));
        //Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), createBlock);
        createBlock.setRegistryName(new ResourceLocation(BYG.MOD_ID, id)); //Forge
        blocksList.add(createBlock);
        return createBlock;
    }

    static Block createImpariusMushroom(String id) {
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.GRASS, MaterialColor.COLOR_CYAN).strength(0.2F).sound(SoundType.TWISTING_VINES).speedFactor(0.5F).jumpFactor(0.5F).harvestTool(ToolType.HOE));
        //Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), createBlock);
        createBlock.setRegistryName(new ResourceLocation(BYG.MOD_ID, id));
        blocksList.add(createBlock);
        return createBlock;
    }

    static Block createImpariusMushroomBranch(String id) {
        Block createBlock = new ImpariusMushroomBranchBlock(AbstractBlock.Properties.of(Material.REPLACEABLE_PLANT, MaterialColor.COLOR_CYAN).instabreak().sound(SoundType.TWISTING_VINES).noOcclusion().noCollission().harvestTool(ToolType.HOE).lightLevel((state) -> 10));
        //Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), createBlock);
        createBlock.setRegistryName(new ResourceLocation(BYG.MOD_ID, id));
        blocksList.add(createBlock);
        return createBlock;
    }

    static Block createFungalImpariusFilamentBlock(String id) {
        Block createBlock = new SlimeBlock(AbstractBlock.Properties.of(Material.GRASS, MaterialColor.COLOR_LIGHT_BLUE).strength(0.2F).sound(SoundType.HONEY_BLOCK).speedFactor(0.5F).jumpFactor(2.5F).harvestTool(ToolType.HOE).lightLevel((state) -> 15));
        //Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), createBlock);
        createBlock.setRegistryName(new ResourceLocation(BYG.MOD_ID, id));
        blocksList.add(createBlock);
        return createBlock;
    }

    static Block createFungalImpariusFilament(String id) {
        Block createBlock = new FungalImpariusFilamentBlock(AbstractBlock.Properties.of(Material.GRASS, MaterialColor.COLOR_LIGHT_BLUE).instabreak().sound(SoundType.HONEY_BLOCK).noOcclusion().noCollission().harvestTool(ToolType.HOE).lightLevel((state) -> 10));
        //Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), createBlock);
        createBlock.setRegistryName(new ResourceLocation(BYG.MOD_ID, id));
        blocksList.add(createBlock);
        return createBlock;
    }

    static Block createFungalImparius(String id) {
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.GRASS, MaterialColor.WARPED_WART_BLOCK).strength(0.2F).sound(SoundType.HONEY_BLOCK).harvestTool(ToolType.HOE));
        //Registry.register(Registry.BLOCK, new ResourceLocation(BYG.MOD_ID, id), createBlock);
        createBlock.setRegistryName(new ResourceLocation(BYG.MOD_ID, id));
        blocksList.add(createBlock);
        return createBlock;
    }

    static Block createShulkrenVine(String id) {
        Block createBlock = new ShulkrenVineBlock(AbstractBlock.Properties.of(Material.LEAVES).instabreak().randomTicks().sound(SoundType.WEEPING_VINES).noCollission().harvestTool(ToolType.HOE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createShulkrenVinePlant(String id) {
        Block createBlock = new ShulkrenVinePlantBlock(AbstractBlock.Properties.of(Material.LEAVES).instabreak().randomTicks().sound(SoundType.WEEPING_VINES).noCollission().harvestTool(ToolType.HOE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createLeaves(String id) {
        Block createBlock = new LeavesBlock(AbstractBlock.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isViewBlocking((state, world, pos) -> false).isSuffocating((state, world, pos) -> false).harvestTool(ToolType.HOE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createGlowingLeaves(String id) {
        return createGlowingLeaves(15, id);
    }

    static Block createGlowingLeaves(int lightLevel, String id) {
        Block createBlock = new LeavesBlock(AbstractBlock.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isViewBlocking((state, world, pos) -> false).isSuffocating((state, world, pos) -> false).lightLevel((state) -> lightLevel).harvestTool(ToolType.HOE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createPetal(String id) {
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.GRASS).sound(SoundType.GRASS).strength(0.2f).noOcclusion().harvestTool(ToolType.HOE));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createDirt(String id) {
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.DIRT).sound(SoundType.GRAVEL).strength(0.2f).randomTicks().harvestTool(ToolType.SHOVEL));
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createDirtSpreadable(Block blockToSpreadToo, @Nullable BlockClusterFeatureConfig featureConfig, String id) {
        Block createBlock = new BYGGrassBlock(AbstractBlock.Properties.of(Material.DIRT).sound(SoundType.GRASS).strength(0.4f).randomTicks().harvestTool(ToolType.SHOVEL), featureConfig, blockToSpreadToo);
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createStoneSpreadable(Block blockToSpreadToo, @Nullable BlockClusterFeatureConfig featureConfig, String id) {
        Block createBlock = new BYGGrassBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 6.0f).randomTicks().harvestLevel(0).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops(), featureConfig, blockToSpreadToo);
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createEndStoneSpreadable(Block blockToSpreadToo, MaterialColor color, @Nullable BlockClusterFeatureConfig featureConfig, String id) {
        Block createBlock = new BYGNylium(AbstractBlock.Properties.of(Material.STONE, color).sound(SoundType.STONE).strength(0.4f).randomTicks().harvestLevel(0).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops(), featureConfig, World.END, blockToSpreadToo);
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createEndDirtSpreadable(Block blockToSpreadToo, @Nullable BlockClusterFeatureConfig featureConfig, String id) {
        Block createBlock = new BYGNylium(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.NYLIUM).strength(0.4f).randomTicks().harvestLevel(0).harvestTool(ToolType.SHOVEL).requiresCorrectToolForDrops(), featureConfig, World.END, blockToSpreadToo);
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createNetherSpreadable(Block blockToSpreadToo, @Nullable BlockClusterFeatureConfig featureConfig, String id) {
        Block createBlock = new BYGNylium(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.NYLIUM).strength(0.4F).randomTicks().harvestLevel(0).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops(), featureConfig, World.NETHER, blockToSpreadToo);
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createNetherStoneSpreadable(Block blockToSpreadToo, @Nullable BlockClusterFeatureConfig featureConfig, String id) {
        Block createBlock = new BYGNylium(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.NYLIUM).strength(0.4f).randomTicks().harvestLevel(0).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops(), featureConfig, World.NETHER, blockToSpreadToo);
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createDesertPlant(String id, ITag.INamedTag<Block> groundTag) {
        Block createBlock = new DesertPlant(AbstractBlock.Properties.of(Material.PLANT).sound(SoundType.GRASS).strength(0.0f).noCollission().noOcclusion(), groundTag);
        createPottedBlock(createBlock, id);
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createTravertine(String id){
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
                .sound(SoundType.STONE).strength(2.0f, 6.0f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createTravertineSlab(String id) {
        Block createBlock = new SlabBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
                .sound(SoundType.STONE).strength(2.0f, 6.0f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createTravertineStairs(String id) {
        Block createBlock = new StairsBlock(Blocks.ANDESITE_STAIRS.defaultBlockState(),AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
                .sound(SoundType.STONE).strength(2.0f, 6.0f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createTravertineWall(String id) {
        Block createBlock = new WallBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_RED)
                .sound(SoundType.STONE).strength(2.0f, 6.0f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createPolishedTravertine(String id){
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
                .sound(SoundType.STONE).strength(2.0f, 6.0f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createPolishedTravertineSlab(String id) {
        Block createBlock = new SlabBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
                .sound(SoundType.STONE).strength(2.0f, 6.0f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createPolishedTravertineStairs(String id) {
        Block createBlock = new StairsBlock(Blocks.POLISHED_ANDESITE.defaultBlockState(),AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
                .sound(SoundType.STONE).strength(2.0f, 6.0f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createPolishedTravertineWall(String id) {
        Block createBlock = new WallBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_RED)
                .sound(SoundType.STONE).strength(2.0f, 6.0f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createChiseledTravertine(String id){
        Block createBlock = new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
                .sound(SoundType.STONE).strength(2.0f, 6.0f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createChiseledTravertineSlab(String id) {
        Block createBlock = new SlabBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
                .sound(SoundType.STONE).strength(2.0f, 6.0f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createChiseledTravertineStairs(String id) {
        Block createBlock = new StairsBlock(Blocks.POLISHED_ANDESITE.defaultBlockState(),AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
                .sound(SoundType.STONE).strength(2.0f, 6.0f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createChiseledTravertineWall(String id) {
        Block createBlock = new WallBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_RED)
                .sound(SoundType.STONE).strength(2.0f, 6.0f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
        createBlock(createBlock, id);
        return createBlock;
    }

    static Block createBlock(Block block, String id) {
        block.setRegistryName(new ResourceLocation(BYG.MOD_ID, id));
        blocksList.add(block);
        return block;
    }

    static Block createBlock(Block block, ResourceLocation id) {
        //Registry.register(Registry.BLOCK, id, createBlock);
        block.setRegistryName(id);
        blocksList.add(block);
        return block;
    }

    public static void init() {

    }

    private static Boolean neverAllowSpawn(BlockState state, IBlockReader reader, BlockPos pos, EntityType<?> entity) {
        return false;
    }

    private static boolean isntSolid(BlockState state, IBlockReader reader, BlockPos pos) {
        return false;
    }

    private static ToIntFunction<BlockState> litBlockEmission(int light) {
        return (state) -> {
            return state.getValue(BlockStateProperties.LIT) ? light : 0;
        };
    }
}
