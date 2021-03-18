package model.data_structures;

public class NodoTS<K extends Comparable<K>, V extends Comparable<V>> implements Comparable<NodoTS<K,V>>
{
	private K llave;
	private V valor;
	public NodoTS(K llave, V valor)
	{
		this.llave = llave;
		this.valor = valor;
	}
	
	public K darllave()
	{
		return llave;
	}
	
	public V darValor()
	{
		return valor;
	}
	
	public void setKey(K pllave)
	{
		this.llave = pllave; 
	}
	
	public void setValue(V pValor)
	{
		this.valor = pValor;
	}
	
	public int compareTo(NodoTS<K, V> otro)
	{
		return this.llave.compareTo( otro.llave );
	}
}
