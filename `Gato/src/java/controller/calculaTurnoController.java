
package controller;

import com.google.gson.Gson;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import utilerias.Juego;
import utilerias.Posicion;

/**
 *
 * @author MEMO
 */
@RestController
@RequestMapping("/turno")
public class calculaTurnoController {
    
    @RequestMapping(value="siguiente",method = RequestMethod.GET)
    public @ResponseBody  String get(@RequestParam("alto") String alto, @RequestParam("ancho") String ancho)
    {
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
        ganes[0][0].setY(0);
        
        //int x = Integer.parseInt(ancho);
        //int y = Integer.parseInt(alto);
        
        //juego.posiciones [x][y] = 'o';
        
        
        
        return "sigue jalando";
    }
    
 
}
