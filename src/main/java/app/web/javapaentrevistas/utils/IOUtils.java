package app.web.javapaentrevistas.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;

public class IOUtils {

    public BufferedReader obterDadosArquivoCsv() {
        BufferedReader br;
        URL resource = this.getClass().getClassLoader().getResource("dados-acesso.csv");
        try {
            br = new BufferedReader(new FileReader(resource.getFile()));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return br;
    }

}
