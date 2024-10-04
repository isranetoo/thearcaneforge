package net.thearcaneforge.mod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thearcaneforge.mod.TheArcaneForge;
import net.thearcaneforge.mod.item.custom.FueItem;
import net.thearcaneforge.mod.item.custom.HammerItem;
import net.thearcaneforge.mod.item.custom.ModToolTiers;

import java.util.List;

public class ModItems {
    public  static  final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TheArcaneForge.MOD_ID);

    //ARCANE
    public  static final RegistryObject<Item> ARCANE_GEMSTONE = ITEMS.register("arcane_gemstone",
            () -> new Item(new Item.Properties()));

    public  static final RegistryObject<Item> RAW_ARCANE_ORE = ITEMS.register("raw_arcane_ore",
            () -> new Item(new Item.Properties()));

    //TOOLS
    public static final RegistryObject<Item> ARCANE_SWORD = ITEMS.register("arcane_sword",
            () -> new SwordItem(ModToolTiers.ARCANE,new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ARCANE,3,-2.4f))));

    public static final RegistryObject<Item> ARCANE_PICKAXE = ITEMS.register("arcane_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ARCANE,new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ARCANE,1,-2.8f))));

    public static final RegistryObject<Item> ARCANE_SHOVEL = ITEMS.register("arcane_shovel",
            () -> new ShovelItem(ModToolTiers.ARCANE,new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.ARCANE,1.5f,-3.0f))));

    public static final RegistryObject<Item> ARCANE_AXE = ITEMS.register("arcane_axe",
            () -> new AxeItem(ModToolTiers.ARCANE,new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ARCANE,6,-3.2f))));

    public static final RegistryObject<Item> ARCANE_HOE = ITEMS.register("arcane_hoe",
            () -> new HoeItem(ModToolTiers.ARCANE,new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.ARCANE,0,-3.0f))));
    //HAMMER
    public static final RegistryObject<Item> ARCANE_HAMMER = ITEMS.register("arcane_hammer",
            () -> new HammerItem(ModToolTiers.ARCANE,new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ARCANE,8,-3.7f))));

    //ARMOR
    public static final RegistryObject<Item> ARCANE_HELMET = ITEMS.register("arcane_helmet",
            () -> new ArmorItem(ModArmorMaterials.ARCANE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(30))));

    public static final RegistryObject<Item> ARCANE_CHESTPLATE = ITEMS.register("arcane_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ARCANE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(30))));

    public static final RegistryObject<Item> ARCANE_LEGGINGS = ITEMS.register("arcane_leggings",
            () -> new ArmorItem(ModArmorMaterials.ARCANE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(30))));

    public static final RegistryObject<Item> ARCANE_BOOTS = ITEMS.register("arcane_boots",
            () -> new ArmorItem(ModArmorMaterials.ARCANE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(30))));


    //GARNET
    public  static final RegistryObject<Item> PINK_GARNET = ITEMS.register("pink_garnet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_PINK_GARNET = ITEMS.register("raw_pink_garnet",
            () -> new Item(new Item.Properties()));

    //TOOLS

    public static final RegistryObject<Item> PINK_GARNET_SWORD = ITEMS.register("pink_garnet_sword",
            () -> new SwordItem(ModToolTiers.PINK_GARNET,new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.PINK_GARNET,3,-2.4f))));

    public static final RegistryObject<Item> PINK_GARNET_PICKAXE = ITEMS.register("pink_garnet_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PINK_GARNET,new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.PINK_GARNET,1,-2.8f))));

    public static final RegistryObject<Item> PINK_GARNET_SHOVEL = ITEMS.register("pink_garnet_shovel",
            () -> new ShovelItem(ModToolTiers.PINK_GARNET,new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.PINK_GARNET,1.5f,-3.0f))));

    public static final RegistryObject<Item> PINK_GARNET_AXE = ITEMS.register("pink_garnet_axe",
            () -> new AxeItem(ModToolTiers.PINK_GARNET,new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.PINK_GARNET,6,-3.2f))));

    public static final RegistryObject<Item> PINK_GARNET_HOE = ITEMS.register("pink_garnet_hoe",
            () -> new HoeItem(ModToolTiers.PINK_GARNET,new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.PINK_GARNET,0,-3.0f))));

    //HAMMER
    public static final RegistryObject<Item> PINK_GARNET_HAMMER = ITEMS.register("pink_garnet_hammer",
            () -> new HammerItem(ModToolTiers.PINK_GARNET,new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.PINK_GARNET,8,-3.7f))));

    //ARMOR
    public static final RegistryObject<Item> PINK_GARNET_HELMET = ITEMS.register("pink_garnet_helmet",
            () -> new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(35))));

    public static final RegistryObject<Item> PINK_GARNET_CHESTPLATE = ITEMS.register("pink_garnet_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(35))));

    public static final RegistryObject<Item> PINK_GARNET_LEGGINGS = ITEMS.register("pink_garnet_leggings",
            () -> new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(35))));

    public static final RegistryObject<Item> PINK_GARNET_BOOTS = ITEMS.register("pink_garnet_boots",
            () -> new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(35))));


    //BISMUTH
    public static final RegistryObject<Item> BISMUTH_GEMSTONE = ITEMS.register("bismuth_gemstone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth",
            () -> new Item(new Item.Properties()));

    //TOOLS

    public static final RegistryObject<Item> BISMUTH_SWORD = ITEMS.register("bismuth_sword",
            () -> new SwordItem(ModToolTiers.BISMUTH,new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.BISMUTH,3,-2.4f))));

    public static final RegistryObject<Item> BISMUTH_PICKAXE = ITEMS.register("bismuth_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BISMUTH,new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.BISMUTH,1,-2.8f))));

    public static final RegistryObject<Item> BISMUTH_SHOVEL = ITEMS.register("bismuth_shovel",
            () -> new ShovelItem(ModToolTiers.BISMUTH,new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.BISMUTH,1.5f,-3.0f))));

    public static final RegistryObject<Item> BISMUTH_AXE = ITEMS.register("bismuth_axe",
            () -> new AxeItem(ModToolTiers.BISMUTH,new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.BISMUTH,6,-3.2f))));

    public static final RegistryObject<Item> BISMUTH_HOE = ITEMS.register("bismuth_hoe",
            () -> new HoeItem(ModToolTiers.BISMUTH,new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.BISMUTH,0,-3.0f))));

    //HAMMER
    public static final RegistryObject<Item> BISMUTH_HAMMER = ITEMS.register("bismuth_hammer",
            () -> new HammerItem(ModToolTiers.BISMUTH,new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.BISMUTH,8,-3.7f))));

    //ARMOR
    public static final RegistryObject<Item> BISMUTH_HELMET = ITEMS.register("bismuth_helmet",
            () -> new ArmorItem(ModArmorMaterials.BISMUTH_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(35))));

    public static final RegistryObject<Item> BISMUTH_CHESTPLATE = ITEMS.register("bismuth_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BISMUTH_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(35))));

    public static final RegistryObject<Item> BISMUTH_LEGGINGS = ITEMS.register("bismuth_leggings",
            () -> new ArmorItem(ModArmorMaterials.BISMUTH_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(35))));

    public static final RegistryObject<Item> BISMUTH_BOOTS = ITEMS.register("bismuth_boots",
            () -> new ArmorItem(ModArmorMaterials.BISMUTH_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(35))));

    //SAPPHIRE
    public static final RegistryObject<Item> SAPPHIRE_GEMSTONE = ITEMS.register("sapphire_gemstone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
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

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.STRAWBERRY)){
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.thearcaneforge.strawberry"));
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

    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FueItem(new Item.Properties(),1200){

                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.thearcaneforge.pine_cone"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public  static  void register (IEventBus eventBus){

        ITEMS.register(eventBus);
    }
}
