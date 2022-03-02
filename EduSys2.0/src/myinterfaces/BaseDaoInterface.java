/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterfaces;

import java.util.ArrayList;

/**
 *
 * @author NTV
 */
public interface BaseDaoInterface<T, K> {
    public boolean insert(T e)throws Exception;
    public boolean update(T e)throws Exception;
    public boolean delete(K key)throws Exception;
    public T selectByID(K key)throws Exception;
    public ArrayList<T> selectALL()throws Exception;
    public ArrayList<T> selectByQuery(String query, Object... args)throws Exception;
}
