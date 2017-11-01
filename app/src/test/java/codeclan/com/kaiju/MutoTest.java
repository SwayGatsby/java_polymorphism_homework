package codeclan.com.kaiju;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


import Kaiju.Muto;

/**
 * Created by user on 01/11/2017.
 */

public class MutoTest {
    Muto muto;

    @Before
    public void before(){
        muto = new Muto("Gladys", 100, 20);
    }

    @Test
    public void hasName(){
        assertEquals("Gladys", muto.getName());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(100, muto.getHealthValue());
    }

    @Test
    public void hasAttackValue(){
        assertEquals(20, muto.getAttackValue());
    }

    @Test
    public void canRoar(){
        assertEquals("ROOOOOAR!", muto.roar());
    }

    @Test
    public void canMove(){
        assertEquals("Moving forward, slowly and methodically.", muto.move());
    }


}



