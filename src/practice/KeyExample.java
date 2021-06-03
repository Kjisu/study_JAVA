package practice;

import java.util.HashMap;

public class KeyExample {
	
	public static void main(String[] args) {
				HashMap<Key, String> hashmMap = new HashMap();
				hashmMap.put(new Key(1), "ȫ�浿");
				String value = hashmMap.get(new Key(1));
				System.out.println(value);
	}

}

class Key{
	int number;
	
	Key(int number){
		this.number = number;}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key)obj;
			if(this.number == compareKey.number) {
				return true;
			}
	}
	
	return false;
}

	@Override
	public int hashCode() {
		return number;
	}

	
	
	
}