import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
 
public class ArrListAdapter<E> implements List<E>, Cloneable, RandomAccess, Serializable
{
  private static final long serialVersionUID = 1L;
 
  // Iterator interface
 
  @Override
  public Iterator<E> iterator() {
    throw new UnsupportedOperationException("iterator");
  }
 
  // Collection interface
 
  @Override
  public boolean add(E e) {
    throw new UnsupportedOperationException("add");
  }
 
  @Override
  public int size() { throw new UnsupportedOperationException("size"); }
 
  @Override
  public boolean addAll(Collection<? extends E> c) {
    throw new UnsupportedOperationException("addAll");
  }
 
  @Override
  public boolean removeAll(Collection<?> c) {
    throw new UnsupportedOperationException("removeAll");
  }
 
  @Override
  public boolean retainAll(Collection<?> c) {
    throw new UnsupportedOperationException("retainAll");
  }
 
  @Override
  public boolean containsAll(Collection<?> c) {
    throw new UnsupportedOperationException("containsAll");
  }
 
  @Override
  public boolean contains(Object o) {
    throw new UnsupportedOperationException("contains");
  }
 
  @Override
  public boolean isEmpty() {
    throw new UnsupportedOperationException("isEmpty");
  }
 
  @Override
  public void clear() { throw new UnsupportedOperationException("clear"); }
 
  @Override
  public boolean remove(Object o) {
    throw new UnsupportedOperationException("remove(Object)"); }
 
  @Override
  public<E> E[] toArray(E[] a) {
    throw new UnsupportedOperationException("toArray(a)");
  }
 
  @Override
  public Object[] toArray() {
    throw new UnsupportedOperationException("toArray");
  }
 
  // List interface
 
  @Override
  public E get(int index) {
    throw new UnsupportedOperationException("get");
  }
 
  @Override
  public E set(int index, E element) {
    throw new UnsupportedOperationException("set");
  }
 
  @Override
  public void add(int index, E element) {
    throw new UnsupportedOperationException("add(int,E)");
  }
 
  @Override
  public List<E> subList(int fromIndex, int toIndex) {
    throw new UnsupportedOperationException("subList");
  }
 
  @Override
  public ListIterator<E> listIterator() {
    throw new UnsupportedOperationException("listIterator");
  }
 
  @Override
  public ListIterator<E> listIterator(int index) {
    throw new UnsupportedOperationException("listIterator(int)");
  }
 
  @Override
  public boolean addAll(int index, Collection<? extends E> c) {
    throw new UnsupportedOperationException("addAll");
  }
 
  @Override
  public int indexOf(Object o) {
    throw new UnsupportedOperationException("indexOf");
  }
 
  @Override
  public int lastIndexOf(Object o) {
    throw new UnsupportedOperationException("lastIndexOf");
  }
 
  @Override
  public E remove(int index) {
    throw new UnsupportedOperationException("remove(int)");
  }
}