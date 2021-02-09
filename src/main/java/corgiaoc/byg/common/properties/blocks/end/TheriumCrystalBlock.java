package corgiaoc.byg.common.properties.blocks.end;

import corgiaoc.byg.core.BYGBlocks;
import corgiaoc.byg.core.BYGItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.Random;

public class TheriumCrystalBlock extends Block implements Fertilizable {
    public static final IntProperty AGE = Properties.AGE_3;
    private static final VoxelShape SHAPE = Block.createCuboidShape(3.0D, 0.0D, 3.0D, 13.0D, 8.0D, 13.0D);

    public TheriumCrystalBlock(Settings properties) {
        super(properties);
        this.setDefaultState(this.stateManager.getDefaultState().with(AGE, 0));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView worldIn, BlockPos pos, ShapeContext context) {
        Vec3d vector3d = state.getModelOffset(worldIn, pos);
        return SHAPE.offset(vector3d.x, vector3d.y, vector3d.z);
    }

    @Override
    public ItemStack getPickStack(BlockView worldIn, BlockPos pos, BlockState state) {
        return new ItemStack(BYGItems.THERIUM_CRYSTAL);
    }

    public boolean hasRandomTicks(BlockState state) {
        return state.get(AGE) < 3;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        Block block1 = worldIn.getBlockState(pos.down()).getBlock();
        int i = state.get(AGE);
        if (i < 3 && block1 == BYGBlocks.THERIUM_BLOCK && random.nextInt(5) == 0) {
            worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(i + 1)), 2);
        }

    }

    @Override
    public ActionResult onUse(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockHitResult hit) {
        int i = state.get(AGE);
        boolean flag = i == 3;
        if (!flag && player.getStackInHand(handIn).getItem() == Items.BONE_MEAL) {
            return ActionResult.PASS;
        } else if (i > 2) {
            int j = 1;
            dropStack(worldIn, pos, new ItemStack(BYGItems.THERIUM_CRYSTAL, j));
            worldIn.playSound(null, pos, SoundEvents.BLOCK_GLASS_BREAK, SoundCategory.BLOCKS, 1.0F, 0.8F + worldIn.random.nextFloat() * 0.4F);
            worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(0)), 2);
            return ActionResult.SUCCESS;
        } else {
            return super.onUse(state, worldIn, pos, player, handIn, hit);
        }
    }

    public BlockState getStateForNeighborUpdate(BlockState stateIn, Direction facing, BlockState facingState, WorldAccess worldIn, BlockPos currentPos, BlockPos facingPos) {
        return !stateIn.canPlaceAt(worldIn, currentPos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    protected boolean isValidGround(BlockState state) {
        return state.getMaterial() == Material.SOIL || state.getMaterial() == Material.STONE;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView worldIn, BlockPos pos) {
        BlockPos blockpos = pos.down();
        return this.isValidGround(worldIn.getBlockState(blockpos));
    }

    @Environment(EnvType.CLIENT)
    public void randomDisplayTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        VoxelShape lvt_5_1_ = this.getOutlineShape(stateIn, worldIn, pos, ShapeContext.absent());
        Vec3d lvt_6_1_ = lvt_5_1_.getBoundingBox().getCenter();
        double lvt_7_1_ = (double) pos.getX() + lvt_6_1_.x;
        double lvt_9_1_ = (double) pos.getZ() + lvt_6_1_.z;

        for (int lvt_11_1_ = 0; lvt_11_1_ < 3; ++lvt_11_1_) {
            if (rand.nextBoolean()) {
                worldIn.addParticle(ParticleTypes.END_ROD, lvt_7_1_ + (double) (rand.nextFloat() / 5.0F), (double) pos.getY() + (0.5D - (double) rand.nextFloat()), lvt_9_1_ + (double) (rand.nextFloat() / 5.0F), 0.0D, 0.0D, 0.0D);
            }
        }

    }

    @Override
    public boolean canGrow(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return false;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    public boolean isFertilizable(BlockView worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return state.get(AGE) < 3;
    }

    public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {
        int i = Math.min(3, state.get(AGE) + 1);
        worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(i)), 2);
    }
}