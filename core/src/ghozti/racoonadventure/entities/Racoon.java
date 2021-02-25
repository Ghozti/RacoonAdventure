package ghozti.racoonadventure.entities;

import com.badlogic.gdx.graphics.Texture;
import ghozti.racoonadventure.structure.Input;

public class Racoon {
//*******************ATTRIBUTES*******************
    float x, y;
    final float speed;
    Texture texture = new Texture("raw_textures/player/player idle.png");

//*******************CONSTRUCTOR*******************
    public Racoon(float x,float y, float speed){
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

//*******************GETTERS*******************
    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public float getSpeed() {
        return speed;
    }

    public Texture getTexture() {return texture;}
//*******************METHODS*******************

    public void updatePositions(){
        x = Input.HandleInput(x,y,2,0)[0];
        y = Input.HandleInput(x,y,2,0)[1];
    }
}
