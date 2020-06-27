package utils;

import main.Main;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.Random;

public class CustomChunkgenerator extends ChunkGenerator {

    @Override
    public ChunkData generateChunkData(World world, Random random, int chunkx, int chunkz, BiomeGrid biome) {

        ChunkData chunk = createChunkData(world);

        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
                int coordinateX = chunkx * 16 + x;
                int coordinateZ = chunkz * 16 + z;
                int currentheight = Main.w.getHighestBlockYAt(coordinateX, coordinateZ);
                for(int y = currentheight; y > 0; y--) {
                    chunk.setBlock(x,y,z,Main.w.getBlockAt(x,y,z).getType());

                }
            }
        }

        return chunk;
    }
}
