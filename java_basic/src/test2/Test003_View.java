package test2;
 
public class Test003_View {
	public static void main(String[] args) {
		
		//ver-1   new UserView_intro().show();
		//ver-2
		UserView_crud crud = new UserView_crud();
		crud.show();
		
		// 1. 데이터 추가 -  add
		Object[] data = {1 , "aaa" ,"aaa@gmail.com" , "2025-02-05"};
		crud.model.addRow(data);
	}
}
// if , switch, for / 