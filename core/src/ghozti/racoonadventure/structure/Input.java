package ghozti.racoonadventure.structure;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class Input {

    public static float[] HandleInput(float x, float y, int speed, float deltaTime){
        if (Gdx.input.isKeyPressed(Keys.W)){//move forward
            y += speed/2;
        }
        if (Gdx.input.isKeyPressed(Keys.A)){//move to the left
            x -= speed;
        }
        if (Gdx.input.isKeyPressed(Keys.S)){//move down
            y -= speed/2;
        }
        if (Gdx.input.isKeyPressed(Keys.D)){//move to the right
            x += speed;
        }

        return new float[]{x,y};
    }
}
