package Controles;
import Entidade.Camera;
import java.util.ArrayList;
/**
 *
 * @author Jhonatan
 */
public class RepositorioMananger {

    private static RepositorioMananger instance;
    ArrayList<Camera> ListaCamera;
    
    private RepositorioMananger(){
     ListaCamera = new ArrayList<Camera>();
    }

    //Singleton

    public static RepositorioMananger getInstance() {
        if (instance == null) {
            instance = new RepositorioMananger();

        }
        return instance;
    }
    public void CadrastoCamera(Camera camera){
        //TODO fazer logica
        ListaCamera.add(camera);
        System.out.println(camera);
    
    }
}
