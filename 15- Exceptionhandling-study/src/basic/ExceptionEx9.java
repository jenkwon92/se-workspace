package basic;

public class ExceptionEx9 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("���Ƿ� �߻���Ŵ");
			throw e;
		//	throw new Exception("���Ƿ� �߻�"); //���� �� ���� ���ٷ� �ٿ� ���
		} catch (Exception e) {
			System.out.println("���� �޽��� : "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷���  ���� ����Ǿ����ϴ�");
	}
}