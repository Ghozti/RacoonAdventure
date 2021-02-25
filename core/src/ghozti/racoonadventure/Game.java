package ghozti.racoonadventure;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import ghozti.racoonadventure.entities.Racoon;

public class Game extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Racoon racoon;
	
	@Override
	public void create () {
		racoon =  new Racoon(0,0,3);
		batch = new SpriteBatch();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(.128f, .128f, .128f, .6f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		racoon.updatePositions();
		batch.begin();
		batch.draw(racoon.getTexture(), racoon.getX(), racoon.getY());
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}