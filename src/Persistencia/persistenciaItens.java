/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Entidades.Itens;
import java.util.List;

/**
 *
 * @author pascal
 */
public interface persistenciaItens {
    public void inserir(Itens novoItem);
    public void alterar(Itens novoItem);
    public void remover(Itens novoItem);
    public List<Itens> getAll();
}
