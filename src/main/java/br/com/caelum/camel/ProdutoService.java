package br.com.caelum.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Service;

/**
 * Created by paler on 18/06/2016.
 */
@Service
public class ProdutoService extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:pedidos")
                .to("activemq:queue:pedidos");
    }
}
