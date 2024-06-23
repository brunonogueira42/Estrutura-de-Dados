
public interface Map<K, V> {
  public void put(K chave, V valor);

  public V get(Object key);

  public V remove(Object key);
}
