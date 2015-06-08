/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import Entidade.Camera;
import java.time.Clock;

/**
 *
 * @author Jhonatan
 */
public class CadastroControles {

    public boolean CadastrarProduto(Camera camera) {
        boolean result = false;

        if (camera != null
                && (camera.getTipodeCamera() != 0)
                && (camera.getEspecificações().length() > 0)
                && (camera.getLocaldaCamera() != 0)
                && (camera.getNome().length() > 0)) {
            //TODO pronto para cadastrar os Sistema
            RepositorioMananger.getInstance().CadrastoCamera(camera);
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
