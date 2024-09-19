package net.thearcaneforge.mod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thearcaneforge.mod.TheArcaneForge;
import net.thearcaneforge.mod.item.custom.ArcaneChiselItem;
import net.thearcaneforge.mod.item.custom.FueItem;

import java.util.List;

public class ModItems {
    public  static  final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TheArcaneForge.MOD_ID);

    //ARCANE
    public  static final RegistryObject<Item> ARCANE_GEMSTONE = ITEMS.register("arcane_gemstone",
            () -> new Item(new Item.Properties()));

    public  static final RegistryObject<Item> RAW_ARCANE_ORE = ITEMS.register("raw_arcane_ore",
            () -> new Item(new Item.Properties()));

    //GARNET
    public  static final RegistryObject<Item> PINK_GARNET = ITEMS.register("pink_garnet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_PINK_GARNET = ITEMS.register("raw_pink_garnet",
            () -> new Item(new Item.Properties()));

    //BISMUTH
    public static final RegistryObject<Item> BISMUTH_GEMSTONE = ITEMS.register("bismuth_gemstone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth",
            () -> new Item(new Item.Properties()));

    //FOOD
    public static final RegistryObject<Item> KOHLRABI = ITEMS.register("kohlrabi",
            () -> new Item(new Item.Properties().food(ModFoodProperties.KOHLRABI)){

        @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.thearcaneforge.kohlrabi"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> RADISH = ITEMS.register("radish",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RADISH)){
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.thearcaneforge.radish"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> CAULIFLOWER = ITEMS.register("cauliflower",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CAULIFLOWER)){
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.thearcaneforge.cauliflower"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    //FUEL
    public static final RegistryObject<Item> ARCANE_ASHES = ITEMS.register("arcane_ashes",
            () -> new FueItem(new Item.Properties(),1200){

        @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.thearcaneforge.arcane_ashes"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> GARNET_ASHES = ITEMS.register("garnet_ashes",
            () -> new FueItem(new Item.Properties(),1200){

        @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.thearcaneforge.garnet_ashes"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> FROSTFIRE_ICE = ITEMS.register("frostfire_ice",
            () -> new FueItem(new Item.Properties(),1200){

        @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.thearcaneforge.frostfire_ice"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public  static  void register (IEventBus eventBus){

        ITEMS.register(eventBus);
    }
}
