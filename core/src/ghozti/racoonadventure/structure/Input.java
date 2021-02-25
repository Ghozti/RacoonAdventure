package ghozti.racoonadventure.structure;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class Input {

    /**
     * Handle input will:
     * take in 3 floats:
     * x,y,speed
     * speed represents the amount of px to move
     * this method will return the updates x and y value based on the key inputed
     */

    public static float[] HandleInput(float x, float y, float speed){
        if (Gdx.input.isKeyPressed(Keys.W)){//move forward
            y += speed * Gdx.graphics.getDeltaTime();
        }
        if (Gdx.input.isKeyPressed(Keys.A)){//move to the left
            x -= speed * Gdx.graphics.getDeltaTime();
        }
        if (Gdx.input.isKeyPressed(Keys.S)){//move down
            y -= speed * Gdx.graphics.getDeltaTime();
        }
        if (Gdx.input.isKeyPressed(Keys.D)){//move to the right
            x += speed * Gdx.graphics.getDeltaTime();
        }
        return new float[]{x,y};
    }
}
