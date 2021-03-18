package model.data_structures;

public class TablaSimbolos <K extends Comparable<K>, V extends Comparable<V>> implements ITablaSimbolos<K, V>
{

	private ILista<NodoTS<K,V>> listaNodos;
	
	public TablaSimbolos()
	{
		listaNodos = new ListaEncadenada<NodoTS<K,V>>();
	}
	
	public void put(K pllave, V pValores) 
	{
		NodoTS<K, V> agregar = new NodoTS<K, V>(pllave, pValores);
		listaNodos.addLast(agregar);
	}

	public V get(K pllave) 
	{
		NodoTS<K, V> buscado = null;
		for(int i = 1; i<= listaNodos.size() && buscado == null; i++)
		{
			if(listaNodos.getElement(i).darllave().compareTo(pllave) == 0)
			{
				buscado = listaNodos.getElement(i);
			}
		}
		return buscado != null? buscado.darValor(): null;
	}

	public V remove(K pllave) 
	{
		NodoTS<K, V> buscado = null;
		for(int i = 1; i<= listaNodos.size() && buscado == null; i++)
		{
			if(listaNodos.getElement(i).darllave().compareTo(pllave) == 0)
			{
				buscado = listaNodos.getElement(i);
				listaNodos.deleteElement(i);
				return buscado.darValor();
			}
		}
		return null;
	}

	public boolean contains(K pllave) 
	{
		for(int i = 1; i<= listaNodos.size( ); i++)
		{
			if(listaNodos.getElement(i).darllave().compareTo(pllave) == 0)
			{
				return true;
			}
		}
		return false;
	}

	public boolean isEmpty() 
	{
		return listaNodos.isEmpty();
	}

	public int size() 
	{
		return listaNodos.size();
	}

	public ILista<K> keySet()
	{
		ILista<K> llaves = new ListaEncadenada<K>();
		for(int i = 1; i<= listaNodos.size(); i++)
		{
			NodoTS<K,V> nuevo = listaNodos.getElement(i);
			llaves.addLast(nuevo.darllave());
		}
		return llaves;
	}

	@Override
	public ILista<V> valueSet() 
	{
		ILista<V> llaves = new ListaEncadenada<V>();
		for(int i = 1; i<= listaNodos.size(); i++)
		{
			NodoTS<K,V> nuevo = listaNodos.getElement(i);
			llaves.addLast(nuevo.darValor());
		}
		return llaves;
	}
}
