package net.thearcaneforge.mod.item;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.thearcaneforge.mod.TheArcaneForge;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    //ARCANE
    public  static final  Holder<ArmorMaterial> ARCANE_ARMOR_MATERIAL = register("arcane", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET,7);
                attribute.put(ArmorItem.Type.CHESTPLATE,11);
                attribute.put(ArmorItem.Type.LEGGINGS,9);
                attribute.put(ArmorItem.Type.BOOTS,7);
                attribute.put(ArmorItem.Type.BODY,14);
            }), 15, 4f, 0.1f,() -> ModItems.ARCANE_GEMSTONE.get());

    //PINK_GARNET
    public  static final  Holder<ArmorMaterial> PINK_GARNET_ARMOR_MATERIAL = register("pink_garnet", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET,6);
                attribute.put(ArmorItem.Type.CHESTPLATE,10);
                attribute.put(ArmorItem.Type.LEGGINGS,8);
                attribute.put(ArmorItem.Type.BOOTS,7);
                attribute.put(ArmorItem.Type.BODY,13);
            }), 15, 4f, 0.1f,() -> ModItems.PINK_GARNET.get());

    //BISMUTH
    public  static final  Holder<ArmorMaterial> BISMUTH_ARMOR_MATERIAL = register("bismuth", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET,5);
                attribute.put(ArmorItem.Type.CHESTPLATE,9);
                attribute.put(ArmorItem.Type.LEGGINGS,7);
                attribute.put(ArmorItem.Type.BOOTS,5);
                attribute.put(ArmorItem.Type.BODY,12);
            }), 15, 4f, 0.1f,() -> ModItems.BISMUTH_GEMSTONE.get());

    //SAPPHIRE
    public  static final  Holder<ArmorMaterial> SAPPHIRE_ARMOR_MATERIAL = register("sapphire", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.HELMET,5);
                attribute.put(ArmorItem.Type.CHESTPLATE,9);
                attribute.put(ArmorItem.Type.LEGGINGS,7);
                attribute.put(ArmorItem.Type.BOOTS,5);
                attribute.put(ArmorItem.Type.BODY,12);
            }), 15, 4f, 0.1f,() -> ModItems.SAPPHIRE_GEMSTONE.get());


    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection,
                                                  int enchantability, float toughness, float knockbackResistance,
                                                  Supplier<Item> ingredientItem) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(TheArcaneForge.MOD_ID, name);
        Holder<SoundEvent> equipSound = SoundEvents.ARMOR_EQUIP_NETHERITE;
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            typeMap.put(type, typeProtection.get(type));
        }

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(typeProtection, enchantability, equipSound, ingredient, layers, toughness, knockbackResistance));
    }
}
