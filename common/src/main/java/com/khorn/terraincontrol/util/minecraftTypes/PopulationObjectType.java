package com.khorn.terraincontrol.util.minecraftTypes;

import com.khorn.terraincontrol.LocalWorld;

/**
 * Certain objects are too complex to be generated by our code. They rely on
 * many Minecraft classes, for example. In cases like that, we simply ask the
 * Minecraft code to generate the object. This enum is used to specify which
 * object must be generated.
 *
 * <p>Only small objects spawned during terrain population can be found here.
 * The trees can be found in {@link TreeType}, while the structures are
 * completely managed by {@link LocalWorld}.
 */
public enum PopulationObjectType
{
    DUNGEON,
    /**
     * A fossil. May only be spawned at the (0, 0) pos inside the chunk being
     * populated.
     */
    FOSSIL
}