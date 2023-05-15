import app.web.javapaentrevistas.TaxaConversao;
import app.web.javapaentrevistas.utils.IOUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;

public class TaxaConversaoTest {

    @Test
    public void testObterIDMaiorConversao() throws IOException {
        TaxaConversao taxaConversao = new TaxaConversao();
        IOUtils ioUtils = new IOUtils();
        BufferedReader bf = ioUtils.obterDadosArquivoCsv();

        Assertions.assertEquals(10, taxaConversao.obterIDMaiorConversao(bf));
    }

}
