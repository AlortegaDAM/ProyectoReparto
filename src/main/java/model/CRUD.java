
package model;

import java.util.List;

public interface CRUD <E>{
    
    public int  add(E element);
    public int  update(E element);
    public void delete(int id);
    public List load();
    // Optional<E> findById(int id);
    
}
