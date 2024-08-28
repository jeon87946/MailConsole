package kr.ac.kopo.Util;

import java.sql.Statement;
import java.sql.Connection;

public class JDBCCloss {

		public static void close(Connection conn, Statement stmt) {
			
			if(stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				if(conn != null) {
					try {
						conn.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					
			}
		}
}
}