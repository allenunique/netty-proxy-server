package cc.leevi.common.httpproxy;

import com.google.common.net.HostAndPort;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class HttpProxyClientTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void startServer() throws IOException {
        HttpServer httpServer = new HttpServer();
        httpServer.startServer();
        System.in.read();
    }

    @Test
    public void parseURI(){
        HostAndPort hostAndPort = HostAndPort.fromString("cdn.segmentfault.com:443");
        System.out.println(hostAndPort.getHost());
        System.out.println(hostAndPort.getPort());
    }
}
