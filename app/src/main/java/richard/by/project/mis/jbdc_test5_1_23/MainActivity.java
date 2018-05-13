package richard.by.project.mis.jbdc_test5_1_23;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        try {
            Class.forName("com.mysql.jdbc.Driver");
            Log.v("TAG", "JDBC驅動架載成功");
        } catch (ClassNotFoundException e) {
            Log.e("TAG", "JDBC驅動架載成功");
            return;
        }


        String ip = "120.114.128.143";
        int port = 3306;
        String dbName = "102art";
        String url = "jdbc:mysql://" + ip + ":" + port
                + "/" + dbName;
        String user = "root1234";
        String password = "root1234";


        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            conn.close();
        } catch (SQLException e) {
            Log.e("TAG", "連接失敗");
            e.printStackTrace();
            return;
        }
    }
}
