
import app.view.login.LoginView;
import config.Config;
import config.DatabaseConfig;
import java.sql.SQLException;
import storage.SQLStorage;
import util.Encoder;
import util.ReadConfig;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        ReadConfig readConfig = new ReadConfig<>(Config.class);
        Config config = (Config) readConfig.getConfig("src/config/file/config.yml");

        DatabaseConfig databaseConfig = config.getDatabase();
        SQLStorage sqlStorage = new SQLStorage(databaseConfig.getMysqlDriverUrl(), databaseConfig.getUsername(), databaseConfig.getPassword());
        // remove this later
        System.out.println(Encoder.encodePassword("123456"));
        
        new LoginView(sqlStorage).setVisible(true);
    }
}
