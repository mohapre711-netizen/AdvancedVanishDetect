package com.vanishdetect;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.text.Text;

public class VanishDetectClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.world != null) {
                // كود كشف اللاعبين المختفين في الـ tab list
                for (PlayerListEntry entry : client.getNetworkHandler().getPlayerList()) {
                    // منطق الكشف هنا...
                }
            }
        });
    }
}

