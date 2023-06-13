/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

/**
 *
 * @author Administrator
 * @param <T>
 */
public class ReadConfig<T> {

    public ReadConfig(Class<T> configClass) {
        this.configClass = configClass;
    }

    private final Class<T> configClass;

    @SuppressWarnings("CallToPrintStackTrace")
    public T getConfig(String path) {
        try {
            DumperOptions options = new DumperOptions();
            options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
            options.setPrettyFlow(true);
            Yaml yaml = new Yaml(options);
            Path configPath = Paths.get(path);
            // Parse the YAML file into an object
            return yaml.loadAs(new FileInputStream(configPath.toFile()), configClass);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
