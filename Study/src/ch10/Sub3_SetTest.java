package ch10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * ��¥ : 2022/01/11
 * �̸� : �ݼ���
 * ���� : �ڹ� �÷��� ����Ʈ �ǽ��ϱ� ���� p348
 */
public class Sub3_SetTest {
	public static void main(String[] args) {
		
		// Set ����
		Set<Integer>	set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(3);
		
		System.out.println("set ���� : "+set);
		System.out.println("set ũ�� : "+set.size());
		
		// Set ���
		for(int n : set) {
			System.out.println(n+" ");
		}
		System.out.print("\n");
		
		// �ݺ���(Iterator)�� �̿��� ���
		Iterator<Integer> iter = set.iterator();
		
		while (iter.hasNext()) {
			
			int num = iter.next();
			System.out.println(num + " ");
			
		}
		System.out.print("\n");
		
	}
}