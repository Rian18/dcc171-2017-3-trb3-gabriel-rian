package trabalho3_lab3_20173;
import java.util.List;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriel
 */
 interface TarefaDAO {
    public void cria(Tarefa taf) throws  Exception;
    public List<Tarefa> listaTodas() throws Exception;

}
