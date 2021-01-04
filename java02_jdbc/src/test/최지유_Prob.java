package Problem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* ���� ���� : show() �޼ҵ�� �Ű������� �μ���ȣ(DEPARTMENT_ID) ������ �Է� �޾Ƽ� �ش�
�μ��� �ش��ϴ� ����� ��� �޿������� ����ϴ� �޼����̴�. 
Ư�� �μ��� �ش��ϴ� ���������� ����ϴ� show () �޼ҵ带 �����Ͻÿ�. 

Ư�� �μ��� ������ �����ϴ� getDept()  �޼ҵ带 �����Ͻÿ�.  */

public class ������_Prob {
  
	
        private static void show(int DEPARTMENT_ID) {
        	String driver = "oracle.jdbc.driver.OracleDriver";
    		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
    		String user = "scott";
    		String pw = "TIGER";
    		
    		String sql = "Select round(avg(sal)) avg_sal from emp Where deptno=" + DEPARTMENT_ID;
    		
    		Connection con = null;
    		Statement st = null;
    		ResultSet rs = null;
    		int result = 0;
    		
    		try {
    			//1.
    			Class.forName(driver);
    			//2.
    			con = DriverManager.getConnection(url, user, pw);
    			//3.
    			st = con.createStatement();
    			//4. 
    			rs = st.executeQuery(sql);
    			
    			while(rs.next()) {
    				if (rs.getString("avg_sal") != null) {
    					System.out.print(DEPARTMENT_ID +"\t");
    					System.out.print(rs.getString("avg_sal")+"\n");
    				} else {
    					System.out.print("�ش�μ��� �������� �ʽ��ϴ�."+"\n");
    				}
    			}
    			} catch (Exception e) {
					System.out.println(e.getMessage());
				} finally {
						try {
						if(con != null) con.close();
						if(st != null) con.close();
						if(rs != null) con.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
				}	
				
				System.out.println("JDBC APP END...");
			}

   
//        private static Dept getDept(int DEPARTMENT_ID) {
//        	
//        }
        
        
	public static void main(String[] args) {
		
		show(10);		
        System.out.println("============================");
		show(50);
		System.out.println("============================");
//		Dept dept10 = getDept(10);
//		Dept dept30 = getDept(30);


	}	
}





