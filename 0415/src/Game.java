import java.util.*;
public class Game {
	public static void main(String[] args) {
		
		int user=0;
		int com=(int)(Math.random()*3); 
		Scanner scan=new Scanner(System.in);
		System.out.println("[1: ���� 2:���� 3:��]");
		user=scan.nextInt();

		switch (com) {
		case 1:
			switch(user)
			{
			case 1:
				System.out.println("[��: ����] VS [��ǻ��: ����]");
				System.out.println("���º�");
				break;
			case 2:
				System.out.println("[��: ����] VS [��ǻ��: ����]");
				System.out.println("�̰���ϴ�");
				break;
			case 3:
				System.out.println("[��: ��] VS [��ǻ��: ����]");
				System.out.println("�����ϴ�");
				break;
			}
			break;
        case 2:
        	switch(user)
			{
			case 1:
				System.out.println("[��: ����] VS [��ǻ��: ����]");
				System.out.println("�����ϴ�");
				break;
			case 2:
				System.out.println("[��: ����] VS [��ǻ��: ����]");
				System.out.println("���º�");
				break;
			case 3:
				System.out.println("[��: ��] VS [��ǻ��: ����]");
				System.out.println("�̰���ϴ�");
			}
			break;	
        case 3:
        	switch(user)
			{
			case 1:
				System.out.println("[��: ����] VS [��ǻ��: ��]");
				System.out.println("�̰���ϴ�");
				break;
			case 2:
				System.out.println("[��: ����] VS [��ǻ��: ��]");
				System.out.println("�����ϴ�");
				break;
			case 3:
				System.out.println("[��: ��] VS [��ǻ��: ��]");
				System.out.println("���º�");
			}
			break;	
		default:
			System.out.println("");
			break;
		}
        	}
	}
