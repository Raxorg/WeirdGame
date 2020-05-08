package com.weird.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Random;

public class WeirdGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Random random;

	@Override
	public void create () {
		batch = new SpriteBatch();
		batch.setColor(Color.GREEN);
		img = new Texture("badlogic.jpg");
		random = new Random();
	}

	// THIS IS MY POWERFUL COMMENT, YOU CAN DELETE THIS THO :D

	@Override
	public void render () {
		float r,g,b;

		r = random.nextFloat();
		g = random.nextFloat();
		b = random.nextFloat();

		Gdx.gl.glClearColor(r, g, b, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
