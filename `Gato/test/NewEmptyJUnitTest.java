/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import utilerias.Juego;
import utilerias.Posicion;

/**
 *
 * @author MEMO
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    @Test
    public void hello() {
    Juego juego = new Juego();
        
        Posicion[][] ganes = new Posicion[8][3];
        ganes[0][0].setX(0);
        ganes[0][0].setY(0);
        ganes[0][0].setX(1);
        ganes[0][0].setY(0);
        ganes[0][0].setX(2);
        ganes[0][0].setY(0);
        
        ganes[0][0].setX(1);
        ganes[0][0].setY(0);
        ganes[0][0].setX(1);
        ganes[0][0].setY(1);
        ganes[0][0].setX(1);
        ganes[0][0].setY(2);
        
        ganes[0][0].setX(2);
        ganes[0][0].setY(0);
        ganes[0][0].setX(2);
        ganes[0][0].setY(1);
        ganes[0][0].setX(2);
        ganes[0][0].setY(2);
        
        ganes[0][0].setX(0);
        ganes[0][0].setY(0);
        ganes[0][0].setX(1);
        ganes[0][0].setY(0);
        ganes[0][0].setX(2);
        ganes[0][0].setY(0);
        
        ganes[0][0].setX(1);
        ganes[0][0].setY(0);
        ganes[0][0].setX(1);
        ganes[0][0].setY(1);
        ganes[0][0].setX(1);
        ganes[0][0].setY(2);
        
        ganes[0][0].setX(2);
        ganes[0][0].setY(0);
        ganes[0][0].setX(2);
        ganes[0][0].setY(1);
        ganes[0][0].setX(2);
        ganes[0][0].setY(2);
        
        ganes[0][0].setX(0);
        ganes[0][0].setY(0);
        ganes[0][0].setX(1);
        ganes[0][0].setY(1);
        ganes[0][0].setX(3);
        ganes[0][0].setY(3);
        
        ganes[0][0].setX(2);
        ganes[0][0].setY(0);
        ganes[0][0].setX(1);
        ganes[0][0].setY(1);
        ganes[0][0].setX(2);
        ganes[0][0].setY(0);}
}
