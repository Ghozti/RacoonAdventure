package ghozti.racoonadventure.screens.gamescreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import ghozti.racoonadventure.Game;
import ghozti.racoonadventure.entities.Racoon;

public class GameScreen implements Screen {

    Game game;
    Texture img;
    Racoon racoon;

    public GameScreen(Game game){
        this.game = game;
    }


    @Override
    public void show() {
        img = new Texture("raw_textures/player/player idle.png");
        racoon =  new Racoon(0,0,3);
    }

    @Override
    public void render(float delta) {
        racoon.updatePositions();
        Gdx.gl.glClearColor(.128f,.128f,.128f,.1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.batch.draw(img,racoon.getX(),racoon.getY());
        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
