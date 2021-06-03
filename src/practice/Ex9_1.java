package practice;

public class Ex9_1 {
	public static void main(String[] args) {
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("���� ��ü �Դϴ�.");
		}else {
			System.out.println("�ٸ� ��ü �Դϴ�.");
		}
		
	}
}

class Value{
	
	int value;
	
	Value(int value) {
		this.value = value;}

	@Override
	public boolean equals(Object obj) {
	// Object�� equals()�� �������̵������ν� �ּҰ� �ƴ� value���� ��
	// �̷��� �������̵� �� ���� �ʰ� equals()�� ����ϰ� �Ǹ� �׻� false�� ���� ��� �� ��.
	// �� ? ���� ���� �ּҸ� ������ �ִ� �ν��Ͻ� ��ü�� ���� ����!!
			// ���������� �� ��ȯ ������ �ݵ�� instanceof�� Ȯ���ؾ� ��.
			if(!(obj instanceof Value)) return false;
			Value v = (Value)obj; // obj�� value�� ����ȯ
			return this.value == v.value;
			
	
	}
	
	
	
	
	
}
