package ghozti.racoonadventure;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import ghozti.racoonadventure.gamescreen.GameScreen;

public class Game extends com.badlogic.gdx.Game {

	public SpriteBatch batch;

	@Override
	public void create () {
		batch = new SpriteBatch();
		this.setScreen(new GameScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
}