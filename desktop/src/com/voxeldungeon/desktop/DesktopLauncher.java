package com.voxeldungeon.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.voxeldungeon.VoxelDungeon;
import com.voxeldungeon.VoxelEngine;
import com.voxeldungeon.VoxelTest;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		// application originale
		//new LwjglApplication(new VoxelDungeon(), config);

		// Voxel Engine test
		//new LwjglApplication(new VoxelEngine(), config);

		new LwjglApplication(new VoxelTest(), config);
	}
}
